package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.domain.ZpInfantData;
import ni.org.ics.zip.service.ZpInfantDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by FIRSTICT on 2/7/2017.
 * V1.0
 */
@Controller
@RequestMapping("/movil/*")
public class ZpInfantDataController {
    @Resource(name = "zpInfantService")
    private ZpInfantDataService zpInfantDataService;
    private static final Logger logger = LoggerFactory.getLogger(ZpInfantDataController.class);


    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpInfants", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpInfantData> getZpInfantsData() {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpInfantData");
        List<ZpInfantData> zpInfantData = zpInfantDataService.getZpInfantData();
        if (zpInfantData == null){
            logger.debug("Nulo");
        }
        return zpInfantData;
    }

    /**
     * Acepta una solicitud GET para JSON
     * @return JSON
     */
    @RequestMapping(value = "zpInfants/{username}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ZpInfantData> getZpInfantsData(@PathVariable String username) {
        logger.info("Descargando toda la informacion de los datos de los formulario ZpInfantData el usuario " +username);
        List<ZpInfantData> zpInfantsDataByUser = zpInfantDataService.getZpInfantsDataByUser(username);
        if (zpInfantsDataByUser == null){
            logger.debug("Nulo");
        }
        return zpInfantsDataByUser;
    }
    /**
     * Acepta una solicitud POST con un par�metro JSON
     * @param envio Objeto serializado de ZpInfantData
     * @return String con el resultado
     */
    @RequestMapping(value = "zpInfants", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    String saveZpInfantsData(@RequestBody ZpInfantData[] envio) {
        logger.debug("Insertando/Actualizando formularios ZpInfantData");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpInfantData> zpInfantDatas = Arrays.asList(envio);
            for (ZpInfantData zpInfantData : zpInfantDatas){
                zpInfantDataService.saveZpInfantData(zpInfantData);
            }
        }
        return "Datos recibidos!";
    }
}
