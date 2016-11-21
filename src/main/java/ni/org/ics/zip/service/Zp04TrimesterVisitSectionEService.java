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
     * Retorna todos los formularios Zp04TrimesterVisitSectionE
     * @return una lista de Zp04TrimesterVisitSectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zp04TrimesterVisitSectionE> getZp04TrimesterVisitSectionEByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionE zp04e where zp04e.pasive = '0' and zp04e.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
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
