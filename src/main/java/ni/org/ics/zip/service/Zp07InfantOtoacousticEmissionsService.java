package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp00aInfantScreening;
import ni.org.ics.zip.domain.Zp07InfantOtoacousticEmissions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zp07InfantOtoacousticEmissions
 * Created by ics on 2/2/2018.
 */
@Service("zp07InfantOtoacousticEmsService")
@Transactional
public class Zp07InfantOtoacousticEmissionsService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp07InfantOtoacousticEmissions
     * @return una lista de Zp07InfantOtoacousticEmissions
     */
    @SuppressWarnings("unchecked")
    public List<Zp07InfantOtoacousticEmissions> getZp07InfantOtoacousticEms(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantOtoacousticEmissions ");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp07InfantOtoacousticEmissions
     * @return una lista de Zp07InfantOtoacousticEmissions
     */
    @SuppressWarnings("unchecked")
    public List<Zp07InfantOtoacousticEmissions> getZp07InfantOtoacousticEmsByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantOtoacousticEmissions zp07 where zp07.pasive = '0' and zp07.recordId in (select dInf.recordId from ZpInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0'))))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zp07InfantOtoacousticEmissions
     * @param recordId del Zp07InfantOtoacousticEmissions a retornar
     * @return un Zp07InfantOtoacousticEmissions
     */
    public Zp07InfantOtoacousticEmissions getZp07InfantOtoacousticEm(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantOtoacousticEmissions where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zp07InfantOtoacousticEmissions) query.uniqueResult();
    }

    /**
     * Guardar un formulario Zp07InfantOtoacousticEmissions
     * @param zp07InfantOtoacousticEm a guardar
     */
    public void saveZp07InfantOtoacousticEm(Zp07InfantOtoacousticEmissions zp07InfantOtoacousticEm){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp07InfantOtoacousticEm);
    }
}
