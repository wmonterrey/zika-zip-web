package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07bInfantAudioResults;
import ni.org.ics.zip.service.Zp07bInfantAudioResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07bInfantAudioResults
 * Created by ics on 20/6/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp07bInfantAudioResultsController {

    @Resource(name = "zp07bInfantAudioResultsService")
    private Zp07bInfantAudioResultsService zp07bInfantAudioResultsService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07bInfantAudioResultsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07bInfantAudioResults", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07bInfantAudioResults> getZp07bInfantAudioResults() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07bInfantAudioResults");
        List<Zp07bInfantAudioResults> zp07bInfantAudioResults = zp07bInfantAudioResultsService.getZp07bInfantAudioResults();
        if (zp07bInfantAudioResults == null){
            logger.debug("Nulo");
        }
        return zp07bInfantAudioResults;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07bInfantAudioResults/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07bInfantAudioResults> getZp07bInfantAudioResults(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07bInfantAudioResults para el usuario " +username);
        List<Zp07bInfantAudioResults> zp07bInfantAudioResults = zp07bInfantAudioResultsService.getZp07bInfantAudioResultstByUser(username);
        if (zp07bInfantAudioResults == null){
            logger.debug("Nulo");
        }
        return zp07bInfantAudioResults;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp07bInfantAudioResults
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07bInfantAudioResults", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07bInfantAudioResults(@RequestBody Zp07bInfantAudioResults[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07bInfantAudioResults");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07bInfantAudioResults> zp07bInfantAudioResults = Arrays.asList(envio);
            for (Zp07bInfantAudioResults zp07bInfantAudioResult : zp07bInfantAudioResults){
                zp07bInfantAudioResultsService.saveZp07bInfantAudioResults(zp07bInfantAudioResult);
            }
        }
        return "Datos recibidos!";
    }
}
