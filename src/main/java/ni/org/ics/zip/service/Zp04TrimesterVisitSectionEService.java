package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionE;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp04TrimesterVisitSectionE
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp04TrimesterVisitSectionEService")
@Transactional
public class Zp04TrimesterVisitSectionEService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp04TrimesterVisitSectionE
     * @return una lista de Zp04TrimesterVisitSectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zp04TrimesterVisitSectionE> getZp04TrimesterVisitSectionE(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionE");
        return query.list();
    }

    /**
     * Retorna un formulario Zp04TrimesterVisitSectionE
     * @param recordId del Zp04TrimesterVisitSectionE a retornar
     * @return un Zp04TrimesterVisitSectionE
     */
    public Zp04TrimesterVisitSectionE getZp04TrimesterVisitSectionE(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionE where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp04TrimesterVisitSectionE)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp04TrimesterVisitSectionE
     * @param zp04TrimesterVisitSectionE a guardar
     */
    public void saveZp04TrimesterVisitSectionE(Zp04TrimesterVisitSectionE zp04TrimesterVisitSectionE){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp04TrimesterVisitSectionE);
    }
}
