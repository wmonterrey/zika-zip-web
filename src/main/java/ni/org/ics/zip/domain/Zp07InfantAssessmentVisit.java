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
    private String infantVisit;
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
    private String infantReferralNeuro;
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
    private String infantOphthAbno;
    private String infantWhichEye;//multiple
    private String infantEyeCalci;
    private String infantChoriore;
    private String infantEyeOther;
    private String infantOtherIssue;//multiple
    private String infantEyeOtherSpecify;
    private String infantReferralOphth;
    private String infantOae;
    private String infantOaeAbnormal;
    private String infantWhichEar; //multiple
    private String infantReferralAudio;
    private String infantAdditionalAudio;
    private Float infatnHearLeft;
    private Float infantHearRight;
    private String infantBreastfeeding;
    private String infantBreastReason;//multiple
    private String infantBreastOther;
    private String infantNeurodeve;
    private String infantNeurodeveType;//multiple
    private String infantOtherSpecify;
    private String infantExhibited; //multiple
    private String infantOtherMovement;
    private String infantFurtherNeuro;
    private String infantHeadAltra;
    private String infantUltraObtained;
    private Date infantUltraDt;
    private String infantResultsUltra;
    private String infantResultsSpecify;
    private String infantHeadCt;
    private String infantCtObtained;
    private Date infantCtDt;
    private String infantResultsCt;
    private String infantCtSpecify;
    private String infantCerebrospinal;
    private String infantCerebroStored;
    private Date infantCerebroDt;
    private Float infantCerebroAmount;
    private String infantResultsCerebro;
    private String infantCerebroSpecify;
    private String infantMri;
    private String infantMriObtained;
    private Date infantMriDt;
    private String infantResultsMri;
    private String infantMriSpecify;
    private String infantPreviousResults;
    private String infantReferrCounselling;
    private String infantOtherLabCollect;
    private String infantIdCompleting;
    private Date infantDateCompleted;
    private String infantIdReviewer;
    private Date infantDateReviewed;
    private String infantIdDataEntry;
    private Date infantDateEntered;

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

    @Column(name = "infant_visit_date", nullable = true)
    public Date getInfantVisitDate() {
        return infantVisitDate;
    }

    public void setInfantVisitDate(Date infantVisitDate) {
        this.infantVisitDate = infantVisitDate;
    }

    @Column(name = "infant_status", nullable = true, length = 1)
    public String getInfantStatus() {
        return infantStatus;
    }

    public void setInfantStatus(String infantStatus) {
        this.infantStatus = infantStatus;
    }

    @Column(name = "infant_visit", nullable = true, length = 1)
    public String getInfantVisit() {
        return infantVisit;
    }

    public void setInfantVisit(String infantVisit) {
        this.infantVisit = infantVisit;
    }

    @Column(name = "infant_temp", nullable = true)
    public Float getInfantTemp() {
        return infantTemp;
    }

    public void setInfantTemp(Float infantTemp) {
        this.infantTemp = infantTemp;
    }

    @Column(name = "infant_tmp_unit", nullable = true, length = 1)
    public String getInfantTmpUnit() {
        return infantTmpUnit;
    }

    public void setInfantTmpUnit(String infantTmpUnit) {
        this.infantTmpUnit = infantTmpUnit;
    }

    @Column(name = "infant_wt", nullable = true)
    public Float getInfantWt() {
        return infantWt;
    }

    public void setInfantWt(Float infantWt) {
        this.infantWt = infantWt;
    }

    @Column(name = "infant_wt_unit", nullable = true, length = 1)
    public String getInfantWtUnit() {
        return infantWtUnit;
    }

    public void setInfantWtUnit(String infantWtUnit) {
        this.infantWtUnit = infantWtUnit;
    }

    @Column(name = "infant_wt_percen", nullable = true)
    public Float getInfantWtPercen() {
        return infantWtPercen;
    }

    public void setInfantWtPercen(Float infantWtPercen) {
        this.infantWtPercen = infantWtPercen;
    }

    @Column(name = "infant_wtpercen_na", nullable = true, length = 2)
    public String getInfantWtpercenNa() {
        return infantWtpercenNa;
    }

    public void setInfantWtpercenNa(String infantWtpercenNa) {
        this.infantWtpercenNa = infantWtpercenNa;
    }

    @Column(name = "infant_length", nullable = true)
    public Float getInfantLength() {
        return infantLength;
    }

    public void setInfantLength(Float infantLength) {
        this.infantLength = infantLength;
    }

    @Column(name = "infant_length_percen", nullable = true)
    public Float getInfantLengthPercen() {
        return infantLengthPercen;
    }

    public void setInfantLengthPercen(Float infantLengthPercen) {
        this.infantLengthPercen = infantLengthPercen;
    }

    @Column(name = "infant_lenpercen_na", nullable = true, length = 2)
    public String getInfantLenpercenNa() {
        return infantLenpercenNa;
    }

    public void setInfantLenpercenNa(String infantLenpercenNa) {
        this.infantLenpercenNa = infantLenpercenNa;
    }

    @Column(name = "infant_headcircu", nullable = true)
    public Float getInfantHeadcircu() {
        return infantHeadcircu;
    }

    public void setInfantHeadcircu(Float infantHeadcircu) {
        this.infantHeadcircu = infantHeadcircu;
    }

    @Column(name = "infant_heapercen", nullable = true)
    public Float getInfantHeapercen() {
        return infantHeapercen;
    }

    public void setInfantHeapercen(Float infantHeapercen) {
        this.infantHeapercen = infantHeapercen;
    }

    @Column(name = "infant_heapercen_na", nullable = true, length = 2)
    public String getInfantHeapercenNa() {
        return infantHeapercenNa;
    }

    public void setInfantHeapercenNa(String infantHeapercenNa) {
        this.infantHeapercenNa = infantHeapercenNa;
    }

    @Column(name = "infant_referral_neuro", nullable = true, length = 2)
    public String getInfantReferralNeuro() {
        return infantReferralNeuro;
    }

    public void setInfantReferralNeuro(String infantReferralNeuro) {
        this.infantReferralNeuro = infantReferralNeuro;
    }

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

    @Column(name = "infant_ophth_abno", nullable = true, length = 2)
    public String getInfantOphthAbno() {
        return infantOphthAbno;
    }

    public void setInfantOphthAbno(String infantOphthAbno) {
        this.infantOphthAbno = infantOphthAbno;
    }

    @Column(name = "infant_which_eye", nullable = true, length = 4)
    public String getInfantWhichEye() {
        return infantWhichEye;
    }

    public void setInfantWhichEye(String infantWhichEye) {
        this.infantWhichEye = infantWhichEye;
    }

    @Column(name = "infant_eye_calci", nullable = true, length = 2)
    public String getInfantEyeCalci() {
        return infantEyeCalci;
    }

    public void setInfantEyeCalci(String infantEyeCalci) {
        this.infantEyeCalci = infantEyeCalci;
    }

    @Column(name = "infant_choriore", nullable = true, length = 2)
    public String getInfantChoriore() {
        return infantChoriore;
    }

    public void setInfantChoriore(String infantChoriore) {
        this.infantChoriore = infantChoriore;
    }

    @Column(name = "infant_eye_other", nullable = true, length = 2)
    public String getInfantEyeOther() {
        return infantEyeOther;
    }

    public void setInfantEyeOther(String infantEyeOther) {
        this.infantEyeOther = infantEyeOther;
    }

    @Column(name = "infant_other_issue", nullable = true, length = 20)
    public String getInfantOtherIssue() {
        return infantOtherIssue;
    }

    public void setInfantOtherIssue(String infantOtherIssue) {
        this.infantOtherIssue = infantOtherIssue;
    }

    @Column(name = "infant_eye_other_specify", nullable = true)
    public String getInfantEyeOtherSpecify() {
        return infantEyeOtherSpecify;
    }

    public void setInfantEyeOtherSpecify(String infantEyeOtherSpecify) {
        this.infantEyeOtherSpecify = infantEyeOtherSpecify;
    }

    @Column(name = "infant_referral_ophth", nullable = true, length = 2)
    public String getInfantReferralOphth() {
        return infantReferralOphth;
    }

    public void setInfantReferralOphth(String infantReferralOphth) {
        this.infantReferralOphth = infantReferralOphth;
    }

    @Column(name = "infant_oae", nullable = true, length = 2)
    public String getInfantOae() {
        return infantOae;
    }

    public void setInfantOae(String infantOae) {
        this.infantOae = infantOae;
    }

    @Column(name = "infant_oae_abnormal", nullable = true, length = 2)
    public String getInfantOaeAbnormal() {
        return infantOaeAbnormal;
    }

    public void setInfantOaeAbnormal(String infantOaeAbnormal) {
        this.infantOaeAbnormal = infantOaeAbnormal;
    }

    @Column(name = "infant_which_ear", nullable = true, length = 4)
    public String getInfantWhichEar() {
        return infantWhichEar;
    }

    public void setInfantWhichEar(String infantWhichEar) {
        this.infantWhichEar = infantWhichEar;
    }

    @Column(name = "infant_referral_audio", nullable = true, length = 2)
    public String getInfantReferralAudio() {
        return infantReferralAudio;
    }

    public void setInfantReferralAudio(String infantReferralAudio) {
        this.infantReferralAudio = infantReferralAudio;
    }

    @Column(name = "infant_additional_audio", nullable = true, length = 2)
    public String getInfantAdditionalAudio() {
        return infantAdditionalAudio;
    }

    public void setInfantAdditionalAudio(String infantAdditionalAudio) {
        this.infantAdditionalAudio = infantAdditionalAudio;
    }

    @Column(name = "infatn_hear_left", nullable = true)
    public Float getInfatnHearLeft() {
        return infatnHearLeft;
    }

    public void setInfatnHearLeft(Float infatnHearLeft) {
        this.infatnHearLeft = infatnHearLeft;
    }

    @Column(name = "infant_hear_right", nullable = true)
    public Float getInfantHearRight() {
        return infantHearRight;
    }

    public void setInfantHearRight(Float infantHearRight) {
        this.infantHearRight = infantHearRight;
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

    @Column(name = "infant_neurodeve_type", nullable = true, length = 20)
    public String getInfantNeurodeveType() {
        return infantNeurodeveType;
    }

    public void setInfantNeurodeveType(String infantNeurodeveType) {
        this.infantNeurodeveType = infantNeurodeveType;
    }

    @Column(name = "infant_other_specify", nullable = true)
    public String getInfantOtherSpecify() {
        return infantOtherSpecify;
    }

    public void setInfantOtherSpecify(String infantOtherSpecify) {
        this.infantOtherSpecify = infantOtherSpecify;
    }

    @Column(name = "infant_exhibited", nullable = true, length = 25)
    public String getInfantExhibited() {
        return infantExhibited;
    }

    public void setInfantExhibited(String infantExhibited) {
        this.infantExhibited = infantExhibited;
    }

    @Column(name = "infant_other_movement", nullable = true)
    public String getInfantOtherMovement() {
        return infantOtherMovement;
    }

    public void setInfantOtherMovement(String infantOtherMovement) {
        this.infantOtherMovement = infantOtherMovement;
    }

    @Column(name = "infant_further_neuro", nullable = true, length = 2)
    public String getInfantFurtherNeuro() {
        return infantFurtherNeuro;
    }

    public void setInfantFurtherNeuro(String infantFurtherNeuro) {
        this.infantFurtherNeuro = infantFurtherNeuro;
    }

    @Column(name = "infant_head_altra", nullable = true, length = 2)
    public String getInfantHeadAltra() {
        return infantHeadAltra;
    }

    public void setInfantHeadAltra(String infantHeadAltra) {
        this.infantHeadAltra = infantHeadAltra;
    }

    @Column(name = "infant_ultra_obtained", nullable = true, length = 2)
    public String getInfantUltraObtained() {
        return infantUltraObtained;
    }

    public void setInfantUltraObtained(String infantUltraObtained) {
        this.infantUltraObtained = infantUltraObtained;
    }

    @Column(name = "infant_ultra_dt", nullable = true)
    public Date getInfantUltraDt() {
        return infantUltraDt;
    }

    public void setInfantUltraDt(Date infantUltraDt) {
        this.infantUltraDt = infantUltraDt;
    }

    @Column(name = "infant_results_ultra", nullable = true, length = 2)
    public String getInfantResultsUltra() {
        return infantResultsUltra;
    }

    public void setInfantResultsUltra(String infantResultsUltra) {
        this.infantResultsUltra = infantResultsUltra;
    }

    @Column(name = "infant_results_specify", nullable = true)
    public String getInfantResultsSpecify() {
        return infantResultsSpecify;
    }

    public void setInfantResultsSpecify(String infantResultsSpecify) {
        this.infantResultsSpecify = infantResultsSpecify;
    }

    @Column(name = "infant_head_ct", nullable = true, length = 2)
    public String getInfantHeadCt() {
        return infantHeadCt;
    }

    public void setInfantHeadCt(String infantHeadCt) {
        this.infantHeadCt = infantHeadCt;
    }

    @Column(name = "infant_ct_obtained", nullable = true, length = 2)
    public String getInfantCtObtained() {
        return infantCtObtained;
    }

    public void setInfantCtObtained(String infantCtObtained) {
        this.infantCtObtained = infantCtObtained;
    }

    @Column(name = "infant_ct_dt", nullable = true)
    public Date getInfantCtDt() {
        return infantCtDt;
    }

    public void setInfantCtDt(Date infantCtDt) {
        this.infantCtDt = infantCtDt;
    }

    @Column(name = "infant_results_ct", nullable = true, length = 2)
    public String getInfantResultsCt() {
        return infantResultsCt;
    }

    public void setInfantResultsCt(String infantResultsCt) {
        this.infantResultsCt = infantResultsCt;
    }

    @Column(name = "infant_ct_specify", nullable = true)
    public String getInfantCtSpecify() {
        return infantCtSpecify;
    }

    public void setInfantCtSpecify(String infantCtSpecify) {
        this.infantCtSpecify = infantCtSpecify;
    }

    @Column(name = "infant_cerebrospinal", nullable = true, length = 2)
    public String getInfantCerebrospinal() {
        return infantCerebrospinal;
    }

    public void setInfantCerebrospinal(String infantCerebrospinal) {
        this.infantCerebrospinal = infantCerebrospinal;
    }

    @Column(name = "infant_cerebro_stored", nullable = true, length = 2)
    public String getInfantCerebroStored() {
        return infantCerebroStored;
    }

    public void setInfantCerebroStored(String infantCerebroStored) {
        this.infantCerebroStored = infantCerebroStored;
    }

    @Column(name = "infant_cerebro_dt", nullable = true)
    public Date getInfantCerebroDt() {
        return infantCerebroDt;
    }

    public void setInfantCerebroDt(Date infantCerebroDt) {
        this.infantCerebroDt = infantCerebroDt;
    }

    @Column(name = "infant_cerebro_amount", nullable = true)
    public Float getInfantCerebroAmount() {
        return infantCerebroAmount;
    }

    public void setInfantCerebroAmount(Float infantCerebroAmount) {
        this.infantCerebroAmount = infantCerebroAmount;
    }

    @Column(name = "infant_results_cerebro", nullable = true, length = 2)
    public String getInfantResultsCerebro() {
        return infantResultsCerebro;
    }

    public void setInfantResultsCerebro(String infantResultsCerebro) {
        this.infantResultsCerebro = infantResultsCerebro;
    }

    @Column(name = "infant_cerebro_specify", nullable = true)
    public String getInfantCerebroSpecify() {
        return infantCerebroSpecify;
    }

    public void setInfantCerebroSpecify(String infantCerebroSpecify) {
        this.infantCerebroSpecify = infantCerebroSpecify;
    }

    @Column(name = "infant_mri", nullable = true, length = 2)
    public String getInfantMri() {
        return infantMri;
    }

    public void setInfantMri(String infantMri) {
        this.infantMri = infantMri;
    }

    @Column(name = "infant_mri_obtained", nullable = true, length = 2)
    public String getInfantMriObtained() {
        return infantMriObtained;
    }

    public void setInfantMriObtained(String infantMriObtained) {
        this.infantMriObtained = infantMriObtained;
    }

    @Column(name = "infant_mri_dt", nullable = true)
    public Date getInfantMriDt() {
        return infantMriDt;
    }

    public void setInfantMriDt(Date infantMriDt) {
        this.infantMriDt = infantMriDt;
    }

    @Column(name = "infant_results_mri", nullable = true, length = 2)
    public String getInfantResultsMri() {
        return infantResultsMri;
    }

    public void setInfantResultsMri(String infantResultsMri) {
        this.infantResultsMri = infantResultsMri;
    }

    @Column(name = "infant_mri_specify", nullable = true)
    public String getInfantMriSpecify() {
        return infantMriSpecify;
    }

    public void setInfantMriSpecify(String infantMriSpecify) {
        this.infantMriSpecify = infantMriSpecify;
    }

    @Column(name = "infant_previous_results", nullable = true, length = 2)
    public String getInfantPreviousResults() {
        return infantPreviousResults;
    }

    public void setInfantPreviousResults(String infantPreviousResults) {
        this.infantPreviousResults = infantPreviousResults;
    }

    @Column(name = "infant_referr_counselling", nullable = true, length = 2)
    public String getInfantReferrCounselling() {
        return infantReferrCounselling;
    }

    public void setInfantReferrCounselling(String infantReferrCounselling) {
        this.infantReferrCounselling = infantReferrCounselling;
    }

    @Column(name = "infant_other_lab_collect", nullable = true, length = 2)
    public String getInfantOtherLabCollect() {
        return infantOtherLabCollect;
    }

    public void setInfantOtherLabCollect(String infantOtherLabCollect) {
        this.infantOtherLabCollect = infantOtherLabCollect;
    }

    @Column(name = "infant_id_completing", nullable = true, length = 50)
    public String getInfantIdCompleting() {
        return infantIdCompleting;
    }

    public void setInfantIdCompleting(String infantIdCompleting) {
        this.infantIdCompleting = infantIdCompleting;
    }

    @Column(name = "infant_date_completed", nullable = true)
    public Date getInfantDateCompleted() {
        return infantDateCompleted;
    }

    public void setInfantDateCompleted(Date infantDateCompleted) {
        this.infantDateCompleted = infantDateCompleted;
    }

    @Column(name = "infant_id_reviewer", nullable = true, length = 50)
    public String getInfantIdReviewer() {
        return infantIdReviewer;
    }

    public void setInfantIdReviewer(String infantIdReviewer) {
        this.infantIdReviewer = infantIdReviewer;
    }

    @Column(name = "infant_date_reviewed", nullable = true)
    public Date getInfantDateReviewed() {
        return infantDateReviewed;
    }

    public void setInfantDateReviewed(Date infantDateReviewed) {
        this.infantDateReviewed = infantDateReviewed;
    }

    @Column(name = "infant_id_data_entry", nullable = true, length = 50)
    public String getInfantIdDataEntry() {
        return infantIdDataEntry;
    }

    public void setInfantIdDataEntry(String infantIdDataEntry) {
        this.infantIdDataEntry = infantIdDataEntry;
    }

    @Column(name = "infant_date_entered", nullable = true)
    public Date getInfantDateEntered() {
        return infantDateEntered;
    }

    public void setInfantDateEntered(Date infantDateEntered) {
        this.infantDateEntered = infantDateEntered;
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
