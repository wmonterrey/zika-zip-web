package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpDatosEmbarazada;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 11/7/2016.
 * V1.0
 */
@Service("zpDatosEmbarazadaService")
@Transactional
public class ZpDatosEmbarazadaService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpDatosEmbarazada
     * @return una lista de ZpDatosEmbarazada
     */
    @SuppressWarnings("unchecked")
    public List<ZpDatosEmbarazada> getZpDatosEmbarazadas(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpDatosEmbarazada");
        return query.list();
    }

    /**
     * Retorna un formulario ZpDatosEmbarazada
     * @param recordId del ZpDatosEmbarazada a retornar
     * @return un ZpDatosEmbarazada
     */
    public ZpDatosEmbarazada getZpDatosEmbarazada(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpDatosEmbarazada where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpDatosEmbarazada)query.uniqueResult();
    }

    /**
     * Guardar un formulario ZpDatosEmbarazada
     * @param zpDatosEmbarazada a guardar
     */
    public void saveZpDatosEmbarazada(ZpDatosEmbarazada zpDatosEmbarazada){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpDatosEmbarazada);
    }
}
