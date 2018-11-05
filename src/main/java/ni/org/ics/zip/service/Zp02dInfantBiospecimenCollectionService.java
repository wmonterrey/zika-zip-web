package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.Zp02dInfantBiospecimenCollection;
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
@Service("zp02dInfantBiospecimenCollectionService")
@Transactional
public class Zp02dInfantBiospecimenCollectionService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zp02dInfantBiospecimenCollection
     * @return una lista de Zp02dInfantBiospecimenCollection
     */
    @SuppressWarnings("unchecked")
    public List<Zp02dInfantBiospecimenCollection> getZp02dInfantBiospecimenCollection(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02dInfantBiospecimenCollection");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp02dInfantBiospecimenCollection
     * @return una lista de Zp02dInfantBiospecimenCollection
     */
    @SuppressWarnings("unchecked")
    public List<Zp02dInfantBiospecimenCollection> getZp02dInfantBiospecimenCollectionByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp02dInfantBiospecimenCollection zp02d where zp02d.pasive = '0' and zp02d.recordId in (select dInf.recordId from ZpInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zp00.recordId from Zp00Screening zp00 where zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0'))))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zp02dInfantBiospecimenCollection
     * @param zp02dInfantBiospecimenCollection a guardar
     */
    public void saveZp02dInfantBiospecimenCollection(Zp02dInfantBiospecimenCollection zp02dInfantBiospecimenCollection){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zp02dInfantBiospecimenCollection);
    }
}
