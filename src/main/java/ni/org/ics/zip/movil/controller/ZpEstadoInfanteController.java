package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpEstadoInfante;
import ni.org.ics.zip.service.ZpEstadoInfanteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by FIRSTICT on 2/10/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpEstadoInfanteController {

    @Resource(name = "zpEstadoInfanteService")
    private ZpEstadoInfanteService zpEstadoInfanteService;
    private static final Logger logger = LoggerFactory.getLogger(ZpEstadoInfanteController.class);


    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpEstadoInfantes", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpEstadoInfante> ZpEstadoInfantes() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpEstadoInfante");
        List<ZpEstadoInfante> zpEstadoInfantes = zpEstadoInfanteService.getZpEstadoInfantes();
        if (zpEstadoInfantes == null){
            logger.debug("Nulo");
        }
        return zpEstadoInfantes;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpEstadoInfantes/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpEstadoInfante> getZpEstadoInfantes(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpEstadoInfante el usuario " +username);
        List<ZpEstadoInfante> zpEstadoInfantesByUser = zpEstadoInfanteService.getZpEstadoInfantesByUser(username);
        if (zpEstadoInfantesByUser == null){
            logger.debug("Nulo");
        }
        return zpEstadoInfantesByUser;
    }
    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de ZpEstadoInfante
     * @return String con el resultado
     */
    @RequestMapping(value = "zpEstadoInfantes", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String saveZpEstadoInfantes(@RequestBody ZpEstadoInfante[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpEstadoInfante");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpEstadoInfante> zpEstadoInfantes = Arrays.asList(envio);
            for (ZpEstadoInfante zpEstadoInfante : zpEstadoInfantes){
                zpEstadoInfanteService.saveZpEstadoInfante(zpEstadoInfante);
            }
        }
        return "Datos recibidos!";
    }
}
