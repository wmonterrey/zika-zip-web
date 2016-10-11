package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp02BiospecimenCollectionSectionB;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp02BiospecimenCollectionSectionB
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp02BiospecimenCollectionSectionBService")
@Transactional
public class Zp02BiospecimenCollectionSectionBService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp02BiospecimenCollectionSectionB
     * @return una lista de Zp02BiospecimenCollectionSectionB
     */
    @SuppressWarnings("unchecked")
    public List<Zp02BiospecimenCollectionSectionB> getZp02BiospecimenCollectionSectionB(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02BiospecimenCollectionSectionB");
        return query.list();
    }

    /**
     * Retorna un formulario Zp02BiospecimenCollectionSectionB
     * @param recordId del Zp02BiospecimenCollectionSectionB a retornar
     * @return un Zp02BiospecimenCollectionSectionB
     */
    public Zp02BiospecimenCollectionSectionB getZp02BiospecimenCollectionSectionB(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02BiospecimenCollectionSectionB where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp02BiospecimenCollectionSectionB)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp02BiospecimenCollectionSectionB
     * @param zp02BiospecimenCollectionSectionB a guardar
     */
    public void saveZp02BiospecimenCollectionSectionB(Zp02BiospecimenCollectionSectionB zp02BiospecimenCollectionSectionB){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp02BiospecimenCollectionSectionB);
    }
}
