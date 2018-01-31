package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp00aInfantScreening;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp00aInfantScreening
 * Created by ics on 22/1/2018.
 */
@Service("zp00aInfantScreeningService")
@Transactional
public class Zp00aInfantScreeningService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp00aInfantScreening
     * @return una lista de Zp00aInfantScreening
     */
    @SuppressWarnings("unchecked")
    public List<Zp00aInfantScreening> getZp00aInfantScreening(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp00aInfantScreening ");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp00aInfantScreening
     * @return una lista de Zp00aInfantScreening
     */
    @SuppressWarnings("unchecked")
    public List<Zp00aInfantScreening> getZp00aInfantScreeningByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp00aInfantScreening zp00a where zp00a.pregnantId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp00aInfantScreening
     * @param recordId del Zp00aInfantScreening a retornar
     * @return un Zp00aInfantScreening
     */
    public Zp00aInfantScreening getZp00aInfantScreening(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp00aInfantScreening where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp00aInfantScreening)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp00aInfantScreening
     * @param zp00aInfantScreening a guardar
     */
    public void saveZp00aInfantScreening(Zp00aInfantScreening zp00aInfantScreening){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp00aInfantScreening);
    }
}
