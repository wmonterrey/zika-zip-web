package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionFtoK;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp01StudyEntrySectionFtoK
 * Contiene la información del formulario Zp01StudyEntry desde la sección F a la K
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp01StudyEntrySectionFtoKService")
@Transactional
public class Zp01StudyEntrySectionFtoKService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp01StudyEntrySectionFtoK
     * @return una lista de Zp01StudyEntrySectionFtoK
     */
    @SuppressWarnings("unchecked")
    public List<Zp01StudyEntrySectionFtoK> getZp01StudyEntrySectionFtoK(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionFtoK");
        return query.list();
    }
    
    
    /**
     * Retorna todos los formularios Zp01StudyEntrySectionFtoK
     * @return una lista de Zp01StudyEntrySectionFtoK
     */
    @SuppressWarnings("unchecked")
    public List<Zp01StudyEntrySectionFtoK> getZp01StudyEntrySectionFtoKByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionFtoK zp01f where zp01f.pasive = '0' and zp01f.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp01StudyEntrySectionFtoK
     * @param recordId del Zp01StudyEntrySectionFtoK a retornar
     * @return un Zp01StudyEntrySectionFtoK
     */
    public Zp01StudyEntrySectionFtoK getZp01StudyEntrySectionFtoK(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionFtoK where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp01StudyEntrySectionFtoK)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp01StudyEntrySectionFtoK
     * @param zp01StudyEntrySectionFtoK a guardar
     */
    public void saveZp01StudyEntrySectionFtoK(Zp01StudyEntrySectionFtoK zp01StudyEntrySectionFtoK){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp01StudyEntrySectionFtoK);
    }
}
