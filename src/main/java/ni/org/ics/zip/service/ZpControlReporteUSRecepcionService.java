package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpControlReporteUSRecepcion;
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
@Service("zpControlReporteUSRecepcionService")
@Transactional
public class ZpControlReporteUSRecepcionService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpControlReporteUSRecepcion
     * @return una lista de ZpControlReporteUSRecepcion
     */
    @SuppressWarnings("unchecked")
    public List<ZpControlReporteUSRecepcion> getZpControlReporteUSRecepcion(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpControlReporteUSRecepcion ");
        return query.list();
    }

    /**
     * Guardar un formulario ZpControlReporteUSRecepcion
     * @param zpControlReporteUSRecepcion a guardar
     */
    public void saveZpControlReporteUSRecepcion(ZpControlReporteUSRecepcion zpControlReporteUSRecepcion){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpControlReporteUSRecepcion);
    }
}
