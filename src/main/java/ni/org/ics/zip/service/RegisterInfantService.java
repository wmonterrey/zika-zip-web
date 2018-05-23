package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp00Screening;
import ni.org.ics.zip.domain.ZpEstadoInfante;
import ni.org.ics.zip.domain.ZpInfantData;
import ni.org.ics.zip.users.model.UserSistema;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import javax.annotation.Resource;
import java.util.List;

@Service("registerInfantService")
@Transactional
public class RegisterInfantService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna formularios ZpEstadoInfante
     * @return una lista de ZpEstadoInfante
     */
    @SuppressWarnings("unchecked")
    public List<ZpInfantData> getZpInfantsDataByPregnantId(String pregnantId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpInfantData zpEstInfa where zpEstInfa.pregnantId =:pregnantId");
        query.setParameter("pregnantId",pregnantId);
        return query.list();
    }


}
