package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.ZpInfantData;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 2/7/2017.
 * V1.0
 */
@Service("zpInfantService")
@Transactional
public class ZpInfantDataService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpInfantData
     * @return una lista de ZpInfantData
     */
    @SuppressWarnings("unchecked")
    public List<ZpInfantData> getZpInfantData(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpInfantData");
        return query.list();
    }

    /**
     * Retorna un formulario ZpInfantData
     * @param recordId del ZpInfantData a retornar
     * @return un ZpInfantData
     */
    public ZpInfantData getZpInfantData(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpInfantData where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpInfantData)query.uniqueResult();
    }

    /**
     * Guardar un formulario ZpInfantData
     * @param zpInfantData a guardar
     */
    public void saveZpInfantData(ZpInfantData zpInfantData){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpInfantData);
    }
}
