package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp00aInfantScreening;
import ni.org.ics.zip.service.Zp00aInfantScreeningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp00aInfantScreening
 * Created by ics on 22/1/2018.
 */

@Controller
@RequestMapping("/movil/*")
public class Zp00aInfantScreeningController {

    @Resource(name = "zp00aInfantScreeningService")
    private Zp00aInfantScreeningService zp00aInfantScreeningService;

    private static final Logger logger = LoggerFactory.getLogger(Zp00aInfantScreeningController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp00aInfantScreenings", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp00aInfantScreening> getZp00aInfantScreenings() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp00aInfantScreening");
        List<Zp00aInfantScreening> zp00aInfantScreenings = zp00aInfantScreeningService.getZp00aInfantScreening();
        if (zp00aInfantScreenings == null){
            logger.debug("Nulo");
        }
        return zp00aInfantScreenings;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp00aInfantScreenings/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp00aInfantScreening> getZp00aInfantScreenings(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formularios Zp00aInfantScreening para el usuario " +username);
        List<Zp00aInfantScreening> zp00aInfantScreenings = zp00aInfantScreeningService.getZp00aInfantScreeningByUser(username);
        if (zp00aInfantScreenings == null){
            logger.debug("Nulo");
        }
        return zp00aInfantScreenings;
    }


    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp00aInfantScreening
     * @return String con el resultado
     */
    @RequestMapping(value = "zp00aInfantScreenings", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp00aInfantScreenings(@RequestBody Zp00aInfantScreening[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp00aInfantScreening");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp00aInfantScreening> zp00aInfantScreenings = Arrays.asList(envio);
            for (Zp00aInfantScreening zp00aInfantScreening : zp00aInfantScreenings){
                zp00aInfantScreeningService.saveZp00aInfantScreening(zp00aInfantScreening);
            }
        }
        return "Datos recibidos!";
    }



}
