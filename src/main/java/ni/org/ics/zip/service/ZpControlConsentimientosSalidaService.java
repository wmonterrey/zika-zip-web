package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpControlConsentimientosSalida;
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
@Service("zpControlConsentimientosSalidaService")
@Transactional
public class ZpControlConsentimientosSalidaService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpControlConsentimientosSalida
     * @return una lista de ZpControlConsentimientosSalida
     */
    @SuppressWarnings("unchecked")
    public List<ZpControlConsentimientosSalida> getZpControlConsentimientosSalida(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpControlConsentimientosSalida");
        return query.list();
    }

    /**
     * Guardar un formulario ZpControlConsentimientosSalida
     * @param zpControlConsentimientosSalida a guardar
     */
    public void saveZpControlConsentimientosSalida(ZpControlConsentimientosSalida zpControlConsentimientosSalida){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpControlConsentimientosSalida);
    }
}
