package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpControlConsentimientosRecepcion;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 12/2/2016.
 * V1.0
 */
@Service("zpControlConsentimientosRecepcionService")
@Transactional
public class ZpControlConsentimientosRecepcionService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpControlConsentimientosRecepcion
     * @return una lista de ZpControlConsentimientosRecepcion
     */
    @SuppressWarnings("unchecked")
    public List<ZpControlConsentimientosRecepcion> getZpControlConsentimientosRecepcion(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpControlConsentimientosRecepcion ");
        return query.list();
    }

    /**
     * Guardar un formulario ZpControlConsentimientosRecepcion
     * @param zpControlConsentimientosRecepcion a guardar
     */
    public void saveZpControlConsentimientosRecepcion(ZpControlConsentimientosRecepcion zpControlConsentimientosRecepcion){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpControlConsentimientosRecepcion);
    }
}
