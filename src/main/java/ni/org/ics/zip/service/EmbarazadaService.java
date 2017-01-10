package ni.org.ics.zip.service;

import ni.org.ics.zip.domain.*;
import ni.org.ics.zip.utils.Constants;
import ni.org.ics.zip.utils.DateUtil;
import ni.org.ics.zip.utils.ZpDetalleEventoPanelControl;
import ni.org.ics.zip.utils.ZpPanelControlEmbarazada;
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
import java.util.concurrent.TimeUnit;

/**
 * Created by FIRSTICT on 12/1/2016.
 * V1.0
 */
@Service("embarazadaService")
@Transactional
public class EmbarazadaService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public List<ZpPanelControlEmbarazada> getZpPanelControlEmbarazadas() throws ParseException{
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select zpE.recordId, zp00.scrVisitDate, zpE.ingreso, zpE.sem2, zpE.sem4, zpE.sem6, zpE.sem8, zpE.sem10, zpE.sem12, zpE.sem14, zpE.sem16, zpE.sem18, zpE.sem20, zpE.sem22, zpE.sem24, " +
                                            "zpE.sem26, zpE.sem28, zpE.sem30, zpE.sem32, zpE.sem34, zpE.sem36, zpE.sem38, zpE.sem40, zpE.sem42, zpE.sem44, zpE.parto, zpE.posparto  " +
                                            "FROM ZpEstadoEmbarazada zpE, Zp00Screening zp00 where zpE.recordId = zp00.recordId and zp00.recordId not in (select zp08.recordId from Zp08StudyExit zp08) ");

        List<Object[]> registros = query.list();
        List<ZpPanelControlEmbarazada> controlEmbarazadas = new ArrayList<ZpPanelControlEmbarazada>();
        ZpPanelControlEmbarazada controlEmbarazada;
        Date fechaProgramada;
        Date fechaIngreso;
        Date hoy = DateUtil.StringToDate(DateUtil.DateToString(new Date(),"dd/MM/yyyy"),"dd/MM/yyyy");
        long dif = 0L;
        for (Object[] registro : registros){
            fechaIngreso = DateUtil.StringToDate(DateUtil.DateToString((Date)registro[1],"dd/MM/yyyy"),"dd/MM/yyyy");

            controlEmbarazada = new ZpPanelControlEmbarazada();
            controlEmbarazada.setCodigo(registro[0].toString());
            controlEmbarazada.setFechaIngreso(DateUtil.DateToString(fechaIngreso, "dd/MM/yyyy"));

            //ingreso
            fechaProgramada = fechaIngreso;
            controlEmbarazada.setIngreso(getEventStatus(registro[2].toString().charAt(0),fechaProgramada,hoy,4));
            //semana2
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,14);
            controlEmbarazada.setSemana2(getEventStatus(registro[3].toString().charAt(0),fechaProgramada,hoy,5));
            //semana4
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 28);
            controlEmbarazada.setSemana4(getEventStatus(registro[4].toString().charAt(0),fechaProgramada,hoy,7));
            //semana6
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,42);
            controlEmbarazada.setSemana6(getEventStatus(registro[5].toString().charAt(0),fechaProgramada,hoy,5));
            //semana8
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 56);
            controlEmbarazada.setSemana8(getEventStatus(registro[6].toString().charAt(0),fechaProgramada,hoy,7));
            //semana10
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,70);
            controlEmbarazada.setSemana10(getEventStatus(registro[7].toString().charAt(0),fechaProgramada,hoy,5));
            //semana12
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 84);
            controlEmbarazada.setSemana12(getEventStatus(registro[8].toString().charAt(0),fechaProgramada,hoy,7));
            //semana14
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,98);
            controlEmbarazada.setSemana14(getEventStatus(registro[9].toString().charAt(0),fechaProgramada,hoy,7));
            //semana16
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 112);
            controlEmbarazada.setSemana16(getEventStatus(registro[10].toString().charAt(0),fechaProgramada,hoy,7));
            //semana18
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,126);
            controlEmbarazada.setSemana18(getEventStatus(registro[11].toString().charAt(0),fechaProgramada,hoy,5));
            //semana20
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 140);
            controlEmbarazada.setSemana20(getEventStatus(registro[12].toString().charAt(0),fechaProgramada,hoy,7));
            //semana22
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,154);
            controlEmbarazada.setSemana22(getEventStatus(registro[13].toString().charAt(0),fechaProgramada,hoy,7));
            //semana24
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 168);
            controlEmbarazada.setSemana24(getEventStatus(registro[14].toString().charAt(0),fechaProgramada,hoy,7));
            //semana26
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,182);
            controlEmbarazada.setSemana26(getEventStatus(registro[15].toString().charAt(0),fechaProgramada,hoy,5));
            //semana28
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 196);
            controlEmbarazada.setSemana28(getEventStatus(registro[16].toString().charAt(0),fechaProgramada,hoy,7));
            //semana30
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,210);
            controlEmbarazada.setSemana30(getEventStatus(registro[17].toString().charAt(0),fechaProgramada,hoy,5));
            //semana32
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 224);
            controlEmbarazada.setSemana32(getEventStatus(registro[18].toString().charAt(0),fechaProgramada,hoy,7));
            //semana34
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,238);
            controlEmbarazada.setSemana34(getEventStatus(registro[19].toString().charAt(0),fechaProgramada,hoy,5));
            //semana36
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 252);
            controlEmbarazada.setSemana36(getEventStatus(registro[20].toString().charAt(0),fechaProgramada,hoy,7));
            //semana38
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,266);
            controlEmbarazada.setSemana38(getEventStatus(registro[21].toString().charAt(0),fechaProgramada,hoy,5));
            //semana40
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 280);
            controlEmbarazada.setSemana40(getEventStatus(registro[22].toString().charAt(0),fechaProgramada,hoy,7));
            //semana42
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso,294);
            controlEmbarazada.setSemana42(getEventStatus(registro[23].toString().charAt(0),fechaProgramada,hoy,28));
            //semana44
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 308);
            controlEmbarazada.setSemana44(getEventStatus(registro[24].toString().charAt(0),fechaProgramada,hoy,28));
            //parto
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 309);
            controlEmbarazada.setParto(getEventStatus(registro[25].toString().charAt(0),fechaProgramada,hoy,28));
            //postparto
            fechaProgramada = DateUtil.addDaystoDate(fechaIngreso, 322);
            controlEmbarazada.setPosparto(getEventStatus(registro[26].toString().charAt(0),fechaProgramada,hoy,50));

            controlEmbarazadas.add(controlEmbarazada);
        }
        return controlEmbarazadas;
    }

    private String getEventStatus(char valor, Date fechaProgramada, Date hoy, long maximo){
        if (valor =='0') {
            long dif = DateUtil.getDateDiff(fechaProgramada, hoy, TimeUnit.DAYS);
            if(dif >= 0 && dif <= maximo){
                return Constants.YELLOW;
            }else if(dif < 0){
                return Constants.GRAY;
            }
            else {
                return Constants.RED;
            }
        }
        else {
            return Constants.GREEN;
        }
    }

    public ZpDetalleEventoPanelControl getZpDetalleEventoPanelControl(ZpDetalleEventoPanelControl zpDetalle){
        List<String[]> formularios = new ArrayList<String[]>();
        String[] formulario = new String[3];
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Zp00Screening where recordId = :codigo");
        query.setParameter("codigo", zpDetalle.getCodigo());

        Zp00Screening screening = (Zp00Screening) query.uniqueResult();
        if (screening!=null) zpDetalle.setFechaIngreso(DateUtil.DateToString(screening.getScrVisitDate(), "dd/MM/yyyy"));

        //sólo ingreso
        if (zpDetalle.getEvento().equalsIgnoreCase(Constants.ENTRY)){
            //Zp01StudyEntrySectionAtoD
            query = session.createQuery("from Zp01StudyEntrySectionAtoD where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp01StudyEntrySectionAtoD zp01a = (Zp01StudyEntrySectionAtoD)query.uniqueResult();
            formulario[0] = "zp01AD";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp01a!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp01a.getSeaVdate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

            //Zp01StudyEntrySectionE
            query = session.createQuery("from Zp01StudyEntrySectionE where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp01StudyEntrySectionE zp01e = (Zp01StudyEntrySectionE)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp01E";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp01e!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp01e.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

            //Zp01StudyEntrySectionFtoK
            query = session.createQuery("from Zp01StudyEntrySectionFtoK where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp01StudyEntrySectionFtoK zp01f = (Zp01StudyEntrySectionFtoK)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp01FK";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp01f!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp01f.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);
        }

        //ingreso y mensual
        if (zpDetalle.getEvento().equalsIgnoreCase(Constants.ENTRY)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK4) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK8)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK12) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK16)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK20) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK24)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK28) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK32)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK36) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK40)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK44)){

            //Zp04TrimesterVisitSectionAtoD
            query = session.createQuery("from Zp04TrimesterVisitSectionAtoD where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp04TrimesterVisitSectionAtoD zp04a = (Zp04TrimesterVisitSectionAtoD)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp04AD";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp04a!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp04a.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

            //Zp04TrimesterVisitSectionE
            query = session.createQuery("from Zp04TrimesterVisitSectionE where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp04TrimesterVisitSectionE zp04e = (Zp04TrimesterVisitSectionE)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp04E";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp04e!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp04e.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

            //Zp04TrimesterVisitSectionFtoH
            query = session.createQuery("from Zp04TrimesterVisitSectionFtoH where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp04TrimesterVisitSectionFtoH zp04f = (Zp04TrimesterVisitSectionFtoH)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp04FH";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp04f!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp04f.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

            //Zp05UltrasoundExam
            query = session.createQuery("from Zp05UltrasoundExam where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp05UltrasoundExam zp05 = (Zp05UltrasoundExam)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp05";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp05!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp05.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

        }

        //sólo mensual
        if (zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK4) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK8)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK12) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK16)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK20) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK24)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK28) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK32)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK36) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK40)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK44)){
            query = session.createQuery("from Zp03MonthlyVisit where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp03MonthlyVisit zp03 = (Zp03MonthlyVisit)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp03";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp03!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp03.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);

        }
        //ingreso, mensual y de 2 semanas
        if (zpDetalle.getEvento().equalsIgnoreCase(Constants.ENTRY)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK4) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK8)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK12) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK16)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK20) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK24)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK28) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK32)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK36) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK40)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK44) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK2)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK6) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK10)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK14) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK18)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK22) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK26)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK30) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK34)
                || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK38) || zpDetalle.getEvento().equalsIgnoreCase(Constants.WEEK42)){

            //Zp02BiospecimenCollection
            query = session.createQuery("from Zp02BiospecimenCollection where recordId = :codigo and redcapEventName = :evento");
            query.setParameter("codigo", zpDetalle.getCodigo());
            query.setParameter("evento",zpDetalle.getEvento());
            Zp02BiospecimenCollection zp02 = (Zp02BiospecimenCollection)query.uniqueResult();
            formulario = new String[3];
            formulario[0] = "zp02";
            formulario[1] = "pending";
            formulario[2] = "";
            if (zp02!=null){
                formulario[1] = "realized";
                formulario[2] = DateUtil.DateToString(zp02.getRecordDate(),"dd/MM/yyyy");
            }
            formularios.add(formulario);
        }
        zpDetalle.setFormularios(formularios);

        //obtener descripcion del evento según el codigo recibido
        if (zpDetalle.getEvento().equalsIgnoreCase(Constants.ENTRY)){
            zpDetalle.setEvento("entry");
        }else if (zpDetalle.getEvento().equalsIgnoreCase(Constants.DELIVERY)){
            zpDetalle.setEvento("delivery");
        }else if (zpDetalle.getEvento().equalsIgnoreCase(Constants.AFTERDELIVERY)){
            zpDetalle.setEvento("postdeli");
        }else{
            zpDetalle.setEvento("week"+zpDetalle.getEvento().substring(0,zpDetalle.getEvento().indexOf("_")));
        }

        return zpDetalle;

    }
}
