package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpControlReporteUSSalida;
import ni.org.ics.zip.service.ZpControlReporteUSSalidaService;
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
 * Manejo de las solicitudes a la aplicación mediante JSON para el formulario ZpControlReporteUSSalida
 * Created by FIRSTICT on 12/2/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpControlReporteUSSalidaController {
    @Resource(name = "zpControlReporteUSSalidaService")
    private ZpControlReporteUSSalidaService zpControlReporteUSSalidaService;
    private static final Logger logger = LoggerFactory.getLogger(ZpControlReporteUSSalidaController.class);

    
    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpSalidaUS", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpControlReporteUSSalida> getZpControlReporteUSSalida() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpControlReporteUSSalida");
        List<ZpControlReporteUSSalida> mZpControlReporteUSSalida = zpControlReporteUSSalidaService.getZpControlReporteUSSalida();
        if (mZpControlReporteUSSalida == null){
            logger.debug("Nulo");
        }
        return mZpControlReporteUSSalida;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpControlReporteUSSalida
     * @return String con el resultado
     */
    @RequestMapping(value = "zpSalidaUS", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String saveZpControlReporteUSSalida(@RequestBody ZpControlReporteUSSalida[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpControlReporteUSSalida");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpControlReporteUSSalida> zpReporteUsSalidas = Arrays.asList(envio);
            for (ZpControlReporteUSSalida reporteUSSalida : zpReporteUsSalidas){
                zpControlReporteUSSalidaService.saveZpControlReporteUSSalida(reporteUSSalida);
            }
        }
        return "Datos recibidos!";
    }
}
