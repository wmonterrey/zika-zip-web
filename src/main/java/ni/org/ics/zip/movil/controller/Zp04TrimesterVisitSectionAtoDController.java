package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionAtoD;
import ni.org.ics.zip.service.Zp04TrimesterVisitSectionAtoDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp04TrimesterVisit desde la sección A a la D
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp04TrimesterVisitSectionAtoDController {

    @Resource(name = "zp04TrimesterVisitSectionAtoDService")
    private Zp04TrimesterVisitSectionAtoDService zp04TrimesterVisitSectionAtoDService;

    private static final Logger logger = LoggerFactory.getLogger(Zp04TrimesterVisitSectionAtoDController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionAtoDs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp04TrimesterVisitSectionAtoD> getZp04TrimesterVisitSectionAtoDs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp04TrimesterVisitSectionAtoD");
        List<Zp04TrimesterVisitSectionAtoD> zp04TrimesterVisitSectionAtoD = zp04TrimesterVisitSectionAtoDService.getZp04TrimesterVisitSectionAtoD();
        if (zp04TrimesterVisitSectionAtoD == null){
            logger.debug("Nulo");
        }
        return zp04TrimesterVisitSectionAtoD;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp04TrimesterVisitSectionAtoD
     * @return String con el resultado
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionAtoDs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp04TrimesterVisitSectionAtoDs(@RequestBody Zp04TrimesterVisitSectionAtoD[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp04TrimesterVisitSectionAtoD");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp04TrimesterVisitSectionAtoD> zp04TrimesterVisitSectionAtoDs = Arrays.asList(envio);
            for (Zp04TrimesterVisitSectionAtoD zp04TrimesterVisitSectionAtoD : zp04TrimesterVisitSectionAtoDs){
                zp04TrimesterVisitSectionAtoDService.saveZp04TrimesterVisitSectionAtoD(zp04TrimesterVisitSectionAtoD);
            }
        }
        return "Datos recibidos!";
    }
}
