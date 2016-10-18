package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.domain.Zp02BiospecimenCollection;
import ni.org.ics.zip.service.Zp02BiospecimenCollectionService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp02BiospecimenCollection
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/zikazip/*")
public class Zp02BiospecimenCollectionController {

    @Resource(name = "zp02BiospecimenCollectionService")
    private Zp02BiospecimenCollectionService zp02BiospecimenCollectionService;

    private static final Logger logger = LoggerFactory.getLogger(Zp02BiospecimenCollectionController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02BiospecimenCollections", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02BiospecimenCollection> getZp02BiospecimenCollections() {
        logger.info("Descargando toda la informacion de los formulario Zp02BiospecimenCollections");
        List<Zp02BiospecimenCollection> zp02BiospecimenCollections = zp02BiospecimenCollectionService.getZp02BiospecimenCollection();
        if (zp02BiospecimenCollections == null){
            logger.debug("Nulo");
        }
        return zp02BiospecimenCollections;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp02BiospecimenCollection
     * @return String con el resultado
     */
    @RequestMapping(value = "zp02BiospecimenCollections", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp02BiospecimenCollections(@RequestBody Zp02BiospecimenCollection[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp02BiospecimenCollections");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp02BiospecimenCollection> zp02BiospecimenCollections = Arrays.asList(envio);
            for (Zp02BiospecimenCollection zp02BiospecimenCollection : zp02BiospecimenCollections){
                zp02BiospecimenCollectionService.saveZp02BiospecimenCollection(zp02BiospecimenCollection);
            }
        }
        return "Datos recibidos!";
    }

}
