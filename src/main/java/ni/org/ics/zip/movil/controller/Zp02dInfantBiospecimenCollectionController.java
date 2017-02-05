package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp02dInfantBiospecimenCollection;
import ni.org.ics.zip.service.Zp02dInfantBiospecimenCollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp02dInfantBiospecimenCollection
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp02dInfantBiospecimenCollectionController {

    @Resource(name = "zp02dInfantBiospecimenCollectionService")
    private Zp02dInfantBiospecimenCollectionService zp02dInfantBiospecimenCollectionService;

    private static final Logger logger = LoggerFactory.getLogger(Zp02dInfantBiospecimenCollectionController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02dInfantBiospecimenCollections", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02dInfantBiospecimenCollection> getZp02dInfantBiospecimenCollections() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp02dInfantBiospecimenCollection");
        List<Zp02dInfantBiospecimenCollection> zp02dInfantBiospecimenCollections = zp02dInfantBiospecimenCollectionService.getZp02dInfantBiospecimenCollection();
        if (zp02dInfantBiospecimenCollections == null){
            logger.debug("Nulo");
        }
        return zp02dInfantBiospecimenCollections;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02dInfantBiospecimenCollections/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02dInfantBiospecimenCollection> getZp02dInfantBiospecimenCollections(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp02dInfantBiospecimenCollection para el usuario " +username);
        List<Zp02dInfantBiospecimenCollection> zp02dInfantBiospecimenCollections = zp02dInfantBiospecimenCollectionService.getZp02dInfantBiospecimenCollectionByUser(username);
        if (zp02dInfantBiospecimenCollections == null){
            logger.debug("Nulo");
        }
        return zp02dInfantBiospecimenCollections;
    }

    /**
     * Acepta una solicitud POST con un parametro JSON
     * @param envio Objeto serializado de Zp02dInfantBiospecimenCollection
     * @return String con el resultado
     */
    @RequestMapping(value = "zp02dInfantBiospecimenCollections", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp02dInfantBiospecimenCollections(@RequestBody Zp02dInfantBiospecimenCollection[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp02dInfantBiospecimenCollections");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp02dInfantBiospecimenCollection> zp02dInfantBiospecimenCollections = Arrays.asList(envio);
            for (Zp02dInfantBiospecimenCollection zp02dInfantBiospecimenCollection : zp02dInfantBiospecimenCollections){
                zp02dInfantBiospecimenCollectionService.saveZp02dInfantBiospecimenCollection(zp02dInfantBiospecimenCollection);
            }
        }
        return "Datos recibidos!";
    }
}
