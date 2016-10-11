package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.domain.Zp02BiospecimenCollectionSectionB;
import ni.org.ics.zip.service.Zp02BiospecimenCollectionSectionBService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp02BiospecimenCollectionSectionB
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/zikazip/*")
public class Zp02BiospecimenCollectionSectionBController {

    @Resource(name = "zp02BiospecimenCollectionSectionBService")
    private Zp02BiospecimenCollectionSectionBService zp02BiospecimenCollectionSectionBService;

    private static final Logger logger = LoggerFactory.getLogger(Zp02BiospecimenCollectionSectionBController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02BiospecimenCollectionSectionBs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02BiospecimenCollectionSectionB> getZp02BiospecimenCollectionSectionBs() {
        logger.info("Descargando toda la informacion de los formulario Zp02BiospecimenCollectionSectionBs");
        List<Zp02BiospecimenCollectionSectionB> zp02BiospecimenCollectionSectionBs = zp02BiospecimenCollectionSectionBService.getZp02BiospecimenCollectionSectionB();
        if (zp02BiospecimenCollectionSectionBs == null){
            logger.debug("Nulo");
        }
        return zp02BiospecimenCollectionSectionBs;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp02BiospecimenCollectionSectionB
     * @return String con el resultado
     */
    @RequestMapping(value = "zp02BiospecimenCollectionSectionBs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp02BiospecimenCollectionSectionBs(@RequestBody Zp02BiospecimenCollectionSectionB[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp02BiospecimenCollectionSectionBs");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp02BiospecimenCollectionSectionB> zp02BiospecimenCollectionSectionBs = Arrays.asList(envio);
            for (Zp02BiospecimenCollectionSectionB zp02BiospecimenCollectionSectionB : zp02BiospecimenCollectionSectionBs){
                zp02BiospecimenCollectionSectionBService.saveZp02BiospecimenCollectionSectionB(zp02BiospecimenCollectionSectionB);
            }
        }
        return "Datos recibidos!";
    }

}
