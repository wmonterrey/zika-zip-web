package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionFtoH;
import ni.org.ics.zip.service.Zp04TrimesterVisitSectionFtoHService;
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
 * Manejo de las solicitudes a la aplicacion mediante JSON para el formulario Zp04TrimesterVisit desde la seccion F a la H
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp04TrimesterVisitSectionFtoHController {
    @Resource(name = "zp04TrimesterVisitSectionFtoHService")
    private Zp04TrimesterVisitSectionFtoHService zp04TrimesterVisitSectionFtoHService;

    private static final Logger logger = LoggerFactory.getLogger(Zp04TrimesterVisitSectionFtoHController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionFtoHs", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp04TrimesterVisitSectionFtoH> getZp04TrimesterVisitSectionFtoHs() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp04TrimesterVisitSectionFtoHs");
        List<Zp04TrimesterVisitSectionFtoH> zp04TrimesterVisitSectionFtoHs = zp04TrimesterVisitSectionFtoHService.getZp04TrimesterVisitSectionFtoH();
        if (zp04TrimesterVisitSectionFtoHs == null){
            logger.debug("Nulo");
        }
        return zp04TrimesterVisitSectionFtoHs;
    }
    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionFtoHs/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp04TrimesterVisitSectionFtoH> getZp04TrimesterVisitSectionFtoHs(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp04TrimesterVisitSectionFtoHs para el usuario " +username);
        List<Zp04TrimesterVisitSectionFtoH> zp04TrimesterVisitSectionFtoHs = zp04TrimesterVisitSectionFtoHService.getZp04TrimesterVisitSectionFtoHByUser(username);
        if (zp04TrimesterVisitSectionFtoHs == null){
            logger.debug("Nulo");
        }
        return zp04TrimesterVisitSectionFtoHs;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de Zp04TrimesterVisitSectionFtoH
     * @return String con el resultado
     */
    @RequestMapping(value = "zp04TrimesterVisitSectionFtoHs", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp04TrimesterVisitSectionFtoHs(@RequestBody Zp04TrimesterVisitSectionFtoH[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp04TrimesterVisitSectionFtoHs");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp04TrimesterVisitSectionFtoH> zp04TrimesterVisitSectionFtoHs = Arrays.asList(envio);
            for (Zp04TrimesterVisitSectionFtoH zp04TrimesterVisitSectionFtoH : zp04TrimesterVisitSectionFtoHs){
                zp04TrimesterVisitSectionFtoHService.saveZp04TrimesterVisitSectionFtoH(zp04TrimesterVisitSectionFtoH);
            }
        }
        return "Datos recibidos!";
    }
}
