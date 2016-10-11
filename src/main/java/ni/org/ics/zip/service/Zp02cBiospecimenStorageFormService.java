package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp02cBiospecimenStorageForm;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp02cBiospecimenStorageForm
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp02cBiospecimenStorageFormService")
@Transactional
public class Zp02cBiospecimenStorageFormService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp02cBiospecimenStorageForm
     * @return una lista de Zp02cBiospecimenStorageForm
     */
    @SuppressWarnings("unchecked")
    public List<Zp02cBiospecimenStorageForm> getZp02cBiospecimenStorageForm(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02cBiospecimenStorageForm");
        return query.list();
    }

    /**
     * Retorna un formulario Zp02cBiospecimenStorageForm
     * @param recordId del Zp02cBiospecimenStorageForm a retornar
     * @return un Zp02cBiospecimenStorageForm
     */
    public Zp02cBiospecimenStorageForm getZp02cBiospecimenStorageForm(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02cBiospecimenStorageForm where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp02cBiospecimenStorageForm)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp02cBiospecimenStorageForm
     * @param zp02cBiospecimenStorageForm a guardar
     */
    public void saveZp02cBiospecimenStorageForm(Zp02cBiospecimenStorageForm zp02cBiospecimenStorageForm){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp02cBiospecimenStorageForm);
    }
}
