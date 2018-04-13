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
    public void saveZp07InfantAssessmentVisit(Zp07InfantAssessmentVisit zp07InfantAssessmentVisit) {
        Session session = sessionFactory.getCurrentSession();

        if (zp07InfantAssessmentVisit != null) {
            Zp07InfantAssessmentVisit zp07 = getZp07InfantAssessmentVisit(zp07InfantAssessmentVisit.getRecordId(), zp07InfantAssessmentVisit.getRedcapEventName());

            if (zp07 != null) {
                if (zp07InfantAssessmentVisit.getPart1() != null) {
                    if ((zp07InfantAssessmentVisit.getPart1() == 2) || (zp07InfantAssessmentVisit.getPart1() == 1 && zp07.getPart1() == null)) {
                        zp07.setInfantVisitDate(zp07InfantAssessmentVisit.getInfantVisitDate());
                        zp07.setInfantStatus(zp07InfantAssessmentVisit.getInfantStatus());
                        zp07.setInfantDeathDt(zp07InfantAssessmentVisit.getInfantDeathDt());
                        zp07.setInfantVisit(zp07InfantAssessmentVisit.getInfantVisit());
                        zp07.setInfantTemp(zp07InfantAssessmentVisit.getInfantTemp());
                        zp07.setInfantTmpUnit(zp07InfantAssessmentVisit.getInfantTmpUnit());
                        zp07.setInfantWt(zp07InfantAssessmentVisit.getInfantWt());
                        zp07.setInfantWtUnit(zp07InfantAssessmentVisit.getInfantWtUnit());
                        zp07.setInfantWtPercen(zp07InfantAssessmentVisit.getInfantWtPercen());
                        zp07.setInfantWtpercenNa(zp07InfantAssessmentVisit.getInfantWtpercenNa());
                        zp07.setInfantLength(zp07InfantAssessmentVisit.getInfantLength());
                        zp07.setInfantLengthPercen(zp07InfantAssessmentVisit.getInfantLengthPercen());
                        zp07.setInfantLenpercenNa(zp07InfantAssessmentVisit.getInfantLenpercenNa());
                        zp07.setInfantHeadcircu(zp07InfantAssessmentVisit.getInfantHeadcircu());
                        zp07.setInfantHeapercen(zp07InfantAssessmentVisit.getInfantHeapercen());
                        zp07.setInfantHeapercenNa(zp07InfantAssessmentVisit.getInfantHeapercenNa());
                        zp07.setInfantHeasize(zp07InfantAssessmentVisit.getInfantHeasize());
                        zp07.setInfantApgarNa(zp07InfantAssessmentVisit.getInfantApgarNa());
                        zp07.setInfantApgar1min(zp07InfantAssessmentVisit.getInfantApgar1min());
                        zp07.setInfantApgar5min(zp07InfantAssessmentVisit.getInfantApgar5min());
                        zp07.setInfantSkinEvalu(zp07InfantAssessmentVisit.getInfantSkinEvalu());
                        zp07.setInfantRash(zp07InfantAssessmentVisit.getInfantRash());
                        zp07.setInfantScarring(zp07InfantAssessmentVisit.getInfantScarring());
                        zp07.setInfantOrganEvalu(zp07InfantAssessmentVisit.getInfantOrganEvalu());
                        zp07.setInfantAbdominal(zp07InfantAssessmentVisit.getInfantAbdominal());
                        zp07.setInfantLiverSpleen(zp07InfantAssessmentVisit.getInfantLiverSpleen());
                        zp07.setInfantOae(zp07InfantAssessmentVisit.getInfantOae());
                        zp07.setInfantHearingTest(zp07InfantAssessmentVisit.getInfantHearingTest());
                        zp07.setInfantHearingOverall(zp07InfantAssessmentVisit.getInfantHearingOverall());
                        zp07.setInfantRoae(zp07InfantAssessmentVisit.getInfantRoae());
                        zp07.setInfantRaabr(zp07InfantAssessmentVisit.getInfantRaabr());
                        zp07.setInfantLoae(zp07InfantAssessmentVisit.getInfantLoae());
                        zp07.setInfantLaabr(zp07InfantAssessmentVisit.getInfantLaabr());
                        zp07.setInfantBreastfeeding(zp07InfantAssessmentVisit.getInfantBreastfeeding());
                        zp07.setInfantBreastReason(zp07InfantAssessmentVisit.getInfantBreastReason());
                        zp07.setInfantBreastOther(zp07InfantAssessmentVisit.getInfantBreastOther());
                        zp07.setInfantNeurodeve(zp07InfantAssessmentVisit.getInfantNeurodeve());
                        zp07.setInfantAsymType(zp07InfantAssessmentVisit.getInfantAsymType());
                        zp07.setInfantOtherMove(zp07InfantAssessmentVisit.getInfantOtherMove());
                        zp07.setInfantExhibitOther(zp07InfantAssessmentVisit.getInfantExhibitOther());
                        zp07.setInfantMicroce(zp07InfantAssessmentVisit.getInfantMicroce());
                        zp07.setInfantDefinition(zp07InfantAssessmentVisit.getInfantDefinition());
                        zp07.setInfantFurtherNeuro(zp07InfantAssessmentVisit.getInfantFurtherNeuro());
                        zp07.setInfantFeverSymptom(zp07InfantAssessmentVisit.getInfantFeverSymptom());
                        zp07.setInfantRashSymptom(zp07InfantAssessmentVisit.getInfantRashSymptom());
                        zp07.setInfantItch(zp07InfantAssessmentVisit.getInfantItch());
                        zp07.setInfantRashFirst(zp07InfantAssessmentVisit.getInfantRashFirst());
                        zp07.setInfantRashDy(zp07InfantAssessmentVisit.getInfantRashDy());
                        zp07.setInfantRashMn(zp07InfantAssessmentVisit.getInfantRashMn());
                        zp07.setInfantRashYr(zp07InfantAssessmentVisit.getInfantRashYr());
                        zp07.setInfantRashDur(zp07InfantAssessmentVisit.getInfantRashDur());
                        zp07.setInfantRashSpread(zp07InfantAssessmentVisit.getInfantRashSpread());
                        zp07.setInfantSpreadPart(zp07InfantAssessmentVisit.getInfantSpreadPart());
                        zp07.setInfantFeverExperience(zp07InfantAssessmentVisit.getInfantFeverExperience());
                        zp07.setInfantTempMeasure(zp07InfantAssessmentVisit.getInfantTempMeasure());
                        zp07.setInfantHighTemp(zp07InfantAssessmentVisit.getInfantHighTemp());
                        zp07.setInfantHightemUnit(zp07InfantAssessmentVisit.getInfantHightemUnit());
                        zp07.setInfantTempunknown(zp07InfantAssessmentVisit.getInfantTempunknown());
                        zp07.setInfantFeverDy(zp07InfantAssessmentVisit.getInfantFeverDy());
                        zp07.setInfantFeverMn(zp07InfantAssessmentVisit.getInfantFeverMn());
                        zp07.setInfantFeverYr(zp07InfantAssessmentVisit.getInfantFeverYr());
                        zp07.setInfantFeverDur(zp07InfantAssessmentVisit.getInfantFeverDur());
                        zp07.setInfantRedeyes(zp07InfantAssessmentVisit.getInfantRedeyes());
                        zp07.setInfantRedeyesDy(zp07InfantAssessmentVisit.getInfantRedeyesDy());
                        zp07.setInfantRedeyesMn(zp07InfantAssessmentVisit.getInfantRedeyesMn());
                        zp07.setInfantRedeyesYr(zp07InfantAssessmentVisit.getInfantRedeyesYr());
                        zp07.setInfantRedeyesDur(zp07InfantAssessmentVisit.getInfantRedeyesDur());
                        zp07.setInfantJoint(zp07InfantAssessmentVisit.getInfantJoint());
                        zp07.setInfantJointDy(zp07InfantAssessmentVisit.getInfantJointDy());
                        zp07.setInfantJointMn(zp07InfantAssessmentVisit.getInfantJointMn());
                        zp07.setInfantJointYr(zp07InfantAssessmentVisit.getInfantJointYr());
                        zp07.setInfantJointDur(zp07InfantAssessmentVisit.getInfantJointDur());
                        zp07.setInfantHeadache(zp07InfantAssessmentVisit.getInfantHeadache());
                        zp07.setInfantHeadacheDy(zp07InfantAssessmentVisit.getInfantHeadacheDy());
                        zp07.setInfantHeadacheMn(zp07InfantAssessmentVisit.getInfantHeadacheMn());
                        zp07.setInfantHeadacheYr(zp07InfantAssessmentVisit.getInfantHeadacheYr());
                        zp07.setInfantHeadaDur(zp07InfantAssessmentVisit.getInfantHeadaDur());
                        zp07.setInfantSymptomOther(zp07InfantAssessmentVisit.getInfantSymptomOther());
                        zp07.setInfantSpecifySymptom(zp07InfantAssessmentVisit.getInfantSpecifySymptom());
                        zp07.setInfantOtherSymptom(zp07InfantAssessmentVisit.getInfantOtherSymptom());
                        zp07.setInfantMedicare(zp07InfantAssessmentVisit.getInfantMedicare());
                        zp07.setInfantCareDy(zp07InfantAssessmentVisit.getInfantCareDy());
                        zp07.setInfantCareMn(zp07InfantAssessmentVisit.getInfantCareMn());
                        zp07.setInfantCareYr(zp07InfantAssessmentVisit.getInfantCareYr());
                        zp07.setInfantCareFacility(zp07InfantAssessmentVisit.getInfantCareFacility());
                        zp07.setInfantHospitalized(zp07InfantAssessmentVisit.getInfantHospitalized());
                        zp07.setInfantHospital(zp07InfantAssessmentVisit.getInfantHospital());
                        zp07.setInfantDiagRubella(zp07InfantAssessmentVisit.getInfantDiagRubella());
                        zp07.setInfantDiagDengue(zp07InfantAssessmentVisit.getInfantDiagDengue());
                        zp07.setInfantDiagChikung(zp07InfantAssessmentVisit.getInfantDiagChikung());
                        zp07.setInfantDiagZika(zp07InfantAssessmentVisit.getInfantDiagZika());
                        zp07.setInfantDiagCytome(zp07InfantAssessmentVisit.getInfantDiagCytome());
                        zp07.setInfantMedicine(zp07InfantAssessmentVisit.getInfantMedicine());
                        zp07.setInfantMedName(zp07InfantAssessmentVisit.getInfantMedName());
                        zp07.setInfantSpDiary(zp07InfantAssessmentVisit.getInfantSpDiary());
                        zp07.setInfantPreResults(zp07InfantAssessmentVisit.getInfantPreResults());
                        zp07.setInfantReferr(zp07InfantAssessmentVisit.getInfantReferr());
                        zp07.setInfantOtherLab(zp07InfantAssessmentVisit.getInfantOtherLab());
                        zp07.setInfantCommentsYn(zp07InfantAssessmentVisit.getInfantCommentsYn());
                        zp07.setInfantComments2(zp07InfantAssessmentVisit.getInfantComments2());
                        zp07.setInfantIdCompleting(zp07InfantAssessmentVisit.getInfantIdCompleting());
                        zp07.setInfantDtComp(zp07InfantAssessmentVisit.getInfantDtComp());
                        zp07.setInfantIdReviewer(zp07InfantAssessmentVisit.getInfantIdReviewer());
                        zp07.setInfantDtReview(zp07InfantAssessmentVisit.getInfantDtReview());
                        zp07.setInfantDtEnter(zp07InfantAssessmentVisit.getInfantDtEnter());
                        zp07.setInfantIdDataEntry(zp07InfantAssessmentVisit.getInfantIdDataEntry());
                        zp07.setPart1(1);
                        zp07.setIdInstancia(zp07InfantAssessmentVisit.getIdInstancia());
                        zp07.setInfantDob(zp07InfantAssessmentVisit.getInfantDob());
                        zp07.setInfantWeeks(zp07InfantAssessmentVisit.getInfantWeeks());
                        zp07.setInfantDays(zp07InfantAssessmentVisit.getInfantDays());
                        zp07.setInfantNeuroDt(zp07InfantAssessmentVisit.getInfantNeuroDt());
                        zp07.setInfantHearDt(zp07InfantAssessmentVisit.getInfantHearDt());
                        zp07.setInfantExhibited1(zp07InfantAssessmentVisit.getInfantExhibited1());
                        zp07.setInfantExhibited2(zp07InfantAssessmentVisit.getInfantExhibited2());
                        zp07.setInfantExhibited3(zp07InfantAssessmentVisit.getInfantExhibited3());
                        zp07.setInfantExhibited4(zp07InfantAssessmentVisit.getInfantExhibited4());
                        zp07.setInfantExhibited5(zp07InfantAssessmentVisit.getInfantExhibited5());
                        zp07.setInfantExhibited6(zp07InfantAssessmentVisit.getInfantExhibited6());
                        zp07.setInfantExhibited7(zp07InfantAssessmentVisit.getInfantExhibited7());
                        zp07.setInfantExhibited8(zp07InfantAssessmentVisit.getInfantExhibited8());
                        zp07.setInfantExhibited9(zp07InfantAssessmentVisit.getInfantExhibited9());
                        zp07.setInfantExhibited10(zp07InfantAssessmentVisit.getInfantExhibited10());
                        zp07.setInfantExhibited11(zp07InfantAssessmentVisit.getInfantExhibited11());
                        zp07.setInfantExhibited12(zp07InfantAssessmentVisit.getInfantExhibited12());
                        zp07.setInfantExhibited13(zp07InfantAssessmentVisit.getInfantExhibited13());
                        zp07.setInfantExhibited14(zp07InfantAssessmentVisit.getInfantExhibited14());

                    }

                }

                if (zp07InfantAssessmentVisit.getPart2() != null) {
                    if ((zp07InfantAssessmentVisit.getPart2() == 2) || (zp07InfantAssessmentVisit.getPart2() == 1 && zp07.getPart2() == null)) {
                        zp07.setInfantVisitDate2(zp07InfantAssessmentVisit.getInfantVisitDate2());
                        zp07.setInfantStatus2(zp07InfantAssessmentVisit.getInfantStatus2());
                        zp07.setInfantDeathDt2(zp07InfantAssessmentVisit.getInfantDeathDt2());
                        zp07.setInfantVisit2(zp07InfantAssessmentVisit.getInfantVisit2());
                        zp07.setInfantOphth(zp07InfantAssessmentVisit.getInfantOphth());
                        zp07.setInfantOphthType(zp07InfantAssessmentVisit.getInfantOphthType());
                        zp07.setInfantOphthAbno(zp07InfantAssessmentVisit.getInfantOphthAbno());
                        zp07.setInfantCommentsYn2(zp07InfantAssessmentVisit.getInfantCommentsYn2());
                        zp07.setInfantComments2_2(zp07InfantAssessmentVisit.getInfantComments2_2());
                        zp07.setInfantIdCompleting2(zp07InfantAssessmentVisit.getInfantIdCompleting2());
                        zp07.setInfantDtComp2(zp07InfantAssessmentVisit.getInfantDtComp2());
                        zp07.setInfantIdReviewer2(zp07InfantAssessmentVisit.getInfantIdReviewer2());
                        zp07.setInfantDtReview2(zp07InfantAssessmentVisit.getInfantDtReview2());
                        zp07.setInfantIdDataEntry2(zp07InfantAssessmentVisit.getInfantIdDataEntry2());
                        zp07.setInfantDtEnter2(zp07InfantAssessmentVisit.getInfantDtEnter2());
                        zp07.setPart2(1);
                        zp07.setIdInstancia2(zp07InfantAssessmentVisit.getIdInstancia2());
                        zp07.setInfantOpDt(zp07InfantAssessmentVisit.getInfantOpDt());
                    }
                }

                    if (zp07InfantAssessmentVisit.getPart3() != null) {
                        if ((zp07InfantAssessmentVisit.getPart3() == 2) || (zp07InfantAssessmentVisit.getPart3() == 1 && zp07.getPart3() == null)) {
                            zp07.setInfantVisitDate3(zp07InfantAssessmentVisit.getInfantVisitDate3());
                            zp07.setInfantStatus3(zp07InfantAssessmentVisit.getInfantStatus3());
                            zp07.setInfantDeathDt3(zp07InfantAssessmentVisit.getInfantDeathDt3());
                            zp07.setInfantVisit3(zp07InfantAssessmentVisit.getInfantVisit3());
                            zp07.setInfantEvaluation(zp07InfantAssessmentVisit.getInfantEvaluation());
                            zp07.setInfantNeuroAsq(zp07InfantAssessmentVisit.getInfantNeuroAsq());
                            zp07.setInfantAsqCommuni(zp07InfantAssessmentVisit.getInfantAsqCommuni());
                            zp07.setInfantAsqGross(zp07InfantAssessmentVisit.getInfantAsqGross());
                            zp07.setInfantAsqFine(zp07InfantAssessmentVisit.getInfantAsqFine());
                            zp07.setInfantAsqProblem(zp07InfantAssessmentVisit.getInfantAsqProblem());
                            zp07.setInfantAsqPersonal(zp07InfantAssessmentVisit.getInfantAsqPersonal());
                            zp07.setInfantNeuroBisd(zp07InfantAssessmentVisit.getInfantNeuroBisd());
                            zp07.setInfantCgScore(zp07InfantAssessmentVisit.getInfantCgScore());
                            zp07.setInfantCgRisk(zp07InfantAssessmentVisit.getInfantCgRisk());
                            zp07.setInfantRpScore(zp07InfantAssessmentVisit.getInfantRpScore());
                            zp07.setInfantRpRisk(zp07InfantAssessmentVisit.getInfantRpRisk());
                            zp07.setInfantEpScore(zp07InfantAssessmentVisit.getInfantEpScore());
                            zp07.setInfantEpRisk(zp07InfantAssessmentVisit.getInfantEpRisk());
                            zp07.setInfantFmScore(zp07InfantAssessmentVisit.getInfantFmScore());
                            zp07.setInfantFmRisk(zp07InfantAssessmentVisit.getInfantFmRisk());
                            zp07.setInfantGmScore(zp07InfantAssessmentVisit.getInfantGmScore());
                            zp07.setInfantGmRisk(zp07InfantAssessmentVisit.getInfantGmRisk());
                            zp07.setInfantNeuroOther(zp07InfantAssessmentVisit.getInfantNeuroOther());
                            zp07.setInfantOtherName(zp07InfantAssessmentVisit.getInfantOtherName());
                            zp07.setInfantOtherScore(zp07InfantAssessmentVisit.getInfantOtherScore());
                            zp07.setInfantResultScreening(zp07InfantAssessmentVisit.getInfantResultScreening());
                            zp07.setInfantReferTesting(zp07InfantAssessmentVisit.getInfantReferTesting());
                            zp07.setInfantCommentsYn3(zp07InfantAssessmentVisit.getInfantCommentsYn3());
                            zp07.setInfantComments2_3(zp07InfantAssessmentVisit.getInfantComments2_3());
                            zp07.setInfantIdCompleting3(zp07InfantAssessmentVisit.getInfantIdCompleting3());
                            zp07.setInfantDtComp3(zp07InfantAssessmentVisit.getInfantDtComp3());
                            zp07.setInfantIdReviewer3(zp07InfantAssessmentVisit.getInfantIdReviewer3());
                            zp07.setInfantDtReview3(zp07InfantAssessmentVisit.getInfantDtReview3());
                            zp07.setInfantIdDataEntry3(zp07InfantAssessmentVisit.getInfantIdDataEntry3());
                            zp07.setInfantDtEnter3(zp07InfantAssessmentVisit.getInfantDtEnter3());
                            zp07.setPart3(1);
                            zp07.setIdInstancia3(zp07InfantAssessmentVisit.getIdInstancia3());
                            zp07.setInfantNedeveDt(zp07InfantAssessmentVisit.getInfantNedeveDt());
                        }
                    }


                zp07.setRecordDate(zp07InfantAssessmentVisit.getRecordDate());
                zp07.setRecordUser(zp07InfantAssessmentVisit.getRecordUser());
                zp07.setInstancePath(zp07InfantAssessmentVisit.getInstancePath());
                zp07.setEstado(zp07InfantAssessmentVisit.getEstado());
                zp07.setStart(zp07InfantAssessmentVisit.getStart());
                zp07.setEnd(zp07InfantAssessmentVisit.getEnd());
                zp07.setDeviceid(zp07InfantAssessmentVisit.getDeviceid());
                zp07.setSimserial(zp07InfantAssessmentVisit.getSimserial());
                zp07.setPhonenumber(zp07InfantAssessmentVisit.getPhonenumber());
                zp07.setToday(zp07InfantAssessmentVisit.getToday());

                session.update(zp07);
            } else {
                session.save(zp07InfantAssessmentVisit);
            }
        }
    }


    /**
     * Retorna un formulario Zp07InfantAssessmentVisit
     * @param recordId del Zp07InfantAssessmentVisit a retornar
     * @return un Zp07InfantAssessmentVisit
     */
    public Zp07InfantAssessmentVisit getZp07InfantAssessmentVisit(String recordId, String event){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zp07InfantAssessmentVisit where recordId = :recordId and redcapEventName = :event");
        query.setParameter("recordId",recordId);
        query.setParameter("event",event);
        return (Zp07InfantAssessmentVisit)query.uniqueResult();
    }
}
