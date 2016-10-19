package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.Zp03MonthlyVisit;
import ni.org.ics.zip.service.Zp03MonthlyVisitService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario Zp03MonthlyVisit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class Zp03MonthlyVisitController {

    @Resource(name = "zp03MonthlyVisitService")
    private Zp03MonthlyVisitService zp03MonthlyVisitService;

    private static final Logger logger = LoggerFactory.getLogger(Zp03MonthlyVisitController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zp03MonthlyVisits", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<Zp03MonthlyVisit> getZp03MonthlyVisits() {
        logger.info("Descargando toda la informacion de los datos de los formulario Zp03MonthlyVisit");
        List<Zp03MonthlyVisit> zp03MonthlyVisit = zp03MonthlyVisitService.getZp03MonthlyVisit();
        if (zp03MonthlyVisit == null){
            logger.debug("Nulo");
        }
        return zp03MonthlyVisit;
    }

    /**
     * Acepta una solicitud POST con un parámetro JSON
     * @param envio Objeto serializado de Zp03MonthlyVisit
     * @return String con el resultado
     */
    @RequestMapping(value = "zp03MonthlyVisits", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZp03MonthlyVisits(@RequestBody Zp03MonthlyVisit[] envio) {
        logger.debug("Insertando/Actualizando formularios Zp03MonthlyVisits");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<Zp03MonthlyVisit> zp03MonthlyVisits = Arrays.asList(envio);
            for (Zp03MonthlyVisit zp03MonthlyVisit : zp03MonthlyVisits){
                zp03MonthlyVisitService.saveZp03MonthlyVisit(zp03MonthlyVisit);
            }
        }
        return "Datos recibidos!";
    }

}
