package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionE;
import ni.org.ics.zip.service.Zp04TrimesterVisitSectionEService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para la sección E del formulario Zp04TrimesterVisit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp04TrimesterVisitSectionEController {
    @Resource(name = "zp04TrimesterVisitSectionEService")
    private Zp04TrimesterVisitSectionEService zp04TrimesterVisitSectionEService;

    private static final Logger logger = LoggerFactory.getLogger(Zp04TrimesterVisitSectionEController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionEs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp04TrimesterVisitSectionE> getZp04TrimesterVisitSectionEs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp04TrimesterVisitSectionE");
        List<Zp04TrimesterVisitSectionE> zp04TrimesterVisitSectionE = zp04TrimesterVisitSectionEService.getZp04TrimesterVisitSectionE();
        if (zp04TrimesterVisitSectionE == null){
            logger.debug("Nulo");
        }
        return zp04TrimesterVisitSectionE;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionEs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp04TrimesterVisitSectionE> getZp04TrimesterVisitSectionEs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp04TrimesterVisitSectionE para el usuario " +username);
        List<Zp04TrimesterVisitSectionE> zp04TrimesterVisitSectionE = zp04TrimesterVisitSectionEService.getZp04TrimesterVisitSectionEByUser(username);
        if (zp04TrimesterVisitSectionE == null){
            logger.debug("Nulo");
        }
        return zp04TrimesterVisitSectionE;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp04TrimesterVisitSectionE
     * @return String con el resultado
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionEs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp04TrimesterVisitSectionEs(@RequestBody Zp04TrimesterVisitSectionE[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp04TrimesterVisitSectionE");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp04TrimesterVisitSectionE> zp04TrimesterVisitSectionEs = Arrays.asList(envio);
            for (Zp04TrimesterVisitSectionE zp04TrimesterVisitSectionE : zp04TrimesterVisitSectionEs){
                zp04TrimesterVisitSectionEService.saveZp04TrimesterVisitSectionE(zp04TrimesterVisitSectionE);
            }
        }
        return "Datos recibidos!";
    }
}
