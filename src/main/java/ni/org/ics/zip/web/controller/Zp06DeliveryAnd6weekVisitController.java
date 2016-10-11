package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.domain.Zp06DeliveryAnd6weekVisit;
import ni.org.ics.zip.service.Zp06DeliveryAnd6weekVisitService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp06DeliveryAnd6weekVisit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/zikazip/*")
public class Zp06DeliveryAnd6weekVisitController {
    @Resource(name = "zp06DeliveryAnd6weekVisitService")
    private Zp06DeliveryAnd6weekVisitService zp06DeliveryAnd6weekVisitService;

    private static final Logger logger = LoggerFactory.getLogger(Zp06DeliveryAnd6weekVisitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp06DeliveryAnd6weekVisits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp06DeliveryAnd6weekVisit> getZp06DeliveryAnd6weekVisits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp06DeliveryAnd6weekVisit");
        List<Zp06DeliveryAnd6weekVisit> zp06DeliveryAnd6weekVisits = zp06DeliveryAnd6weekVisitService.getZp06DeliveryAnd6weekVisit();
        if (zp06DeliveryAnd6weekVisits == null){
            logger.debug("Nulo");
        }
        return zp06DeliveryAnd6weekVisits;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp06DeliveryAnd6weekVisit
     * @return String con el resultado
     */
    @RequestMapping(value = "zp06DeliveryAnd6weekVisits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp06DeliveryAnd6weekVisits(@RequestBody Zp06DeliveryAnd6weekVisit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp06DeliveryAnd6weekVisit");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp06DeliveryAnd6weekVisit> zp06DeliveryAnd6weekVisits = Arrays.asList(envio);
            for (Zp06DeliveryAnd6weekVisit zp06DeliveryAnd6weekVisit : zp06DeliveryAnd6weekVisits){
                zp06DeliveryAnd6weekVisitService.saveZp06DeliveryAnd6weekVisit(zp06DeliveryAnd6weekVisit);
            }
        }
        return "Datos recibidos!";
    }
}
