package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07aInfantOphtResults;
import ni.org.ics.zip.service.Zp07aInfantOphtResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07aInfantOphtResults
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp07aInfantOphtResultsController {

    @Resource(name = "zp07aInfantOphtResultsService")
    private Zp07aInfantOphtResultsService zp07aInfantOphtResultsService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07aInfantOphtResultsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07aInfantOphtResults", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07aInfantOphtResults> getZp07aInfantOphtResults() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07aInfantOphtResults");
        List<Zp07aInfantOphtResults> zp07aInfantOphtResults = zp07aInfantOphtResultsService.getZp07aInfantOphtResults();
        if (zp07aInfantOphtResults == null){
            logger.debug("Nulo");
        }
        return zp07aInfantOphtResults;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07aInfantOphtResults/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07aInfantOphtResults> getZp07aInfantOphtResults(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07aInfantOphtResults para el usuario " +username);
        List<Zp07aInfantOphtResults> zp07aInfantOphtResults = zp07aInfantOphtResultsService.getZp07aInfantOphtResultstByUser(username);
        if (zp07aInfantOphtResults == null){
            logger.debug("Nulo");
        }
        return zp07aInfantOphtResults;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp07aInfantOphtResults
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07aInfantOphtResults", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07aInfantOphtResults(@RequestBody Zp07aInfantOphtResults[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07aInfantOphtResults");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07aInfantOphtResults> zp07aInfantOphtResults = Arrays.asList(envio);
            for (Zp07aInfantOphtResults zp07aInfantOphtResult : zp07aInfantOphtResults){
                zp07aInfantOphtResultsService.saveZp07aInfantOphtResults(zp07aInfantOphtResult);
            }
        }
        return "Datos recibidos!";
    }
}
