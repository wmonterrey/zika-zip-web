package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp07bInfantAudioResults;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ics on 20/6/2017.
 * V1.0
 */
@Service("zp07bInfantAudioResultsService")
@Transactional
public class Zp07bInfantAudioResultsService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp07bInfantAudioResults
     * @return una lista de Zp07bInfantAudioResults
     */
    @SuppressWarnings("unchecked")
    public List<Zp07bInfantAudioResults> getZp07bInfantAudioResults(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07bInfantAudioResults");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp07bInfantAudioResult
     * @return una lista de Zp07bInfantAudioResult
     */
    @SuppressWarnings("unchecked")
    public List<Zp07bInfantAudioResults> getZp07bInfantAudioResultstByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07bInfantAudioResults zp07 where zp07.pasive = '0' and zp07.recordId in (select dInf.recordId from ZpInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0'))))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zp07bInfantAudioResults
     * @param zp07bInfantAudioResults a guardar
     */
    public void saveZp07bInfantAudioResults(Zp07bInfantAudioResults zp07bInfantAudioResults){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp07bInfantAudioResults);
    }
}
