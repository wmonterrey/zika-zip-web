package ni.org.ics.zip.service;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;


import ni.org.ics.zip.users.model.UserSistema;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("dashboardService")
@Transactional
public class DashboardService {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Object> tamizajesDia(UserSistema usuario, long date1, long date2){
		// Retrieve session from Hibernate
		Session session = sessionFactory.getCurrentSession();
		date2 = date2 + (24*60*60*1000-1000);
		Timestamp timeStampInicio = new Timestamp(date1);
		Timestamp timeStampFinal = new Timestamp(date2);
		// Create a Hibernate query (HQL)
        Query query = session.createQuery("select zp00.scrVisitDate as fecha, "+
        		"count(zpPre.cs) as total, " +
        		"sum(case zpPre.cs when 'Socrates Flores' then 1 else 0 end) as CSSFV, " +
        		"sum(case zpPre.cs when 'Villa Libertad' then 1 else 0 end) as CSVL, " +
        		"sum(case zpPre.cs when 'Francisco Buitrago' then 1 else 0 end) as CSFB " +
        		"FROM Zp00Screening zp00 , ZpPreScreening zpPre " +
        		"where zp00.preScreenId = zpPre.recId and zp00.pasive = '0' and zp00.preScreenId in (select recId from ZpPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')) "+
        		"and zp00.scrVisitDate between :fechaInicio and :fechaFinal group by zp00.scrVisitDate order by zp00.scrVisitDate");
		query.setTimestamp("fechaInicio", timeStampInicio);
		query.setTimestamp("fechaFinal", timeStampFinal);	
		query.setParameter("usuarioactual",usuario.getUsername());
        // Retrieve all
		return  query.list();
	}
	
}
