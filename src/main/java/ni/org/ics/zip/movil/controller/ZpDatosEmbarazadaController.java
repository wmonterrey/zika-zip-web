package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpDatosEmbarazada;
import ni.org.ics.zip.service.ZpDatosEmbarazadaService;
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
 * Manejo de las solicitudes a la aplicaci�n mediante JSON para el formulario Zp00Screening
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpDatosEmbarazadaController {
    @Resource(name = "zpDatosEmbarazadaService")
    private ZpDatosEmbarazadaService zpDatosEmbarazadaService;

    private static final Logger logger = LoggerFactory.getLogger(ZpDatosEmbarazadaController.class);

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpDatosEmb", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpDatosEmbarazada> getZpDatosEmbarazadas() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpDatosEmbarazada");
        List<ZpDatosEmbarazada> zpDatosEmbarazadas = zpDatosEmbarazadaService.getZpDatosEmbarazadas();
        if (zpDatosEmbarazadas == null){
            logger.debug("Nulo");
        }
        return zpDatosEmbarazadas;
    }

    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpDatosEmbarazada
     * @return String con el resultado
     */
    @RequestMapping(value = "zpDatosEmb", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String saveZpDatosEmbarazada(@RequestBody ZpDatosEmbarazada[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpDatosEmbarazada");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpDatosEmbarazada> zpDatosEmbarazadas = Arrays.asList(envio);
            for (ZpDatosEmbarazada zpDatosEmbarazada : zpDatosEmbarazadas){
            	zpDatosEmbarazadaService.saveZpDatosEmbarazada(zpDatosEmbarazada);
            }
        }
        return "Datos recibidos!";
    }
}
