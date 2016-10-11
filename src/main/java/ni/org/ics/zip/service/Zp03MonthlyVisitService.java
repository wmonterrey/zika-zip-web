package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp03MonthlyVisit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto p03MonthlyVisit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp03MonthlyVisitService")
@Transactional
public class Zp03MonthlyVisitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp03MonthlyVisit
     * @return una lista de Zp03MonthlyVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp03MonthlyVisit> getZp03MonthlyVisit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp03MonthlyVisit");
        return query.list();
    }

    /**
     * Retorna un formulario Zp03MonthlyVisit
     * @param recordId del Zp03MonthlyVisit a retornar
     * @return un Zp03MonthlyVisit
     */
    public Zp03MonthlyVisit getZp03MonthlyVisit(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp03MonthlyVisit where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp03MonthlyVisit)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp03MonthlyVisit
     * @param zp03MonthlyVisit a guardar
     */
    public void saveZp03MonthlyVisit(Zp03MonthlyVisit zp03MonthlyVisit){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp03MonthlyVisit);
    }
}
