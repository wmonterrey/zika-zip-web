
//CatalogosController
package ni.org.ics.zip.web.controller;


import ni.org.ics.zip.domain.audit.AuditTrail;
import ni.org.ics.zip.domain.catalogs.AppointmentType;
import ni.org.ics.zip.domain.catalogs.Cs;
import ni.org.ics.zip.domain.catalogs.Provider;
import ni.org.ics.zip.domain.catalogs.Speciality;
import ni.org.ics.zip.domain.catalogs.SubjectType;
import ni.org.ics.zip.domain.relationships.UserCenter;
import ni.org.ics.zip.service.AuditTrailService;
import ni.org.ics.zip.service.CatalogosService;
import ni.org.ics.zip.service.UsuarioService;
import ni.org.ics.zip.users.model.Authority;
import ni.org.ics.zip.users.model.UserAccess;
import ni.org.ics.zip.users.model.UserSistema;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/catalog/*")
public class CatalogosController {

    private static final Logger logger = LoggerFactory.getLogger(CatalogosController.class);

    @Resource(name = "catalogosService")
    private CatalogosService catalogosService;
    @Resource(name="usuarioService")
	private UsuarioService usuarioService;
    @Resource(name="auditTrailService")
	private AuditTrailService auditTrailService;
    
    @RequestMapping(value = "centers", method = RequestMethod.GET)
    public String obtenerUnidades(Model model) throws ParseException {
        logger.debug("Mostrando unidades de salud en JSP");

        List<Cs> centros = catalogosService.getCss();
        model.addAttribute("centros", centros);
        return "catalogos/centers/list";
    }
    
    @RequestMapping(value = "showCenter/{centername}", method = RequestMethod.GET)
    public String showUnidad(Model model, @PathVariable(value = "centername") String centername) throws ParseException {
        logger.debug("Mostrando unidad de salud en JSP " + centername);

        Cs centro = catalogosService.getCs(centername);
       
        model.addAttribute("centro", centro);
        return "catalogos/centers/viewCenter";
    }
    

    
    @RequestMapping(value = "newCenter", method = RequestMethod.GET)
	public String initCreationCenter(Model model) {
    	
    	 model.addAttribute("agregando",true);
         model.addAttribute("editando",false);
         
		return "catalogos/centers/enterForm";
	}
    
    @RequestMapping(value = "editcenter/{centername}", method = RequestMethod.GET)
   	public String initEditCenter(Model model, @PathVariable(value = "centername") String centername) throws ParseException {
    	   logger.debug("Editando unidad de salud en JSP " + centername);      
        Cs centro = catalogosService.getCs(centername);  
        model.addAttribute("unidad", centro);
    	 model.addAttribute("agregando",false);
         model.addAttribute("editando",true);
   		return "catalogos/centers/enterForm";
    }
    
    @RequestMapping( value="saveCenter", method=RequestMethod.POST)
	public ResponseEntity<String> processCenterForm( @RequestParam(value="centerName", required=true) String centerName)
	{
    	try{
			Cs center = new Cs();
			center.setCs(centerName);
			this.catalogosService.saveCs(center);
			return ni.org.ics.zip.utils.Tool.createJsonResponse(center);
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
    
    
    @RequestMapping(value = "subjectTypes", method = RequestMethod.GET)
    public String obtenerTiposSujetos(Model model) throws ParseException {
        logger.debug("Mostrando TiposSujetos de salud en JSP");

        List<SubjectType> tipos = catalogosService.getSubjectTypes();
        model.addAttribute("tipos", tipos);
        return "catalogos/subjectTypes/list";
    }
    
    
    @RequestMapping(value = "newSubjectType", method = RequestMethod.GET)
	public String initCreationSubject(Model model) {
		return "catalogos/subjectTypes/enterForm";
	}
    
    @RequestMapping( value="saveSubjectType", method=RequestMethod.POST)
	public ResponseEntity<String> processSubjectForm( @RequestParam(value="subjectType", required=true) String subjectType)
	{
    	try{
    		SubjectType subject = new SubjectType();
    		subject.setSubjectType(subjectType);
			this.catalogosService.saveSubjectType(subject);
			return ni.org.ics.zip.utils.Tool.createJsonResponse(subject);
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
    
    
    @RequestMapping(value = "specialities", method = RequestMethod.GET)
    public String obtenerEspecialidades(Model model) throws ParseException {
        logger.debug("Mostrando Especialidades de salud en JSP");

        List<Speciality> especialidades = catalogosService.getSpecialities();
        model.addAttribute("especialidades", especialidades);
        return "catalogos/specialities/list";
    }
    
    
    @RequestMapping(value = "newSpeciality", method = RequestMethod.GET)
	public String initCreationSpeciality(Model model) {
		return "catalogos/specialities/enterForm";
	}
    
    @RequestMapping( value="saveSpeciality", method=RequestMethod.POST)
	public ResponseEntity<String> processSpecialityForm( @RequestParam(value="speciality", required=true) String speciality)
	{
    	try{
    		Speciality specialityObj = new Speciality();
    		specialityObj.setSpeciality(speciality);
			this.catalogosService.saveSpeciality(specialityObj);
			return ni.org.ics.zip.utils.Tool.createJsonResponse(specialityObj);
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
    
    
    @RequestMapping(value = "appointmenttypes", method = RequestMethod.GET)
    public String obtenerTiposCita(Model model) throws ParseException {
        logger.debug("Mostrando appointmentType de salud en JSP");

        List<AppointmentType> tipos = catalogosService.getAppointmentTypes();
        model.addAttribute("tipos", tipos);
        return "catalogos/apptypes/list";
    }
    
    
    @RequestMapping(value = "newAppType", method = RequestMethod.GET)
	public String initCreationAppType(Model model) {
		return "catalogos/apptypes/enterForm";
	}
    
    @RequestMapping( value="saveAppType", method=RequestMethod.POST)
	public ResponseEntity<String> processAppTypeForm( @RequestParam(value="appointmentType", required=true) String appointmentType)
	{
    	try{
    		AppointmentType appType = new AppointmentType();
    		appType.setAppointmentType(appointmentType);
			this.catalogosService.saveAppointmentType(appType);
			return ni.org.ics.zip.utils.Tool.createJsonResponse(appType);
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
    
    @RequestMapping(value = "providers", method = RequestMethod.GET)
    public String obtenerProveedores(Model model) throws ParseException {
        logger.debug("Mostrando providers de salud en JSP");
        List<Provider> proveedores = catalogosService.getProviders();
        model.addAttribute("proveedores", proveedores);
        return "catalogos/providers/list";
    }
    
    
    @RequestMapping(value = "newProvider", method = RequestMethod.GET)
	public String initCreationProvider(Model model) {
    	List<Speciality> especialidades = catalogosService.getSpecialities();
        model.addAttribute("especialidades", especialidades);
        List<Cs> centros = catalogosService.getCss();
        model.addAttribute("centros", centros);
		return "catalogos/providers/enterForm";
	}
    
    @RequestMapping(value = "viewProvider/{provider}/", method = RequestMethod.GET)
    public String initViewProvider(Model model, @PathVariable(value = "provider") String providerId){
    	Provider provider = this.catalogosService.getProvider(Integer.parseInt(providerId));
    	if (provider!=null){
    		model.addAttribute("provider", provider);
    		List<Speciality> especialidades = catalogosService.getSpecialities();
            model.addAttribute("especialidades", especialidades);
            List<Cs> centros = catalogosService.getCss();
            model.addAttribute("centros", centros);
            List<AuditTrail> bitacoraProvider = auditTrailService.getBitacora(providerId);
        	model.addAttribute("bitacora", bitacoraProvider);
    		return "catalogos/providers/viewData";
    	}
    	else{
    		return "404";
        }
    }
    
    @RequestMapping(value = "editProvider/{provider}/", method = RequestMethod.GET)
    public String initEditionProvider(Model model, @PathVariable(value = "provider") String providerId){
    	Provider provider = this.catalogosService.getProvider(Integer.parseInt(providerId));
    	if (provider!=null){
    		model.addAttribute("provider", provider);
    		List<Speciality> especialidades = catalogosService.getSpecialities();
            model.addAttribute("especialidades", especialidades);
            
            List<Cs> centros = catalogosService.getCss();
            model.addAttribute("centros", centros);
    		return "catalogos/providers/enterForm";
    	}
    	else{
    		return "404";
        }
    }
    
    @RequestMapping( value="saveProvider", method=RequestMethod.POST)
	public ResponseEntity<String> processProviderForm( 
			@RequestParam(value="id", required=false, defaultValue="") String id
			, @RequestParam( value="providerName", required=true ) String name
			, @RequestParam( value="unidadSalud", required=true ) String us
			, @RequestParam( value="especialidadProveedor", required=true ) String speciality)
	{
    	try{
    		UserSistema usuario = usuarioService.getUser(SecurityContextHolder.getContext().getAuthentication().getName());
    		Provider provider = new Provider();
    		if (!id.equals("")){
    		
    			provider =  this.catalogosService.getProvider(Integer.parseInt(id));
    		}
    		else provider.setId(0);
    		provider.setName(name);
    		provider.setUs(us);// this.catalogosService.getCs(us));
    		provider.setSpeciality(speciality);// this.catalogosService.getSpeciality(speciality));
    		provider.setRecordUser(usuario.getUsername());
    		provider.setRecordDate(new Date());
			WebAuthenticationDetails wad  = (WebAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        	String idSesion = wad.getSessionId();
        	String direccionIp = wad.getRemoteAddress();
        	provider.setDeviceid(idSesion + "-"+ direccionIp);
        	provider.setEstado("1");
			this.catalogosService.saveProvider(provider);
			return ni.org.ics.zip.utils.Tool.createJsonResponse(provider);
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
    
    /**
     * Custom handler for enabling/disabling a provider.
     *
     * @param providerId the ID of the provider
     * @return a String
     */
    @RequestMapping("/providers/act/{accion}/{providerId}/")
    public String habDeshabProvider(@PathVariable("providerId") String providerId, 
    		@PathVariable("accion") String accion, RedirectAttributes redirectAttributes) {
    	String redirecTo="404";
    	char estado;
    	if (accion.matches("enable1")){
    		redirecTo = "redirect:/catalog/providers/";
    		estado = '0';
    		redirectAttributes.addFlashAttribute("proveedorHabilitado", true);
        }
        else if (accion.matches("enable2")){
        	redirecTo = "redirect:/catalog/viewProvider/{providerId}/";
    		estado = '0';
    		redirectAttributes.addFlashAttribute("proveedorHabilitado", true);
        }
        else if(accion.matches("disable1")){
        	redirecTo = "redirect:/catalog/providers/";
    		estado = '1';
    		redirectAttributes.addFlashAttribute("proveedorDeshabilitado", true);
        }
        else if(accion.matches("disable2")){
        	redirecTo = "redirect:/catalog/viewProvider/{providerId}/";
    		estado = '1';
    		redirectAttributes.addFlashAttribute("proveedorDeshabilitado", true);
        }
        else{
        	return redirecTo;
        }
    	Provider proveedoraEditar = this.catalogosService.getProvider(Integer.parseInt( providerId));
    	if(proveedoraEditar==null){
    		redirecTo="404";
		}
		else{
	    	proveedoraEditar.setPasive(estado);
	    	this.catalogosService.saveProvider(proveedoraEditar);
	    	redirectAttributes.addFlashAttribute("nombreProveedor", proveedoraEditar.getName());
		}
    	return redirecTo;	
    }

    

    
}
