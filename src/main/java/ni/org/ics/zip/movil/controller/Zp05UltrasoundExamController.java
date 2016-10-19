package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp05UltrasoundExam;
import ni.org.ics.zip.service.Zp05UltrasoundExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp05UltrasoundExam
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp05UltrasoundExamController {
    @Resource(name = "zp05UltrasoundExamService")
    private Zp05UltrasoundExamService zp05UltrasoundExamService;

    private static final Logger logger = LoggerFactory.getLogger(Zp05UltrasoundExamController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp05UltrasoundExams", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp05UltrasoundExam> getZp05UltrasoundExams() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp05UltrasoundExam");
        List<Zp05UltrasoundExam> zp05UltrasoundExams = zp05UltrasoundExamService.getZp05UltrasoundExam();
        if (zp05UltrasoundExams == null){
            logger.debug("Nulo");
        }
        return zp05UltrasoundExams;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp05UltrasoundExam
     * @return String con el resultado
     */
    @RequestMapping(value = "zp05UltrasoundExams", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp05UltrasoundExams(@RequestBody Zp05UltrasoundExam[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp05UltrasoundExam");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp05UltrasoundExam> zp05UltrasoundExams = Arrays.asList(envio);
            for (Zp05UltrasoundExam zp05UltrasoundExam : zp05UltrasoundExams){
                zp05UltrasoundExamService.saveZp05UltrasoundExam(zp05UltrasoundExam);
            }
        }
        return "Datos recibidos!";
    }
}
