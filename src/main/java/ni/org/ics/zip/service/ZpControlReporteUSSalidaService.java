package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpControlReporteUSSalida;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 12/2/2016.
 * V1.0
 */
@Service("zpControlReporteUSSalidaService")
@Transactional
public class ZpControlReporteUSSalidaService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpControlReporteUSSalida
     * @return una lista de ZpControlReporteUSSalida
     */
    @SuppressWarnings("unchecked")
    public List<ZpControlReporteUSSalida> getZpControlReporteUSSalida(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpControlReporteUSSalida ");
        return query.list();
    }

    /**
     * Guardar un formulario ZpControlReporteUSSalida
     * @param zpControlReporteUSSalida a guardar
     */
    public void saveZpControlReporteUSSalida(ZpControlReporteUSSalida zpControlReporteUSSalida){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpControlReporteUSSalida);
    }

}
