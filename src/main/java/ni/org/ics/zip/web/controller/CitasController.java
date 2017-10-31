package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.domain.ZpAgendaEstudio;
import ni.org.ics.zip.domain.ZpDatosEmbarazada;
import ni.org.ics.zip.domain.ZpEstadoEmbarazada;
import ni.org.ics.zip.domain.ZpEstadoInfante;
import ni.org.ics.zip.domain.catalogs.AppointmentType;
import ni.org.ics.zip.domain.catalogs.Cs;
import ni.org.ics.zip.domain.catalogs.Provider;
import ni.org.ics.zip.domain.catalogs.Speciality;
import ni.org.ics.zip.domain.catalogs.SubjectType;
import ni.org.ics.zip.domain.relationships.UserCenter;
import ni.org.ics.zip.service.AgendaService;
import ni.org.ics.zip.service.CatalogosService;
import ni.org.ics.zip.service.MessageResourceService;
import ni.org.ics.zip.service.ParametersService;
import ni.org.ics.zip.service.UsuarioService;
import ni.org.ics.zip.service.ZpEstadoEmbarazadaService;
import ni.org.ics.zip.service.ZpEstadoInfanteService;
import ni.org.ics.zip.users.model.UserSistema;
import ni.org.ics.zip.utils.Constants;
import ni.org.ics.zip.utils.Parametros;
import ni.org.ics.zip.utils.Respuesta;
import ni.org.ics.zip.utils.ZpAgendaEmbarazada;
import ni.org.ics.zip.utils.Evento;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;


/**
 * Created by Alopez on 02/10/2017.
 * V1.0
 */

@Controller
@RequestMapping("/agenda/*")
public class CitasController {

    private static final Logger logger = LoggerFactory.getLogger(CitasController.class);

    @Resource(name = "agendaService")
    private AgendaService agendaService;
    
    @Resource(name = "catalogosService")
    private CatalogosService catalogosService;
    
    @Resource(name="usuarioService")
 	private UsuarioService usuarioService;
    
    
    @Resource(name="zpEstadoEmbarazadaService")
 	private ZpEstadoEmbarazadaService datosEmbarazadas;
    
    @Resource(name="parametersService")
   	private ParametersService parametersService;
    
    
    @Resource(name="zpEstadoInfanteService")
   	private ZpEstadoInfanteService datosInfantes;
    
    @Resource(name="messageResourceService")
    private MessageResourceService datosMensajes;
    
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtenerCitas(Model model) throws ParseException {
        logger.debug("Mostrando visitas del dia en JSP");
        Date fecha = new Date();
        
   	   Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	  
	   List<UserCenter> centrosusuario = this.usuarioService.getCentersUser(authentication.getName());
	   model.addAttribute("centrosusuario", centrosusuario);
      
       fecha = simpleDateFormat.parse(simpleDateFormat.format(fecha));
  
       List<SubjectType> tipoAgendas = catalogosService.getSubjectTypes();
        
    //   List<ZpAgendaEstudio> citas = agendaService.getCitas(fecha,"");
    //   model.addAttribute("citas", citas);
       model.addAttribute("tipoAgendas", tipoAgendas);
       model.addAttribute("today",new Date());
       return "agenda/list";
    }
    
    @RequestMapping(value = "newAppointment", method = RequestMethod.GET)
    public String nuevaCita(Model model) throws ParseException {
        logger.debug("Mostrando formulario para creacion de nueva cita en JSP");

       
       List<Parametros> parametros = parametersService.getParametoPorOpcion("agenda");
       
       
       /*for(Parametros p : listParam) {
    	   if(p.getName().equals(Constants.HORAINICIO_CITA)) {
    		   minTime = p.getValue();
    		
    	   }
    	   if(p.getName().equals(Constants.HORAFIN_CITA)) {
    		   maxTime = p.getValue();
    		
    	   }
       }
       */
       
       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       
        model.addAttribute("today",new Date());
        
        List<UserCenter> centrosusuario = this.usuarioService.getCentersUser(authentication.getName());
        model.addAttribute("centrosusuario", centrosusuario);
        
        List<SubjectType> tipoAgendas = catalogosService.getSubjectTypes();
        model.addAttribute("tipoAgendas", tipoAgendas);
        
        List<AppointmentType> tipoCitas = catalogosService.getAppointmentTypes();
        model.addAttribute("tipoCitas", tipoCitas);
        
        List<Speciality> especialidades = catalogosService.getSpecialities();
        model.addAttribute("especialidades", especialidades);

        List<Provider> proveedores = catalogosService.getProviders();
        model.addAttribute("proveedores", proveedores);
        
        for(Parametros parametro:parametros) {
        	  model.addAttribute(parametro.getName(), parametro.getValue());
        }
        
      
        
        
        return "agenda/enterForm";
    }
    
    @RequestMapping(value = "/calendar", method = RequestMethod.POST)
    public ResponseEntity<String> obtenerCalendario( Model model,
    		 @RequestParam(value="start", required=true ) String start,
    		 @RequestParam(value="end", required=true ) String end,
    		 @RequestParam(value="tipoagenda", required=false, defaultValue="" ) String tipoagenda,
    		 @RequestParam(value="unidadsalud", required=false, defaultValue="" ) String unidadsalud
    		
    		) throws ParseException {
    	
    	/// long uSec = Long.parseLong(start);
    	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	  
    	  SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
    	  
    	  SimpleDateFormat fsdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    	 // fsdf.setTimeZone(TimeZone.getTimeZone("GMT"));
    	  
    	  Date fechaI = df.parse(start);
    	//  uSec = Long.parseLong(end);
    	  Date fechaF = df.parse(end); // new Date(uSec*1000L);
    	  List<Evento> listaEventos = new ArrayList<Evento>();
     
      
    	  
    	  List<ZpAgendaEstudio> citas = agendaService.getCitas(fechaI,fechaF,tipoagenda,unidadsalud);
    	  for(ZpAgendaEstudio cita:citas) {
    		  Date fechaInicio = cita.getAppointmentDateTime();
    		  Calendar c = Calendar.getInstance();
			  c.setTime(fechaInicio);
			  String tipoAgenda = cita.getSubjectType();
			  c.add(Calendar.MINUTE, 30);
			  Date fechaFin = c.getTime();		
			  String[] headers = {
					  datosMensajes.getMessageByKey("catalogsubjtype"),
					  datosMensajes.getMessageByKey("subjectId") ,
					  datosMensajes.getMessageByKey("catalogcenter"),
					  datosMensajes.getMessageByKey("provider"),
					  datosMensajes.getMessageByKey("speciality"),
					  datosMensajes.getMessageByKey("diary.agreeddate"),
					  datosMensajes.getMessageByKey("diary.agreedtime"),
					  datosMensajes.getMessageByKey("asistencia") 
			  };
			  
			  Evento evento = new Evento(cita.getRecordId()
					   ,fsdf.format(fechaInicio)  //String.valueOf((fechaInicio.getTime() / 1000L)) 
						,fsdf.format(fechaFin) //String.valueOf((fechaFin.getTime()/1000L))
						,false,"red"
					    ,cita.getId()
					    ,headers[0] + " : " + cita.getAppointmentType() + "\n"     // descripcion
					    +headers[1] + " : " + cita.getRecordId() + "\n"     // descripcion
					    +headers[2] + " : " + cita.getHealtUnit() + "\n"
					   	+headers[3] + " : " + cita.getProvider() + "\n"
					   	+headers[4] + " : " + cita.getSpecialityType() + "\n"
					    +headers[5] + " : " + simpleDateFormat.format(cita.getAppointmentDateTime()) + "\n"
					    +headers[6] + " : " + sdf.format(cita.getAppointmentDateTime()) + " - " + 	sdf.format(fechaFin)
					    +headers[7] + " : " + cita.getAsistio()					    
					    ,cita.getRecordId() , simpleDateFormat.format(cita.getAppointmentDateTime())
					    ,sdf.format(cita.getAppointmentDateTime()),cita.getHealtUnit()
					    ,cita.getProvider(),cita.getSpecialityType(),cita.getSMSNumber(),cita.getAsistio()	
					    ,StringToUnicode(cita.getSubjectType())
					  
					  );
			  
    		 // Evento evento = new Evento(cita.getRecordId(),df2.format(fechaInicio)
    		//		  							,df2.format(fechaFin),"grey");
    		  if(tipoAgenda.equals(Constants._MUJER))
    			  evento.setColor("red");
    		  else evento.setColor("blue");
    		  
    		  listaEventos.add(evento);
    		  
    	  }
    	  
    	return createJsonResponse(listaEventos);
    }
    
    
    @RequestMapping(value = "/calendar/{file_name}", method = RequestMethod.POST /*, produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"*/)
    public void obtenerExcel( Model model,@PathVariable(value = "file_name") String fileName, HttpServletResponse response
    		 
          ,@RequestParam(value="sources", required=true ) String eventos
    		
    		) throws IOException {
    	
    	 fileName += ".xlsx";
    	 Gson gson = new Gson();
    	 Evento[] arrEventos = gson.fromJson(eventos, Evento[].class);    	
  
    	 XSSFWorkbook workbook = new XSSFWorkbook();
    	 SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
    	 try {
    	 
    		 String[] headers = {
					  datosMensajes.getMessageByKey("catalogsubjtype"),
					  datosMensajes.getMessageByKey("subjectId") ,
					  datosMensajes.getMessageByKey("catalogcenter"),
					  datosMensajes.getMessageByKey("provider"),
					  datosMensajes.getMessageByKey("speciality"),
					  datosMensajes.getMessageByKey("diary.agreeddate"),
					  datosMensajes.getMessageByKey("diary.agreedtime"),
					  datosMensajes.getMessageByKey("asistencia") ,
					  datosMensajes.getMessageByKey("phone_number") 
			  };
    	 
    		 XSSFSheet sheet = workbook.createSheet("Agenda");
    		

    	        int rowNum = 0;
    	        List<ZpAgendaEstudio> citas = agendaService.getCitas();
    	        
    	        System.out.println("Creating excel");
    	        Row firsterow = sheet.createRow(rowNum++);
    	        int colNum = 0;
    	        Cell cell = firsterow.createCell(colNum++);
    	        cell.setCellValue(headers[1]);
    	        
    	        Cell cell2 = firsterow.createCell(colNum++);
    	        cell2.setCellValue(headers[0]);
    	        
    	        Cell cell3 = firsterow.createCell(colNum++);
    	        cell3.setCellValue(headers[5]);
    	        
    	        Cell cell4 = firsterow.createCell(colNum++);
    	        cell4.setCellValue(headers[6]);
    	        
    	      //  Cell cell0 = firsterow.createCell(colNum++);
    	      //  cell0.setCellValue((String) "Hora Fin");
    	        
    	        Cell cell5 = firsterow.createCell(colNum++);
    	        cell5.setCellValue(headers[2]);
    	        
    	        Cell cell6 = firsterow.createCell(colNum++);
    	        cell6.setCellValue(headers[3]);
    	        
    	        Cell cell7 = firsterow.createCell(colNum++);
    	        cell7.setCellValue(headers[4]);
    	        
    	        Cell cell8 = firsterow.createCell(colNum++);
    	        cell8.setCellValue(headers[8]);
    	        
    	        Cell cell9 = firsterow.createCell(colNum++);
    	        cell9.setCellValue(headers[7]);
    	        
    	     for(Evento evento:arrEventos) {
    	    	 	colNum = 0;
    	    	     Row row = sheet.createRow(rowNum++);
    	    	 	 	
    	    	     Cell cellev = row.createCell(colNum++);	             
    	    	     cellev.setCellValue(evento.getNumeroid());
    	    	     
    	    	     Cell cellev2 = row.createCell(colNum++);	             
    	    	     cellev2.setCellValue(evento.getTipoAgenda());
    	    	     
    	    	     Cell cellev3 = row.createCell(colNum++);	             
    	    	     cellev3.setCellValue(evento.getFechacita());
    	    	     
    	    	     Cell cellev4 = row.createCell(colNum++);	             
    	    	     cellev4.setCellValue(evento.getHoracita());        	     
    	    	   
    	    	     
    	    	     Cell cellev5 = row.createCell(colNum++);	             
    	    	     cellev5.setCellValue(evento.getUnidadsalud());
    	    	     
    	    	     Cell cellev6 = row.createCell(colNum++);	             
    	    	     cellev6.setCellValue(evento.getProveedor());
    	    	     
    	    	     Cell cellev7 = row.createCell(colNum++);	             
    	    	     cellev7.setCellValue(evento.getEspecialidad());
    	    	     
    	    	     Cell cellev8 = row.createCell(colNum++);	             
    	    	     cellev8.setCellValue(evento.getNumerotelefono());
    	    	     
    	    	     Cell cellev9 = row.createCell(colNum++);	             
    	    	     cellev9.setCellValue(evento.getAsistio());	             
    	    	     
    	    		  
    	    	  }
    	        
    	   
    	     ByteArrayOutputStream excelOutputStream = new ByteArrayOutputStream();
    	     
             workbook.write(excelOutputStream);
                
             byte[] excelBytes = excelOutputStream.toByteArray();

            
             response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    	     response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
    	      
             ServletOutputStream responseOutputStream = response.getOutputStream();
                
                 
  	         responseOutputStream.write(excelBytes);
  	         responseOutputStream.flush();
  	         responseOutputStream.close();
  	       
  	        //   response.flushBuffer();
  	          
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
    		
    		finally {
    	      //workbook.close();

    		}
  /*  
   *   	 fileName += ".xlsx";
    	 Gson gson = new Gson();
    	 Evento[] arrEventos = gson.fromJson(eventos, Evento[].class);
    	//    	 ServletContext servletContext = request.getSession().getServletContext();
//    	    
//    	 String filePath = servletContext.getRealPath("/WEB-INF/downloads/");
  	 //  String fileName = "citas.xls";
//    	 String fullPath = filePath +"/"+ fileName;   
    	 ServletContext servletContext = request.getSession().getServletContext();
//    	    
    	 String filePath = servletContext.getRealPath("/WEB-INF/downloads/");
  	   
    	 String fullPath = filePath +"/"+ fileName;     
    	 XSSFWorkbook workbook = new XSSFWorkbook();
    	 SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
    	 try {
    	 
    	 
    		 XSSFSheet sheet = workbook.createSheet("Agenda");
    		

    	        int rowNum = 0;
    	        List<ZpAgendaEstudio> citas = agendaService.getCitas();
    	        
    	        System.out.println("Creating excel");
    	        Row firsterow = sheet.createRow(rowNum++);
    	        int colNum = 0;
    	        Cell cell = firsterow.createCell(colNum++);
    	        cell.setCellValue((String) "Código Participante");
    	        
    	        Cell cell2 = firsterow.createCell(colNum++);
    	        cell2.setCellValue((String) "Tipo Agenda");
    	        
    	        Cell cell3 = firsterow.createCell(colNum++);
    	        cell3.setCellValue((String) "Fecha Cita");
    	        
    	        Cell cell4 = firsterow.createCell(colNum++);
    	        cell4.setCellValue((String) "Hora Cita");
    	        
    	      //  Cell cell0 = firsterow.createCell(colNum++);
    	      //  cell0.setCellValue((String) "Hora Fin");
    	        
    	        Cell cell5 = firsterow.createCell(colNum++);
    	        cell5.setCellValue((String) "Unidad de Salud");
    	        
    	        Cell cell6 = firsterow.createCell(colNum++);
    	        cell6.setCellValue((String) "Proveedor");
    	        
    	        Cell cell7 = firsterow.createCell(colNum++);
    	        cell7.setCellValue((String) "Especialidad");
    	        
    	        Cell cell8 = firsterow.createCell(colNum++);
    	        cell8.setCellValue((String) "Número Teléfono");
    	        
    	        Cell cell9 = firsterow.createCell(colNum++);
    	        cell9.setCellValue((String) "¿Asistio?");
    	        
    	     for(Evento evento:arrEventos) {
    	    	 	colNum = 0;
    	    	     Row row = sheet.createRow(rowNum++);
    	    	 	 	
    	    	     Cell cellev = row.createCell(colNum++);	             
    	    	     cellev.setCellValue(evento.getNumeroid());
    	    	     
    	    	     Cell cellev2 = row.createCell(colNum++);	             
    	    	     cellev2.setCellValue(evento.getTipoAgenda());
    	    	     
    	    	     Cell cellev3 = row.createCell(colNum++);	             
    	    	     cellev3.setCellValue(evento.getFechacita());
    	    	     
    	    	     Cell cellev4 = row.createCell(colNum++);	             
    	    	     cellev4.setCellValue(evento.getHoracita());        	     
    	    	   
    	    	     
    	    	     Cell cellev5 = row.createCell(colNum++);	             
    	    	     cellev5.setCellValue(evento.getUnidadsalud());
    	    	     
    	    	     Cell cellev6 = row.createCell(colNum++);	             
    	    	     cellev6.setCellValue(evento.getProveedor());
    	    	     
    	    	     Cell cellev7 = row.createCell(colNum++);	             
    	    	     cellev7.setCellValue(evento.getEspecialidad());
    	    	     
    	    	     Cell cellev8 = row.createCell(colNum++);	             
    	    	     cellev8.setCellValue(evento.getNumerotelefono());
    	    	     
    	    	     Cell cellev9 = row.createCell(colNum++);	             
    	    	     cellev9.setCellValue(evento.getAsistio());	             
    	    	     
    	    		  
    	    	  }
    	        
    	        
    	      /*  for (Object[] datatype : datatypes) {
    	            Row row = sheet.createRow(rowNum++);
    	            colNum = 0;
    	            for (Object field : datatype) {
    	                Cell cell = row.createCell(colNum++);
    	                if (field instanceof String) {
    	                    cell.setCellValue((String) field);
    	                } else if (field instanceof Integer) {
    	                    cell.setCellValue((Integer) field);
    	                }
    	            }
    	        }
    	        
    	        FileOutputStream outputStream = new FileOutputStream(fullPath);    	
    	        
    	        workbook.write(outputStream);
    	        
    	        outputStream.close();
    	        
    	        File downloadFile = new File(fullPath);
    	        FileInputStream inputStream = new FileInputStream(downloadFile);
    	        org.apache.commons.io.IOUtils.copy(inputStream, response.getOutputStream());
    	        downloadFile.deleteOnExit();
    	        inputStream.close();
    	        
               // workbook.write(response.getOutputStream());
          
             //  response.setContentType(                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
  	         //  response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
  	           response.flushBuffer();
  	          
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
    		
    		finally {
    	      //workbook.close();

    		}
   * 	 long uSec = Long.parseLong(start);
    	 // SimpleDateFormat df = new SimpleDateFormat("MMddyyHHmm");
    	  
    	   SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
   
    	  Date fechaI = new Date(uSec*1000L);
    	  uSec = Long.parseLong(end);
    	  Date fechaF =  new Date(uSec*1000L);
    	  List<Evento> listaEventos = new ArrayList<Evento>();
    
    	  
    	  List<ZpAgendaEstudio> citas = agendaService.getCitas(fechaI,fechaF,tipoagenda,unidadsalud);
    	  for(ZpAgendaEstudio cita:citas) {
    		  Date fechaInicio = cita.getAppointmentDateTime();
    		  Calendar c = Calendar.getInstance();
			  c.setTime(fechaInicio);
			  String tipoAgenda = cita.getSubjectType();
			  c.add(Calendar.MINUTE, 30);
			  Date fechaFin = c.getTime();		

			  Evento evento = new Evento(cita.getRecordId()
					  , String.valueOf((fechaInicio.getTime() / 1000L)) 
						,String.valueOf((fechaFin.getTime()/1000L)),false,"red"
					    ,cita.getId()
					    ,"Tipo: " + cita.getAppointmentType() + "\n"     // descripcion
					    +"Codigo: " + cita.getRecordId() + "\n"     // descripcion
					    +"Unidad de Salud: " + cita.getHealtUnit() + "\n"
					   	+"Proveedor: " + cita.getProvider() + "\n"
					   	+"Especialidad: " + cita.getSpecialityType() + "\n"
					    +"Fecha: " + simpleDateFormat.format(cita.getAppointmentDateTime()) + "\n"
					    +"Desde " + sdf.format(cita.getAppointmentDateTime()) + "Hasta " + 	sdf.format(fechaFin)
					    +"Asistio?: " + cita.getAsistio()					    
					    ,cita.getRecordId() , simpleDateFormat.format(cita.getAppointmentDateTime())
					    ,sdf.format(cita.getAppointmentDateTime()),cita.getHealtUnit()
					    ,cita.getProvider(),cita.getSpecialityType(),cita.getPhonenumber(),cita.getAsistio()	
					    ,cita.getSubjectType()
					  
					  );
			  
    		 // Evento evento = new Evento(cita.getRecordId(),df2.format(fechaInicio)
    		//		  							,df2.format(fechaFin),"grey");
    		  if(tipoAgenda.equals(Constants._MUJER))
    			  evento.setColor("red");
    		  else evento.setColor("blue");
    		  
    		  listaEventos.add(evento);
    		  
    	  }*/
    	 // try {
	    	  
	         // File downloadFile = new File(fullPath);
	       //   FileInputStream inputStream = new FileInputStream(downloadFile);
	          // copy it to response's OutputStream
	       //   org.apache.commons.io.IOUtils.copy(inputStream, response.getOutputStream());
	        
	          //inputStream.close();
    	  
	   
    }
    

	@RequestMapping( value="saveCita", method=RequestMethod.POST)
	public ResponseEntity<String> processCitaForm( 
			@RequestParam(value="id", required=false, defaultValue="") String id
			,@RequestParam(value="recordid", required=true) String recordid
			, @RequestParam(value="tipoAgenda", required=true, defaultValue="" ) String tipoAgenda
			, @RequestParam(value="diarydate", required=true ) String diarydate
			, @RequestParam(value="timepicker", required=true ) String timepicker
			, @RequestParam(value="tipoCita", required=true, defaultValue="" ) String tipoCita
			, @RequestParam(value="providerName",required=true, defaultValue="") String providerName
			, @RequestParam(value="unidadSalud",required=true, defaultValue="" ) String unidadSalud
			, @RequestParam(value="tipoespecialidad", required=true, defaultValue="" ) String tipoespecialidad
			, @RequestParam(value="smsNumber", required=false, defaultValue="" ) String smsNumber
			, @RequestParam(value="observacion", required=false, defaultValue="" ) String observacion
			)
	{
    	try{
    		UserSistema usuario = usuarioService.getUser(SecurityContextHolder.getContext().getAuthentication().getName());
    		ZpAgendaEstudio zpAgenda = new ZpAgendaEstudio();
    		if (!id.equals("")){
    		
    			zpAgenda =  this.agendaService.getZpAgendaEstudio((Integer)Integer.parseInt(id));
    		}
    		else zpAgenda.setId(0);
    		String mensajeError = "";
    		// Existe el código registrado?
    		ZpEstadoEmbarazada zpEmbarazada =datosEmbarazadas.getZpEstadoEmbarazada(recordid) ;
    		// Si esta en esta tabla de embarazada entoncees es tipo de agenda = " MUJER "
    		if(zpEmbarazada == null) {
    			
    			ZpEstadoInfante zpInfante =datosInfantes.getZpEstadoInfante(recordid) ;
    			// Si esta en esta tabla de embarazada entoncees es tipo de agenda = " INFANTE "
    			if( zpInfante == null) {
    				mensajeError = datosMensajes.getMessageByKey("err_msg_participante_no_existe");
	    			Exception ex = new Exception(mensajeError);
	    			Gson gson = new Gson();
	        	    String json = gson.toJson(ex.getMessage());
	        		return new ResponseEntity<String>( json, HttpStatus.ALREADY_REPORTED);
    			}
    			
    		}
    		    		
    		String myDatetime = diarydate + " " + timepicker;
    	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
    	    java.util.Date utilDate = new java.util.Date();
    	    try {
    	        utilDate = sdf.parse(myDatetime);
    	    } catch (ParseException pe){
    	    	String message = pe.getMessage();
        		Gson gson = new Gson();
        	    String json = gson.toJson(message);
        		return new ResponseEntity<String>( json, HttpStatus.CREATED);
    	    }
    	 // Verificar que la la fecha y hora no se encuentren agendadas por tipo de agenda
    		ZpAgendaEstudio zpAgendaVerificacion = agendaService.getZpAgendaEstudio(tipoCita, utilDate);
    		if(zpAgendaVerificacion != null)    
    		{
    			mensajeError = datosMensajes.getMessageByKey("err_msg_participante_ya_agendado");
    			Exception ex = new Exception(mensajeError);
    			Gson gson = new Gson();
        	    String json = gson.toJson(ex.getMessage());
        		return new ResponseEntity<String>(json, HttpStatus.ALREADY_REPORTED);
    		}
    	    zpAgenda.setRecordId(recordid);
    	    zpAgenda.setAppointmentDateTime(utilDate);
    	    zpAgenda.setAppointmentType(tipoCita);
    	    zpAgenda.setAsistio("");
    	    zpAgenda.setHealtUnit(unidadSalud);
    	    zpAgenda.setObs(observacion);
    	    if(!smsNumber.isEmpty()) zpAgenda.setCellNumAuth("S");
    	    else zpAgenda.setCellNumAuth("N");
    	    zpAgenda.setProvider(providerName);
    	    zpAgenda.setSMSNumber(smsNumber);
    	    zpAgenda.setSpecialityType(tipoespecialidad);
    	    zpAgenda.setSubjectType(tipoAgenda);    	 
    	    zpAgenda.setAsistio("P");
    		zpAgenda.setRecordUser(usuario.getUsername());
    		zpAgenda.setRecordDate(new Date());
			WebAuthenticationDetails wad  = (WebAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        	String idSesion = wad.getSessionId();
        	String direccionIp = wad.getRemoteAddress();
        	zpAgenda.setDeviceid(idSesion + "-"+ direccionIp);
        	zpAgenda.setEstado("1");
			this.agendaService.saveAppointment(zpAgenda);
			return createJsonResponse(zpAgenda);
    	}
    	catch (DataIntegrityViolationException e){
    		String message = e.getMostSpecificCause().getMessage();
    		Gson gson = new Gson();
    	    String json = gson.toJson(message);
    		return new ResponseEntity<String>( json, HttpStatus.CREATED);
    	}
    	catch(Exception e){
    		Gson gson = new Gson();
    	    String json = gson.toJson(e.toString());
    		return new ResponseEntity<String>( json, HttpStatus.CREATED);
    	}
		
	}
	
	
	@RequestMapping( value="saveState", method=RequestMethod.POST)
	public ResponseEntity<String> processAsistencia( 
			@RequestParam(value="citaid", required=true) String id
			,@RequestParam(value="estado", required=true) java.lang.Boolean state){
			
		Respuesta resp = new Respuesta();
		resp.setSucceed(false);
		try {
			
			ZpAgendaEstudio zpAgenda = new ZpAgendaEstudio();
			zpAgenda =  this.agendaService.getZpAgendaEstudio((Integer)Integer.parseInt(id));
			zpAgenda.setAsistio((state == true?"S":"N"));
			this.agendaService.saveAppointment(zpAgenda);		
			resp.setSucceed(true);
			resp.setMessage("OK");
			resp.setHttpStatus(HttpStatus.ACCEPTED);
			
			return createJsonResponse(resp);
		}
		catch(Exception e)
		{
			resp.setMessage(e.toString());
			resp.setHttpStatus(HttpStatus.METHOD_FAILURE);
			return createJsonResponse(resp);
		}
		
		
				
	}
    
    private ResponseEntity<String> createJsonResponse( Object o )
  	{
  	    HttpHeaders headers = new HttpHeaders();
  	    headers.set("Content-Type", "application/json");
  	    Gson gson = new Gson();
  	    String json = gson.toJson(o);
  	    return new ResponseEntity<String>( json, headers, HttpStatus.CREATED );
  	}
    
    private ResponseEntity<String> createJsonResponse( Respuesta o )
  	{
  	    HttpHeaders headers = new HttpHeaders();
  	    headers.set("Content-Type", "application/json");
  	    Gson gson = new Gson();
  	    String json = gson.toJson(o);
  	    return new ResponseEntity<String>( json, headers, o.getHttpStatus() );
  	}
    
    private String StringToUnicode(String frase) {
    	
    	String fraseUnicode = frase.replaceAll("Á", "\\u00C1");
    	fraseUnicode = frase.replaceAll("á", "\\u00E1");
    	fraseUnicode = frase.replaceAll("É", "\\u00C9");
    	fraseUnicode = frase.replaceAll("é", "\\u00E9");
    	fraseUnicode = frase.replaceAll("Í", "\\u00CD");
    	fraseUnicode = frase.replaceAll("í", "\\u00ED");
    	fraseUnicode = frase.replaceAll("Ó", "\\u00D3");
    	fraseUnicode = frase.replaceAll("ó", "\\u00F3");
    	fraseUnicode = frase.replaceAll("Ú", "\\u00DA");
    	fraseUnicode = frase.replaceAll("ú", "\\u00FA");
    	fraseUnicode = frase.replaceAll("Ñ", "\\u00D1");
    	fraseUnicode = frase.replaceAll("ñ", "\\u00F1");
    	
    	return fraseUnicode;
    	
    }

    
  
}
