package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp01StudyEntrySectionE;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp01StudyEntrySectionE
 * Contiene la informacion de la seccion E del formulario Zp01StudyEntry
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zp01StudyEntrySectionEService")
@Transactional
public class Zp01StudyEntrySectionEService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp01StudyEntry Secci�n E
     * @return una lista de Zp01StudyEntrySectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zp01StudyEntrySectionE> getZp01StudyEntrySectionE(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionE");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zp01StudyEntry Secci�n E
     * @return una lista de Zp01StudyEntrySectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zp01StudyEntrySectionE> getZp01StudyEntrySectionEByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionE zp01e where zp01e.pasive = '0' and zp01e.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp01StudyEntry Secci�n E
     * @param recordId del Zp01StudyEntrySectionE a retornar
     * @return un Zp01StudyEntrySectionE
     */
    public Zp01StudyEntrySectionE getZp01StudyEntrySectionE(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp01StudyEntrySectionE where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp01StudyEntrySectionE)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp01StudyEntry Secci�n E
     * @param zp01StudyEntrySectionE a guardar
     */
    public void saveZp01StudyEntrySectionE(Zp01StudyEntrySectionE zp01StudyEntrySectionE){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp01StudyEntrySectionE);
    }
}
