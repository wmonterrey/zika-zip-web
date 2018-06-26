package ni.org.ics.zip.web.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ni.org.ics.zip.domain.*;
import ni.org.ics.zip.service.*;
import ni.org.ics.zip.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/infants/*")
public class RegisterInfantController {

    private static final Logger logger = LoggerFactory.getLogger(RegisterInfantController.class);

    @Resource(name="zp00ScreeningService")
    private Zp00ScreeningService zp00ScreeningService;

    @Resource(name="zp08StudyExitService")
    private Zp08StudyExitService zp08StudyExitService;

    @Resource(name="registerInfantService")
    private RegisterInfantService registerInfantService;

    @Resource(name="zpEstadoInfanteService")
    private ZpEstadoInfanteService zpEstadoInfanteService;

    @Resource(name="zpInfantService")
    private ZpInfantDataService zpInfantService;

    @Resource(name="usuarioService")
    private UsuarioService usuarioService;

    @Resource(name="messageResourceService")
    private MessageResourceService datosMensajes;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String initForm(Model model) throws ParseException, Exception {
        logger.debug("Pantalla de inicio de Registro de Infante");
        return "infants/enterForm";
    }

    @RequestMapping(value = "saveInfant", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void processSaveInfantForm(HttpServletResponse response, HttpServletRequest request) throws Exception {

        ZpEstadoInfante estInf1 = null;
        ZpEstadoInfante estInf2 = null;
        ZpEstadoInfante estInf3 = null;
        ZpInfantData dataInf1 = null;
        ZpInfantData dataInf2 = null;
        ZpInfantData dataInf3 = null;
        String resultado = "";
        String error = "";
        String json = "";
        String id = "";
        String consent = "";
        String deliveryDate = "";
        String numBirth = "";

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF8"));
            json = br.readLine();
            //Recuperando Json enviado desde el cliente
            JsonObject jsonpObject = new Gson().fromJson(json, JsonObject.class);

            if(jsonpObject.get("id") != null && !jsonpObject.get("id").getAsString().isEmpty() ) {
                id = jsonpObject.get("id").getAsString();
            }
            if(jsonpObject.get("deliveryDate") != null && !jsonpObject.get("deliveryDate").getAsString().isEmpty() ) {
                deliveryDate = jsonpObject.get("deliveryDate").getAsString();
            }

            if(jsonpObject.get("numBirth") != null && !jsonpObject.get("numBirth").getAsString().isEmpty() ) {
                numBirth = jsonpObject.get("numBirth").getAsString();
            }

            if(jsonpObject.get("consent") != null && !jsonpObject.get("consent").getAsString().isEmpty() ) {
                consent = jsonpObject.get("consent").getAsString();
            }


            //search pregnantId
            Zp00Screening pregnant = zp00ScreeningService.getZp00Screening(id);

            if (pregnant != null){
                //check if there is no exist
                Zp08StudyExit exitRecord = zp08StudyExitService.getZp08StudyExit(id);

                if (exitRecord != null){
                    resultado = datosMensajes.getMessageByKey("msj_exit_records");
                    error = "error";


                }else{
                    List<ZpInfantData> infantData = registerInfantService.getZpInfantsDataByPregnantId(id);
                    if (infantData.size() > 0) {
                        resultado =  datosMensajes.getMessageByKey("msj_existing_records");
                        error = "error";

                    }else{
                        if (numBirth.matches("1")) {
                            dataInf1 = completeInfantData(1, id, deliveryDate, consent);
                            estInf1 = new ZpEstadoInfante(dataInf1.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());

                            zpInfantService.saveZpInfantData(dataInf1);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf1);
                            resultado = datosMensajes.getMessageByKey("msj_saved_record");
                        } else if (numBirth.matches("2")) {
                            dataInf1 = completeInfantData(1, id, deliveryDate, consent);
                            dataInf2 = completeInfantData(2, id, deliveryDate, consent);
                            estInf1 = new ZpEstadoInfante(dataInf1.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());
                            estInf2 = new ZpEstadoInfante(dataInf2.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());

                            zpInfantService.saveZpInfantData(dataInf1);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf1);
                            zpInfantService.saveZpInfantData(dataInf2);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf2);
                            resultado = datosMensajes.getMessageByKey("msj_saved_record");

                        } else {
                            dataInf1 = completeInfantData(1, id, deliveryDate, consent);
                            dataInf2 = completeInfantData(2, id, deliveryDate, consent);
                            dataInf3 = completeInfantData(3, id, deliveryDate, consent);
                            estInf1 = new ZpEstadoInfante(dataInf1.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());
                            estInf2 = new ZpEstadoInfante(dataInf2.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());
                            estInf3 = new ZpEstadoInfante(dataInf3.getRecordId(), '0', '0', '0', '0', new Date(),
                                    username, '0', null, null, "enviado", null, null, null, null, null, new Date());

                            zpInfantService.saveZpInfantData(dataInf1);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf1);
                            zpInfantService.saveZpInfantData(dataInf2);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf2);
                            zpInfantService.saveZpInfantData(dataInf3);
                            zpEstadoInfanteService.saveZpEstadoInfante(estInf3);
                            resultado = datosMensajes.getMessageByKey("msj_saved_record");

                        }
                    }
                }

            }else{
                resultado = datosMensajes.getMessageByKey("msj_record_not_found");
                error = "error";
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            ex.printStackTrace();
            resultado = resultado + ". \n " + ex.toString();
            error = "error";
        } finally {
            Map<String, String> map = new HashMap<String, String>();
            map.put("mensaje", resultado);
            map.put("error",error);
            String jsonResponse = new Gson().toJson(map);
            response.getOutputStream().write(jsonResponse.getBytes());
            response.getOutputStream().close();
        }

    }

    private ZpInfantData completeInfantData(Integer numInfante, String pregnantId, String deliveryDate, String consent) throws ParseException {
        String madreId = pregnantId;
        String bebeId = null;

        if (numInfante == 1) {
            bebeId = madreId.substring(0, madreId.length() - 2) + "1" + madreId.substring(madreId.length() - 1, madreId.length());
        } else if (numInfante == 2) {
            bebeId = madreId.substring(0, madreId.length() - 2) + "2" + madreId.substring(madreId.length() - 1, madreId.length());
        } else if (numInfante == 3) {
            bebeId = madreId.substring(0, madreId.length() - 2) + "3" + madreId.substring(madreId.length() - 1, madreId.length());
        }
        ZpInfantData data = new ZpInfantData();
        data.setRecordId(bebeId);
        data.setPregnantId(madreId);
        data.setInfantBirthDate(DateUtil.StringToDate(deliveryDate, "dd/MM/yyyy"));
        data.setInfantNumBirth(String.valueOf(numInfante));
        data.setEstado("enviado");
        data.setInfantConsentInfant(consent);
        data.setIdInstancia(0);
        data.setToday(new Date());
        data.setRecordDate(new Date());
        data.setRecordUser(SecurityContextHolder.getContext().getAuthentication().getName());
        return data;
    }


}
