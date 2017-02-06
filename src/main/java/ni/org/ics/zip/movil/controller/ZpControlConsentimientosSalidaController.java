package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpControlConsentimientosSalida;
import ni.org.ics.zip.service.ZpControlConsentimientosSalidaService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario ZpControlConsentimientosSalida
 * Created by FIRSTICT on 11/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpControlConsentimientosSalidaController {

    @Resource(name = "zpControlConsentimientosSalidaService")
    private ZpControlConsentimientosSalidaService zpControlConsentimientosSalidaService;
    private static final Logger logger = LoggerFactory.getLogger(ZpControlConsentimientosSalidaController.class);

    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpSalidaCons", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpControlConsentimientosSalida> getZpControlConsentimientosSalida() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpControlConsentimientosSalida");
        List<ZpControlConsentimientosSalida> mZpControlConsentimientosSalida = zpControlConsentimientosSalidaService.getZpControlConsentimientosSalida();
        if (mZpControlConsentimientosSalida == null){
            logger.debug("Nulo");
        }
        return mZpControlConsentimientosSalida;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpControlConsentimientosSalida
     * @return String con el resultado
     */
    @RequestMapping(value = "zpSalidaCons", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpControlConsentimientosSalida(@RequestBody ZpControlConsentimientosSalida[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpControlConsentimientosSalida");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpControlConsentimientosSalida> zpConsSal = Arrays.asList(envio);
            for (ZpControlConsentimientosSalida zpPreScreening : zpConsSal){
            	zpControlConsentimientosSalidaService.saveZpControlConsentimientosSalida(zpPreScreening);
            }
        }
        return "Datos recibidos!";
    }
}
