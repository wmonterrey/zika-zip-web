package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/10/2016.
 * V1.0
 */
@Entity
@Table(name = "zp06_delivery_and_6week_visit", catalog = "zika_zip")
public class Zp06DeliveryAnd6weekVisit extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private Date deliVisitDate;
    private String deliVisitStatus;
    private String deliVisitType;
    private Float deliMotherWt;
    private String deliWtUnit;
    private Integer deliSystolic;
    private Integer deliDiastolic;
    private Float deliTemperature;
    private String deliTempUnit;
    private Date deliDeliveryDate;
    private String deliMode;
    private String deliDeliveryWho;
    private String deliDeliveryOccur;
    private String deliHospitalId;
    private String deliClinicId;
    private String deliDeliveryOther;
    private String deliNumBirth;
    private String deliFetalOutcome1;
    private String deliCauseDeath1;
    private String deliSexBaby1;
    private String deliFetalOutcome2;
    private String deliCauseDeath2;
    private String deliSexBaby2;
    private String deliFetalOutcome3;
    private String deliCauseDeath3;
    private String deliSexBaby3;
    private String deliConsentInfant;
    private String deliReasonNoconsent;
    private String deliNoconsentOther;
    private String deliFeverSymptom;
    private String deliRash;
    private String deliItch;
    private String deliRashFirst;//multiple
    private String deliRashDay;
    private String deliRashMonth;
    private String deliRashYear;
    private Integer deliRashDuration;
    private String deliRashSpread;
    private String deliSpreadPart;//multiple
    private String deliFeverExperience;
    private String deliTempMeasure;
    private Float deliHighTemp;
    private String deliHightemUnit;
    private String deliTempunknown;
    private String deliFeverDay;
    private String deliFeverMonth;
    private String deliFeverYear;
    private Integer deliFeverDuration;
    private String deliRedeyes;
    private String deliRedeyesDay;
    private String deliRedeyesMonth;
    private String deliRedeyesYear;
    private Integer deliRedeyesDuration;
    private String deliJoint;
    private String deliJointDay;
    private String deliJointMonth;
    private String deliJointYear;
    private Integer deliJointDuration;
    private String deliHeadache;
    private String deliHeadacheDay;
    private String deliHeadacheMonth;
    private String deliHeadacheYear;
    private Integer deliHeadacheDuration;
    private String deliSymptomOther;
    private String deliSpecifySymptom;
    private String deliOtherSymptom;
    private String deliMedicare;
    private String deliCareDay;
    private String deliCareMonth;
    private String deliCareYear;
    private String deliCareFacility;
    private String deliHospitalized;
    private String deliHospital;
    private String deliDiagRubella;
    private String deliDiagDengue;
    private String deliDiagChikung;
    private String deliDiagZika;
    private String deliDiagCytome;
    private String deliMedicine;
    private String deliMedcineName;
    private String deliSymptomDiary;
    private String deliGuillainbarre;
    private String deliTingling;
    private String deliTinglingArm;//multiple
    private String deliTinglingLeg;//multiple
    private String deliTinglingHand;//multiple
    private String deliTinglingFoot;//multiple
    private String deliTinglingFace;//multiple
    private String deliTinglingOther;
    private Integer deliSensationMin;
    private Integer deliSensationHr;
    private Integer deliSenstaionDay;
    private String deliInjury;
    private String deliTinglingDay;
    private String deliTinglingMonth;
    private String deliTinglingYear;
    private Integer deliTinglingDuration;
    private String deliNumbness;
    private String deliNumbArm;//multiple
    private String deliNumbLeg;//multiple
    private String deliNumbHand;//multiple
    private String deliNumbFoot;//multiple
    private String deliNumbFace;//multiple
    private String deliNumbOther;
    private String deliNumbDay;
    private String deliNumbMonth;
    private String deliNumbYear;
    private Integer deliNumbDuration;
    private String deliParalysis;
    private String deliParaArm;//multiple
    private String deliParaLeg;//multiple
    private String deliParaHand;//multiple
    private String deliParaFoot;//multiple
    private String deliParaFace;//multiple
    private String deliParaOther;
    private String deliParaDay;
    private String deliParaMonth;
    private String deliParaYear;
    private Integer deliParaDuration;
    private String deliResultsProvided;
    private String deliCounseling;
    private String deliResultsOther;
    private String deliIdCompleting;
    private Date deliDateCompleted;
    private String deliIdReviewer;
    private Date deliDateReviewed;
    private String deliIdDataEntry;
    private Date deliDateEntered;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "redcap_event_name", nullable = true)
    public String getRedcapEventName() {
        return redcapEventName;
    }

    public void setRedcapEventName(String redcapEventName) {
        this.redcapEventName = redcapEventName;
    }

    @Column(name = "deli_visit_date", nullable = true)
    public Date getDeliVisitDate() {
        return deliVisitDate;
    }

    public void setDeliVisitDate(Date deliVisitDate) {
        this.deliVisitDate = deliVisitDate;
    }

    @Column(name = "deli_visit_status", nullable = true, length = 1)
    public String getDeliVisitStatus() {
        return deliVisitStatus;
    }

    public void setDeliVisitStatus(String deliVisitStatus) {
        this.deliVisitStatus = deliVisitStatus;
    }

    @Column(name = "deli_visit_type", nullable = true, length = 1)
    public String getDeliVisitType() {
        return deliVisitType;
    }

    public void setDeliVisitType(String deliVisitType) {
        this.deliVisitType = deliVisitType;
    }

    @Column(name = "deli_mother_wt", nullable = true)
    public Float getDeliMotherWt() {
        return deliMotherWt;
    }

    public void setDeliMotherWt(Float deliMotherWt) {
        this.deliMotherWt = deliMotherWt;
    }

    @Column(name = "deli_wt_unit", nullable = true, length = 1)
    public String getDeliWtUnit() {
        return deliWtUnit;
    }

    public void setDeliWtUnit(String deliWtUnit) {
        this.deliWtUnit = deliWtUnit;
    }

    @Column(name = "deli_systolic", nullable = true)
    public Integer getDeliSystolic() {
        return deliSystolic;
    }

    public void setDeliSystolic(Integer deliSystolic) {
        this.deliSystolic = deliSystolic;
    }

    @Column(name = "deli_diastolic", nullable = true)
    public Integer getDeliDiastolic() {
        return deliDiastolic;
    }

    public void setDeliDiastolic(Integer deliDiastolic) {
        this.deliDiastolic = deliDiastolic;
    }

    @Column(name = "deli_temperature", nullable = true)
    public Float getDeliTemperature() {
        return deliTemperature;
    }

    public void setDeliTemperature(Float deliTemperature) {
        this.deliTemperature = deliTemperature;
    }

    @Column(name = "deli_temp_unit", nullable = true, length = 1)
    public String getDeliTempUnit() {
        return deliTempUnit;
    }

    public void setDeliTempUnit(String deliTempUnit) {
        this.deliTempUnit = deliTempUnit;
    }

    @Column(name = "deli_delivery_date", nullable = true)
    public Date getDeliDeliveryDate() {
        return deliDeliveryDate;
    }

    public void setDeliDeliveryDate(Date deliDeliveryDate) {
        this.deliDeliveryDate = deliDeliveryDate;
    }

    @Column(name = "deli_mode", nullable = true, length = 2)
    public String getDeliMode() {
        return deliMode;
    }

    public void setDeliMode(String deliMode) {
        this.deliMode = deliMode;
    }

    @Column(name = "deli_delivery_who", nullable = true, length = 2)
    public String getDeliDeliveryWho() {
        return deliDeliveryWho;
    }

    public void setDeliDeliveryWho(String deliDeliveryWho) {
        this.deliDeliveryWho = deliDeliveryWho;
    }

    @Column(name = "deli_delivery_occur", nullable = true, length = 2)
    public String getDeliDeliveryOccur() {
        return deliDeliveryOccur;
    }

    public void setDeliDeliveryOccur(String deliDeliveryOccur) {
        this.deliDeliveryOccur = deliDeliveryOccur;
    }

    @Column(name = "deli_hospital_id", nullable = true, length = 25)
    public String getDeliHospitalId() {
        return deliHospitalId;
    }

    public void setDeliHospitalId(String deliHospitalId) {
        this.deliHospitalId = deliHospitalId;
    }

    @Column(name = "deli_clinic_id", nullable = true, length = 25)
    public String getDeliClinicId() {
        return deliClinicId;
    }

    public void setDeliClinicId(String deliClinicId) {
        this.deliClinicId = deliClinicId;
    }

    @Column(name = "deli_delivery_other", nullable = true)
    public String getDeliDeliveryOther() {
        return deliDeliveryOther;
    }

    public void setDeliDeliveryOther(String deliDeliveryOther) {
        this.deliDeliveryOther = deliDeliveryOther;
    }

    @Column(name = "deli_num_birth", nullable = true, length = 1)
    public String getDeliNumBirth() {
        return deliNumBirth;
    }

    public void setDeliNumBirth(String deliNumBirth) {
        this.deliNumBirth = deliNumBirth;
    }

    @Column(name = "deli_fetal_outcome1", nullable = true, length = 2)
    public String getDeliFetalOutcome1() {
        return deliFetalOutcome1;
    }

    public void setDeliFetalOutcome1(String deliFetalOutcome1) {
        this.deliFetalOutcome1 = deliFetalOutcome1;
    }

    @Column(name = "deli_cause_death1", nullable = true)
    public String getDeliCauseDeath1() {
        return deliCauseDeath1;
    }

    public void setDeliCauseDeath1(String deliCauseDeath1) {
        this.deliCauseDeath1 = deliCauseDeath1;
    }

    @Column(name = "deli_sex_baby1", nullable = true, length = 1)
    public String getDeliSexBaby1() {
        return deliSexBaby1;
    }

    public void setDeliSexBaby1(String deliSexBaby1) {
        this.deliSexBaby1 = deliSexBaby1;
    }

    @Column(name = "deli_fetal_outcome2", nullable = true, length = 2)
    public String getDeliFetalOutcome2() {
        return deliFetalOutcome2;
    }

    public void setDeliFetalOutcome2(String deliFetalOutcome2) {
        this.deliFetalOutcome2 = deliFetalOutcome2;
    }

    @Column(name = "deli_cause_death2", nullable = true)
    public String getDeliCauseDeath2() {
        return deliCauseDeath2;
    }

    public void setDeliCauseDeath2(String deliCauseDeath2) {
        this.deliCauseDeath2 = deliCauseDeath2;
    }

    @Column(name = "deli_sex_baby2", nullable = true, length = 1)
    public String getDeliSexBaby2() {
        return deliSexBaby2;
    }

    public void setDeliSexBaby2(String deliSexBaby2) {
        this.deliSexBaby2 = deliSexBaby2;
    }

    @Column(name = "deli_fetal_outcome3", nullable = true, length = 2)
    public String getDeliFetalOutcome3() {
        return deliFetalOutcome3;
    }

    public void setDeliFetalOutcome3(String deliFetalOutcome3) {
        this.deliFetalOutcome3 = deliFetalOutcome3;
    }

    @Column(name = "deli_cause_death3", nullable = true)
    public String getDeliCauseDeath3() {
        return deliCauseDeath3;
    }

    public void setDeliCauseDeath3(String deliCauseDeath3) {
        this.deliCauseDeath3 = deliCauseDeath3;
    }

    @Column(name = "deli_sex_baby3", nullable = true, length = 1)
    public String getDeliSexBaby3() {
        return deliSexBaby3;
    }

    public void setDeliSexBaby3(String deliSexBaby3) {
        this.deliSexBaby3 = deliSexBaby3;
    }

    @Column(name = "deli_consent_infant", nullable = true, length = 1)
    public String getDeliConsentInfant() {
        return deliConsentInfant;
    }

    public void setDeliConsentInfant(String deliConsentInfant) {
        this.deliConsentInfant = deliConsentInfant;
    }

    @Column(name = "deli_reason_noconsent", nullable = true, length = 1)
    public String getDeliReasonNoconsent() {
        return deliReasonNoconsent;
    }

    public void setDeliReasonNoconsent(String deliReasonNoconsent) {
        this.deliReasonNoconsent = deliReasonNoconsent;
    }

    @Column(name = "deli_noconsent_other", nullable = true)
    public String getDeliNoconsentOther() {
        return deliNoconsentOther;
    }

    public void setDeliNoconsentOther(String deliNoconsentOther) {
        this.deliNoconsentOther = deliNoconsentOther;
    }

    @Column(name = "deli_fever_symptom", nullable = true, length = 1)
    public String getDeliFeverSymptom() {
        return deliFeverSymptom;
    }

    public void setDeliFeverSymptom(String deliFeverSymptom) {
        this.deliFeverSymptom = deliFeverSymptom;
    }

    @Column(name = "deli_rash", nullable = true, length = 1)
    public String getDeliRash() {
        return deliRash;
    }

    public void setDeliRash(String deliRash) {
        this.deliRash = deliRash;
    }

    @Column(name = "deli_itch", nullable = true, length = 1)
    public String getDeliItch() {
        return deliItch;
    }

    public void setDeliItch(String deliItch) {
        this.deliItch = deliItch;
    }

    @Column(name = "deli_rash_first", nullable = true, length = 30)
    public String getDeliRashFirst() {
        return deliRashFirst;
    }

    public void setDeliRashFirst(String deliRashFirst) {
        this.deliRashFirst = deliRashFirst;
    }

    @Column(name = "deli_rash_day", nullable = true, length = 2)
    public String getDeliRashDay() {
        return deliRashDay;
    }

    public void setDeliRashDay(String deliRashDay) {
        this.deliRashDay = deliRashDay;
    }

    @Column(name = "deli_rash_month", nullable = true, length = 2)
    public String getDeliRashMonth() {
        return deliRashMonth;
    }

    public void setDeliRashMonth(String deliRashMonth) {
        this.deliRashMonth = deliRashMonth;
    }

    @Column(name = "deli_rash_year", nullable = true, length = 4)
    public String getDeliRashYear() {
        return deliRashYear;
    }

    public void setDeliRashYear(String deliRashYear) {
        this.deliRashYear = deliRashYear;
    }

    @Column(name = "deli_rash_duration", nullable = true)
    public Integer getDeliRashDuration() {
        return deliRashDuration;
    }

    public void setDeliRashDuration(Integer deliRashDuration) {
        this.deliRashDuration = deliRashDuration;
    }

    @Column(name = "deli_rash_spread", nullable = true, length = 1)
    public String getDeliRashSpread() {
        return deliRashSpread;
    }

    public void setDeliRashSpread(String deliRashSpread) {
        this.deliRashSpread = deliRashSpread;
    }

    @Column(name = "deli_spread_part", nullable = true, length = 30)
    public String getDeliSpreadPart() {
        return deliSpreadPart;
    }

    public void setDeliSpreadPart(String deliSpreadPart) {
        this.deliSpreadPart = deliSpreadPart;
    }

    @Column(name = "deli_fever_experience", nullable = true, length = 1)
    public String getDeliFeverExperience() {
        return deliFeverExperience;
    }

    public void setDeliFeverExperience(String deliFeverExperience) {
        this.deliFeverExperience = deliFeverExperience;
    }

    @Column(name = "deli_temp_measure", nullable = true, length = 1)
    public String getDeliTempMeasure() {
        return deliTempMeasure;
    }

    public void setDeliTempMeasure(String deliTempMeasure) {
        this.deliTempMeasure = deliTempMeasure;
    }

    @Column(name = "deli_high_temp", nullable = true)
    public Float getDeliHighTemp() {
        return deliHighTemp;
    }

    public void setDeliHighTemp(Float deliHighTemp) {
        this.deliHighTemp = deliHighTemp;
    }

    @Column(name = "deli_hightem_unit", nullable = true, length = 1)
    public String getDeliHightemUnit() {
        return deliHightemUnit;
    }

    public void setDeliHightemUnit(String deliHightemUnit) {
        this.deliHightemUnit = deliHightemUnit;
    }

    @Column(name = "deli_tempunknown", nullable = true, length = 1)
    public String getDeliTempunknown() {
        return deliTempunknown;
    }

    public void setDeliTempunknown(String deliTempunknown) {
        this.deliTempunknown = deliTempunknown;
    }

    @Column(name = "deli_fever_day", nullable = true, length = 2)
    public String getDeliFeverDay() {
        return deliFeverDay;
    }

    public void setDeliFeverDay(String deliFeverDay) {
        this.deliFeverDay = deliFeverDay;
    }

    @Column(name = "deli_fever_month", nullable = true, length = 2)
    public String getDeliFeverMonth() {
        return deliFeverMonth;
    }

    public void setDeliFeverMonth(String deliFeverMonth) {
        this.deliFeverMonth = deliFeverMonth;
    }

    @Column(name = "deli_fever_year", nullable = true, length = 4)
    public String getDeliFeverYear() {
        return deliFeverYear;
    }

    public void setDeliFeverYear(String deliFeverYear) {
        this.deliFeverYear = deliFeverYear;
    }

    @Column(name = "deli_fever_duration", nullable = true)
    public Integer getDeliFeverDuration() {
        return deliFeverDuration;
    }

    public void setDeliFeverDuration(Integer deliFeverDuration) {
        this.deliFeverDuration = deliFeverDuration;
    }

    @Column(name = "deli_redeyes", nullable = true, length = 1)
    public String getDeliRedeyes() {
        return deliRedeyes;
    }

    public void setDeliRedeyes(String deliRedeyes) {
        this.deliRedeyes = deliRedeyes;
    }

    @Column(name = "deli_redeyes_day", nullable = true, length = 2)
    public String getDeliRedeyesDay() {
        return deliRedeyesDay;
    }

    public void setDeliRedeyesDay(String deliRedeyesDay) {
        this.deliRedeyesDay = deliRedeyesDay;
    }

    @Column(name = "deli_redeyes_month", nullable = true, length = 2)
    public String getDeliRedeyesMonth() {
        return deliRedeyesMonth;
    }

    public void setDeliRedeyesMonth(String deliRedeyesMonth) {
        this.deliRedeyesMonth = deliRedeyesMonth;
    }

    @Column(name = "deli_redeyes_year", nullable = true, length = 4)
    public String getDeliRedeyesYear() {
        return deliRedeyesYear;
    }

    public void setDeliRedeyesYear(String deliRedeyesYear) {
        this.deliRedeyesYear = deliRedeyesYear;
    }

    @Column(name = "deli_redeyes_duration", nullable = true)
    public Integer getDeliRedeyesDuration() {
        return deliRedeyesDuration;
    }

    public void setDeliRedeyesDuration(Integer deliRedeyesDuration) {
        this.deliRedeyesDuration = deliRedeyesDuration;
    }

    @Column(name = "deli_joint", nullable = true, length = 1)
    public String getDeliJoint() {
        return deliJoint;
    }

    public void setDeliJoint(String deliJoint) {
        this.deliJoint = deliJoint;
    }

    @Column(name = "deli_joint_day", nullable = true, length = 2)
    public String getDeliJointDay() {
        return deliJointDay;
    }

    public void setDeliJointDay(String deliJointDay) {
        this.deliJointDay = deliJointDay;
    }

    @Column(name = "deli_joint_month", nullable = true, length = 2)
    public String getDeliJointMonth() {
        return deliJointMonth;
    }

    public void setDeliJointMonth(String deliJointMonth) {
        this.deliJointMonth = deliJointMonth;
    }

    @Column(name = "deli_joint_year", nullable = true, length = 4)
    public String getDeliJointYear() {
        return deliJointYear;
    }

    public void setDeliJointYear(String deliJointYear) {
        this.deliJointYear = deliJointYear;
    }

    @Column(name = "deli_joint_duration", nullable = true)
    public Integer getDeliJointDuration() {
        return deliJointDuration;
    }

    public void setDeliJointDuration(Integer deliJointDuration) {
        this.deliJointDuration = deliJointDuration;
    }

    @Column(name = "deli_headache", nullable = true, length = 1)
    public String getDeliHeadache() {
        return deliHeadache;
    }

    public void setDeliHeadache(String deliHeadache) {
        this.deliHeadache = deliHeadache;
    }

    @Column(name = "deli_headache_day", nullable = true, length = 2)
    public String getDeliHeadacheDay() {
        return deliHeadacheDay;
    }

    public void setDeliHeadacheDay(String deliHeadacheDay) {
        this.deliHeadacheDay = deliHeadacheDay;
    }

    @Column(name = "deli_headache_month", nullable = true, length = 2)
    public String getDeliHeadacheMonth() {
        return deliHeadacheMonth;
    }

    public void setDeliHeadacheMonth(String deliHeadacheMonth) {
        this.deliHeadacheMonth = deliHeadacheMonth;
    }

    @Column(name = "deli_headache_year", nullable = true, length = 4)
    public String getDeliHeadacheYear() {
        return deliHeadacheYear;
    }

    public void setDeliHeadacheYear(String deliHeadacheYear) {
        this.deliHeadacheYear = deliHeadacheYear;
    }

    @Column(name = "deli_headache_duration", nullable = true)
    public Integer getDeliHeadacheDuration() {
        return deliHeadacheDuration;
    }

    public void setDeliHeadacheDuration(Integer deliHeadacheDuration) {
        this.deliHeadacheDuration = deliHeadacheDuration;
    }

    @Column(name = "deli_symptom_other", nullable = true, length = 1)
    public String getDeliSymptomOther() {
        return deliSymptomOther;
    }

    public void setDeliSymptomOther(String deliSymptomOther) {
        this.deliSymptomOther = deliSymptomOther;
    }

    @Column(name = "deli_specify_symptom", nullable = true, length = 50)
    public String getDeliSpecifySymptom() {
        return deliSpecifySymptom;
    }

    public void setDeliSpecifySymptom(String deliSpecifySymptom) {
        this.deliSpecifySymptom = deliSpecifySymptom;
    }

    @Column(name = "deli_other_symptom", nullable = true)
    public String getDeliOtherSymptom() {
        return deliOtherSymptom;
    }

    public void setDeliOtherSymptom(String deliOtherSymptom) {
        this.deliOtherSymptom = deliOtherSymptom;
    }

    @Column(name = "deli_medicare", nullable = true, length = 1)
    public String getDeliMedicare() {
        return deliMedicare;
    }

    public void setDeliMedicare(String deliMedicare) {
        this.deliMedicare = deliMedicare;
    }

    @Column(name = "deli_care_day", nullable = true, length = 2)
    public String getDeliCareDay() {
        return deliCareDay;
    }

    public void setDeliCareDay(String deliCareDay) {
        this.deliCareDay = deliCareDay;
    }

    @Column(name = "deli_care_month", nullable = true, length = 2)
    public String getDeliCareMonth() {
        return deliCareMonth;
    }

    public void setDeliCareMonth(String deliCareMonth) {
        this.deliCareMonth = deliCareMonth;
    }

    @Column(name = "deli_care_year", nullable = true, length = 4)
    public String getDeliCareYear() {
        return deliCareYear;
    }

    public void setDeliCareYear(String deliCareYear) {
        this.deliCareYear = deliCareYear;
    }

    @Column(name = "deli_care_facility", nullable = true, length = 25)
    public String getDeliCareFacility() {
        return deliCareFacility;
    }

    public void setDeliCareFacility(String deliCareFacility) {
        this.deliCareFacility = deliCareFacility;
    }

    @Column(name = "deli_hospitalized", nullable = true, length = 1)
    public String getDeliHospitalized() {
        return deliHospitalized;
    }

    public void setDeliHospitalized(String deliHospitalized) {
        this.deliHospitalized = deliHospitalized;
    }

    @Column(name = "deli_hospital", nullable = true)
    public String getDeliHospital() {
        return deliHospital;
    }

    public void setDeliHospital(String deliHospital) {
        this.deliHospital = deliHospital;
    }

    @Column(name = "deli_diag_rubella", nullable = true, length = 1)
    public String getDeliDiagRubella() {
        return deliDiagRubella;
    }

    public void setDeliDiagRubella(String deliDiagRubella) {
        this.deliDiagRubella = deliDiagRubella;
    }

    @Column(name = "deli_diag_dengue", nullable = true, length = 1)
    public String getDeliDiagDengue() {
        return deliDiagDengue;
    }

    public void setDeliDiagDengue(String deliDiagDengue) {
        this.deliDiagDengue = deliDiagDengue;
    }

    @Column(name = "deli_diag_chikung", nullable = true, length = 1)
    public String getDeliDiagChikung() {
        return deliDiagChikung;
    }

    public void setDeliDiagChikung(String deliDiagChikung) {
        this.deliDiagChikung = deliDiagChikung;
    }

    @Column(name = "deli_diag_zika", nullable = true, length = 1)
    public String getDeliDiagZika() {
        return deliDiagZika;
    }

    public void setDeliDiagZika(String deliDiagZika) {
        this.deliDiagZika = deliDiagZika;
    }

    @Column(name = "deli_diag_cytome", nullable = true, length = 1)
    public String getDeliDiagCytome() {
        return deliDiagCytome;
    }

    public void setDeliDiagCytome(String deliDiagCytome) {
        this.deliDiagCytome = deliDiagCytome;
    }

    @Column(name = "deli_medicine", nullable = true, length = 1)
    public String getDeliMedicine() {
        return deliMedicine;
    }

    public void setDeliMedicine(String deliMedicine) {
        this.deliMedicine = deliMedicine;
    }

    @Column(name = "deli_medcine_name", nullable = true)
    public String getDeliMedcineName() {
        return deliMedcineName;
    }

    public void setDeliMedcineName(String deliMedcineName) {
        this.deliMedcineName = deliMedcineName;
    }

    @Column(name = "deli_symptom_diary", nullable = true, length = 1)
    public String getDeliSymptomDiary() {
        return deliSymptomDiary;
    }

    public void setDeliSymptomDiary(String deliSymptomDiary) {
        this.deliSymptomDiary = deliSymptomDiary;
    }

    @Column(name = "deli_guillainbarre", nullable = true, length = 1)
    public String getDeliGuillainbarre() {
        return deliGuillainbarre;
    }

    public void setDeliGuillainbarre(String deliGuillainbarre) {
        this.deliGuillainbarre = deliGuillainbarre;
    }

    @Column(name = "deli_tingling", nullable = true, length = 1)
    public String getDeliTingling() {
        return deliTingling;
    }

    public void setDeliTingling(String deliTingling) {
        this.deliTingling = deliTingling;
    }

    @Column(name = "deli_tingling_arm", nullable = true, length = 5)
    public String getDeliTinglingArm() {
        return deliTinglingArm;
    }

    public void setDeliTinglingArm(String deliTinglingArm) {
        this.deliTinglingArm = deliTinglingArm;
    }

    @Column(name = "deli_tingling_leg", nullable = true, length = 5)
    public String getDeliTinglingLeg() {
        return deliTinglingLeg;
    }

    public void setDeliTinglingLeg(String deliTinglingLeg) {
        this.deliTinglingLeg = deliTinglingLeg;
    }

    @Column(name = "deli_tingling_hand", nullable = true, length = 5)
    public String getDeliTinglingHand() {
        return deliTinglingHand;
    }

    public void setDeliTinglingHand(String deliTinglingHand) {
        this.deliTinglingHand = deliTinglingHand;
    }

    @Column(name = "deli_tingling_foot", nullable = true, length = 5)
    public String getDeliTinglingFoot() {
        return deliTinglingFoot;
    }

    public void setDeliTinglingFoot(String deliTinglingFoot) {
        this.deliTinglingFoot = deliTinglingFoot;
    }

    @Column(name = "deli_tingling_face", nullable = true, length = 5)
    public String getDeliTinglingFace() {
        return deliTinglingFace;
    }

    public void setDeliTinglingFace(String deliTinglingFace) {
        this.deliTinglingFace = deliTinglingFace;
    }

    @Column(name = "deli_tingling_other", nullable = true)
    public String getDeliTinglingOther() {
        return deliTinglingOther;
    }

    public void setDeliTinglingOther(String deliTinglingOther) {
        this.deliTinglingOther = deliTinglingOther;
    }

    @Column(name = "deli_sensation_min", nullable = true, length = 2)
    public Integer getDeliSensationMin() {
        return deliSensationMin;
    }

    public void setDeliSensationMin(Integer deliSensationMin) {
        this.deliSensationMin = deliSensationMin;
    }

    @Column(name = "deli_sensation_hr", nullable = true, length = 2)
    public Integer getDeliSensationHr() {
        return deliSensationHr;
    }

    public void setDeliSensationHr(Integer deliSensationHr) {
        this.deliSensationHr = deliSensationHr;
    }

    @Column(name = "deli_senstaion_day", nullable = true, length = 3)
    public Integer getDeliSenstaionDay() {
        return deliSenstaionDay;
    }

    public void setDeliSenstaionDay(Integer deliSenstaionDay) {
        this.deliSenstaionDay = deliSenstaionDay;
    }

    @Column(name = "deli_injury", nullable = true, length = 1)
    public String getDeliInjury() {
        return deliInjury;
    }

    public void setDeliInjury(String deliInjury) {
        this.deliInjury = deliInjury;
    }

    @Column(name = "deli_tingling_day", nullable = true, length = 2)
    public String getDeliTinglingDay() {
        return deliTinglingDay;
    }

    public void setDeliTinglingDay(String deliTinglingDay) {
        this.deliTinglingDay = deliTinglingDay;
    }

    @Column(name = "deli_tingling_month", nullable = true, length = 2)
    public String getDeliTinglingMonth() {
        return deliTinglingMonth;
    }

    public void setDeliTinglingMonth(String deliTinglingMonth) {
        this.deliTinglingMonth = deliTinglingMonth;
    }

    @Column(name = "deli_tingling_year", nullable = true, length = 4)
    public String getDeliTinglingYear() {
        return deliTinglingYear;
    }

    public void setDeliTinglingYear(String deliTinglingYear) {
        this.deliTinglingYear = deliTinglingYear;
    }

    @Column(name = "deli_tingling_duration", nullable = true)
    public Integer getDeliTinglingDuration() {
        return deliTinglingDuration;
    }

    public void setDeliTinglingDuration(Integer deliTinglingDuration) {
        this.deliTinglingDuration = deliTinglingDuration;
    }

    @Column(name = "deli_numbness", nullable = true, length = 1)
    public String getDeliNumbness() {
        return deliNumbness;
    }

    public void setDeliNumbness(String deliNumbness) {
        this.deliNumbness = deliNumbness;
    }

    @Column(name = "deli_numb_arm", nullable = true, length = 5)
    public String getDeliNumbArm() {
        return deliNumbArm;
    }

    public void setDeliNumbArm(String deliNumbArm) {
        this.deliNumbArm = deliNumbArm;
    }

    @Column(name = "deli_numb_leg", nullable = true, length = 5)
    public String getDeliNumbLeg() {
        return deliNumbLeg;
    }

    public void setDeliNumbLeg(String deliNumbLeg) {
        this.deliNumbLeg = deliNumbLeg;
    }

    @Column(name = "deli_numb_hand", nullable = true, length = 5)
    public String getDeliNumbHand() {
        return deliNumbHand;
    }

    public void setDeliNumbHand(String deliNumbHand) {
        this.deliNumbHand = deliNumbHand;
    }

    @Column(name = "deli_numb_foot", nullable = true, length = 5)
    public String getDeliNumbFoot() {
        return deliNumbFoot;
    }

    public void setDeliNumbFoot(String deliNumbFoot) {
        this.deliNumbFoot = deliNumbFoot;
    }

    @Column(name = "deli_numb_face", nullable = true, length = 5)
    public String getDeliNumbFace() {
        return deliNumbFace;
    }

    public void setDeliNumbFace(String deliNumbFace) {
        this.deliNumbFace = deliNumbFace;
    }

    @Column(name = "deli_numb_other", nullable = true)
    public String getDeliNumbOther() {
        return deliNumbOther;
    }

    public void setDeliNumbOther(String deliNumbOther) {
        this.deliNumbOther = deliNumbOther;
    }

    @Column(name = "deli_numb_day", nullable = true, length = 2)
    public String getDeliNumbDay() {
        return deliNumbDay;
    }

    public void setDeliNumbDay(String deliNumbDay) {
        this.deliNumbDay = deliNumbDay;
    }

    @Column(name = "deli_numb_month", nullable = true, length = 2)
    public String getDeliNumbMonth() {
        return deliNumbMonth;
    }

    public void setDeliNumbMonth(String deliNumbMonth) {
        this.deliNumbMonth = deliNumbMonth;
    }

    @Column(name = "deli_numb_year", nullable = true, length = 4)
    public String getDeliNumbYear() {
        return deliNumbYear;
    }

    public void setDeliNumbYear(String deliNumbYear) {
        this.deliNumbYear = deliNumbYear;
    }

    @Column(name = "deli_numb_duration", nullable = true)
    public Integer getDeliNumbDuration() {
        return deliNumbDuration;
    }

    public void setDeliNumbDuration(Integer deliNumbDuration) {
        this.deliNumbDuration = deliNumbDuration;
    }

    @Column(name = "deli_paralysis", nullable = true, length = 1)
    public String getDeliParalysis() {
        return deliParalysis;
    }

    public void setDeliParalysis(String deliParalysis) {
        this.deliParalysis = deliParalysis;
    }

    @Column(name = "deli_para_arm", nullable = true, length = 5)
    public String getDeliParaArm() {
        return deliParaArm;
    }

    public void setDeliParaArm(String deliParaArm) {
        this.deliParaArm = deliParaArm;
    }

    @Column(name = "deli_para_leg", nullable = true, length = 5)
    public String getDeliParaLeg() {
        return deliParaLeg;
    }

    public void setDeliParaLeg(String deliParaLeg) {
        this.deliParaLeg = deliParaLeg;
    }

    @Column(name = "deli_para_hand", nullable = true, length = 5)
    public String getDeliParaHand() {
        return deliParaHand;
    }

    public void setDeliParaHand(String deliParaHand) {
        this.deliParaHand = deliParaHand;
    }

    @Column(name = "deli_para_foot", nullable = true, length = 5)
    public String getDeliParaFoot() {
        return deliParaFoot;
    }

    public void setDeliParaFoot(String deliParaFoot) {
        this.deliParaFoot = deliParaFoot;
    }

    @Column(name = "deli_para_face", nullable = true, length = 5)
    public String getDeliParaFace() {
        return deliParaFace;
    }

    public void setDeliParaFace(String deliParaFace) {
        this.deliParaFace = deliParaFace;
    }

    @Column(name = "deli_para_other", nullable = true)
    public String getDeliParaOther() {
        return deliParaOther;
    }

    public void setDeliParaOther(String deliParaOther) {
        this.deliParaOther = deliParaOther;
    }

    @Column(name = "deli_para_day", nullable = true, length = 2)
    public String getDeliParaDay() {
        return deliParaDay;
    }

    public void setDeliParaDay(String deliParaDay) {
        this.deliParaDay = deliParaDay;
    }

    @Column(name = "deli_para_month", nullable = true, length = 2)
    public String getDeliParaMonth() {
        return deliParaMonth;
    }

    public void setDeliParaMonth(String deliParaMonth) {
        this.deliParaMonth = deliParaMonth;
    }

    @Column(name = "deli_para_year", nullable = true, length = 4)
    public String getDeliParaYear() {
        return deliParaYear;
    }

    public void setDeliParaYear(String deliParaYear) {
        this.deliParaYear = deliParaYear;
    }

    @Column(name = "deli_para_duration", nullable = true)
    public Integer getDeliParaDuration() {
        return deliParaDuration;
    }

    public void setDeliParaDuration(Integer deliParaDuration) {
        this.deliParaDuration = deliParaDuration;
    }

    @Column(name = "deli_results_provided", nullable = true, length = 1)
    public String getDeliResultsProvided() {
        return deliResultsProvided;
    }

    public void setDeliResultsProvided(String deliResultsProvided) {
        this.deliResultsProvided = deliResultsProvided;
    }

    @Column(name = "deli_counseling", nullable = true, length = 1)
    public String getDeliCounseling() {
        return deliCounseling;
    }

    public void setDeliCounseling(String deliCounseling) {
        this.deliCounseling = deliCounseling;
    }

    @Column(name = "deli_results_other", nullable = true, length = 1)
    public String getDeliResultsOther() {
        return deliResultsOther;
    }

    public void setDeliResultsOther(String deliResultsOther) {
        this.deliResultsOther = deliResultsOther;
    }

    @Column(name = "deli_id_completing", nullable = true, length = 50)
    public String getDeliIdCompleting() {
        return deliIdCompleting;
    }

    public void setDeliIdCompleting(String deliIdCompleting) {
        this.deliIdCompleting = deliIdCompleting;
    }

    @Column(name = "deli_date_completed", nullable = true)
    public Date getDeliDateCompleted() {
        return deliDateCompleted;
    }

    public void setDeliDateCompleted(Date deliDateCompleted) {
        this.deliDateCompleted = deliDateCompleted;
    }

    @Column(name = "deli_id_reviewer", nullable = true, length = 50)
    public String getDeliIdReviewer() {
        return deliIdReviewer;
    }

    public void setDeliIdReviewer(String deliIdReviewer) {
        this.deliIdReviewer = deliIdReviewer;
    }

    @Column(name = "deli_date_reviewed", nullable = true)
    public Date getDeliDateReviewed() {
        return deliDateReviewed;
    }

    public void setDeliDateReviewed(Date deliDateReviewed) {
        this.deliDateReviewed = deliDateReviewed;
    }

    @Column(name = "deli_id_data_entry", nullable = true, length = 50)
    public String getDeliIdDataEntry() {
        return deliIdDataEntry;
    }

    public void setDeliIdDataEntry(String deliIdDataEntry) {
        this.deliIdDataEntry = deliIdDataEntry;
    }

    @Column(name = "deli_date_entered", nullable = true)
    public Date getDeliDateEntered() {
        return deliDateEntered;
    }

    public void setDeliDateEntered(Date deliDateEntered) {
        this.deliDateEntered = deliDateEntered;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return this.recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zp06DeliveryAnd6weekVisit)) return false;

        Zp06DeliveryAnd6weekVisit that = (Zp06DeliveryAnd6weekVisit) o;

        return (recordId.equals(that.recordId));
    }
}
