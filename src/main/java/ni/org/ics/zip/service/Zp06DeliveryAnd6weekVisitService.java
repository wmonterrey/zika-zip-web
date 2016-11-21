package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp06DeliveryAnd6weekVisit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp06DeliveryAnd6weekVisit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp06DeliveryAnd6weekVisitService")
@Transactional
public class Zp06DeliveryAnd6weekVisitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp06DeliveryAnd6weekVisit
     * @return una lista de Zp06DeliveryAnd6weekVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp06DeliveryAnd6weekVisit> getZp06DeliveryAnd6weekVisit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp06DeliveryAnd6weekVisit");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zp06DeliveryAnd6weekVisit
     * @return una lista de Zp06DeliveryAnd6weekVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp06DeliveryAnd6weekVisit> getZp06DeliveryAnd6weekVisitByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp06DeliveryAnd6weekVisit zp06 where zp06.pasive = '0' and zp06.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp06DeliveryAnd6weekVisit
     * @param recordId del Zp06DeliveryAnd6weekVisit a retornar
     * @return un Zp06DeliveryAnd6weekVisit
     */
    public Zp06DeliveryAnd6weekVisit getZp06DeliveryAnd6weekVisit(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp06DeliveryAnd6weekVisit where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp06DeliveryAnd6weekVisit)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp06DeliveryAnd6weekVisit
     * @param zp06DeliveryAnd6weekVisit a guardar
     */
    public void saveZp06DeliveryAnd6weekVisit(Zp06DeliveryAnd6weekVisit zp06DeliveryAnd6weekVisit){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp06DeliveryAnd6weekVisit);
    }
}
