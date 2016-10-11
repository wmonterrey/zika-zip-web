package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.domain.Zp02bBiospecimenResults;
import ni.org.ics.zip.service.Zp02bBiospecimenResultsService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp02bBiospecimenResults
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/zikazip/*")
public class Zp02bBiospecimenResultsController {

    @Resource(name = "zp02bBiospecimenResultsService")
    private Zp02bBiospecimenResultsService zp02bBiospecimenResultsService;

    private static final Logger logger = LoggerFactory.getLogger(Zp02bBiospecimenResultsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02bBiospecimenResults", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02bBiospecimenResults> getZp02bBiospecimenResults() {
        logger.info("Descargando toda la informacion de los formulario Zp02bBiospecimenResults");
        List<Zp02bBiospecimenResults> zp02bBiospecimenResults = zp02bBiospecimenResultsService.getZp02bBiospecimenResults();
        if (zp02bBiospecimenResults == null){
            logger.debug("Nulo");
        }
        return zp02bBiospecimenResults;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp02bBiospecimenResults
     * @return String con el resultado
     */
    @RequestMapping(value = "zp02bBiospecimenResults", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp02bBiospecimenResults(@RequestBody Zp02bBiospecimenResults[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp02bBiospecimenResults");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp02bBiospecimenResults> zp02bBiospecimenResults = Arrays.asList(envio);
            for (Zp02bBiospecimenResults zp02bBiospecimenResults1 : zp02bBiospecimenResults){
                zp02bBiospecimenResultsService.saveZp02bBiospecimenResults(zp02bBiospecimenResults1);
            }
        }
        return "Datos recibidos!";
    }
}
