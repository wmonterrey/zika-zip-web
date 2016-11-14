package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.service.ExportarService;
import ni.org.ics.zip.utils.ExportParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;

/**
 * Created by FIRSTICT on 11/10/2016.
 * V1.0
 */
@Controller
@RequestMapping("export")
public class ExportarController {

    private static final Logger logger = LoggerFactory.getLogger(AdminUsuariosController.class);

    private static final String TABLE_ZP00 = "zp00_screening";
    private static final String TABLE_ZP01AD = "zp01_study_entry_section_a_to_d";
    private static final String TABLE_ZP01E = "zp01_study_entry_section_e";
    private static final String TABLE_ZP01FK = "zp01_study_entry_section_f_to_k";
    private static final String TABLE_ZP02 = "zp02_biospecimen_collection";
    private static final String TABLE_ZP03 = "zp03_monthly_visit";
    private static final String TABLE_ZP04AD = "zp04_trimester_visit_section_a_to_d";
    private static final String TABLE_ZP04E = "zp04_trimester_visit_section_e";
    private static final String TABLE_ZP04FH = "zp04_trimester_visit_section_f_to_h";
    private static final String TABLE_ZP05 = "zp05_ultrasound_exam";
    private static final String TABLE_ZP06 = "zp06_delivery_and_6week_visit";
    private static final String TABLE_ZP08 = "zp08_study_exit";


    @Resource(name="exportarService")
    private ExportarService exportarService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtenerUsuarios(Model model) throws ParseException, Exception {
        logger.debug("Pantalla de inicio exportación JSP");
        return "export/enterForm";
    }

    @RequestMapping(value = "getZp00", method = RequestMethod.GET)
    public void getZp00(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP00,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp00ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "zp00.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01AD", method = RequestMethod.GET)
    public void getZp01AD(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP01AD,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp01ADExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01E", method = RequestMethod.GET)
    public void getZp01E(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP01E,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp01EExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01FK", method = RequestMethod.GET)
    public void getZp01FK(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP01FK,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp01FKExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01FK.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp02", method = RequestMethod.GET)
    public void getZp02(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP02,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp02ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp03", method = RequestMethod.GET)
    public void getZp03(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP03,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp03ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp03.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04AD", method = RequestMethod.GET)
    public void getZp04AD(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP04AD,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp04ADExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04E", method = RequestMethod.GET)
    public void getZp04E(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                         @RequestParam(value = "codigoFin", required = false) String codigoFin,
                         HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP04E,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp04EExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04FH", method = RequestMethod.GET)
    public void getZp04FH(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                          @RequestParam(value = "codigoFin", required = false) String codigoFin,
                          HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP04FH,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp04FHExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04FH.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp05", method = RequestMethod.GET)
    public void getZp05(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP05,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp05ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp05.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp06", method = RequestMethod.GET)
    public void getZp06(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP06,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp06ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp06.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp08", method = RequestMethod.GET)
    public void getZp08(@RequestParam(value = "codigoInicio", required = false) String codigoInicio,
                        @RequestParam(value = "codigoFin", required = false) String codigoFin,
                        HttpServletResponse response) throws Exception {
        ExportParameters ep = new ExportParameters(TABLE_ZP08,codigoInicio,codigoFin);
        StringBuffer registros = exportarService.getZp08ExportData(ep);
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp08.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }
}
