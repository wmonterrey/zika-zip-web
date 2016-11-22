package ni.org.ics.zip.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador web de peticiones relacionadas a embarazadas
 * 
 * @author William Avilés
 */
@Controller
@RequestMapping("/pregnants/*")
public class EmbarazadasController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmbarazadasController.class);
	
    @RequestMapping(value = "dashboard", method = RequestMethod.GET)
    public String home(Model model) {
    	logger.info("Pagina principal embarazadas");
        return "home";
    }

	
}
