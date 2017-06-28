package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp08StudyExit;
import ni.org.ics.zip.service.Zp08StudyExitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp08StudyExit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp08StudyExitController {

    @Resource(name = "zp08StudyExitService")
    private Zp08StudyExitService zp08StudyExitService;

    private static final Logger logger = LoggerFactory.getLogger(Zp08StudyExitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp08StudyExits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp08StudyExit> getZp08StudyExits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp08StudyExit");
        List<Zp08StudyExit> zp08StudyExits = zp08StudyExitService.getZp08StudyExit();
        if (zp08StudyExits == null){
            logger.debug("Nulo");
        }
        return zp08StudyExits;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp08StudyExits/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp08StudyExit> getZp08StudyExits(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp08StudyExit para el usuario " +username);
        List<Zp08StudyExit> zp08StudyExits = zp08StudyExitService.getZp08StudyExitByUser(username);
        if (zp08StudyExits == null){
            logger.debug("Nulo");
        }
        return zp08StudyExits;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zp08StudyExit
     * @return String con el resultado
     */
    @RequestMapping(value = "zp08StudyExits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp08StudyExits(@RequestBody Zp08StudyExit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp08StudyExits");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp08StudyExit> zp08StudyExits = Arrays.asList(envio);
            for (Zp08StudyExit zp08StudyExit : zp08StudyExits){
                zp08StudyExitService.saveZp08StudyExit(zp08StudyExit);
            }
        }
        return "Datos recibidos!";
    }
}
