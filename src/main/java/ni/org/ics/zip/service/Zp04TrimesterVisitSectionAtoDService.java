package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp04TrimesterVisitSectionAtoD;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp04TrimesterVisitSectionAtoD
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp04TrimesterVisitSectionAtoDService")
@Transactional
public class Zp04TrimesterVisitSectionAtoDService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp04TrimesterVisitSectionAtoD
     * @return una lista de Zp04TrimesterVisitSectionAtoD
     */
    @SuppressWarnings("unchecked")
    public List<Zp04TrimesterVisitSectionAtoD> getZp04TrimesterVisitSectionAtoD(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionAtoD");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zp04TrimesterVisitSectionAtoD
     * @return una lista de Zp04TrimesterVisitSectionAtoD
     */
    @SuppressWarnings("unchecked")
    public List<Zp04TrimesterVisitSectionAtoD> getZp04TrimesterVisitSectionAtoDByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionAtoD zp04 where zp04.pasive = '0' and zp04.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp04TrimesterVisitSectionAtoD
     * @param recordId del Zp04TrimesterVisitSectionAtoD a retornar
     * @return un Zp04TrimesterVisitSectionAtoD
     */
    public Zp04TrimesterVisitSectionAtoD getZp04TrimesterVisitSectionAtoD(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp04TrimesterVisitSectionAtoD where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp04TrimesterVisitSectionAtoD)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp04TrimesterVisitSectionAtoD
     * @param zp04TrimesterVisitSectionAtoD a guardar
     */
    public void saveZp04TrimesterVisitSectionAtoD(Zp04TrimesterVisitSectionAtoD zp04TrimesterVisitSectionAtoD){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp04TrimesterVisitSectionAtoD);
    }
}
