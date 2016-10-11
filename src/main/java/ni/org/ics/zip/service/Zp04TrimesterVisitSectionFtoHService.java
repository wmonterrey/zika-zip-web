package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionFtoH;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp04TrimesterVisitSectionFtoH
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp04TrimesterVisitSectionFtoHService")
@Transactional
public class Zp04TrimesterVisitSectionFtoHService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp04TrimesterVisitSectionFtoH
     * @return una lista de Zp04TrimesterVisitSectionFtoH
     */
    @SuppressWarnings("unchecked")
    public List<Zp04TrimesterVisitSectionFtoH> getZp04TrimesterVisitSectionFtoH(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionFtoH");
        return query.list();
    }

    /**
     * Retorna un formulario Zp04TrimesterVisitSectionFtoH
     * @param recordId del Zp04TrimesterVisitSectionFtoH a retornar
     * @return un Zp04TrimesterVisitSectionFtoH
     */
    public Zp04TrimesterVisitSectionFtoH getZp04TrimesterVisitSectionFtoH(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionFtoH where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp04TrimesterVisitSectionFtoH)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp04TrimesterVisitSectionFtoH
     * @param zp04TrimesterVisitSectionFtoH a guardar
     */
    public void saveZp04TrimesterVisitSectionFtoH(Zp04TrimesterVisitSectionFtoH zp04TrimesterVisitSectionFtoH){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp04TrimesterVisitSectionFtoH);
    }
}
