package ni.org.ics.zip.service;
import java.util.List;


import ni.org.ics.zip.utils.Parametros;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Alex Lopez on 09/10/2017.

 */
@Service("parametersService")
@Transactional
public class ParametersService {
	
	 @Resource(name="sessionFactory")
	 private SessionFactory sessionFactory;
	 
	@SuppressWarnings("unchecked")
	public List<Parametros> getParametros() {
			
			
		    Session session = sessionFactory.getCurrentSession();
		
		
	        Query query = session.createQuery("from Parametros");
		        
		 
			return query.list();
		
	}
	
	public Parametros getParametoPorNombre(String name) {
		
		try
		{
		    Session session = sessionFactory.getCurrentSession();
		
		
	        Query query = session.createQuery("from Parametros where name = :nombre");
		    query.setParameter("nombre", name);
		 
			return (Parametros)query.uniqueResult();
		}
		catch (Exception ex){
			return null;
		}
	
	}
	
	 @SuppressWarnings("unchecked")
	public List<Parametros> getParametoPorOpcion(String opcion) {
		
		
	    Session session = sessionFactory.getCurrentSession();
	
	    String str = "from Parametros where name like ('" + opcion + "%')";
	    
        Query query = session.createQuery(str);
	    
	 
		return query.list();
	
	}

}
