package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpPreScreening;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 11/11/2016.
 * V1.0
 */
@Service("zpPreScreeningService")
@Transactional
public class ZpPreScreeningService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpPreScreening
     * @return una lista de ZpPreScreening
     */
    @SuppressWarnings("unchecked")
    public List<ZpPreScreening> getZpPreScreening(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpPreScreening");
        return query.list();
    }

    /**
     * Retorna un formulario ZpPreScreening
     * @param recordId del ZpPreScreening a retornar
     * @return un ZpPreScreening
     */
    public ZpPreScreening getZpPreScreening(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpPreScreening where recId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpPreScreening)query.uniqueResult();
    }
    
    /**
     * Retorna todos los formularios ZpPreScreening del usuario username
     * @return una lista de ZpPreScreening
     */
    @SuppressWarnings("unchecked")
    public List<ZpPreScreening> getZpPreScreeningByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario ZpPreScreening
     * @param zpPreScreening a guardar
     */
    public void saveZpPreScreening(ZpPreScreening zpPreScreening){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpPreScreening);
    }
}
