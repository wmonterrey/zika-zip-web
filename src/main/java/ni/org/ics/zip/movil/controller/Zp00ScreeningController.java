package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp00Screening;
import ni.org.ics.zip.service.Zp00ScreeningService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp00Screening
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp00ScreeningController {
    @Resource(name = "zp00ScreeningService")
    private Zp00ScreeningService zp00ScreeningService;

    private static final Logger logger = LoggerFactory.getLogger(Zp00ScreeningController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp00Screenings", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp00Screening> getZp00Screenings() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp00Screening");
        List<Zp00Screening> zp00Screenings = zp00ScreeningService.getZp00Screening();
        if (zp00Screenings == null){
            logger.debug("Nulo");
        }
        return zp00Screenings;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp00Screenings/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp00Screening> getZp00Screenings(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp00Screening para el usuario " +username);
        List<Zp00Screening> zp00Screenings = zp00ScreeningService.getZp00ScreeningByUser(username);
        if (zp00Screenings == null){
            logger.debug("Nulo");
        }
        return zp00Screenings;
    }


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zp00Screening
     * @return String con el resultado
     */
    @RequestMapping(value = "zp00Screenings", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp00Screenings(@RequestBody Zp00Screening[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp00Screenings");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp00Screening> zp00Screenings = Arrays.asList(envio);
            for (Zp00Screening zp00Screening : zp00Screenings){
                zp00ScreeningService.saveZp00Screening(zp00Screening);
            }
        }
        return "Datos recibidos!";
    }
}
