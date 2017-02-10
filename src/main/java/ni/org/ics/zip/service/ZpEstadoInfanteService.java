package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpEstadoInfante;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 2/10/2017.
 * V1.0
 */
@Service("zpEstadoInfanteService")
@Transactional
public class ZpEstadoInfanteService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpEstadoInfante
     * @return una lista de ZpEstadoInfante
     */
    @SuppressWarnings("unchecked")
    public List<ZpEstadoInfante> getZpEstadoInfantes(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoInfante");
        return query.list();
    }


    /**
     * Retorna todos los formularios ZpEstadoInfante
     * @return una lista de ZpEstadoInfante
     */
    @SuppressWarnings("unchecked")
    public List<ZpEstadoInfante> getZpEstadoInfantesByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoInfante zpEstInfa where zpEstInfa.recordId in (select zpInDat.recordId from Zp00Screening zp00, ZpInfantData zpInDat where zp00.recordId = zpInDat.pregnantId and zpInDat.pasive = '0' and zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);


        return query.list();
    }

    /**
     * Retorna un formulario ZpEstadoInfante
     * @param recordId del ZpEstadoInfante a retornar
     * @return un ZpEstadoInfante
     */
    public ZpEstadoInfante getZpEstadoInfante(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoInfante where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpEstadoInfante)query.uniqueResult();
    }

    /**
     * Guardar un formulario ZpEstadoInfante
     * @param zpEstadoInfante a guardar
     */
    public void saveZpEstadoInfante(ZpEstadoInfante zpEstadoInfante){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpEstadoInfante);
    }
}
