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
@Table(name = "zp03_monthly_visit", catalog = "zika_zip")
public class Zp03MonthlyVisit extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private Date monVisitDate;
    private String monVisitType;
    private String monReasonMissed;
    private String monOtherReschedu;
    private String monReasonUnscheduled;
    private String monOtherUnscheduled;
    private Float monMotherWt;
    private String monWtUnit;
    private Integer monSystolic;
    private Integer monDiastolic;
    private Float monTemperature;
    private String monTempUnit;
    private String monPregnancyLoss;
    private Date monDateLoss;
    private String monPersisHeadache;
    private String monDizziness;
    private String monNausea;
    private String monVomiting;
    private String monLights;
    private String monLightsSpecify;
    private String monSwelling;
    private String monFetalMovement;
    private String monMoveUsual;
    private String monMoveDecrease;
    private String monContractions;
    private Integer monContractWeek;
    private Integer monContractDay;
    private Integer monContractHour;
    private Integer monContract10min;
    private String monVaginalDischarge;
    private String monCharacDischarge;//multiple
    private String monBleeding;
    private String monBleedingCharac;
    private String monUtiTold;
    private String monPrenatalDay;
    private String monPrenatalMonth;
    private String monPrenatalYear;
    private String monFeverSymptom;
    private String monRash;
    private String monItch;
    private String monRashFirst;//multiple
    private String monRashDay;
    private String monRashMonth;
    private String monRashYear;
    private Integer monRashDuration;
    private String monRashSpread;
    private String monSpreadPart;//multiple
    private String monFeverExperience;
    private String monTempMeasure;
    private Float monHighTemp;
    private String monHightemUnit;
    private String monTempunknown;
    private String monFeverDay;
    private String monFeverMonth;
    private String monFeverYear;
    private Integer monFeverDuration;
    private String monRedeyes;
    private String monRedeyesDay;
    private String monRedeyesMonth;
    private String monRedeyesYear;
    private Integer monRedeyesDuration;
    private String monJoint;
    private String monJointDay;
    private String monJointMonth;
    private String monJointYear;
    private Integer monJointDuration;
    private String monHeadache;
    private String monHeadacheDay;
    private String monHeadacheMonth;
    private String monHeadacheYear;
    private Integer monHeadacheDuration;
    private String monSymptomOther;
    private String monSpecifySymptom;//multiple
    private String monOtherSymptom;
    private String monMedicare;
    private String monCareDay;
    private String monCareMonth;
    private String monCareYear;
    private String monCareFacility;
    private String monHospitalized;
    private String monHospital;
    private String monDiagRubella;
    private String monDiagDengue;
    private String monDiagChikung;
    private String monDiagZika;
    private String monDiagCytome;
    private String monMedicine;
    private String monMedcineName;
    private String monSymptomDiary;
    private String monGuillainbarre;
    private String monTingling;
    private String monTinglingArm;//multiple
    private String monTinglingLeg;//multiple
    private String monTinglingHand;//multiple
    private String monTinglingFoot;//multiple
    private String monTinglingFace;//multiple
    private String monTinglingOther;
    private String monSensationMin;
    private String monSensationHr;
    private String monSenstaionDay;
    private String monInjury;
    private String monTinglingDay;
    private String monTinglingMonth;
    private String monTinglingYear;
    private Integer monTinglingDuration;
    private String monNumbness;
    private String monNumbArm;//multiple
    private String monNumbLeg;//multiple
    private String monNumbHand;//multiple
    private String monNumbFoot;//multiple
    private String monNumbFace;//multiple
    private String monNumbOther;
    private String monNumbDay;
    private String monNumbMonth;
    private String monNumbYear;
    private Integer monNumbDuration;
    private String monParalysis;
    private String monParaArm;//multiple
    private String monParaLeg;//multiple
    private String monParaHand;//multiple
    private String monParaFoot;//multiple
    private String monParaFace;//multiple
    private String monParaOther;
    private String monParaDay;
    private String monParaMonth;
    private String monParaYear;
    private Integer monParaDuration;
    private String monResultsProvided;
    private String monCounseling;
    private String monResultsOther;
    private Date monOneweekDate;
    private String monOneweekTime;
    private String monProvideSym;
    private String monReminderPreg;
    private String monReminderProvided;
    private Date monNextDate;
    private String monNextTime;
    private String monIdCompleting;
    private Date monDateCompleted;
    private String monIdReviewer;
    private Date monDateReviewed;
    private String monIdDataEntry;
    private Date monDateEntered;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Id
    @Column(name = "redcap_event_name", nullable = true, length = 100)
    public String getRedcapEventName() {
        return redcapEventName;
    }

    public void setRedcapEventName(String redcapEventName) {
        this.redcapEventName = redcapEventName;
    }

    @Column(name = "mon_visit_date", nullable = true)
    public Date getMonVisitDate() {
        return monVisitDate;
    }

    public void setMonVisitDate(Date monVisitDate) {
        this.monVisitDate = monVisitDate;
    }

    @Column(name = "mon_visit_type", nullable = true, length = 2)
    public String getMonVisitType() {
        return monVisitType;
    }

    public void setMonVisitType(String monVisitType) {
        this.monVisitType = monVisitType;
    }

    @Column(name = "mon_reason_missed", nullable = true, length = 2)
    public String getMonReasonMissed() {
        return monReasonMissed;
    }

    public void setMonReasonMissed(String monReasonMissed) {
        this.monReasonMissed = monReasonMissed;
    }

    @Column(name = "mon_other_reschedu", nullable = true)
    public String getMonOtherReschedu() {
        return monOtherReschedu;
    }

    public void setMonOtherReschedu(String monOtherReschedu) {
        this.monOtherReschedu = monOtherReschedu;
    }

    @Column(name = "mon_reason_unscheduled", nullable = true, length = 2)
    public String getMonReasonUnscheduled() {
        return monReasonUnscheduled;
    }

    public void setMonReasonUnscheduled(String monReasonUnscheduled) {
        this.monReasonUnscheduled = monReasonUnscheduled;
    }

    @Column(name = "mon_other_unscheduled", nullable = true)
    public String getMonOtherUnscheduled() {
        return monOtherUnscheduled;
    }

    public void setMonOtherUnscheduled(String monOtherUnscheduled) {
        this.monOtherUnscheduled = monOtherUnscheduled;
    }

    @Column(name = "mon_mother_wt", nullable = true)
    public Float getMonMotherWt() {
        return monMotherWt;
    }

    public void setMonMotherWt(Float monMotherWt) {
        this.monMotherWt = monMotherWt;
    }

    @Column(name = "mon_wt_unit", nullable = true, length = 2)
    public String getMonWtUnit() {
        return monWtUnit;
    }

    public void setMonWtUnit(String monWtUnit) {
        this.monWtUnit = monWtUnit;
    }

    @Column(name = "mon_systolic", nullable = true)
    public Integer getMonSystolic() {
        return monSystolic;
    }

    public void setMonSystolic(Integer monSystolic) {
        this.monSystolic = monSystolic;
    }

    @Column(name = "mon_diastolic", nullable = true)
    public Integer getMonDiastolic() {
        return monDiastolic;
    }

    public void setMonDiastolic(Integer monDiastolic) {
        this.monDiastolic = monDiastolic;
    }

    @Column(name = "mon_temperature", nullable = true)
    public Float getMonTemperature() {
        return monTemperature;
    }

    public void setMonTemperature(Float monTemperature) {
        this.monTemperature = monTemperature;
    }

    @Column(name = "mon_temp_unit", nullable = true, length = 2)
    public String getMonTempUnit() {
        return monTempUnit;
    }

    public void setMonTempUnit(String monTempUnit) {
        this.monTempUnit = monTempUnit;
    }

    @Column(name = "mon_pregnancy_loss", nullable = true, length = 1)
    public String getMonPregnancyLoss() {
        return monPregnancyLoss;
    }

    public void setMonPregnancyLoss(String monPregnancyLoss) {
        this.monPregnancyLoss = monPregnancyLoss;
    }

    @Column(name = "mon_date_loss", nullable = true)
    public Date getMonDateLoss() {
        return monDateLoss;
    }

    public void setMonDateLoss(Date monDateLoss) {
        this.monDateLoss = monDateLoss;
    }

    @Column(name = "mon_persis_headache", nullable = true, length = 1)
    public String getMonPersisHeadache() {
        return monPersisHeadache;
    }

    public void setMonPersisHeadache(String monPersisHeadache) {
        this.monPersisHeadache = monPersisHeadache;
    }

    @Column(name = "mon_dizziness", nullable = true, length = 1)
    public String getMonDizziness() {
        return monDizziness;
    }

    public void setMonDizziness(String monDizziness) {
        this.monDizziness = monDizziness;
    }

    @Column(name = "mon_nausea", nullable = true, length = 1)
    public String getMonNausea() {
        return monNausea;
    }

    public void setMonNausea(String monNausea) {
        this.monNausea = monNausea;
    }

    @Column(name = "mon_vomiting", nullable = true, length = 1)
    public String getMonVomiting() {
        return monVomiting;
    }

    public void setMonVomiting(String monVomiting) {
        this.monVomiting = monVomiting;
    }

    @Column(name = "mon_lights", nullable = true, length = 1)
    public String getMonLights() {
        return monLights;
    }

    public void setMonLights(String monLights) {
        this.monLights = monLights;
    }

    @Column(name = "mon_lights_specify", nullable = true, length = 1)
    public String getMonLightsSpecify() {
        return monLightsSpecify;
    }

    public void setMonLightsSpecify(String monLightsSpecify) {
        this.monLightsSpecify = monLightsSpecify;
    }

    @Column(name = "mon_swelling", nullable = true, length = 1)
    public String getMonSwelling() {
        return monSwelling;
    }

    public void setMonSwelling(String monSwelling) {
        this.monSwelling = monSwelling;
    }

    @Column(name = "mon_fetal_movement", nullable = true, length = 1)
    public String getMonFetalMovement() {
        return monFetalMovement;
    }

    public void setMonFetalMovement(String monFetalMovement) {
        this.monFetalMovement = monFetalMovement;
    }

    @Column(name = "mon_move_usual", nullable = true, length = 1)
    public String getMonMoveUsual() {
        return monMoveUsual;
    }

    public void setMonMoveUsual(String monMoveUsual) {
        this.monMoveUsual = monMoveUsual;
    }

    @Column(name = "mon_move_decrease", nullable = true, length = 1)
    public String getMonMoveDecrease() {
        return monMoveDecrease;
    }

    public void setMonMoveDecrease(String monMoveDecrease) {
        this.monMoveDecrease = monMoveDecrease;
    }

    @Column(name = "mon_contractions", nullable = true, length = 1)
    public String getMonContractions() {
        return monContractions;
    }

    public void setMonContractions(String monContractions) {
        this.monContractions = monContractions;
    }

    @Column(name = "mon_contract_week", nullable = true)
    public Integer getMonContractWeek() {
        return monContractWeek;
    }

    public void setMonContractWeek(Integer monContractWeek) {
        this.monContractWeek = monContractWeek;
    }

    @Column(name = "mon_contract_day", nullable = true)
    public Integer getMonContractDay() {
        return monContractDay;
    }

    public void setMonContractDay(Integer monContractDay) {
        this.monContractDay = monContractDay;
    }

    @Column(name = "mon_contract_hour", nullable = true)
    public Integer getMonContractHour() {
        return monContractHour;
    }

    public void setMonContractHour(Integer monContractHour) {
        this.monContractHour = monContractHour;
    }

    @Column(name = "mon_contract_10min", nullable = true)
    public Integer getMonContract10min() {
        return monContract10min;
    }

    public void setMonContract10min(Integer monContract10min) {
        this.monContract10min = monContract10min;
    }

    @Column(name = "mon_vaginal_discharge", nullable = true, length = 1)
    public String getMonVaginalDischarge() {
        return monVaginalDischarge;
    }

    public void setMonVaginalDischarge(String monVaginalDischarge) {
        this.monVaginalDischarge = monVaginalDischarge;
    }

    @Column(name = "mon_charac_discharge", nullable = true, length = 20)
    public String getMonCharacDischarge() {
        return monCharacDischarge;
    }

    public void setMonCharacDischarge(String monCharacDischarge) {
        this.monCharacDischarge = monCharacDischarge;
    }

    @Column(name = "mon_bleeding", nullable = true, length = 1)
    public String getMonBleeding() {
        return monBleeding;
    }

    public void setMonBleeding(String monBleeding) {
        this.monBleeding = monBleeding;
    }

    @Column(name = "mon_bleeding_charac", nullable = true, length = 2)
    public String getMonBleedingCharac() {
        return monBleedingCharac;
    }

    public void setMonBleedingCharac(String monBleedingCharac) {
        this.monBleedingCharac = monBleedingCharac;
    }

    @Column(name = "mon_uti_told", nullable = true, length = 1)
    public String getMonUtiTold() {
        return monUtiTold;
    }

    public void setMonUtiTold(String monUtiTold) {
        this.monUtiTold = monUtiTold;
    }

    @Column(name = "mon_prenatal_day", nullable = true, length = 2)
    public String getMonPrenatalDay() {
        return monPrenatalDay;
    }

    public void setMonPrenatalDay(String monPrenatalDay) {
        this.monPrenatalDay = monPrenatalDay;
    }

    @Column(name = "mon_prenatal_month", nullable = true, length = 2)
    public String getMonPrenatalMonth() {
        return monPrenatalMonth;
    }

    public void setMonPrenatalMonth(String monPrenatalMonth) {
        this.monPrenatalMonth = monPrenatalMonth;
    }

    @Column(name = "mon_prenatal_year", nullable = true, length = 4)
    public String getMonPrenatalYear() {
        return monPrenatalYear;
    }

    public void setMonPrenatalYear(String monPrenatalYear) {
        this.monPrenatalYear = monPrenatalYear;
    }

    @Column(name = "mon_fever_symptom", nullable = true, length = 1)
    public String getMonFeverSymptom() {
        return monFeverSymptom;
    }

    public void setMonFeverSymptom(String monFeverSymptom) {
        this.monFeverSymptom = monFeverSymptom;
    }

    @Column(name = "mon_rash", nullable = true, length = 1)
    public String getMonRash() {
        return monRash;
    }

    public void setMonRash(String monRash) {
        this.monRash = monRash;
    }

    @Column(name = "mon_itch", nullable = true, length = 1)
    public String getMonItch() {
        return monItch;
    }

    public void setMonItch(String monItch) {
        this.monItch = monItch;
    }

    @Column(name = "mon_rash_first", nullable = true, length = 30)
    public String getMonRashFirst() {
        return monRashFirst;
    }

    public void setMonRashFirst(String monRashFirst) {
        this.monRashFirst = monRashFirst;
    }

    @Column(name = "mon_rash_day", nullable = true, length = 2)
    public String getMonRashDay() {
        return monRashDay;
    }

    public void setMonRashDay(String monRashDay) {
        this.monRashDay = monRashDay;
    }

    @Column(name = "mon_rash_month", nullable = true, length = 2)
    public String getMonRashMonth() {
        return monRashMonth;
    }

    public void setMonRashMonth(String monRashMonth) {
        this.monRashMonth = monRashMonth;
    }

    @Column(name = "mon_rash_year", nullable = true, length = 4)
    public String getMonRashYear() {
        return monRashYear;
    }

    public void setMonRashYear(String monRashYear) {
        this.monRashYear = monRashYear;
    }

    @Column(name = "mon_rash_duration", nullable = true)
    public Integer getMonRashDuration() {
        return monRashDuration;
    }

    public void setMonRashDuration(Integer monRashDuration) {
        this.monRashDuration = monRashDuration;
    }

    @Column(name = "mon_rash_spread", nullable = true, length = 1)
    public String getMonRashSpread() {
        return monRashSpread;
    }

    public void setMonRashSpread(String monRashSpread) {
        this.monRashSpread = monRashSpread;
    }

    @Column(name = "mon_spread_part", nullable = true, length = 30)
    public String getMonSpreadPart() {
        return monSpreadPart;
    }

    public void setMonSpreadPart(String monSpreadPart) {
        this.monSpreadPart = monSpreadPart;
    }

    @Column(name = "mon_fever_experience", nullable = true, length = 1)
    public String getMonFeverExperience() {
        return monFeverExperience;
    }

    public void setMonFeverExperience(String monFeverExperience) {
        this.monFeverExperience = monFeverExperience;
    }

    @Column(name = "mon_temp_measure", nullable = true, length = 1)
    public String getMonTempMeasure() {
        return monTempMeasure;
    }

    public void setMonTempMeasure(String monTempMeasure) {
        this.monTempMeasure = monTempMeasure;
    }

    @Column(name = "mon_high_temp", nullable = true)
    public Float getMonHighTemp() {
        return monHighTemp;
    }

    public void setMonHighTemp(Float monHighTemp) {
        this.monHighTemp = monHighTemp;
    }

    @Column(name = "mon_hightem_unit", nullable = true, length = 1)
    public String getMonHightemUnit() {
        return monHightemUnit;
    }

    public void setMonHightemUnit(String monHightemUnit) {
        this.monHightemUnit = monHightemUnit;
    }

    @Column(name = "mon_tempunknown", nullable = true, length = 1)
    public String getMonTempunknown() {
        return monTempunknown;
    }

    public void setMonTempunknown(String monTempunknown) {
        this.monTempunknown = monTempunknown;
    }

    @Column(name = "mon_fever_day", nullable = true, length = 2)
    public String getMonFeverDay() {
        return monFeverDay;
    }

    public void setMonFeverDay(String monFeverDay) {
        this.monFeverDay = monFeverDay;
    }

    @Column(name = "mon_fever_month", nullable = true, length = 2)
    public String getMonFeverMonth() {
        return monFeverMonth;
    }

    public void setMonFeverMonth(String monFeverMonth) {
        this.monFeverMonth = monFeverMonth;
    }

    @Column(name = "mon_fever_year", nullable = true, length = 4)
    public String getMonFeverYear() {
        return monFeverYear;
    }

    public void setMonFeverYear(String monFeverYear) {
        this.monFeverYear = monFeverYear;
    }

    @Column(name = "mon_fever_duration", nullable = true)
    public Integer getMonFeverDuration() {
        return monFeverDuration;
    }

    public void setMonFeverDuration(Integer monFeverDuration) {
        this.monFeverDuration = monFeverDuration;
    }

    @Column(name = "mon_redeyes", nullable = true, length = 1)
    public String getMonRedeyes() {
        return monRedeyes;
    }

    public void setMonRedeyes(String monRedeyes) {
        this.monRedeyes = monRedeyes;
    }

    @Column(name = "mon_redeyes_day", nullable = true, length = 2)
    public String getMonRedeyesDay() {
        return monRedeyesDay;
    }

    public void setMonRedeyesDay(String monRedeyesDay) {
        this.monRedeyesDay = monRedeyesDay;
    }

    @Column(name = "mon_redeyes_month", nullable = true, length = 2)
    public String getMonRedeyesMonth() {
        return monRedeyesMonth;
    }

    public void setMonRedeyesMonth(String monRedeyesMonth) {
        this.monRedeyesMonth = monRedeyesMonth;
    }

    @Column(name = "mon_redeyes_year", nullable = true, length = 4)
    public String getMonRedeyesYear() {
        return monRedeyesYear;
    }

    public void setMonRedeyesYear(String monRedeyesYear) {
        this.monRedeyesYear = monRedeyesYear;
    }

    @Column(name = "mon_redeyes_duration", nullable = true)
    public Integer getMonRedeyesDuration() {
        return monRedeyesDuration;
    }

    public void setMonRedeyesDuration(Integer monRedeyesDuration) {
        this.monRedeyesDuration = monRedeyesDuration;
    }

    @Column(name = "mon_joint", nullable = true, length = 1)
    public String getMonJoint() {
        return monJoint;
    }

    public void setMonJoint(String monJoint) {
        this.monJoint = monJoint;
    }

    @Column(name = "mon_joint_day", nullable = true, length = 2)
    public String getMonJointDay() {
        return monJointDay;
    }

    public void setMonJointDay(String monJointDay) {
        this.monJointDay = monJointDay;
    }

    @Column(name = "mon_joint_month", nullable = true, length = 2)
    public String getMonJointMonth() {
        return monJointMonth;
    }

    public void setMonJointMonth(String monJointMonth) {
        this.monJointMonth = monJointMonth;
    }

    @Column(name = "mon_joint_year", nullable = true, length = 4)
    public String getMonJointYear() {
        return monJointYear;
    }

    public void setMonJointYear(String monJointYear) {
        this.monJointYear = monJointYear;
    }

    @Column(name = "mon_joint_duration", nullable = true)
    public Integer getMonJointDuration() {
        return monJointDuration;
    }

    public void setMonJointDuration(Integer monJointDuration) {
        this.monJointDuration = monJointDuration;
    }

    @Column(name = "mon_headache", nullable = true, length = 1)
    public String getMonHeadache() {
        return monHeadache;
    }

    public void setMonHeadache(String monHeadache) {
        this.monHeadache = monHeadache;
    }

    @Column(name = "mon_headache_day", nullable = true, length = 2)
    public String getMonHeadacheDay() {
        return monHeadacheDay;
    }

    public void setMonHeadacheDay(String monHeadacheDay) {
        this.monHeadacheDay = monHeadacheDay;
    }

    @Column(name = "mon_headache_month", nullable = true, length = 2)
    public String getMonHeadacheMonth() {
        return monHeadacheMonth;
    }

    public void setMonHeadacheMonth(String monHeadacheMonth) {
        this.monHeadacheMonth = monHeadacheMonth;
    }

    @Column(name = "mon_headache_year", nullable = true, length = 4)
    public String getMonHeadacheYear() {
        return monHeadacheYear;
    }

    public void setMonHeadacheYear(String monHeadacheYear) {
        this.monHeadacheYear = monHeadacheYear;
    }

    @Column(name = "mon_headache_duration", nullable = true)
    public Integer getMonHeadacheDuration() {
        return monHeadacheDuration;
    }

    public void setMonHeadacheDuration(Integer monHeadacheDuration) {
        this.monHeadacheDuration = monHeadacheDuration;
    }

    @Column(name = "mon_symptom_other", nullable = true, length = 1)
    public String getMonSymptomOther() {
        return monSymptomOther;
    }

    public void setMonSymptomOther(String monSymptomOther) {
        this.monSymptomOther = monSymptomOther;
    }

    @Column(name = "mon_specify_symptom", nullable = true, length = 50)
    public String getMonSpecifySymptom() {
        return monSpecifySymptom;
    }

    public void setMonSpecifySymptom(String monSpecifySymptom) {
        this.monSpecifySymptom = monSpecifySymptom;
    }

    @Column(name = "mon_other_symptom", nullable = true)
    public String getMonOtherSymptom() {
        return monOtherSymptom;
    }

    public void setMonOtherSymptom(String monOtherSymptom) {
        this.monOtherSymptom = monOtherSymptom;
    }

    @Column(name = "mon_medicare", nullable = true, length = 1)
    public String getMonMedicare() {
        return monMedicare;
    }

    public void setMonMedicare(String monMedicare) {
        this.monMedicare = monMedicare;
    }

    @Column(name = "mon_care_day", nullable = true, length = 2)
    public String getMonCareDay() {
        return monCareDay;
    }

    public void setMonCareDay(String monCareDay) {
        this.monCareDay = monCareDay;
    }

    @Column(name = "mon_care_month", nullable = true, length = 2)
    public String getMonCareMonth() {
        return monCareMonth;
    }

    public void setMonCareMonth(String monCareMonth) {
        this.monCareMonth = monCareMonth;
    }

    @Column(name = "mon_care_year", nullable = true, length = 4)
    public String getMonCareYear() {
        return monCareYear;
    }

    public void setMonCareYear(String monCareYear) {
        this.monCareYear = monCareYear;
    }

    @Column(name = "mon_care_facility", nullable = true, length = 25)
    public String getMonCareFacility() {
        return monCareFacility;
    }

    public void setMonCareFacility(String monCareFacility) {
        this.monCareFacility = monCareFacility;
    }

    @Column(name = "mon_hospitalized", nullable = true, length = 1)
    public String getMonHospitalized() {
        return monHospitalized;
    }

    public void setMonHospitalized(String monHospitalized) {
        this.monHospitalized = monHospitalized;
    }

    @Column(name = "mon_hospital", nullable = true, length = 25)
    public String getMonHospital() {
        return monHospital;
    }

    public void setMonHospital(String monHospital) {
        this.monHospital = monHospital;
    }

    @Column(name = "mon_diag_rubella", nullable = true, length = 1)
    public String getMonDiagRubella() {
        return monDiagRubella;
    }

    public void setMonDiagRubella(String monDiagRubella) {
        this.monDiagRubella = monDiagRubella;
    }

    @Column(name = "mon_diag_dengue", nullable = true, length = 1)
    public String getMonDiagDengue() {
        return monDiagDengue;
    }

    public void setMonDiagDengue(String monDiagDengue) {
        this.monDiagDengue = monDiagDengue;
    }

    @Column(name = "mon_diag_chikung", nullable = true, length = 1)
    public String getMonDiagChikung() {
        return monDiagChikung;
    }

    public void setMonDiagChikung(String monDiagChikung) {
        this.monDiagChikung = monDiagChikung;
    }

    @Column(name = "mon_diag_zika", nullable = true, length = 1)
    public String getMonDiagZika() {
        return monDiagZika;
    }

    public void setMonDiagZika(String monDiagZika) {
        this.monDiagZika = monDiagZika;
    }

    @Column(name = "mon_diag_cytome", nullable = true, length = 1)
    public String getMonDiagCytome() {
        return monDiagCytome;
    }

    public void setMonDiagCytome(String monDiagCytome) {
        this.monDiagCytome = monDiagCytome;
    }

    @Column(name = "mon_medicine", nullable = true, length = 1)
    public String getMonMedicine() {
        return monMedicine;
    }

    public void setMonMedicine(String monMedicine) {
        this.monMedicine = monMedicine;
    }

    @Column(name = "mon_medcine_name", nullable = true)
    public String getMonMedcineName() {
        return monMedcineName;
    }

    public void setMonMedcineName(String monMedcineName) {
        this.monMedcineName = monMedcineName;
    }

    @Column(name = "mon_symptom_diary", nullable = true, length = 1)
    public String getMonSymptomDiary() {
        return monSymptomDiary;
    }

    public void setMonSymptomDiary(String monSymptomDiary) {
        this.monSymptomDiary = monSymptomDiary;
    }

    @Column(name = "mon_guillainbarre", nullable = true, length = 1)
    public String getMonGuillainbarre() {
        return monGuillainbarre;
    }

    public void setMonGuillainbarre(String monGuillainbarre) {
        this.monGuillainbarre = monGuillainbarre;
    }

    @Column(name = "mon_tingling", nullable = true, length = 1)
    public String getMonTingling() {
        return monTingling;
    }

    public void setMonTingling(String monTingling) {
        this.monTingling = monTingling;
    }

    @Column(name = "mon_tingling_arm", nullable = true, length = 5)
    public String getMonTinglingArm() {
        return monTinglingArm;
    }

    public void setMonTinglingArm(String monTinglingArm) {
        this.monTinglingArm = monTinglingArm;
    }

    @Column(name = "mon_tingling_leg", nullable = true, length = 5)
    public String getMonTinglingLeg() {
        return monTinglingLeg;
    }

    public void setMonTinglingLeg(String monTinglingLeg) {
        this.monTinglingLeg = monTinglingLeg;
    }

    @Column(name = "mon_tingling_hand", nullable = true, length = 5)
    public String getMonTinglingHand() {
        return monTinglingHand;
    }

    public void setMonTinglingHand(String monTinglingHand) {
        this.monTinglingHand = monTinglingHand;
    }

    @Column(name = "mon_tingling_foot", nullable = true, length = 5)
    public String getMonTinglingFoot() {
        return monTinglingFoot;
    }

    public void setMonTinglingFoot(String monTinglingFoot) {
        this.monTinglingFoot = monTinglingFoot;
    }

    @Column(name = "mon_tingling_face", nullable = true, length = 5)
    public String getMonTinglingFace() {
        return monTinglingFace;
    }

    public void setMonTinglingFace(String monTinglingFace) {
        this.monTinglingFace = monTinglingFace;
    }

    @Column(name = "mon_tingling_other", nullable = true)
    public String getMonTinglingOther() {
        return monTinglingOther;
    }

    public void setMonTinglingOther(String monTinglingOther) {
        this.monTinglingOther = monTinglingOther;
    }

    @Column(name = "mon_sensation_min", nullable = true, length = 2)
    public String getMonSensationMin() {
        return monSensationMin;
    }

    public void setMonSensationMin(String monSensationMin) {
        this.monSensationMin = monSensationMin;
    }

    @Column(name = "mon_sensation_hr", nullable = true, length = 2)
    public String getMonSensationHr() {
        return monSensationHr;
    }

    public void setMonSensationHr(String monSensationHr) {
        this.monSensationHr = monSensationHr;
    }

    @Column(name = "mon_senstaion_day", nullable = true, length = 2)
    public String getMonSenstaionDay() {
        return monSenstaionDay;
    }

    public void setMonSenstaionDay(String monSenstaionDay) {
        this.monSenstaionDay = monSenstaionDay;
    }

    @Column(name = "mon_injury", nullable = true, length = 1)
    public String getMonInjury() {
        return monInjury;
    }

    public void setMonInjury(String monInjury) {
        this.monInjury = monInjury;
    }

    @Column(name = "mon_tingling_day", nullable = true, length = 2)
    public String getMonTinglingDay() {
        return monTinglingDay;
    }

    public void setMonTinglingDay(String monTinglingDay) {
        this.monTinglingDay = monTinglingDay;
    }

    @Column(name = "mon_tingling_month", nullable = true, length = 2)
    public String getMonTinglingMonth() {
        return monTinglingMonth;
    }

    public void setMonTinglingMonth(String monTinglingMonth) {
        this.monTinglingMonth = monTinglingMonth;
    }

    @Column(name = "mon_tingling_year", nullable = true, length = 4)
    public String getMonTinglingYear() {
        return monTinglingYear;
    }

    public void setMonTinglingYear(String monTinglingYear) {
        this.monTinglingYear = monTinglingYear;
    }

    @Column(name = "mon_tingling_duration", nullable = true)
    public Integer getMonTinglingDuration() {
        return monTinglingDuration;
    }

    public void setMonTinglingDuration(Integer monTinglingDuration) {
        this.monTinglingDuration = monTinglingDuration;
    }

    @Column(name = "mon_numbness", nullable = true, length = 1)
    public String getMonNumbness() {
        return monNumbness;
    }

    public void setMonNumbness(String monNumbness) {
        this.monNumbness = monNumbness;
    }

    @Column(name = "mon_numb_arm", nullable = true, length = 5)
    public String getMonNumbArm() {
        return monNumbArm;
    }

    public void setMonNumbArm(String monNumbArm) {
        this.monNumbArm = monNumbArm;
    }

    @Column(name = "mon_numb_leg", nullable = true, length = 5)
    public String getMonNumbLeg() {
        return monNumbLeg;
    }

    public void setMonNumbLeg(String monNumbLeg) {
        this.monNumbLeg = monNumbLeg;
    }

    @Column(name = "mon_numb_hand", nullable = true, length = 5)
    public String getMonNumbHand() {
        return monNumbHand;
    }

    public void setMonNumbHand(String monNumbHand) {
        this.monNumbHand = monNumbHand;
    }

    @Column(name = "mon_numb_foot", nullable = true, length = 5)
    public String getMonNumbFoot() {
        return monNumbFoot;
    }

    public void setMonNumbFoot(String monNumbFoot) {
        this.monNumbFoot = monNumbFoot;
    }

    @Column(name = "mon_numb_face", nullable = true, length = 5)
    public String getMonNumbFace() {
        return monNumbFace;
    }

    public void setMonNumbFace(String monNumbFace) {
        this.monNumbFace = monNumbFace;
    }

    @Column(name = "mon_numb_other", nullable = true)
    public String getMonNumbOther() {
        return monNumbOther;
    }

    public void setMonNumbOther(String monNumbOther) {
        this.monNumbOther = monNumbOther;
    }

    @Column(name = "mon_numb_day", nullable = true, length = 2)
    public String getMonNumbDay() {
        return monNumbDay;
    }

    public void setMonNumbDay(String monNumbDay) {
        this.monNumbDay = monNumbDay;
    }

    @Column(name = "mon_numb_month", nullable = true, length = 2)
    public String getMonNumbMonth() {
        return monNumbMonth;
    }

    public void setMonNumbMonth(String monNumbMonth) {
        this.monNumbMonth = monNumbMonth;
    }

    @Column(name = "mon_numb_year", nullable = true, length = 4)
    public String getMonNumbYear() {
        return monNumbYear;
    }

    public void setMonNumbYear(String monNumbYear) {
        this.monNumbYear = monNumbYear;
    }

    @Column(name = "mon_numb_duration", nullable = true)
    public Integer getMonNumbDuration() {
        return monNumbDuration;
    }

    public void setMonNumbDuration(Integer monNumbDuration) {
        this.monNumbDuration = monNumbDuration;
    }

    @Column(name = "mon_paralysis", nullable = true, length = 1)
    public String getMonParalysis() {
        return monParalysis;
    }

    public void setMonParalysis(String monParalysis) {
        this.monParalysis = monParalysis;
    }

    @Column(name = "mon_para_arm", nullable = true, length = 5)
    public String getMonParaArm() {
        return monParaArm;
    }

    public void setMonParaArm(String monParaArm) {
        this.monParaArm = monParaArm;
    }

    @Column(name = "mon_para_leg", nullable = true, length = 5)
    public String getMonParaLeg() {
        return monParaLeg;
    }

    public void setMonParaLeg(String monParaLeg) {
        this.monParaLeg = monParaLeg;
    }

    @Column(name = "mon_para_hand", nullable = true, length = 5)
    public String getMonParaHand() {
        return monParaHand;
    }

    public void setMonParaHand(String monParaHand) {
        this.monParaHand = monParaHand;
    }

    @Column(name = "mon_para_foot", nullable = true, length = 5)
    public String getMonParaFoot() {
        return monParaFoot;
    }

    public void setMonParaFoot(String monParaFoot) {
        this.monParaFoot = monParaFoot;
    }

    @Column(name = "mon_para_face", nullable = true, length = 5)
    public String getMonParaFace() {
        return monParaFace;
    }

    public void setMonParaFace(String monParaFace) {
        this.monParaFace = monParaFace;
    }

    @Column(name = "mon_para_other", nullable = true)
    public String getMonParaOther() {
        return monParaOther;
    }

    public void setMonParaOther(String monParaOther) {
        this.monParaOther = monParaOther;
    }

    @Column(name = "mon_para_day", nullable = true, length = 2)
    public String getMonParaDay() {
        return monParaDay;
    }

    public void setMonParaDay(String monParaDay) {
        this.monParaDay = monParaDay;
    }

    @Column(name = "mon_para_month", nullable = true, length = 2)
    public String getMonParaMonth() {
        return monParaMonth;
    }

    public void setMonParaMonth(String monParaMonth) {
        this.monParaMonth = monParaMonth;
    }

    @Column(name = "mon_para_year", nullable = true, length = 4)
    public String getMonParaYear() {
        return monParaYear;
    }

    public void setMonParaYear(String monParaYear) {
        this.monParaYear = monParaYear;
    }

    @Column(name = "mon_para_duration", nullable = true)
    public Integer getMonParaDuration() {
        return monParaDuration;
    }

    public void setMonParaDuration(Integer monParaDuration) {
        this.monParaDuration = monParaDuration;
    }

    @Column(name = "mon_results_provided", nullable = true, length = 1)
    public String getMonResultsProvided() {
        return monResultsProvided;
    }

    public void setMonResultsProvided(String monResultsProvided) {
        this.monResultsProvided = monResultsProvided;
    }

    @Column(name = "mon_counseling", nullable = true, length = 1)
    public String getMonCounseling() {
        return monCounseling;
    }

    public void setMonCounseling(String monCounseling) {
        this.monCounseling = monCounseling;
    }

    @Column(name = "mon_results_other", nullable = true, length = 1)
    public String getMonResultsOther() {
        return monResultsOther;
    }

    public void setMonResultsOther(String monResultsOther) {
        this.monResultsOther = monResultsOther;
    }

    @Column(name = "mon_oneweek_date", nullable = true)
    public Date getMonOneweekDate() {
        return monOneweekDate;
    }

    public void setMonOneweekDate(Date monOneweekDate) {
        this.monOneweekDate = monOneweekDate;
    }

    @Column(name = "mon_oneweek_time", nullable = true, length = 25)
    public String getMonOneweekTime() {
        return monOneweekTime;
    }

    public void setMonOneweekTime(String monOneweekTime) {
        this.monOneweekTime = monOneweekTime;
    }

    @Column(name = "mon_provide_sym", nullable = true, length = 1)
    public String getMonProvideSym() {
        return monProvideSym;
    }

    public void setMonProvideSym(String monProvideSym) {
        this.monProvideSym = monProvideSym;
    }

    @Column(name = "mon_reminder_preg", nullable = true, length = 1)
    public String getMonReminderPreg() {
        return monReminderPreg;
    }

    public void setMonReminderPreg(String monReminderPreg) {
        this.monReminderPreg = monReminderPreg;
    }

    @Column(name = "mon_reminder_provided", nullable = true, length = 1)
    public String getMonReminderProvided() {
        return monReminderProvided;
    }

    public void setMonReminderProvided(String monReminderProvided) {
        this.monReminderProvided = monReminderProvided;
    }

    @Column(name = "mon_next_date", nullable = true)
    public Date getMonNextDate() {
        return monNextDate;
    }

    public void setMonNextDate(Date monNextDate) {
        this.monNextDate = monNextDate;
    }

    @Column(name = "mon_next_time", nullable = true, length = 25)
    public String getMonNextTime() {
        return monNextTime;
    }

    public void setMonNextTime(String monNextTime) {
        this.monNextTime = monNextTime;
    }

    @Column(name = "mon_id_completing", nullable = true, length = 50)
    public String getMonIdCompleting() {
        return monIdCompleting;
    }

    public void setMonIdCompleting(String monIdCompleting) {
        this.monIdCompleting = monIdCompleting;
    }

    @Column(name = "mon_date_completed", nullable = true)
    public Date getMonDateCompleted() {
        return monDateCompleted;
    }

    public void setMonDateCompleted(Date monDateCompleted) {
        this.monDateCompleted = monDateCompleted;
    }

    @Column(name = "mon_id_reviewer", nullable = true, length = 50)
    public String getMonIdReviewer() {
        return monIdReviewer;
    }

    public void setMonIdReviewer(String monIdReviewer) {
        this.monIdReviewer = monIdReviewer;
    }

    @Column(name = "mon_date_reviewed", nullable = true)
    public Date getMonDateReviewed() {
        return monDateReviewed;
    }

    public void setMonDateReviewed(Date monDateReviewed) {
        this.monDateReviewed = monDateReviewed;
    }

    @Column(name = "mon_id_data_entry", nullable = true, length = 50)
    public String getMonIdDataEntry() {
        return monIdDataEntry;
    }

    public void setMonIdDataEntry(String monIdDataEntry) {
        this.monIdDataEntry = monIdDataEntry;
    }

    @Column(name = "mon_date_entered", nullable = true)
    public Date getMonDateEntered() {
        return monDateEntered;
    }

    public void setMonDateEntered(Date monDateEntered) {
        this.monDateEntered = monDateEntered;
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
        if (!(o instanceof Zp03MonthlyVisit)) return false;

        Zp03MonthlyVisit that = (Zp03MonthlyVisit) o;

        return (recordId.equals(that.recordId));
    }
}
