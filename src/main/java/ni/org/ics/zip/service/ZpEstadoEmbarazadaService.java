package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpEstadoEmbarazada;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto ZpEstadoEmbarazada
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpEstadoEmbarazadaService")
@Transactional
public class ZpEstadoEmbarazadaService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpEstadoEmbarazada
     * @return una lista de ZpEstadoEmbarazada
     */
    @SuppressWarnings("unchecked")
    public List<ZpEstadoEmbarazada> getZpEstadoEmbarazada(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoEmbarazada");
        return query.list();
    }
    
    
    /**
     * Retorna todos los formularios ZpEstadoEmbarazada
     * @return una lista de ZpEstadoEmbarazada
     */
    @SuppressWarnings("unchecked")
    public List<ZpEstadoEmbarazada> getZpEstadoEmbarazadByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoEmbarazada zpEstado where zpEstado.pasive = '0' and zpEstado.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario ZpEstadoEmbarazada
     * @param recordId del ZpEstadoEmbarazada a retornar
     * @return un ZpEstadoEmbarazada
     */
    public ZpEstadoEmbarazada getZpEstadoEmbarazada(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpEstadoEmbarazada where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpEstadoEmbarazada)query.uniqueResult();
    }

    /**
     * Guardar un formulario ZpEstadoEmbarazada
     * @param zpEstadoEmbarazada a guardar
     */
    public void saveZpEstadoEmbarazada(ZpEstadoEmbarazada zpEstadoEmbarazada){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpEstadoEmbarazada);
    }
}
