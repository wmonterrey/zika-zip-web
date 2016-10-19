package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp02cBiospecimenStorageForm;
import ni.org.ics.zip.service.Zp02cBiospecimenStorageFormService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp02cBiospecimenStorageForm
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp02cBiospecimenStorageFormController {

    @Resource(name = "zp02cBiospecimenStorageFormService")
    private Zp02cBiospecimenStorageFormService zp02cBiospecimenStorageFormService;

    private static final Logger logger = LoggerFactory.getLogger(Zp02cBiospecimenStorageFormController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp02cBiospecimenStorageForms", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp02cBiospecimenStorageForm> getZp02cBiospecimenStorageForms() {
        logger.info("Descargando toda la informacion de los formulario Zp02cBiospecimenStorageForms");
        List<Zp02cBiospecimenStorageForm> zp02cBiospecimenStorageForms = zp02cBiospecimenStorageFormService.getZp02cBiospecimenStorageForm();
        if (zp02cBiospecimenStorageForms == null){
            logger.debug("Nulo");
        }
        return zp02cBiospecimenStorageForms;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp02cBiospecimenStorageForm
     * @return String con el resultado
     */
    @RequestMapping(value = "zp02cBiospecimenStorageForms", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp02cBiospecimenStorageForms(@RequestBody Zp02cBiospecimenStorageForm[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp02cBiospecimenStorageForms");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp02cBiospecimenStorageForm> zp02cBiospecimenStorageForms = Arrays.asList(envio);
            for (Zp02cBiospecimenStorageForm zp02cBiospecimenStorageForm : zp02cBiospecimenStorageForms){
                zp02cBiospecimenStorageFormService.saveZp02cBiospecimenStorageForm(zp02cBiospecimenStorageForm);
            }
        }
        return "Datos recibidos!";
    }
}
