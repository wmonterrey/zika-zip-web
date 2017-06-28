package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionE;
import ni.org.ics.zip.service.Zp01StudyEntrySectionEService;
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
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp01StudyEntrySectionEController {
    @Resource(name = "zp01StudyEntrySectionEService")
    private Zp01StudyEntrySectionEService zp01StudyEntrySectionEService;

    private static final Logger logger = LoggerFactory.getLogger(Zp01StudyEntrySectionEController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionEs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionE> getZp01StudyEntrySectionEs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp01StudyEntry seccion E");
        List<Zp01StudyEntrySectionE> zp01StudyEntrySectionEs = zp01StudyEntrySectionEService.getZp01StudyEntrySectionE();
        if (zp01StudyEntrySectionEs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionEs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionEs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionE> getZp01StudyEntrySectionEs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp01StudyEntry seccion E para el usuario " +username);
        List<Zp01StudyEntrySectionE> zp01StudyEntrySectionEs = zp01StudyEntrySectionEService.getZp01StudyEntrySectionEByUser(username);
        if (zp01StudyEntrySectionEs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionEs;
    }


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zp01StudyEntrySectionE
     * @return String con el resultado
     */
    @RequestMapping(value = "zp01StudyEntrySectionEs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp01StudyEntrySectionEs(@RequestBody Zp01StudyEntrySectionE[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp01StudyEntrySectionE");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp01StudyEntrySectionE> zp01StudyEntrySectionEs = Arrays.asList(envio);
            for (Zp01StudyEntrySectionE zp01StudyEntrySectionE : zp01StudyEntrySectionEs){
                zp01StudyEntrySectionEService.saveZp01StudyEntrySectionE(zp01StudyEntrySectionE);
            }
        }
        return "Datos recibidos!";
    }
}
