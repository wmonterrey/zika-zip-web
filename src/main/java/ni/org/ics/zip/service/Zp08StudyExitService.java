package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp08StudyExit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp08StudyExit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp08StudyExitService")
@Transactional
public class Zp08StudyExitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp08StudyExit
     * @return una lista de Zp08StudyExit
     */
    @SuppressWarnings("unchecked")
    public List<Zp08StudyExit> getZp08StudyExit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp08StudyExit");
        return query.list();
    }

    /**
     * Retorna un formulario Zp08StudyExit
     * @param recordId del Zp08StudyExit a retornar
     * @return un Zp08StudyExit
     */
    public Zp08StudyExit getZp08StudyExit(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp08StudyExit where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp08StudyExit)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp08StudyExit
     * @param zp08StudyExit a guardar
     */
    public void saveZp08StudyExit(Zp08StudyExit zp08StudyExit){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp08StudyExit);
    }
}
