package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 1/31/2017.
 * V1.0
 */

@Entity
@Table(name = "zp07_infant_assessment", catalog = "zika_zip")
public class Zp07InfantAssessmentVisit extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private Date infantVisitDate;
    private String infantStatus;
    private Date infantDeathDt;
    private String infantVisit;
    private Date infantVisitDate2;
    private String infantStatus2;
    private Date infantDeathDt2;
    private String infantVisit2;
    private Date infantVisitDate3;
    private String infantStatus3;
    private Date infantDeathDt3;
    private String infantVisit3;
    private Float infantTemp;
    private String infantTmpUnit;
    private Float infantWt;
    private String infantWtUnit;
    private Float infantWtPercen;
    private String infantWtpercenNa;
    private Float infantLength;
    private Float infantLengthPercen;
    private String infantLenpercenNa;
    private Float infantHeadcircu;
    private Float infantHeapercen;
    private String infantHeapercenNa;
    private String infantHeasize;//nuevo
    //  private String infantReferralNeuro;//
    private String infantApgarNa;
    private Float infantApgar1min;
    private Float infantApgar5min;
    private String infantSkinEvalu;
    private String infantRash;
    private String infantScarring;
    private String infantOrganEvalu;
    private String infantAbdominal;
    private String infantLiverSpleen;
    private String infantOphth;
    private String infantOphthType; //nuevo
    private String infantOphthAbno;
    private String infantOae;
    private String infantHearingTest;//nuevo
    private String infantHearingOverall; //nuevo
    private String infantRoae; //nuevo
    private String infantRaabr; //nuevo
    private String infantLoae;//nuevo
    private String infantLaabr; //nuevo
    private String infantBreastfeeding;
    private String infantBreastReason;//multiple
    private String infantBreastOther;
    private String infantNeurodeve;
    private String infantExhibited; //multiple
    private String infantAsymType; //nuevo
    private String infantOtherMove; //cambio nombre
    private String infantExhibitOther; //nuevo
    private String infantMicroce; //nuevo
    private String infantDefinition; //nuevo
    private String infantFurtherNeuro;
    private String infantEvaluation; //nuevo
    private String infantNeuroAsq; //nuevo
    private Float infantAsqCommuni; //nuevo
    private Float infantAsqGross; //nuevo
    private Float infantAsqFine; //nuevo
    private Float infantAsqProblem; //nuevo
    private Float infantAsqPersonal; //nuevo
    private String infantNeuroBisd; //nuevo
    private Float infantCgScore; //nuevo
    private String infantCgRisk; //nuevo
    private Float infantRpScore; //nuevo
    private String infantRpRisk;//nuevo
    private Float infantEpScore; //nuevo
    private String infantEpRisk; //nuevo
    private Float infantFmScore; //nuevo
    private String infantFmRisk; //nuevo
    private Float infantGmScore; //nuevo
    private String infantGmRisk; //nuevo
    private String infantNeuroOther; //nuevo
    private String infantOtherName; //nuevo
    private Float infantOtherScore; //nuevo
    private String infantResultScreening; //nuevo
    private String infantReferTesting; //nuevo
    private String infantFeverSymptom; //nuevo
    private String infantRashSymptom; //nuevo
    private String infantItch; //nuevo
    private String infantRashFirst;
    private String infantRashDy; //nuevo
    private String infantRashMn; //nuevo
    private String infantRashYr; //nuevo
    private Float infantRashDur;//nuevo
    private String infantRashSpread; //nuevo
    private String infantSpreadPart; //nuevo
    private String infantFeverExperience; //nuevo
    private String infantTempMeasure; //nuevo
    private Float infantHighTemp; //nuevo
    private String infantHightemUnit; //nuevo
    private String infantTempunknown; //nuevo
    private String infantFeverDy; //nuevo
    private String infantFeverMn; //nuevo
    private String infantFeverYr; //nuevo
    private Float infantFeverDur; //nuevo
    private String infantRedeyes; //nuevo
    private String infantRedeyesDy; //nuevo
    private String infantRedeyesMn; //nuevo
    private String infantRedeyesYr; //nuevo
    private Float infantRedeyesDur; //nuevo
    private String infantJoint; //nuevo
    private String infantJointDy; //nuevo
    private String infantJointMn; //nuevo
    private String infantJointYr; //nuevo
    private Float infantJointDur; //nuevo
    private String infantHeadache; //nuevo
    private String infantHeadacheDy; //nuevo
    private String infantHeadacheMn; //nuevo
    private String infantHeadacheYr; //nuevo
    private Float infantHeadaDur; //nuevo
    private String infantSymptomOther; //nuevo
    private String infantSpecifySymptom; //nuevo
    private String infantOtherSymptom; //nuevo
    private String infantMedicare; //nuevo
    private String infantCareDy; //nuevo
    private String infantCareMn; //nuevo
    private String infantCareYr; //nuevo
    private String infantCareFacility; //nuevo
    private String infantHospitalized; //nuevo
    private String infantHospital; //nuevo
    private String infantDiagRubella; //nuevo
    private String infantDiagDengue; //nuevo
    private String infantDiagChikung; //nuevo
    private String infantDiagZika; //nuevo
    private String infantDiagCytome; //nuevo
    private String infantMedicine; //nuevo
    private String infantMedName; //nuevo
    private String infantSpDiary; //nuevo
    private String infantPreResults; //nuevo
    private String infantReferr; //nuevo
    private String infantOtherLab; //nuevo
    private String infantCommentsYn; //nuevo
    private String infantComments2; //nuevo
    private String infantCommentsYn2; //nuevo
    private String infantComments2_2; //nuevo
    private String infantCommentsYn3; //nuevo
    private String infantComments2_3; //nuevo
    private String infantIdCompleting;
    private Date infantDtComp; //cambio nombre
    private String infantIdReviewer;
    private Date infantDtReview; //cambio nombre
    private String infantIdDataEntry;
    private Date infantDtEnter; //cambio nombre
    private String infantIdCompleting2;
    private Date infantDtComp2; //cambio nombre
    private String infantIdReviewer2;
    private Date infantDtReview2; //cambio nombre
    private String infantIdDataEntry2;
    private Date infantDtEnter2; //cambio nombre
    private String infantIdCompleting3;
    private Date infantDtComp3; //cambio nombre
    private String infantIdReviewer3;
    private Date infantDtReview3; //cambio nombre
    private String infantIdDataEntry3;
    private Date infantDtEnter3; //cambio nombre
    private Integer part1;
    private Integer part2;
    private Integer part3;
    private Integer idInstancia2;
    private Integer idInstancia3;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Id
    @Column(name = "redcap_event_name", nullable = false, length = 100)
    public String getRedcapEventName() {
        return redcapEventName;
    }

    public void setRedcapEventName(String redcapEventName) {
        this.redcapEventName = redcapEventName;
    }

    @Column(name = "infant_visit_date")
    public Date getInfantVisitDate() {
        return infantVisitDate;
    }

    public void setInfantVisitDate(Date infantVisitDate) {
        this.infantVisitDate = infantVisitDate;
    }

    @Column(name = "infant_status", length = 1)
    public String getInfantStatus() {
        return infantStatus;
    }

    public void setInfantStatus(String infantStatus) {
        this.infantStatus = infantStatus;
    }

    @Column(name = "infant_death_dt")
    public Date getInfantDeathDt() {
        return infantDeathDt;
    }

    public void setInfantDeathDt(Date infantDeathDt) {
        this.infantDeathDt = infantDeathDt;
    }

    @Column(name = "infant_visit", length = 1)
    public String getInfantVisit() {
        return infantVisit;
    }

    public void setInfantVisit(String infantVisit) {
        this.infantVisit = infantVisit;
    }

    @Column(name = "infant_visit_date2", length = 1)
    public Date getInfantVisitDate2() {
        return infantVisitDate2;
    }

    public void setInfantVisitDate2(Date infantVisitDate2) {
        this.infantVisitDate2 = infantVisitDate2;
    }

    @Column(name = "infant_status2", length = 1)
    public String getInfantStatus2() {
        return infantStatus2;
    }

    public void setInfantStatus2(String infantStatus2) {
        this.infantStatus2 = infantStatus2;
    }

    @Column(name = "infant_death_dt2")
    public Date getInfantDeathDt2() {
        return infantDeathDt2;
    }

    public void setInfantDeathDt2(Date infantDeathDt2) {
        this.infantDeathDt2 = infantDeathDt2;
    }

    @Column(name = "infant_visit2", length = 1)
    public String getInfantVisit2() {
        return infantVisit2;
    }

    public void setInfantVisit2(String infantVisit2) {
        this.infantVisit2 = infantVisit2;
    }

    @Column(name = "infant_visit_date3", length = 1)
    public Date getInfantVisitDate3() {
        return infantVisitDate3;
    }

    public void setInfantVisitDate3(Date infantVisitDate3) {
        this.infantVisitDate3 = infantVisitDate3;
    }

    @Column(name = "infant_status3", length = 1)
    public String getInfantStatus3() {
        return infantStatus3;
    }

    public void setInfantStatus3(String infantStatus3) {
        this.infantStatus3 = infantStatus3;
    }

    @Column(name = "infant_death_dt3")
    public Date getInfantDeathDt3() {
        return infantDeathDt3;
    }

    public void setInfantDeathDt3(Date infantDeathDt3) {
        this.infantDeathDt3 = infantDeathDt3;
    }

    @Column(name = "infant_visit3", length = 1)
    public String getInfantVisit3() {
        return infantVisit3;
    }

    public void setInfantVisit3(String infantVisit3) {
        this.infantVisit3 = infantVisit3;
    }

    @Column(name = "infant_temp")
    public Float getInfantTemp() {
        return infantTemp;
    }

    public void setInfantTemp(Float infantTemp) {
        this.infantTemp = infantTemp;
    }

    @Column(name = "infant_tmp_unit", length = 1)
    public String getInfantTmpUnit() {
        return infantTmpUnit;
    }

    public void setInfantTmpUnit(String infantTmpUnit) {
        this.infantTmpUnit = infantTmpUnit;
    }

    @Column(name = "infant_wt")
    public Float getInfantWt() {
        return infantWt;
    }

    public void setInfantWt(Float infantWt) {
        this.infantWt = infantWt;
    }

    @Column(name = "infant_wt_unit", length = 1)
    public String getInfantWtUnit() {
        return infantWtUnit;
    }

    public void setInfantWtUnit(String infantWtUnit) {
        this.infantWtUnit = infantWtUnit;
    }

    @Column(name = "infant_wt_percen")
    public Float getInfantWtPercen() {
        return infantWtPercen;
    }

    public void setInfantWtPercen(Float infantWtPercen) {
        this.infantWtPercen = infantWtPercen;
    }

    @Column(name = "infant_wtpercen_na", length = 2)
    public String getInfantWtpercenNa() {
        return infantWtpercenNa;
    }

    public void setInfantWtpercenNa(String infantWtpercenNa) {
        this.infantWtpercenNa = infantWtpercenNa;
    }

    @Column(name = "infant_length")
    public Float getInfantLength() {
        return infantLength;
    }

    public void setInfantLength(Float infantLength) {
        this.infantLength = infantLength;
    }

    @Column(name = "infant_length_percen")
    public Float getInfantLengthPercen() {
        return infantLengthPercen;
    }

    public void setInfantLengthPercen(Float infantLengthPercen) {
        this.infantLengthPercen = infantLengthPercen;
    }

    @Column(name = "infant_lenpercen_na", length = 2)
    public String getInfantLenpercenNa() {
        return infantLenpercenNa;
    }

    public void setInfantLenpercenNa(String infantLenpercenNa) {
        this.infantLenpercenNa = infantLenpercenNa;
    }

    @Column(name = "infant_headcircu")
    public Float getInfantHeadcircu() {
        return infantHeadcircu;
    }

    public void setInfantHeadcircu(Float infantHeadcircu) {
        this.infantHeadcircu = infantHeadcircu;
    }

    @Column(name = "infant_heapercen")
    public Float getInfantHeapercen() {
        return infantHeapercen;
    }

    public void setInfantHeapercen(Float infantHeapercen) {
        this.infantHeapercen = infantHeapercen;
    }

    @Column(name = "infant_heapercen_na", length = 2)
    public String getInfantHeapercenNa() {
        return infantHeapercenNa;
    }

    public void setInfantHeapercenNa(String infantHeapercenNa) {
        this.infantHeapercenNa = infantHeapercenNa;
    }

    @Column(name = "infant_heasize", length = 2)
    public String getInfantHeasize() {
        return infantHeasize;
    }

    public void setInfantHeasize(String infantHeasize) {
        this.infantHeasize = infantHeasize;
    }

    /* @Column(name = "infant_referral_neuro", nullable = true, length = 2)
     public String getInfantReferralNeuro() {
         return infantReferralNeuro;
     }

     public void setInfantReferralNeuro(String infantReferralNeuro) {
         this.infantReferralNeuro = infantReferralNeuro;
     }
 */
    @Column(name = "infant_apgar_na", nullable = true, length = 2)
    public String getInfantApgarNa() {
        return infantApgarNa;
    }

    public void setInfantApgarNa(String infantApgarNa) {
        this.infantApgarNa = infantApgarNa;
    }

    @Column(name = "infant_apgar_1min", nullable = true)
    public Float getInfantApgar1min() {
        return infantApgar1min;
    }

    public void setInfantApgar1min(Float infantApgar1min) {
        this.infantApgar1min = infantApgar1min;
    }

    @Column(name = "infant_apgar_5min", nullable = true)
    public Float getInfantApgar5min() {
        return infantApgar5min;
    }

    public void setInfantApgar5min(Float infantApgar5min) {
        this.infantApgar5min = infantApgar5min;
    }

    @Column(name = "infant_skin_evalu", nullable = true, length = 2)
    public String getInfantSkinEvalu() {
        return infantSkinEvalu;
    }

    public void setInfantSkinEvalu(String infantSkinEvalu) {
        this.infantSkinEvalu = infantSkinEvalu;
    }

    @Column(name = "infant_rash", nullable = true, length = 2)
    public String getInfantRash() {
        return infantRash;
    }

    public void setInfantRash(String infantRash) {
        this.infantRash = infantRash;
    }

    @Column(name = "infant_scarring", nullable = true, length = 2)
    public String getInfantScarring() {
        return infantScarring;
    }

    public void setInfantScarring(String infantScarring) {
        this.infantScarring = infantScarring;
    }

    @Column(name = "infant_organ_evalu", nullable = true, length = 2)
    public String getInfantOrganEvalu() {
        return infantOrganEvalu;
    }

    public void setInfantOrganEvalu(String infantOrganEvalu) {
        this.infantOrganEvalu = infantOrganEvalu;
    }

    @Column(name = "infant_abdominal", nullable = true, length = 2)
    public String getInfantAbdominal() {
        return infantAbdominal;
    }

    public void setInfantAbdominal(String infantAbdominal) {
        this.infantAbdominal = infantAbdominal;
    }

    @Column(name = "infant_liver_spleen", nullable = true, length = 2)
    public String getInfantLiverSpleen() {
        return infantLiverSpleen;
    }

    public void setInfantLiverSpleen(String infantLiverSpleen) {
        this.infantLiverSpleen = infantLiverSpleen;
    }

    @Column(name = "infant_ophth", nullable = true, length = 2)
    public String getInfantOphth() {
        return infantOphth;
    }

    public void setInfantOphth(String infantOphth) {
        this.infantOphth = infantOphth;
    }

    @Column(name = "infant_ophth_type", length = 2)
    public String getInfantOphthType() {
        return infantOphthType;
    }

    public void setInfantOphthType(String infantOphthType) {
        this.infantOphthType = infantOphthType;
    }

    @Column(name = "infant_ophth_abno", length = 2)
    public String getInfantOphthAbno() {
        return infantOphthAbno;
    }

    public void setInfantOphthAbno(String infantOphthAbno) {
        this.infantOphthAbno = infantOphthAbno;
    }

    @Column(name = "infant_oae", nullable = true, length = 2)
    public String getInfantOae() {
        return infantOae;
    }

    public void setInfantOae(String infantOae) {
        this.infantOae = infantOae;
    }

    @Column(name = "infant_hearing_test", length = 2)
    public String getInfantHearingTest() {
        return infantHearingTest;
    }

    public void setInfantHearingTest(String infantHearingTest) {
        this.infantHearingTest = infantHearingTest;
    }

    @Column(name = "infant_hearing_overall", length = 2)
    public String getInfantHearingOverall() {
        return infantHearingOverall;
    }

    public void setInfantHearingOverall(String infantHearingOverall) {
        this.infantHearingOverall = infantHearingOverall;
    }

    @Column(name = "infant_roae", length = 2)
    public String getInfantRoae() {
        return infantRoae;
    }

    public void setInfantRoae(String infantRoae) {
        this.infantRoae = infantRoae;
    }

    @Column(name = "infant_raabr", nullable = true, length = 2)
    public String getInfantRaabr() {
        return infantRaabr;
    }

    public void setInfantRaabr(String infantRaabr) {
        this.infantRaabr = infantRaabr;
    }

    @Column(name = "infant_loae", nullable = true, length = 2)
    public String getInfantLoae() {
        return infantLoae;
    }

    public void setInfantLoae(String infantLoae) {
        this.infantLoae = infantLoae;
    }

    @Column(name = "infant_laabr", nullable = true, length = 2)
    public String getInfantLaabr() {
        return infantLaabr;
    }

    public void setInfantLaabr(String infantLaabr) {
        this.infantLaabr = infantLaabr;
    }

    @Column(name = "infant_breastfeeding", nullable = true, length = 2)
    public String getInfantBreastfeeding() {
        return infantBreastfeeding;
    }

    public void setInfantBreastfeeding(String infantBreastfeeding) {
        this.infantBreastfeeding = infantBreastfeeding;
    }

    @Column(name = "infant_breast_reason", nullable = true, length = 20)
    public String getInfantBreastReason() {
        return infantBreastReason;
    }

    public void setInfantBreastReason(String infantBreastReason) {
        this.infantBreastReason = infantBreastReason;
    }

    @Column(name = "infant_breast_other", nullable = true)
    public String getInfantBreastOther() {
        return infantBreastOther;
    }

    public void setInfantBreastOther(String infantBreastOther) {
        this.infantBreastOther = infantBreastOther;
    }

    @Column(name = "infant_neurodeve", nullable = true, length = 2)
    public String getInfantNeurodeve() {
        return infantNeurodeve;
    }

    public void setInfantNeurodeve(String infantNeurodeve) {
        this.infantNeurodeve = infantNeurodeve;
    }

    @Column(name = "infant_exhibited", nullable = true, length = 50)
    public String getInfantExhibited() {
        return infantExhibited;
    }

    public void setInfantExhibited(String infantExhibited) {
        this.infantExhibited = infantExhibited;
    }

    @Column(name = "infant_asym_type", nullable = true, length = 25)
    public String getInfantAsymType() {
        return infantAsymType;
    }

    public void setInfantAsymType(String infantAsymType) {
        this.infantAsymType = infantAsymType;
    }

    @Column(name = "infant_other_move", nullable = true)
    public String getInfantOtherMove() {
        return infantOtherMove;
    }

    public void setInfantOtherMove(String infantOtherMove) {
        this.infantOtherMove = infantOtherMove;
    }

    @Column(name = "infant_exhibit_other", nullable = true, length = 25)
    public String getInfantExhibitOther() {
        return infantExhibitOther;
    }

    public void setInfantExhibitOther(String infantExhibitOther) {
        this.infantExhibitOther = infantExhibitOther;
    }

    @Column(name = "infant_microce", length = 2)
    public String getInfantMicroce() {
        return infantMicroce;
    }

    public void setInfantMicroce(String infantMicroce) {
        this.infantMicroce = infantMicroce;
    }

    @Column(name = "infant_definition",  length = 50)
    public String getInfantDefinition() {
        return infantDefinition;
    }

    public void setInfantDefinition(String infantDefinition) {
        this.infantDefinition = infantDefinition;
    }

    @Column(name = "infant_further_neuro", length = 2)
    public String getInfantFurtherNeuro() {
        return infantFurtherNeuro;
    }

    public void setInfantFurtherNeuro(String infantFurtherNeuro) {
        this.infantFurtherNeuro = infantFurtherNeuro;
    }

    @Column(name = "infant_evaluation", length = 2)
    public String getInfantEvaluation() {
        return infantEvaluation;
    }

    public void setInfantEvaluation(String infantEvaluation) {
        this.infantEvaluation = infantEvaluation;
    }

    @Column(name = "infant_neuro_asq", nullable = true, length = 2)
    public String getInfantNeuroAsq() {
        return infantNeuroAsq;
    }

    public void setInfantNeuroAsq(String infantNeuroAsq) {
        this.infantNeuroAsq = infantNeuroAsq;
    }

    @Column(name = "infant_asq_communi", nullable = true)
    public Float getInfantAsqCommuni() {
        return infantAsqCommuni;
    }

    public void setInfantAsqCommuni(Float infantAsqCommuni) {
        this.infantAsqCommuni = infantAsqCommuni;
    }

    @Column(name = "infant_asq_gross", nullable = true)
    public Float getInfantAsqGross() {
        return infantAsqGross;
    }

    public void setInfantAsqGross(Float infantAsqGross) {
        this.infantAsqGross = infantAsqGross;
    }

    @Column(name = "infant_asq_fine", nullable = true)
    public Float getInfantAsqFine() {
        return infantAsqFine;
    }

    public void setInfantAsqFine(Float infantAsqFine) {
        this.infantAsqFine = infantAsqFine;
    }

    @Column(name = "infant_asq_problem", nullable = true)
    public Float getInfantAsqProblem() {
        return infantAsqProblem;
    }

    public void setInfantAsqProblem(Float infantAsqProblem) {
        this.infantAsqProblem = infantAsqProblem;
    }

    @Column(name = "infant_asq_personal", nullable = true)
    public Float getInfantAsqPersonal() {
        return infantAsqPersonal;
    }

    public void setInfantAsqPersonal(Float infantAsqPersonal) {
        this.infantAsqPersonal = infantAsqPersonal;
    }

    @Column(name = "infant_neuro_bisd", nullable = true, length = 2)
    public String getInfantNeuroBisd() {
        return infantNeuroBisd;
    }

    public void setInfantNeuroBisd(String infantNeuroBisd) {
        this.infantNeuroBisd = infantNeuroBisd;
    }

    @Column(name = "infant_cg_score", nullable = true)
    public Float getInfantCgScore() {
        return infantCgScore;
    }

    public void setInfantCgScore(Float infantCgScore) {
        this.infantCgScore = infantCgScore;
    }

    @Column(name = "infant_cg_risk", nullable = true, length = 2)
    public String getInfantCgRisk() {
        return infantCgRisk;
    }

    public void setInfantCgRisk(String infantCgRisk) {
        this.infantCgRisk = infantCgRisk;
    }

    @Column(name = "infant_rp_score", nullable = true)
    public Float getInfantRpScore() {
        return infantRpScore;
    }

    public void setInfantRpScore(Float infantRpScore) {
        this.infantRpScore = infantRpScore;
    }

    @Column(name = "infant_rp_risk", nullable = true, length = 2)
    public String getInfantRpRisk() {
        return infantRpRisk;
    }

    public void setInfantRpRisk(String infantRpRisk) {
        this.infantRpRisk = infantRpRisk;
    }

    @Column(name = "infant_ep_score", nullable = true)
    public Float getInfantEpScore() {
        return infantEpScore;
    }

    public void setInfantEpScore(Float infantEpScore) {
        this.infantEpScore = infantEpScore;
    }

    @Column(name = "infant_ep_risk", nullable = true, length = 2)
    public String getInfantEpRisk() {
        return infantEpRisk;
    }

    public void setInfantEpRisk(String infantEpRisk) {
        this.infantEpRisk = infantEpRisk;
    }

    @Column(name = "infant_fm_score", nullable = true)
    public Float getInfantFmScore() {
        return infantFmScore;
    }

    public void setInfantFmScore(Float infantFmScore) {
        this.infantFmScore = infantFmScore;
    }

    @Column(name = "infant_fm_risk", nullable = true, length = 2)
    public String getInfantFmRisk() {
        return infantFmRisk;
    }

    public void setInfantFmRisk(String infantFmRisk) {
        this.infantFmRisk = infantFmRisk;
    }

    @Column(name = "infant_gm_score", nullable = true)
    public Float getInfantGmScore() {
        return infantGmScore;
    }

    public void setInfantGmScore(Float infantGmScore) {
        this.infantGmScore = infantGmScore;
    }

    @Column(name = "infant_gm_risk", nullable = true, length = 2)
    public String getInfantGmRisk() {
        return infantGmRisk;
    }

    public void setInfantGmRisk(String infantGmRisk) {
        this.infantGmRisk = infantGmRisk;
    }

    @Column(name = "infant_neuro_other", nullable = true, length = 2)
    public String getInfantNeuroOther() {
        return infantNeuroOther;
    }

    public void setInfantNeuroOther(String infantNeuroOther) {
        this.infantNeuroOther = infantNeuroOther;
    }

    @Column(name = "infant_other_name", nullable = true, length = 50)
    public String getInfantOtherName() {
        return infantOtherName;
    }

    public void setInfantOtherName(String infantOtherName) {
        this.infantOtherName = infantOtherName;
    }

    @Column(name = "infant_other_score", nullable = true)
    public Float getInfantOtherScore() {
        return infantOtherScore;
    }

    public void setInfantOtherScore(Float infantOtherScore) {
        this.infantOtherScore = infantOtherScore;
    }

    @Column(name = "infant_result_screening", length = 2)
    public String getInfantResultScreening() {
        return infantResultScreening;
    }

    public void setInfantResultScreening(String infantResultScreening) {
        this.infantResultScreening = infantResultScreening;
    }

    @Column(name = "infant_refer_testing", length = 2)
    public String getInfantReferTesting() {
        return infantReferTesting;
    }

    public void setInfantReferTesting(String infantReferTesting) {
        this.infantReferTesting = infantReferTesting;
    }

    @Column(name = "infant_fever_symptom", length = 2)
    public String getInfantFeverSymptom() {
        return infantFeverSymptom;
    }

    public void setInfantFeverSymptom(String infantFeverSymptom) {
        this.infantFeverSymptom = infantFeverSymptom;
    }

    @Column(name = "infant_rash_symptom", length = 2)
    public String getInfantRashSymptom() {
        return infantRashSymptom;
    }

    public void setInfantRashSymptom(String infantRashSymptom) {
        this.infantRashSymptom = infantRashSymptom;
    }

    @Column(name = "infant_itch", length = 2)
    public String getInfantItch() {
        return infantItch;
    }

    public void setInfantItch(String infantItch) {
        this.infantItch = infantItch;
    }

    @Column(name = "infant_rash_first", length = 2)
    public String getInfantRashFirst() {
        return infantRashFirst;
    }

    public void setInfantRashFirst(String infantRashFirst) {
        this.infantRashFirst = infantRashFirst;
    }

    @Column(name = "infant_rash_dy", length = 2)
    public String getInfantRashDy() {
        return infantRashDy;
    }

    public void setInfantRashDy(String infantRashDy) {
        this.infantRashDy = infantRashDy;
    }

    @Column(name = "infant_rash_mn", length = 2)
    public String getInfantRashMn() {
        return infantRashMn;
    }

    public void setInfantRashMn(String infantRashMn) {
        this.infantRashMn = infantRashMn;
    }

    @Column(name = "infant_rash_yr", length = 4)
    public String getInfantRashYr() {
        return infantRashYr;
    }

    public void setInfantRashYr(String infantRashYr) {
        this.infantRashYr = infantRashYr;
    }

    @Column(name = "infant_rash_dur")
    public Float getInfantRashDur() {
        return infantRashDur;
    }

    public void setInfantRashDur(Float infantRashDur) {
        this.infantRashDur = infantRashDur;
    }

    @Column(name = "infant_rash_spread", length = 2)
    public String getInfantRashSpread() {
        return infantRashSpread;
    }

    public void setInfantRashSpread(String infantRashSpread) {
        this.infantRashSpread = infantRashSpread;
    }

    @Column(name = "infant_spread_part", length = 15)
    public String getInfantSpreadPart() {
        return infantSpreadPart;
    }

    public void setInfantSpreadPart(String infantSpreadPart) {
        this.infantSpreadPart = infantSpreadPart;
    }

    @Column(name = "infant_fever_experience", length = 2)
    public String getInfantFeverExperience() {
        return infantFeverExperience;
    }

    public void setInfantFeverExperience(String infantFeverExperience) {
        this.infantFeverExperience = infantFeverExperience;
    }

    @Column(name = "infant_temp_measure", length = 2)
    public String getInfantTempMeasure() {
        return infantTempMeasure;
    }

    public void setInfantTempMeasure(String infantTempMeasure) {
        this.infantTempMeasure = infantTempMeasure;
    }

    @Column(name = "infant_high_temp")
    public Float getInfantHighTemp() {
        return infantHighTemp;
    }

    public void setInfantHighTemp(Float infantHighTemp) {
        this.infantHighTemp = infantHighTemp;
    }

    @Column(name = "infant_hightem_unit", length = 2)
    public String getInfantHightemUnit() {
        return infantHightemUnit;
    }

    public void setInfantHightemUnit(String infantHightemUnit) {
        this.infantHightemUnit = infantHightemUnit;
    }

    @Column(name = "infant_tempunknown", length = 2)
    public String getInfantTempunknown() {
        return infantTempunknown;
    }

    public void setInfantTempunknown(String infantTempunknown) {
        this.infantTempunknown = infantTempunknown;
    }

    @Column(name = "infant_fever_dy", length = 2)
    public String getInfantFeverDy() {
        return infantFeverDy;
    }

    public void setInfantFeverDy(String infantFeverDy) {
        this.infantFeverDy = infantFeverDy;
    }

    @Column(name = "infant_fever_mn", length = 2)
    public String getInfantFeverMn() {
        return infantFeverMn;
    }

    public void setInfantFeverMn(String infantFeverMn) {
        this.infantFeverMn = infantFeverMn;
    }

    @Column(name = "infant_fever_yr", length = 4)
    public String getInfantFeverYr() {
        return infantFeverYr;
    }

    public void setInfantFeverYr(String infantFeverYr) {
        this.infantFeverYr = infantFeverYr;
    }

    @Column(name = "infant_fever_dur")
    public Float getInfantFeverDur() {
        return infantFeverDur;
    }

    public void setInfantFeverDur(Float infantFeverDur) {
        this.infantFeverDur = infantFeverDur;
    }

    @Column(name = "infant_redeyes", length = 2)
    public String getInfantRedeyes() {
        return infantRedeyes;
    }

    public void setInfantRedeyes(String infantRedeyes) {
        this.infantRedeyes = infantRedeyes;
    }

    @Column(name = "infant_redeyes_dy", length = 2)
    public String getInfantRedeyesDy() {
        return infantRedeyesDy;
    }

    public void setInfantRedeyesDy(String infantRedeyesDy) {
        this.infantRedeyesDy = infantRedeyesDy;
    }

    @Column(name = "infant_redeyes_mn", length = 2)
    public String getInfantRedeyesMn() {
        return infantRedeyesMn;
    }

    public void setInfantRedeyesMn(String infantRedeyesMn) {
        this.infantRedeyesMn = infantRedeyesMn;
    }

    @Column(name = "infant_redeyes_yr", length = 4)
    public String getInfantRedeyesYr() {
        return infantRedeyesYr;
    }

    public void setInfantRedeyesYr(String infantRedeyesYr) {
        this.infantRedeyesYr = infantRedeyesYr;
    }

    @Column(name = "infant_redeyes_dur")
    public Float getInfantRedeyesDur() {
        return infantRedeyesDur;
    }

    public void setInfantRedeyesDur(Float infantRedeyesDur) {
        this.infantRedeyesDur = infantRedeyesDur;
    }

    @Column(name = "infant_joint", length = 2)
    public String getInfantJoint() {
        return infantJoint;
    }

    public void setInfantJoint(String infantJoint) {
        this.infantJoint = infantJoint;
    }

    @Column(name = "infant_joint_dy", length = 2)
    public String getInfantJointDy() {
        return infantJointDy;
    }

    public void setInfantJointDy(String infantJointDy) {
        this.infantJointDy = infantJointDy;
    }

    @Column(name = "infant_joint_mn", length = 2)
    public String getInfantJointMn() {
        return infantJointMn;
    }

    public void setInfantJointMn(String infantJointMn) {
        this.infantJointMn = infantJointMn;
    }

    @Column(name = "infant_joint_yr", length = 4)
    public String getInfantJointYr() {
        return infantJointYr;
    }

    public void setInfantJointYr(String infantJointYr) {
        this.infantJointYr = infantJointYr;
    }

    @Column(name = "infant_joint_dur")
    public Float getInfantJointDur() {
        return infantJointDur;
    }

    public void setInfantJointDur(Float infantJointDur) {
        this.infantJointDur = infantJointDur;
    }

    @Column(name = "infant_headache", length = 2)
    public String getInfantHeadache() {
        return infantHeadache;
    }

    public void setInfantHeadache(String infantHeadache) {
        this.infantHeadache = infantHeadache;
    }

    @Column(name = "infant_headache_dy", length = 2)
    public String getInfantHeadacheDy() {
        return infantHeadacheDy;
    }

    public void setInfantHeadacheDy(String infantHeadacheDy) {
        this.infantHeadacheDy = infantHeadacheDy;
    }

    @Column(name = "infant_headache_mn", length = 2)
    public String getInfantHeadacheMn() {
        return infantHeadacheMn;
    }

    public void setInfantHeadacheMn(String infantHeadacheMn) {
        this.infantHeadacheMn = infantHeadacheMn;
    }

    @Column(name = "infant_headache_yr", length = 4)
    public String getInfantHeadacheYr() {
        return infantHeadacheYr;
    }

    public void setInfantHeadacheYr(String infantHeadacheYr) {
        this.infantHeadacheYr = infantHeadacheYr;
    }

    @Column(name = "infant_heada_dur")
    public Float getInfantHeadaDur() {
        return infantHeadaDur;
    }

    public void setInfantHeadaDur(Float infantHeadaDur) {
        this.infantHeadaDur = infantHeadaDur;
    }

    @Column(name = "infant_symptom_other", length = 2)
    public String getInfantSymptomOther() {
        return infantSymptomOther;
    }

    public void setInfantSymptomOther(String infantSymptomOther) {
        this.infantSymptomOther = infantSymptomOther;
    }

    @Column(name = "infant_specify_symptom", length = 50)
    public String getInfantSpecifySymptom() {
        return infantSpecifySymptom;
    }

    public void setInfantSpecifySymptom(String infantSpecifySymptom) {
        this.infantSpecifySymptom = infantSpecifySymptom;
    }

    @Column(name = "infant_other_symptom", length = 50)
    public String getInfantOtherSymptom() {
        return infantOtherSymptom;
    }

    public void setInfantOtherSymptom(String infantOtherSymptom) {
        this.infantOtherSymptom = infantOtherSymptom;
    }

    @Column(name = "infant_medicare", length = 2)
    public String getInfantMedicare() {
        return infantMedicare;
    }

    public void setInfantMedicare(String infantMedicare) {
        this.infantMedicare = infantMedicare;
    }

    @Column(name = "infant_care_dy", length = 2)
    public String getInfantCareDy() {
        return infantCareDy;
    }

    public void setInfantCareDy(String infantCareDy) {
        this.infantCareDy = infantCareDy;
    }

    @Column(name = "infant_care_mn", length = 2)
    public String getInfantCareMn() {
        return infantCareMn;
    }

    public void setInfantCareMn(String infantCareMn) {
        this.infantCareMn = infantCareMn;
    }

    @Column(name = "infant_care_yr", length = 4)
    public String getInfantCareYr() {
        return infantCareYr;
    }

    public void setInfantCareYr(String infantCareYr) {
        this.infantCareYr = infantCareYr;
    }

    @Column(name = "infant_care_facility", length = 8)
    public String getInfantCareFacility() {
        return infantCareFacility;
    }

    public void setInfantCareFacility(String infantCareFacility) {
        this.infantCareFacility = infantCareFacility;
    }

    @Column(name = "infant_hospitalized", length = 2)
    public String getInfantHospitalized() {
        return infantHospitalized;
    }

    public void setInfantHospitalized(String infantHospitalized) {
        this.infantHospitalized = infantHospitalized;
    }

    @Column(name = "infant_hospital", length = 50)
    public String getInfantHospital() {
        return infantHospital;
    }

    public void setInfantHospital(String infantHospital) {
        this.infantHospital = infantHospital;
    }

    @Column(name = "infant_diag_rubella", length = 2)
    public String getInfantDiagRubella() {
        return infantDiagRubella;
    }

    public void setInfantDiagRubella(String infantDiagRubella) {
        this.infantDiagRubella = infantDiagRubella;
    }

    @Column(name = "infant_diag_dengue", length = 2)
    public String getInfantDiagDengue() {
        return infantDiagDengue;
    }

    public void setInfantDiagDengue(String infantDiagDengue) {
        this.infantDiagDengue = infantDiagDengue;
    }

    @Column(name = "infant_diag_chikung", length = 2)
    public String getInfantDiagChikung() {
        return infantDiagChikung;
    }

    public void setInfantDiagChikung(String infantDiagChikung) {
        this.infantDiagChikung = infantDiagChikung;
    }

    @Column(name = "infant_diag_zika", length = 2)
    public String getInfantDiagZika() {
        return infantDiagZika;
    }

    public void setInfantDiagZika(String infantDiagZika) {
        this.infantDiagZika = infantDiagZika;
    }

    @Column(name = "infant_diag_cytome", length = 2)
    public String getInfantDiagCytome() {
        return infantDiagCytome;
    }

    public void setInfantDiagCytome(String infantDiagCytome) {
        this.infantDiagCytome = infantDiagCytome;
    }

    @Column(name = "infant_medicine", length = 2)
    public String getInfantMedicine() {
        return infantMedicine;
    }

    public void setInfantMedicine(String infantMedicine) {
        this.infantMedicine = infantMedicine;
    }

    @Column(name = "infant_med_name", length = 25)
    public String getInfantMedName() {
        return infantMedName;
    }

    public void setInfantMedName(String infantMedName) {
        this.infantMedName = infantMedName;
    }

    @Column(name = "infant_sp_diary", length = 2)
    public String getInfantSpDiary() {
        return infantSpDiary;
    }

    public void setInfantSpDiary(String infantSpDiary) {
        this.infantSpDiary = infantSpDiary;
    }

    @Column(name = "infant_pre_results", length = 2)
    public String getInfantPreResults() {
        return infantPreResults;
    }

    public void setInfantPreResults(String infantPreResults) {
        this.infantPreResults = infantPreResults;
    }

    @Column(name = "infant_referr", length = 2)
    public String getInfantReferr() {
        return infantReferr;
    }

    public void setInfantReferr(String infantReferr) {
        this.infantReferr = infantReferr;
    }

    @Column(name = "infant_other_lab", length = 2)
    public String getInfantOtherLab() {
        return infantOtherLab;
    }

    public void setInfantOtherLab(String infantOtherLab) {
        this.infantOtherLab = infantOtherLab;
    }

    @Column(name = "infant_comments_yn",  length = 2)
    public String getInfantCommentsYn() {
        return infantCommentsYn;
    }

    public void setInfantCommentsYn(String infantCommentsYn) {
        this.infantCommentsYn = infantCommentsYn;
    }

    @Column(name = "infant_comments2", length = 100)
    public String getInfantComments2() {
        return infantComments2;
    }

    public void setInfantComments2(String infantComments2) {
        this.infantComments2 = infantComments2;
    }

    @Column(name = "infant_comments_yn2",  length = 2)
    public String getInfantCommentsYn2() {
        return infantCommentsYn2;
    }

    public void setInfantCommentsYn2(String infantCommentsYn2) {
        this.infantCommentsYn2 = infantCommentsYn2;
    }

    @Column(name = "infant_comments_yn2_2", length = 100)
    public String getInfantComments2_2() {
        return infantComments2_2;
    }

    public void setInfantComments2_2(String infantComments2_2) {
        this.infantComments2_2 = infantComments2_2;
    }

    @Column(name = "infant_comments_yn3", length = 2)
    public String getInfantCommentsYn3() {
        return infantCommentsYn3;
    }

    public void setInfantCommentsYn3(String infantCommentsYn3) {
        this.infantCommentsYn3 = infantCommentsYn3;
    }

    @Column(name = "infant_comments_yn2_3", length = 100)
    public String getInfantComments2_3() {
        return infantComments2_3;
    }

    public void setInfantComments2_3(String infantComments2_3) {
        this.infantComments2_3 = infantComments2_3;
    }

    @Column(name = "infant_id_completing", nullable = true, length = 50)
    public String getInfantIdCompleting() {
        return infantIdCompleting;
    }

    public void setInfantIdCompleting(String infantIdCompleting) {
        this.infantIdCompleting = infantIdCompleting;
    }

    @Column(name = "infant_dt_comp", nullable = true)
    public Date getInfantDtComp() {
        return infantDtComp;
    }

    public void setInfantDtComp(Date infantDtComp) {
        this.infantDtComp = infantDtComp;
    }

    @Column(name = "infant_id_reviewer", nullable = true, length = 50)
    public String getInfantIdReviewer() {
        return infantIdReviewer;
    }

    public void setInfantIdReviewer(String infantIdReviewer) {
        this.infantIdReviewer = infantIdReviewer;
    }

    @Column(name = "infant_dt_review", nullable = true)
    public Date getInfantDtReview() {
        return infantDtReview;
    }

    public void setInfantDtReview(Date infantDtReview) {
        this.infantDtReview = infantDtReview;
    }

    @Column(name = "infant_id_data_entry", nullable = true, length = 50)
    public String getInfantIdDataEntry() {
        return infantIdDataEntry;
    }

    public void setInfantIdDataEntry(String infantIdDataEntry) {
        this.infantIdDataEntry = infantIdDataEntry;
    }

    @Column(name = "infant_dt_enter", nullable = true)
    public Date getInfantDtEnter() {
        return infantDtEnter;
    }

    public void setInfantDtEnter(Date infantDtEnter) {
        this.infantDtEnter = infantDtEnter;
    }

    @Column(name = "infant_id_completing2", nullable = true, length = 50)
    public String getInfantIdCompleting2() {
        return infantIdCompleting2;
    }

    public void setInfantIdCompleting2(String infantIdCompleting2) {
        this.infantIdCompleting2 = infantIdCompleting2;
    }
    @Column(name = "infant_dt_comp2", nullable = true)
    public Date getInfantDtComp2() {
        return infantDtComp2;
    }

    public void setInfantDtComp2(Date infantDtComp2) {
        this.infantDtComp2 = infantDtComp2;
    }

    @Column(name = "infant_id_reviewer2", nullable = true, length = 50)
    public String getInfantIdReviewer2() {
        return infantIdReviewer2;
    }

    public void setInfantIdReviewer2(String infantIdReviewer2) {
        this.infantIdReviewer2 = infantIdReviewer2;
    }

    @Column(name = "infant_dt_review2", nullable = true)
    public Date getInfantDtReview2() {
        return infantDtReview2;
    }

    public void setInfantDtReview2(Date infantDtReview2) {
        this.infantDtReview2 = infantDtReview2;
    }

    @Column(name = "infant_id_data_entry2", nullable = true, length = 50)
    public String getInfantIdDataEntry2() {
        return infantIdDataEntry2;
    }

    public void setInfantIdDataEntry2(String infantIdDataEntry2) {
        this.infantIdDataEntry2 = infantIdDataEntry2;
    }

    @Column(name = "infant_dt_enter2", nullable = true)
    public Date getInfantDtEnter2() {
        return infantDtEnter2;
    }

    public void setInfantDtEnter2(Date infantDtEnter2) {
        this.infantDtEnter2 = infantDtEnter2;
    }

    @Column(name = "infant_id_completing3", nullable = true, length = 50)
    public String getInfantIdCompleting3() {
        return infantIdCompleting3;
    }

    public void setInfantIdCompleting3(String infantIdCompleting3) {
        this.infantIdCompleting3 = infantIdCompleting3;
    }

    @Column(name = "infant_dt_comp3", nullable = true)
    public Date getInfantDtComp3() {
        return infantDtComp3;
    }

    public void setInfantDtComp3(Date infantDtComp3) {
        this.infantDtComp3 = infantDtComp3;
    }

    @Column(name = "infant_id_reviewer3", nullable = true, length = 50)
    public String getInfantIdReviewer3() {
        return infantIdReviewer3;
    }

    public void setInfantIdReviewer3(String infantIdReviewer3) {
        this.infantIdReviewer3 = infantIdReviewer3;
    }

    @Column(name = "infant_dt_review3", nullable = true)
    public Date getInfantDtReview3() {
        return infantDtReview3;
    }

    public void setInfantDtReview3(Date infantDtReview3) {
        this.infantDtReview3 = infantDtReview3;
    }

    @Column(name = "infant_id_data_entry3", nullable = true, length = 50)
    public String getInfantIdDataEntry3() {
        return infantIdDataEntry3;
    }

    public void setInfantIdDataEntry3(String infantIdDataEntry3) {
        this.infantIdDataEntry3 = infantIdDataEntry3;
    }

    @Column(name = "infant_dt_enter3", nullable = true)
    public Date getInfantDtEnter3() {
        return infantDtEnter3;
    }

    public void setInfantDtEnter3(Date infantDtEnter3) {
        this.infantDtEnter3 = infantDtEnter3;
    }

    @Column(name = "part1")
    public Integer getPart1() {
        return part1;
    }

    public void setPart1(Integer part1) {
        this.part1 = part1;
    }

    @Column(name = "part2")
    public Integer getPart2() {
        return part2;
    }

    public void setPart2(Integer part2) {
        this.part2 = part2;
    }


    @Column(name = "part3")
    public Integer getPart3() {
        return part3;
    }

    public void setPart3(Integer part3) {
        this.part3 = part3;
    }

    @Column(name = "id_instancia2")
    public Integer getIdInstancia2() {
        return idInstancia2;
    }

    public void setIdInstancia2(Integer idInstancia2) {
        this.idInstancia2 = idInstancia2;
    }

    @Column(name = "id_instancia3")
    public Integer getIdInstancia3() {
        return idInstancia3;
    }

    public void setIdInstancia3(Integer idInstancia3) {
        this.idInstancia3 = idInstancia3;
    }


    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "ZP07{" + recordId + ", " + redcapEventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zp07InfantAssessmentVisit)) return false;

        Zp07InfantAssessmentVisit that = (Zp07InfantAssessmentVisit) o;

        if (!recordId.equals(that.recordId)) return false;
        if (!redcapEventName.equals(that.redcapEventName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId.hashCode();
        result = 31 * result + redcapEventName.hashCode();
        return result;
    }
}
