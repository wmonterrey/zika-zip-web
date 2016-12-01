package ni.org.ics.zip.web.controller;

import ni.org.ics.zip.service.AgendaService;
import ni.org.ics.zip.utils.ZpAgendaEmbarazada;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by FIRSTICT on 11/23/2016.
 * V1.0
 */
@Controller
@RequestMapping("/pregnants/diary/*")
public class AgendaController {

    private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);

    @Resource(name = "agendaService")
    private AgendaService agendaService;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String obtenerUsuarios(Model model) throws ParseException {
        logger.debug("Mostrando visitas del dia en JSP");

        String fecha = simpleDateFormat.format(new Date());
        List<ZpAgendaEmbarazada> registrosdia = agendaService.getDiary(fecha);
        model.addAttribute("registros", registrosdia);
        model.addAttribute("today",new Date());
        return "pregnants/enterFormDiary";
    }

    @RequestMapping(value = "getDiary", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List<ZpAgendaEmbarazada> getDetailByHeader(@RequestParam(value = "fecha", required = false) String fecha) throws Exception {
        //String strFecha = simpleDateFormat.format(fecha);
        return agendaService.getDiary(fecha);
    }
}
