package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionAtoD;
import ni.org.ics.zip.service.Zp01StudyEntrySectionAtoDService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp01StudyEntry desde la sección A a la D
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp01StudyEntrySectionAtoDController {

    @Resource(name = "zp01StudyEntrySectionAtoDService")
    private Zp01StudyEntrySectionAtoDService zp01StudyEntrySectionAtoDService;

    private static final Logger logger = LoggerFactory.getLogger(Zp01StudyEntrySectionAtoDController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionAtoDs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionAtoD> getZp01StudyEntrySectionAtoDs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp01StudyEntrySectionAtoD");
        List<Zp01StudyEntrySectionAtoD> zp01StudyEntrySectionAtoDs = zp01StudyEntrySectionAtoDService.getZp01StudyEntrySectionAtoD();
        if (zp01StudyEntrySectionAtoDs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionAtoDs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp01StudyEntrySectionAtoDs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp01StudyEntrySectionAtoD> getZp01StudyEntrySectionAtoDs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp01StudyEntrySectionAtoD para el usuario " +username);
        List<Zp01StudyEntrySectionAtoD> zp01StudyEntrySectionAtoDs = zp01StudyEntrySectionAtoDService.getZp01StudyEntrySectionAtoDByUser(username);
        if (zp01StudyEntrySectionAtoDs == null){
            logger.debug("Nulo");
        }
        return zp01StudyEntrySectionAtoDs;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp01StudyEntrySectionAtoD
     * @return String con el resultado
     */
    @RequestMapping(value = "zp01StudyEntrySectionAtoDs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp01StudyEntrySectionAtoDs(@RequestBody Zp01StudyEntrySectionAtoD[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp01StudyEntrySectionAtoD");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp01StudyEntrySectionAtoD> zp01StudyEntrySectionAtoDs = Arrays.asList(envio);
            for (Zp01StudyEntrySectionAtoD zp01StudyEntrySectionAtoD : zp01StudyEntrySectionAtoDs){
                zp01StudyEntrySectionAtoDService.saveZp01StudyEntrySectionAtoD(zp01StudyEntrySectionAtoD);
            }
        }
        return "Datos recibidos!";
    }
}
