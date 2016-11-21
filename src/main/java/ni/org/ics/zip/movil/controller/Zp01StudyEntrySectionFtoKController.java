package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionFtoK;
import ni.org.ics.zip.service.Zp01StudyEntrySectionFtoKService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp01StudyEntry desde la sección F a la K
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp01StudyEntrySectionFtoKController {

    @Resource(name = "zp01StudyEntrySectionFtoKService")
    private Zp01StudyEntrySectionFtoKService zp01StudyEntrySectionFtoKService;

    private static final Logger logger = LoggerFactory.getLogger(Zp01StudyEntrySectionFtoKController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionFtoKs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionFtoK> getZp01StudyEntrySectionFtoKs() {
        logger.info("Descargando toda la informacion de los formulario Zp01StudyEntrySectionFtoKs");
        List<Zp01StudyEntrySectionFtoK> zp01StudyEntrySectionFtoKs = zp01StudyEntrySectionFtoKService.getZp01StudyEntrySectionFtoK();
        if (zp01StudyEntrySectionFtoKs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionFtoKs;
    }
    
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionFtoKs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionFtoK> getZp01StudyEntrySectionFtoKs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los formulario Zp01StudyEntrySectionFtoKs para el usuario " +username);
        List<Zp01StudyEntrySectionFtoK> zp01StudyEntrySectionFtoKs = zp01StudyEntrySectionFtoKService.getZp01StudyEntrySectionFtoKByUser(username);
        if (zp01StudyEntrySectionFtoKs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionFtoKs;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp01StudyEntrySectionFtoK
     * @return String con el resultado
     */
    @RequestMapping(value = "zp01StudyEntrySectionFtoKs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp01StudyEntrySectionFtoKs(@RequestBody Zp01StudyEntrySectionFtoK[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp01StudyEntrySectionFtoKs");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp01StudyEntrySectionFtoK> zp01StudyEntrySectionFtoKs = Arrays.asList(envio);
            for (Zp01StudyEntrySectionFtoK zp01StudyEntrySectionFtoK : zp01StudyEntrySectionFtoKs){
                zp01StudyEntrySectionFtoKService.saveZp01StudyEntrySectionFtoK(zp01StudyEntrySectionFtoK);
            }
        }
        return "Datos recibidos!";
    }

}
