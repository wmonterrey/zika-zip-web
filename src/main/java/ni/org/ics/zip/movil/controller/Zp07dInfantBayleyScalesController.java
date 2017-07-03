package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp07dInfantBayleyScales;
import ni.org.ics.zip.service.Zp07dInfantBayleyScalesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp07dInfantBayleyScales
 * Created by ics on 20/6/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp07dInfantBayleyScalesController {

    @Resource(name = "zp07dInfantBayleyScalesService")
    private Zp07dInfantBayleyScalesService zp07dInfantBayleyScalesService;

    private static final Logger logger = LoggerFactory.getLogger(Zp07dInfantBayleyScalesController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07dInfantBayleyScales", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07dInfantBayleyScales> getZp07dInfantBayleyScales() {
        logger.info("Descargando toda la informacion de los datos de los formulario zp07dInfantBayleyScales");
        List<Zp07dInfantBayleyScales> zp07dInfantBayleyScales = zp07dInfantBayleyScalesService.getZp07dInfantBayleyScales();
        if (zp07dInfantBayleyScales == null){
            logger.debug("Nulo");
        }
        return zp07dInfantBayleyScales;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp07dInfantBayleyScales/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp07dInfantBayleyScales> getZp07dInfantBayleyScales(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp07dInfantBayleyScales para el usuario " +username);
        List<Zp07dInfantBayleyScales> zp07dInfantBayleyScales = zp07dInfantBayleyScalesService.getZp07dInfantBayleyScalesByUser(username);
        if (zp07dInfantBayleyScales == null){
            logger.debug("Nulo");
        }
        return zp07dInfantBayleyScales;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp07dInfantBayleyScales
     * @return String con el resultado
     */
    @RequestMapping(value = "zp07dInfantBayleyScales", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp07dInfantBayleyScales(@RequestBody Zp07dInfantBayleyScales[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp07dInfantBayleyScales");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp07dInfantBayleyScales> zp07dInfantBayleyScales = Arrays.asList(envio);
            for (Zp07dInfantBayleyScales zp07dInfantBayleySc : zp07dInfantBayleyScales){
                zp07dInfantBayleyScalesService.saveZp07dInfantBayleyScales(zp07dInfantBayleySc);
            }
        }
        return "Datos recibidos!";
    }
}
