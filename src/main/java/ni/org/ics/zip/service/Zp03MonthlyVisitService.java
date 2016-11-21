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
     * Retorna todos los formularios Zp03MonthlyVisit
     * @return una lista de Zp03MonthlyVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp03MonthlyVisit> getZp03MonthlyVisitByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp03MonthlyVisit zp03 where zp03.pasive = '0' and zp03.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
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
