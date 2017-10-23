package ni.org.ics.zip.service;

import java.util.Calendar;
import ni.org.ics.zip.domain.*;
import ni.org.ics.zip.domain.catalogs.Provider;
import ni.org.ics.zip.utils.Constants;
import ni.org.ics.zip.utils.DateUtil;
import ni.org.ics.zip.utils.ZpAgendaEmbarazada;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by FIRSTICT on 11/23/2016.
 * V1.0
 */
@Service("agendaService")
@Transactional
public class AgendaService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
	public List<ZpAgendaEmbarazada> getDiary(String fecha) throws ParseException{

        List<ZpAgendaEmbarazada> agendaEmbarazadas = new ArrayList<ZpAgendaEmbarazada>();
        List<Zp00Screening> screenings;
        List<Zp04TrimesterVisitSectionFtoH> trimesterVisitSectionFtoHs = new ArrayList<Zp04TrimesterVisitSectionFtoH>();
        ZpAgendaEmbarazada agendaEmbarazada;
        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();
        Date fechaValidar = new Date();
        Date fechaProgramada;
        Date fechaIngreso;
        Date fechaAcordada;
        try {
            fechaValidar = DateUtil.StringToDate(fecha,"dd/MM/yyyy");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Query query = session.createQuery("select zp00 from Zp00Screening zp00 where zp00.recordId not in ( select zp08.recordId from Zp08StudyExit zp08 )");
        screenings = query.list();

        for (Zp00Screening screening : screenings){
            fechaIngreso = DateUtil.StringToDate(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
            //QUINCENALES
            //visita semana2
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,14);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK2_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.ENTRY_LABEL);
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana6
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,42);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK6_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 1");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana10
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,70);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK10_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 2");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana14
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,98);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK14_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 3");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana18
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,126);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK18_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 4");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana22
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,154);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK22_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 5");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana26
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,182);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK26_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 6");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana30
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,210);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK30_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 7");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana34
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,238);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK34_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 8");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana38
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,266);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK38_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 9");
                agendaEmbarazadas.add(agendaEmbarazada);
            }
            //visita semana42
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,294);
            if (fechaProgramada.compareTo(fechaValidar)==0){
                agendaEmbarazada = new ZpAgendaEmbarazada();
                agendaEmbarazada.setCodigo(screening.getRecordId());
                agendaEmbarazada.setEvento(Constants.WEEK42_LABEL);
                agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(),"dd/MM/yyyy"));
                agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada,"dd/MM/yyyy"));
                agendaEmbarazada.setFechaCita("");
                agendaEmbarazada.setHoraCita("");
                agendaEmbarazada.setFormulario(Constants.HOME_VISIT + " 10");
                agendaEmbarazadas.add(agendaEmbarazada);
            }

            //MENSUALES
            //visita semana4
            query = session.createQuery("from Zp01StudyEntrySectionFtoK zp01fk " +
                    "where zp01fk.recordId = :codigo and zp01fk.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.ENTRY);
            Zp01StudyEntrySectionFtoK entrySectionFtoK = (Zp01StudyEntrySectionFtoK)query.uniqueResult();
            if (entrySectionFtoK!=null && entrySectionFtoK.getSeaNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(entrySectionFtoK.getSeaNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 28);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK4_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + entrySectionFtoK.getSeaNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.ENTRY_LABEL);
                    //Obtener fecha de visita que se encuentra en la primera parte del formulario (AtoD)
                    query = session.createQuery("from Zp01StudyEntrySectionAtoD zp01 " +
                            "where zp01.recordId = :codigo and zp01.redcapEventName = :event ");
                    query.setParameter("codigo",entrySectionFtoK.getRecordId());
                    query.setParameter("event",entrySectionFtoK.getRedcapEventName());
                    Zp01StudyEntrySectionAtoD entryAtoD = (Zp01StudyEntrySectionAtoD)query.uniqueResult();
                    if (entryAtoD != null){
                        agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(entryAtoD.getSeaVdate(), "dd/MM/yyyy"));
                    }
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana8
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK4);
            Zp03MonthlyVisit monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 56);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK8_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 1");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana12
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK8);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(), "dd/MM/yyyy"), "dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 84);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK12_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 2");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana16
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK12);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 112);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK16_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 3");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana20
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK16);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 140);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK20_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 4");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana24
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK20);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 168);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK24_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 5");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana28
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK24);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 196);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK28_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 6");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana32
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK28);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 224);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK32_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 7");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana36
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK32);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 252);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK36_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 8");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana40
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK36);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 280);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK40_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 9");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }
            //visita semana44
            query = session.createQuery("from Zp03MonthlyVisit zp03 " +
                    "where zp03.recordId = :codigo and zp03.redcapEventName = :event ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("event", Constants.WEEK40);
            monthlyVisit = (Zp03MonthlyVisit)query.uniqueResult();
            if (monthlyVisit!=null && monthlyVisit.getMonNextDate()!=null) {
                fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(monthlyVisit.getMonNextDate(),"dd/MM/yyyy"),"dd/MM/yyyy");
                fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 308);
                if (fechaAcordada.compareTo(fechaValidar) == 0) {
                    agendaEmbarazada = new ZpAgendaEmbarazada();
                    agendaEmbarazada.setCodigo(screening.getRecordId());
                    agendaEmbarazada.setEvento(Constants.WEEK44_LABEL);
                    agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaProgramada(DateUtil.DateToString(fechaProgramada, "dd/MM/yyyy"));
                    agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                    agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + monthlyVisit.getMonNextTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                    agendaEmbarazada.setFormulario(Constants.MONTHLY_VISIT + " 10");
                    agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(monthlyVisit.getMonVisitDate(), "dd/MM/yyyy"));
                    agendaEmbarazadas.add(agendaEmbarazada);
                }
            }

            //TRIMESTRALES
            query = session.createQuery("from Zp04TrimesterVisitSectionFtoH zp04 " +
                    "where zp04.recordId = :codigo and zp04.triNextVisitDat >= :fecha ");
            query.setParameter("codigo",screening.getRecordId());
            query.setParameter("fecha",fechaValidar);
            trimesterVisitSectionFtoHs = query.list();

            if (trimesterVisitSectionFtoHs!=null){
                for(Zp04TrimesterVisitSectionFtoH trimesterVisit : trimesterVisitSectionFtoHs){
                    if (trimesterVisit.getTriNextVisitDat()!=null) {
                        fechaAcordada = DateUtil.StringToDate(DateUtil.DateToString(trimesterVisit.getTriNextVisitDat(), "dd/MM/yyyy"), "dd/MM/yyyy");
                        if (fechaAcordada.compareTo(fechaValidar) == 0) {
                            int semana = DateUtil.getWeek(screening.getScrVisitDate(), trimesterVisit.getTriNextVisitDat());
                            agendaEmbarazada = new ZpAgendaEmbarazada();
                            agendaEmbarazada.setCodigo(screening.getRecordId());
                            agendaEmbarazada.setEvento(String.valueOf(semana) + " " + Constants.WEEK_LABEL);
                            agendaEmbarazada.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));
                            agendaEmbarazada.setFechaProgramada("");
                            agendaEmbarazada.setFechaCita(DateUtil.DateToString(fechaAcordada, "dd/MM/yyyy"));
                            agendaEmbarazada.setHoraCita(DateUtil.DateToString(DateUtil.StringToDate(fecha + " " + trimesterVisit.getTriNextVisitTime(), "dd/MM/yyyy HH:mm:ss"), "hh:mm a"));
                            if (trimesterVisit.getRedcapEventName().equalsIgnoreCase(Constants.ENTRY)) {
                                agendaEmbarazada.setFormulario(Constants.TRIMESTER_VISIT + " 1");
                            } else {
                                agendaEmbarazada.setFormulario(Constants.TRIMESTER_VISIT + " 2");
                            }
                            //Obtener fecha de visita que se encuentra en la primera parte del formulario (AtoD)
                            query = session.createQuery("from Zp04TrimesterVisitSectionAtoD zp04 " +
                                    "where zp04.recordId = :codigo and zp04.redcapEventName = :event ");
                            query.setParameter("codigo", trimesterVisit.getRecordId());
                            query.setParameter("event", trimesterVisit.getRedcapEventName());
                            Zp04TrimesterVisitSectionAtoD tvAtoD = (Zp04TrimesterVisitSectionAtoD) query.uniqueResult();
                            if (tvAtoD != null) {
                                agendaEmbarazada.setFechaProgramacionCita(DateUtil.DateToString(tvAtoD.getTriDov(), "dd/MM/yyyy"));
                            }
                            agendaEmbarazadas.add(agendaEmbarazada);
                        }
                    }
                }
            }
        }

        return  agendaEmbarazadas;
    }


		@SuppressWarnings("unchecked")
		public List<ZpAgendaEstudio> getCitas(Date fechaFiltro, String tipoCita) {
			
			List<ZpAgendaEstudio> agenda = new ArrayList<ZpAgendaEstudio>();
			
			  Session session = sessionFactory.getCurrentSession();
		
			  Calendar c = Calendar.getInstance();
			  c.setTime(fechaFiltro);
			  c.add(Calendar.DAY_OF_YEAR, 1);
			 Date fechaF = c.getTime();
		        Query query = session.createQuery("from ZpAgendaEstudio as  z where z.appointmentDateTime >= :fecha and z.appointmentDateTime < :fechaF");
		        query.setParameter("fecha",fechaFiltro);
		        query.setParameter("fechaF",fechaF);
		       // query.setParameter("tipoAgenda",tipoCita);
		        
		        agenda = query.list(); 
			return agenda;
		
		}
		/// Para motivos de prueba
		@SuppressWarnings("unchecked")
		public List<ZpAgendaEstudio> getCitas() {
			
			List<ZpAgendaEstudio> agenda = new ArrayList<ZpAgendaEstudio>();
			
			  Session session = sessionFactory.getCurrentSession();
		
			  Calendar c = Calendar.getInstance();
			 
			  c.add(Calendar.DAY_OF_YEAR, 1);
			 Date fechaF = c.getTime();
		        Query query = session.createQuery("from ZpAgendaEstudio as z");
		       
		       
		        agenda = query.list(); 
			return agenda;
		
		}
		
		@SuppressWarnings("unchecked")
		public List<ZpAgendaEstudio> getCitas(Date fechaInicio, Date fechaFin, String tipo_agenda, String unidad_salud) {
			
			List<ZpAgendaEstudio> agenda = new ArrayList<ZpAgendaEstudio>();
			
			  Session session = sessionFactory.getCurrentSession();		
			  String qst = "from ZpAgendaEstudio as  z where z.appointmentDateTime >= :fecha "
			  		+ "and z.appointmentDateTime <= :fechaF "
					+ " and (z.healtUnit = :unidad or :unidad  = '')"
			  		+ " and (z.subjectType = :tipoagenda or :tipoagenda = '')";
			 
		        Query query = session.createQuery(qst);
		        query.setParameter("fecha",fechaInicio);
		        query.setParameter("fechaF",fechaFin);
		        query.setParameter("unidad",unidad_salud);
		        query.setParameter("tipoagenda",tipo_agenda);
		        
		        agenda = query.list(); 
			return agenda;
		
		}

		public void saveAppointment(ZpAgendaEstudio agenda){
	        Session session = sessionFactory.getCurrentSession();
	        
	        session.saveOrUpdate(agenda);
	    }
		
		public ZpAgendaEstudio getZpAgendaEstudio(Integer id){
			
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("FROM ZpAgendaEstudio p WHERE p.id=:id");
	        query.setParameter("id", id);
	        return (ZpAgendaEstudio) query.uniqueResult();
	    }
		
		public ZpAgendaEstudio getZpAgendaEstudio(String tipoAgenda, Date fechahora){
			
	        Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("FROM ZpAgendaEstudio p WHERE p.appointmentType=:tipoagenda AND p.appointmentDateTime = :fecha");
	        query.setParameter("tipoagenda",tipoAgenda);
	        query.setParameter("fecha",fechahora);
	        return (ZpAgendaEstudio) query.uniqueResult();
		}

}
