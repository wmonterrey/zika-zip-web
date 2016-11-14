package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.service.ExportarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @Resource(name="exportarService")
    private ExportarService exportarService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtenerUsuarios(Model model) throws ParseException, Exception {
        logger.debug("Pantalla de inicio exportación JSP");
        return "export/enterForm";
    }

    @RequestMapping(value = "getZp00", method = RequestMethod.GET)
    public void getZp00(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp00ExportData("zp00_screening");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "zp00.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01AD", method = RequestMethod.GET)
    public void getZp01AD(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp01ADExportData("zp01_study_entry_section_a_to_d");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01E", method = RequestMethod.GET)
    public void getZp01E(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp01EExportData("zp01_study_entry_section_e");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp01FK", method = RequestMethod.GET)
    public void getZp01FK(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp01FKExportData("zp01_study_entry_section_f_to_k");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp01FK.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp02", method = RequestMethod.GET)
    public void getZp02(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp02ExportData("zp02_biospecimen_collection");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp02.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp03", method = RequestMethod.GET)
    public void getZp03(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp03ExportData("zp03_monthly_visit");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp03.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04AD", method = RequestMethod.GET)
    public void getZp04AD(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp04ADExportData("zp04_trimester_visit_section_a_to_d");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04AD.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04E", method = RequestMethod.GET)
    public void getZp04E(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp04EExportData("zp04_trimester_visit_section_e");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04E.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp04FH", method = RequestMethod.GET)
    public void getZp04FH(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp04FHExportData("zp04_trimester_visit_section_f_to_h");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp04FH.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp05", method = RequestMethod.GET)
    public void getZp05(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp05ExportData("zp05_ultrasound_exam");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp05.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp06", method = RequestMethod.GET)
    public void getZp06(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp06ExportData("zp06_delivery_and_6week_visit");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp06.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

    @RequestMapping(value = "getZp08", method = RequestMethod.GET)
    public void getZp08(HttpServletResponse response) throws Exception {
        StringBuffer registros = exportarService.getZp04EExportData("zp08_study_exit");
        InputStream inputStream = new ByteArrayInputStream(registros.toString().getBytes());
        String mimeType = "text/csv";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + "Zp08.csv" +"\""));
        response.setContentLength(registros.length());
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }
}
