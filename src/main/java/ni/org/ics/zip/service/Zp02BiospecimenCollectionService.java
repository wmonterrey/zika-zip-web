package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp02BiospecimenCollection;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp02BiospecimenCollection
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp02BiospecimenCollectionService")
@Transactional
public class Zp02BiospecimenCollectionService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp02BiospecimenCollection
     * @return una lista de Zp02BiospecimenCollection
     */
    @SuppressWarnings("unchecked")
    public List<Zp02BiospecimenCollection> getZp02BiospecimenCollection(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02BiospecimenCollection");
        return query.list();
    }

    /**
     * Retorna un formulario Zp02BiospecimenCollection
     * @param recordId del Zp02BiospecimenCollection a retornar
     * @return un Zp02BiospecimenCollection
     */
    public Zp02BiospecimenCollection getZp02BiospecimenCollection(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02BiospecimenCollection where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp02BiospecimenCollection)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp02BiospecimenCollection
     * @param zp02BiospecimenCollection a guardar
     */
    public void saveZp02BiospecimenCollection(Zp02BiospecimenCollection zp02BiospecimenCollection){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp02BiospecimenCollection);
    }
}
