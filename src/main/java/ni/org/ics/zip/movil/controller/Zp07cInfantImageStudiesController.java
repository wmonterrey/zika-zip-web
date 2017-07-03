package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07cInfantImageStudies;
import ni.org.ics.zip.service.Zp07cInfantImageStudiesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07cInfantImageStudies
 * Created by ics on 20/6/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp07cInfantImageStudiesController {

    @Resource(name = "zp07cInfantImageStudiesService")
    private Zp07cInfantImageStudiesService zp07cInfantImageStudiesService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07cInfantImageStudiesController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07cInfantImageStudies", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07cInfantImageStudies> getZp07cInfantImageStudies() {
        logger.info("Descargando toda la informacion de los datos de los formulario zp07CInfantImageStudies");
        List<Zp07cInfantImageStudies> zp07CInfantImageStudies = zp07cInfantImageStudiesService.getZp07cInfantImageStudies();
        if (zp07CInfantImageStudies == null){
            logger.debug("Nulo");
        }
        return zp07CInfantImageStudies;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07cInfantImageStudies/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07cInfantImageStudies> getZp07cInfantImageStudies(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07cInfantImageStudies para el usuario " +username);
        List<Zp07cInfantImageStudies> zp07CInfantImageStudies = zp07cInfantImageStudiesService.getZp07cInfantImageStudiesByUser(username);
        if (zp07CInfantImageStudies == null){
            logger.debug("Nulo");
        }
        return zp07CInfantImageStudies;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp07cInfantImageStudies
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07cInfantImageStudies", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07cInfantImageStudies(@RequestBody Zp07cInfantImageStudies[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07cInfantImageStudies");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07cInfantImageStudies> zp07CInfantImageStudies = Arrays.asList(envio);
            for (Zp07cInfantImageStudies zp07cInfantImageSt : zp07CInfantImageStudies){
                zp07cInfantImageStudiesService.saveZp07cInfantImageStudies(zp07cInfantImageSt);
            }
        }
        return "Datos recibidos!";
    }
}
