package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionAtoD;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp01StudyEntrySectionAtoD
 * Contiene la información del formulario Zp01StudyEntry desde la sección A a la D
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp01StudyEntrySectionAtoDService")
@Transactional
public class Zp01StudyEntrySectionAtoDService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp01StudyEntrySectionAtoD
     * @return una lista de Zp01StudyEntrySectionAtoD
     */
    @SuppressWarnings("unchecked")
    public List<Zp01StudyEntrySectionAtoD> getZp01StudyEntrySectionAtoD(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionAtoD");
        return query.list();
    }

    /**
     * Retorna un formulario Zp01StudyEntrySectionAtoD
     * @param recordId del Zp01StudyEntrySectionAtoD a retornar
     * @return un Zp01StudyEntrySectionAtoD
     */
    public Zp01StudyEntrySectionAtoD getZp01StudyEntrySectionAtoD(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionAtoD where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp01StudyEntrySectionAtoD)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp01StudyEntry desde la sección A a la D
     * @param zp01StudyEntrySectionAtoD a guardar
     */
    public void saveZp01StudyEntrySectionAtoD(Zp01StudyEntrySectionAtoD zp01StudyEntrySectionAtoD){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp01StudyEntrySectionAtoD);
    }
}
