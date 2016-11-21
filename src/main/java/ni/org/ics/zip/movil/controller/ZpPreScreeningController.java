package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpPreScreening;
import ni.org.ics.zip.service.ZpPreScreeningService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario ZpPreScreening
 * Created by FIRSTICT on 11/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpPreScreeningController {

    @Resource(name = "zpPreScreeningService")
    private ZpPreScreeningService zpPreScreeningService;
    private static final Logger logger = LoggerFactory.getLogger(ZpPreScreeningController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpPreScreening", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpPreScreening> getZpPreScreenings() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpPreScreening");
        List<ZpPreScreening> zpPreScreening = zpPreScreeningService.getZpPreScreening();
        if (zpPreScreening == null){
            logger.debug("Nulo");
        }
        return zpPreScreening;
    }
    
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpPreScreening/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpPreScreening> getZpPreScreenings(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpPreScreening para el usuario " +username);
        List<ZpPreScreening> zpPreScreening = zpPreScreeningService.getZpPreScreeningByUser(username);
        if (zpPreScreening == null){
            logger.debug("Nulo");
        }
        return zpPreScreening;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpPreScreening
     * @return String con el resultado
     */
    @RequestMapping(value = "zpPreScreening", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpPreScreening(@RequestBody ZpPreScreening[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpPreScreening");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpPreScreening> zpPreScreenings = Arrays.asList(envio);
            for (ZpPreScreening zpPreScreening : zpPreScreenings){
                zpPreScreeningService.saveZpPreScreening(zpPreScreening);
            }
        }
        return "Datos recibidos!";
    }
}
