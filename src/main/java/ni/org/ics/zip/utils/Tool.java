package ni.org.ics.zip.utils;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.google.gson.Gson;

import ni.org.ics.zip.service.ParametersService;

public class Tool {	
	
	 
	 
	public static ResponseEntity<String> createJsonResponse( Object o )
  	{
  	    HttpHeaders headers = new HttpHeaders();
  	    headers.set("Content-Type", "application/json");
  	    Gson gson = new Gson();
  	    String json = gson.toJson(o);
  	    return new ResponseEntity<String>( json, headers, HttpStatus.CREATED );
  	}
    
	public static ResponseEntity<String> createJsonResponse( Respuesta o )
  	{
  	    HttpHeaders headers = new HttpHeaders();
  	    headers.set("Content-Type", "application/json");
  	    Gson gson = new Gson();
  	    String json = gson.toJson(o);
  	    return new ResponseEntity<String>( json, headers, o.getHttpStatus() );
  	}
	
	public static void SetPatametersToModel(org.springframework.ui.Model model,ParametersService parametersService, String filtro) {
		
		try {
			
			  List<Parametros> parametros = parametersService.getParametoPorOpcion(filtro);     
			  for(Parametros parametro:parametros) 
	        	  model.addAttribute(parametro.getName(), parametro.getValue());
	        
		}
		catch (Exception ex) {
			return ;
		}
	
	}
	
    public static String StringToUnicode(String frase) {
    	
    	String fraseUnicode = frase.replaceAll("Á", "\\u00C1");
    	fraseUnicode = frase.replaceAll("á", "\\u00E1");
    	fraseUnicode = frase.replaceAll("É", "\\u00C9");
    	fraseUnicode = frase.replaceAll("é", "\\u00E9");
    	fraseUnicode = frase.replaceAll("Í", "\\u00CD");
    	fraseUnicode = frase.replaceAll("í", "\\u00ED");
    	fraseUnicode = frase.replaceAll("Ó", "\\u00D3");
    	fraseUnicode = frase.replaceAll("ó", "\\u00F3");
    	fraseUnicode = frase.replaceAll("Ú", "\\u00DA");
    	fraseUnicode = frase.replaceAll("ú", "\\u00FA");
    	fraseUnicode = frase.replaceAll("Ñ", "\\u00D1");
    	fraseUnicode = frase.replaceAll("ñ", "\\u00F1");
    	
    	return fraseUnicode;
    	
    }


}
