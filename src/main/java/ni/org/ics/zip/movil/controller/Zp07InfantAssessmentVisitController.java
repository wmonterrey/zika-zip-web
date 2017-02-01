package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07InfantAssessmentVisit;
import ni.org.ics.zip.service.Zp07InfantAssessmentVisitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07InfantAssessmentVisit
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp07InfantAssessmentVisitController {

    @Resource(name = "zp07InfantAssessmentVisitService")
    private Zp07InfantAssessmentVisitService zp07InfantAssessmentVisitService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07InfantAssessmentVisitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07InfantAssessmentVisits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07InfantAssessmentVisit> getZp07InfantAssessmentVisits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07InfantAssessmentVisit");
        List<Zp07InfantAssessmentVisit> zp07InfantAssessmentVisits = zp07InfantAssessmentVisitService.getZp07InfantAssessmentVisit();
        if (zp07InfantAssessmentVisits == null){
            logger.debug("Nulo");
        }
        return zp07InfantAssessmentVisits;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07InfantAssessmentVisits/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07InfantAssessmentVisit> getZp07InfantAssessmentVisits(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07InfantAssessmentVisit para el usuario " +username);
        List<Zp07InfantAssessmentVisit> zp07InfantAssessmentVisits = zp07InfantAssessmentVisitService.getZp07InfantAssessmentVisitByUser(username);
        if (zp07InfantAssessmentVisits == null){
            logger.debug("Nulo");
        }
        return zp07InfantAssessmentVisits;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp07InfantAssessmentVisit
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07InfantAssessmentVisits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07InfantAssessmentVisits(@RequestBody Zp07InfantAssessmentVisit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07InfantAssessmentVisits");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07InfantAssessmentVisit> zp07InfantAssessmentVisits = Arrays.asList(envio);
            for (Zp07InfantAssessmentVisit zp07InfantAssessmentVisit : zp07InfantAssessmentVisits){
                zp07InfantAssessmentVisitService.saveZp07InfantAssessmentVisit(zp07InfantAssessmentVisit);
            }
        }
        return "Datos recibidos!";
    }
}
