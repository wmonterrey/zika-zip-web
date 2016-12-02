package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpControlReporteUSRecepcion;
import ni.org.ics.zip.service.ZpControlReporteUSRecepcionService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario ZpControlReporteUSRecepcion
 * Created by FIRSTICT on 12/2/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpControlReporteUSRecepcionController {
    @Resource(name = "zpControlReporteUSRecepcionService")
    private ZpControlReporteUSRecepcionService zpControlReporteUSRecepcionService;
    private static final Logger logger = LoggerFactory.getLogger(ZpControlReporteUSRecepcionController.class);


    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpControlReporteUSRecepcion
     * @return String con el resultado
     */
    @RequestMapping(value = "zpRecepcionUS", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String saveZpControlReporteUSRecepcion(@RequestBody ZpControlReporteUSRecepcion[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpControlReporteUSRecepcion");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpControlReporteUSRecepcion> reporteUSRecepcions = Arrays.asList(envio);
            for (ZpControlReporteUSRecepcion reporteUSRecepcion : reporteUSRecepcions){
                zpControlReporteUSRecepcionService.saveZpControlReporteUSRecepcion(reporteUSRecepcion);
            }
        }
        return "Datos recibidos!";
    }
}
