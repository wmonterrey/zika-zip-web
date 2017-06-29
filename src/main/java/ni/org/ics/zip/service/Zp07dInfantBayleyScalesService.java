package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp07dInfantBayleyScales;
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
@Service("zp07dInfantBayleyScalesService")
@Transactional
public class Zp07dInfantBayleyScalesService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp07dInfantBayleyScales
     * @return una lista de Zp07dInfantBayleyScales
     */
    @SuppressWarnings("unchecked")
    public List<Zp07dInfantBayleyScales> getZp07dInfantBayleyScales(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07dInfantBayleyScales");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp07dInfantBayleyScales
     * @return una lista de Zp07dInfantBayleyScales
     */
    @SuppressWarnings("unchecked")
    public List<Zp07dInfantBayleyScales> getZp07dInfantBayleyScalesByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07dInfantBayleyScales zp07 where zp07.pasive = '0' and zp07.recordId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zp07dInfantBayleyScales
     * @param zp07dInfantBayleyScales a guardar
     */
    public void saveZp07dInfantBayleyScales(Zp07dInfantBayleyScales zp07dInfantBayleyScales){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp07dInfantBayleyScales);
    }
}
