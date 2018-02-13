package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07InfantOtoacousticEmissions;
import ni.org.ics.zip.service.Zp07InfantOtoacousticEmissionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07InfantOtocousticEmissions
 * Created by ics on 2/2/2018.
 */

@Controller
@RequestMapping("/movil/*")
public class Zp07InfantOtocousticEmissionsController {

    @Resource(name = "zp07InfantOtoacousticEmsService")
    private Zp07InfantOtoacousticEmissionsService zp07InfantOtoacousticEmsService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07InfantOtocousticEmissionsController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07InfantOtoacousticEms", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07InfantOtoacousticEmissions> getZp07InfantOtoacousticEms() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07InfantOacousticEmissions");
        List<Zp07InfantOtoacousticEmissions> zp07InfantOtoacousticEms = zp07InfantOtoacousticEmsService.getZp07InfantOtoacousticEms();
        if (zp07InfantOtoacousticEms == null){
            logger.debug("Nulo");
        }
        return zp07InfantOtoacousticEms;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07InfantOtoacousticEms/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07InfantOtoacousticEmissions> getZp07InfantOtoacousticEms(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formularios Zp07InfantOacousticEmissions para el usuario " +username);
        List<Zp07InfantOtoacousticEmissions> zp07InfantOtoacousticEms = zp07InfantOtoacousticEmsService.getZp07InfantOtoacousticEmsByUser(username);
        if (zp07InfantOtoacousticEms == null){
            logger.debug("Nulo");
        }
        return zp07InfantOtoacousticEms;
    }


    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp07InfantOtoacousticEmissions
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07InfantOtoacousticEms", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07InfantOtoacousticEms(@RequestBody Zp07InfantOtoacousticEmissions[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07InfantOtocousticEmissions");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07InfantOtoacousticEmissions> zp07InfantOtoacousticEms = Arrays.asList(envio);
            for (Zp07InfantOtoacousticEmissions zp07InfantOtoacousticEm : zp07InfantOtoacousticEms){
                zp07InfantOtoacousticEmsService.saveZp07InfantOtoacousticEm(zp07InfantOtoacousticEm);
            }
        }
        return "Datos recibidos!";
    }



}
