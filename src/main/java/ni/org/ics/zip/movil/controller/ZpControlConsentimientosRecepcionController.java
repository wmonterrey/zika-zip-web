package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpControlConsentimientosRecepcion;
import ni.org.ics.zip.service.ZpControlConsentimientosRecepcionService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario ZpControlConsentimientosRecepcion
 * Created by FIRSTICT on 12/2/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpControlConsentimientosRecepcionController {

    @Resource(name = "zpControlConsentimientosRecepcionService")
    private ZpControlConsentimientosRecepcionService zpControlConsentimientosRecepcionService;
    private static final Logger logger = LoggerFactory.getLogger(ZpControlConsentimientosRecepcionController.class);


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpControlConsentimientosRecepcion
     * @return String con el resultado
     */
    @RequestMapping(value = "zpRecepcionCons", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String saveZpControlConsentimientosRecepcion(@RequestBody ZpControlConsentimientosRecepcion[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpControlConsentimientosRecepcion");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpControlConsentimientosRecepcion> zpConsRecepcion = Arrays.asList(envio);
            for (ZpControlConsentimientosRecepcion consentimientosRecepcion : zpConsRecepcion){
                zpControlConsentimientosRecepcionService.saveZpControlConsentimientosRecepcion(consentimientosRecepcion);
            }
        }
        return "Datos recibidos!";
    }
}
