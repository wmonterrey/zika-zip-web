package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.service.ExportarService;
import ni.org.ics.zip.utils.Constants;
import ni.org.ics.zip.utils.ExportParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;

/**
 * Created by FIRSTICT on 11/10/2016.
 * V1.0
 */
@Controller
@RequestMapping("/admin/export/*")
public class ExportarController {

    private static final Logger logger = LoggerFactory.getLogger(ExportarController.class);

    @Resource(name="exportarService")
    private ExportarService exportarService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtenerUsuarios(Model model) throws ParseException, Exception {
        logger.debug("Pantalla de inicio exportación JSP");
        List<String> eventos = exportarService.getRedCapEvents();
        model.addAttribute("eventos",eventos);
        return "export/enterForm";
    }

   /* @RequestMapping(value = "getZp00", method = RequestMethod.GET)
    public void getZp00(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP00,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp00ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "zp00.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp00", method = RequestMethod.GET)
    public void getZp00Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                              @RequestParam(value = "codigoFin", required = false) String codigoFin,
                              @RequestParam(value = "event", required = false) String event,
                              HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp00.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP00,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp00ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


 /*   @RequestMapping(value = "getZp01AD", method = RequestMethod.GET)
    public void getZp01AD(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          @RequestParam(value = "event", required = false) String event,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01AD,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp01ADExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp01AD", method = RequestMethod.GET)
    public void getZp01ADNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                                @RequestParam(value = "codigoFin", required = false) String codigoFin,
                                @RequestParam(value = "event", required = false) String event,
                                HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01AD.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01AD,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp01ADExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


   /* @RequestMapping(value = "getZp01E", method = RequestMethod.GET)
    public void getZp01E(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01E,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp01EExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp01E", method = RequestMethod.GET)
    public void getZp01ENuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                               @RequestParam(value = "codigoFin", required = false) String codigoFin,
                               @RequestParam(value = "event", required = false) String event,
                               HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01E.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01E,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp01EExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

  /*  @RequestMapping(value = "getZp01FK", method = RequestMethod.GET)
    public void getZp01FK(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          @RequestParam(value = "event", required = false) String event,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01FK,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp01FKExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01FK.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp01FK", method = RequestMethod.GET)
    public void getZp01FKNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                                @RequestParam(value = "codigoFin", required = false) String codigoFin,
                                @RequestParam(value = "event", required = false) String event,
                                HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01FK.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP01FK,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp01FKExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp02", method = RequestMethod.GET)
    public void getZp02(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP02,codigoInicio,codigoFin,event);
        StringBuffer registros = new StringBuffer("");
        if (!event.equalsIgnoreCase("all")) {
            ep.setAddHeader(true);
            registros = exportarService.getZp02ExportData(ep);
        }else{
            List<String> events = exportarService.getRedCapEvents();
            for (String evento: events){
                ep.setEvent(evento);
                if (evento.equalsIgnoreCase(Constants.SCREENING)) ep.setAddHeader(true);
                else ep.setAddHeader(false);
                registros.append(exportarService.getZp02ExportData(ep));
            }
        }
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp02", method = RequestMethod.GET)
    public void getZp02Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                              @RequestParam(value = "codigoFin", required = false) String codigoFin,
                              @RequestParam(value = "event", required = false) String event,
                              HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP02,codigoInicio,codigoFin,event);
        ep.setAddHeader(true);
        StringBuffer registros = new StringBuffer("");
        try {
            //registros = exportarService.getZp02ExportData(ep);
            List<String> events = exportarService.getRedCapEvents();
            for (String evento: events){
                ep.setEvent(evento);
                if (evento.equalsIgnoreCase(Constants.SCREENING)) ep.setAddHeader(true);
                else ep.setAddHeader(false);
                registros.append(exportarService.getZp02ExportData(ep));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp03", method = RequestMethod.GET)
    public void getZp03(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP03,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp03ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp03.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp03", method = RequestMethod.GET)
    public void getZp03Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                              @RequestParam(value = "codigoFin", required = false) String codigoFin,
                              @RequestParam(value = "event", required = false) String event,
                              HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp03.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP03,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp03ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp04AD", method = RequestMethod.GET)
    public void getZp04AD(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          @RequestParam(value = "event", required = false) String event,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04AD,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp04ADExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp04AD", method = RequestMethod.GET)
    public void getZp04ADNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                              @RequestParam(value = "codigoFin", required = false) String codigoFin,
                              @RequestParam(value = "event", required = false) String event,
                              HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04AD.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04AD,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp04ADExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


  /*  @RequestMapping(value = "getZp04E", method = RequestMethod.GET)
    public void getZp04E(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04E,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp04EExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp04E", method = RequestMethod.GET)
    public void getZp04ENuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04E.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04E,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp04EExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }



   /* @RequestMapping(value = "getZp04FH", method = RequestMethod.GET)
    public void getZp04FH(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          @RequestParam(value = "event", required = false) String event,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04FH,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp04FHExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04FH.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp04FH", method = RequestMethod.GET)
    public void getZp04FHNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04FH.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP04FH,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp04FHExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp05", method = RequestMethod.GET)
    public void getZp05(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP05,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp05ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp05.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/


    @RequestMapping(value = "getZp05", method = RequestMethod.GET)
    public void getZp05Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp05.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP05,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp05ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


   /* @RequestMapping(value = "getZp06", method = RequestMethod.GET)
    public void getZp06(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP06,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp06ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp06.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp06", method = RequestMethod.GET)
    public void getZp06Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp06.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP06,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp06ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

  /*  @RequestMapping(value = "getZp08", method = RequestMethod.GET)
    public void getZp08(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP08,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp08ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp08.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp08", method = RequestMethod.GET)
    public void getZp08Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp08.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP08,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp08ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public void getAllFormsNuevo(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                                 @RequestParam(value = "codigoFin", required = false) String codigoFin,
                                 @RequestParam(value = "event", required = false) String event,
                                 HttpServletResponse res) throws Exception {

        res.setContentType( "application/csv" );
        res.setHeader( "Content-Disposition", String.format( "inline; filename=\"" + "allforms.csv" + "\"" ) );
        PrintWriter w = res.getWriter();
        String todasTablas = null;
        StringBuffer registros = null;

        //codigos madres
        if (codigoInicio.matches( "^07[0-9][0-9][0-9][0-9][0][A-Y]$") && codigoFin.matches( "^07[0-9][0-9][0-9][0-9][0][A-Y]$" )) {
            todasTablas = Constants.TABLE_ZP00 + "," + Constants.TABLE_ZP01AD + "," + Constants.TABLE_ZP01E + "," + Constants.TABLE_ZP01FK + "," + Constants.TABLE_ZP02 + "," + Constants.TABLE_ZP03 + "," +
                    Constants.TABLE_ZP04AD + "," + Constants.TABLE_ZP04E + "," + Constants.TABLE_ZP04FH + "," + Constants.TABLE_ZP05 + "," + Constants.TABLE_ZP06 + "," + Constants.TABLE_ZP08;
            //codigos infantes
        } else if (codigoInicio.matches( "^07[0-9][0-9][0-9][0-9][1-3][A-Y]$") && codigoFin.matches( "^07[0-9][0-9][0-9][0-9][1-3][A-Y]$" )) {
            todasTablas = Constants.TABLE_ZP00a + "," + Constants.TABLE_ZP07
                    + "," + Constants.TABLE_ZP07a + "," + Constants.TABLE_ZP07b + "," + Constants.TABLE_ZP07c + "," + Constants.TABLE_ZP07d + "," + Constants.TABLE_ZP02d + "," + Constants.TABLE_ZP08;
            //codigos madre e infantes
        } else if (codigoInicio.matches( "^07[0-9][0-9][0-9][0-9][0][A-Y]$") || codigoFin.matches( "^07[0-9][0-9][0-9][0-9][1-3][A-Y]$" )) {
            todasTablas = Constants.TABLE_ZP00 + "," + Constants.TABLE_ZP01AD + "," + Constants.TABLE_ZP01E + "," + Constants.TABLE_ZP01FK + "," + Constants.TABLE_ZP02 + "," + Constants.TABLE_ZP03 + "," +
                    Constants.TABLE_ZP04AD + "," + Constants.TABLE_ZP04E + "," + Constants.TABLE_ZP04FH + "," + Constants.TABLE_ZP05 + "," + Constants.TABLE_ZP06 + "," + Constants.TABLE_ZP00a + "," + Constants.TABLE_ZP07
                    + "," + Constants.TABLE_ZP07a + "," + Constants.TABLE_ZP07b + "," + Constants.TABLE_ZP07c + "," + Constants.TABLE_ZP07d + "," + Constants.TABLE_ZP02d + "," + Constants.TABLE_ZP08;
        //codigo infante y madre
        } else if (codigoInicio.matches( "^07[0-9][0-9][0-9][0-9][1-3][A-Y]$") && codigoFin.matches( "^07[0-9][0-9][0-9][0-9][0][A-Y]$" )) {
            todasTablas = Constants.TABLE_ZP00 + "," + Constants.TABLE_ZP01AD + "," + Constants.TABLE_ZP01E + "," + Constants.TABLE_ZP01FK + "," + Constants.TABLE_ZP02 + "," + Constants.TABLE_ZP03 + "," +
                    Constants.TABLE_ZP04AD + "," + Constants.TABLE_ZP04E + "," + Constants.TABLE_ZP04FH + "," + Constants.TABLE_ZP05 + "," + Constants.TABLE_ZP06 + "," + Constants.TABLE_ZP00a + "," + Constants.TABLE_ZP07
                    + "," + Constants.TABLE_ZP07a + "," + Constants.TABLE_ZP07b + "," + Constants.TABLE_ZP07c + "," + Constants.TABLE_ZP07d + "," + Constants.TABLE_ZP02d + "," + Constants.TABLE_ZP08;

        }else if (codigoInicio == null && codigoFin == null ){
            todasTablas = Constants.TABLE_ZP00 + "," + Constants.TABLE_ZP01AD + "," + Constants.TABLE_ZP01E + "," + Constants.TABLE_ZP01FK + "," + Constants.TABLE_ZP02 + "," + Constants.TABLE_ZP03 + "," +
                    Constants.TABLE_ZP04AD + "," + Constants.TABLE_ZP04E + "," + Constants.TABLE_ZP04FH + "," + Constants.TABLE_ZP05 + "," + Constants.TABLE_ZP06 + "," + Constants.TABLE_ZP00a + "," + Constants.TABLE_ZP07
                    + "," + Constants.TABLE_ZP07a + "," + Constants.TABLE_ZP07b + "," + Constants.TABLE_ZP07c + "," + Constants.TABLE_ZP07d + "," + Constants.TABLE_ZP02d + "," + Constants.TABLE_ZP08;
        }


        ExportParameters ep = new ExportParameters( todasTablas, codigoInicio, codigoFin, event );
        try {
            if (!event.equalsIgnoreCase( "all" )) {
                ep.setAddHeader( true );
                registros = exportarService.getAllExportData( ep );
            } else {
                registros = new StringBuffer();
                List<String> events = exportarService.getRedCapEvents();
                for (String evento : events) {
                    ep.setEvent( evento );
                    if (evento.equalsIgnoreCase( Constants.SCREENING )) ep.setAddHeader( true );
                    else ep.setAddHeader( false );
                    registros.append( exportarService.getAllExportData( ep ) );
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

    /* @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public void getAllForms(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                            @RequestParam(value = "codigoFin", required = false) String codigoFin,
                            @RequestParam(value = "event", required = false) String event,
                            HttpServletResponse response) throws Exception {
        //String todasTablas = Constants.TABLE_ZP00+","+Constants.TABLE_ZP01AD+","+Constants.TABLE_ZP01E+","+Constants.TABLE_ZP01FK+","+Constants.TABLE_ZP02+","+Constants.TABLE_ZP03+","+
        //        Constants.TABLE_ZP04AD+","+Constants.TABLE_ZP04E+","+Constants.TABLE_ZP04FH+","+Constants.TABLE_ZP05+","+Constants.TABLE_ZP06+","+Constants.TABLE_ZP07+","+Constants.TABLE_ZP02d+","+Constants.TABLE_ZP08;
        String todasTablas = Constants.TABLE_ZP00 + "," + Constants.TABLE_ZP01AD + "," + Constants.TABLE_ZP01E + "," + Constants.TABLE_ZP01FK + "," + Constants.TABLE_ZP02 + "," + Constants.TABLE_ZP03 + "," +
                Constants.TABLE_ZP04AD + "," + Constants.TABLE_ZP04E + "," + Constants.TABLE_ZP04FH + "," + Constants.TABLE_ZP05 + "," + Constants.TABLE_ZP06 + "," + Constants.TABLE_ZP00a + "," + Constants.TABLE_ZP07 + "," + Constants.TABLE_ZP07a + "," + Constants.TABLE_ZP07b + "," + Constants.TABLE_ZP07c + "," + Constants.TABLE_ZP07d + "," + Constants.TABLE_ZP02d + "," + Constants.TABLE_ZP08;
        ExportParameters ep = new ExportParameters(todasTablas, codigoInicio, codigoFin, event);
        StringBuffer registros = new StringBuffer("");
        if (!event.equalsIgnoreCase("all")) {
            ep.setAddHeader(true);
            registros = exportarService.getAllExportData(ep);
        } else {
            List<String> events = exportarService.getRedCapEvents();
            for (String evento : events) {
                ep.setEvent(evento);
                if (evento.equalsIgnoreCase(Constants.SCREENING)) ep.setAddHeader(true);
                else ep.setAddHeader(false);
                registros.append(exportarService.getAllExportData(ep));
            }
        }
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "allforms.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/


  /*  @RequestMapping(value = "getZp07", method = RequestMethod.GET)
    public void getZp07(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp07ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp07", method = RequestMethod.GET)
    public void getZp07Nuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07ExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp02d", method = RequestMethod.GET)
    public void getZp02d(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        @RequestParam(value = "event", required = false) String event,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP02d,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp02dExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02d.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp02d", method = RequestMethod.GET)
    public void getZp02dNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02d.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP02d,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp02dExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

    //export para ultimos formularios creados
    //Screening infantes

   /* @RequestMapping(value = "getZp00a", method = RequestMethod.GET)
    public void getZp00a(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP00a,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp00aExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp00a.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp00a", method = RequestMethod.GET)
    public void getZp00aNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp00a.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP00a,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp00aExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp07a", method = RequestMethod.GET)
    public void getZp07a(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07a,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp07aExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07a.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp07a", method = RequestMethod.GET)
    public void getZp07aNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07a.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07a,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07aExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp07b", method = RequestMethod.GET)
    public void getZp07b(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07b,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp07bExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07b.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp07b", method = RequestMethod.GET)
    public void getZp07bNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07b.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07b,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07bExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

  /*  @RequestMapping(value = "getZp07c", method = RequestMethod.GET)
    public void getZp07c(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07c,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp07cExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07c.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp07c", method = RequestMethod.GET)
    public void getZp07cNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07c.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07c,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07cExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }

   /* @RequestMapping(value = "getZp07d", method = RequestMethod.GET)
    public void getZp07d(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         @RequestParam(value = "event", required = false) String event,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07d,codigoInicio,codigoFin,event);
        StringBuffer registros = exportarService.getZp07dExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07d.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }*/

    @RequestMapping(value = "getZp07d", method = RequestMethod.GET)
    public void getZp07dNuevo (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                           @RequestParam(value = "codigoFin", required = false) String codigoFin,
                           @RequestParam(value = "event", required = false) String event,
                           HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07d.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07d,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07dExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }


    @RequestMapping(value = "getZp07oae", method = RequestMethod.GET)
    public void getZp07oae (@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                               @RequestParam(value = "codigoFin", required = false) String codigoFin,
                               @RequestParam(value = "event", required = false) String event,
                               HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/csv");
        res.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp07oae.csv" +"\""));
        PrintWriter w = res.getWriter();
        ExportParameters ep = new ExportParameters(Constants.TABLE_ZP07oae,codigoInicio,codigoFin,event);
        StringBuffer registros = null;
        try {
            registros = exportarService.getZp07oaeExportData(ep);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        w.println(registros);
        w.flush();
        w.close();
    }
}
