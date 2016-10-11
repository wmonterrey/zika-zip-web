package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp05UltrasoundExam;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp05UltrasoundExam
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp05UltrasoundExamService")
@Transactional
public class Zp05UltrasoundExamService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp05UltrasoundExam
     * @return una lista de Zp05UltrasoundExam
     */
    @SuppressWarnings("unchecked")
    public List<Zp05UltrasoundExam> getZp05UltrasoundExam(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp05UltrasoundExam");
        return query.list();
    }

    /**
     * Retorna un formulario Zp05UltrasoundExam
     * @param recordId del Zp05UltrasoundExam a retornar
     * @return un Zp05UltrasoundExam
     */
    public Zp05UltrasoundExam getZp05UltrasoundExam(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp05UltrasoundExam where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp05UltrasoundExam)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp05UltrasoundExam
     * @param zp05UltrasoundExam a guardar
     */
    public void saveZp05UltrasoundExam(Zp05UltrasoundExam zp05UltrasoundExam){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp05UltrasoundExam);
    }
}
