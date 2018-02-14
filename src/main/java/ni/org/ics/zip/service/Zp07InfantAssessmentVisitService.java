package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp07InfantAssessmentVisit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Service("zp07InfantAssessmentVisitService")
@Transactional
public class Zp07InfantAssessmentVisitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp07InfantAssessmentVisit
     * @return una lista de Zp07InfantAssessmentVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp07InfantAssessmentVisit> getZp07InfantAssessmentVisit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantAssessmentVisit");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp07InfantAssessmentVisit
     * @return una lista de Zp07InfantAssessmentVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zp07InfantAssessmentVisit> getZp07InfantAssessmentVisitByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantAssessmentVisit zp07 where zp07.pasive = '0' and zp07.recordId in (select dInf.recordId from ZpInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0'))))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zp07InfantAssessmentVisit
     * @param zp07InfantAssessmentVisit a guardar
     */
    public void saveZp07InfantAssessmentVisit(Zp07InfantAssessmentVisit zp07InfantAssessmentVisit){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp07InfantAssessmentVisit);
    }
}
