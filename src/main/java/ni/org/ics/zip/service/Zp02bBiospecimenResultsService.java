package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp02bBiospecimenResults;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp02bBiospecimenResults
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp02bBiospecimenResultsService")
@Transactional
public class Zp02bBiospecimenResultsService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp02bBiospecimenResults
     * @return una lista de Zp02bBiospecimenResults
     */
    @SuppressWarnings("unchecked")
    public List<Zp02bBiospecimenResults> getZp02bBiospecimenResults(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02bBiospecimenResults");
        return query.list();
    }

    /**
     * Retorna un formulario Zp02bBiospecimenResults
     * @param recordId del Zp02bBiospecimenResults a retornar
     * @return un Zp02bBiospecimenResults
     */
    public Zp02bBiospecimenResults getZp02bBiospecimenResults(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02bBiospecimenResults where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp02bBiospecimenResults)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp02bBiospecimenResults
     * @param zp02bBiospecimenResults a guardar
     */
    public void saveZp02bBiospecimenResults(Zp02bBiospecimenResults zp02bBiospecimenResults){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp02bBiospecimenResults);
    }
}
