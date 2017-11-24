package ni.org.ics.zip.movil.controller;

import ni.org.ics.zip.service.AgendaService;
import ni.org.ics.zip.service.CatalogosService;
import ni.org.ics.zip.service.UsuarioService;
import ni.org.ics.zip.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * A.L. | 09/11/17 Datos de Agenda Studio
 */
@Controller
@RequestMapping("/movil/*")
public class zpAgendaStudioController {

	@Resource(name = "agendaService")
	private AgendaService zpAgendaStudioService;
	
	 @Resource(name = "catalogosService")
	    private CatalogosService catalogosService;
	
	@Resource(name = "usuarioService")
	private UsuarioService usuarioService;
	
	@Resource(name = "parametersService")
	private ni.org.ics.zip.service.ParametersService parametersService;

	private static final Logger logger = LoggerFactory.getLogger(zpAgendaStudioController.class);

	@RequestMapping(value = "zpAgendaStudio/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ZpAgendaEstudio> getAgendaStudio(@PathVariable String username) {
		logger.info("Descargando toda la informacion de los datos de los formulario zpAgendaStudio para el usuario "
				+ username);
		List<ZpAgendaEstudio> citas = zpAgendaStudioService.getCitasPorUsuario(username);
		if (citas == null) {
			logger.debug("Nulo");
		}
		return citas;
	}
	
	
    @RequestMapping(value = "zpAgendaStudio", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String savezpAgendaStudio(@RequestBody ZpAgendaEstudio[] envio) {
        logger.debug("Insertando/Actualizando formularios Agenda");
        if (envio == null){
            logger.debug("Nulo");
            return "No recibi nada!";
        }
        else{
            List<ZpAgendaEstudio> datosArray = Arrays.asList(envio);
            for (ZpAgendaEstudio obj : datosArray){
            	try {            	
            		obj.setId(0); // Id Autonumerico por lo que la base datos lo creara
            		if(obj.getObs() == null) obj.setObs("");
            		logger.debug("Insertando / Actualizando Cita #" + String.valueOf(obj.getId()));
            		zpAgendaStudioService.saveAppointment(obj);
            	}catch (Exception e) {
            		logger.debug("Error al insertar Cita #" + String.valueOf(obj.getId()) + " | " + e.getMessage());
            	}            	
            }
        }
        return "Datos recibidos!";
    }
	
	@RequestMapping(value = "centers/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ni.org.ics.zip.domain.catalogs.Cs> getUserCenters(@PathVariable String username){
		
		logger.info("Descargando datos de centro por usuario");
		List<ni.org.ics.zip.domain.relationships.UserCenter> u_centros =  this.usuarioService.getCentersUser(username);
		List<ni.org.ics.zip.domain.catalogs.Cs> centers =   new ArrayList<ni.org.ics.zip.domain.catalogs.Cs>();
		for(ni.org.ics.zip.domain.relationships.UserCenter centro :u_centros) {
			ni.org.ics.zip.domain.catalogs.Cs us = new ni.org.ics.zip.domain.catalogs.Cs();
			us.setCs(centro.getUserCenterId().getCenter());
			centers.add(us);
		}
		
		return centers;
	}
	
	@RequestMapping(value = "providers/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ni.org.ics.zip.domain.catalogs.Provider> getProviders(@PathVariable String username){
		
		logger.info("Descargando datos de centro por usuario");
		List<ni.org.ics.zip.domain.catalogs.Provider> proveedores =  this.catalogosService.getProviders();		
		
		return proveedores;
	}
	
	
	@RequestMapping(value = "specialities/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ni.org.ics.zip.domain.catalogs.Speciality> getSpecialities(@PathVariable String username){
		
		logger.info("Descargando datos de especialidades por:" + username);
		
		List<ni.org.ics.zip.domain.catalogs.Speciality> especialidades =   catalogosService.getSpecialities();	
		
		return especialidades;
	}
	
	@RequestMapping(value = "paramerters/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ni.org.ics.zip.utils.Parametros> getParameters(@PathVariable String username){
		
		logger.info("Descargando parametros para la agenda por:" + username);
		
		List<ni.org.ics.zip.utils.Parametros> parametros =   parametersService.getParametros();	
		
		return parametros;
	}
	

}
