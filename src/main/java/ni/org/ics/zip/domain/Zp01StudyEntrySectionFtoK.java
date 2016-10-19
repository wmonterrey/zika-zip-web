package ni.org.ics.zip.domain;

/**
 * Created by FIRSTICT on 10/7/2016.
 * V1.0
 */

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "zp01_study_entry_section_f_to_k", catalog = "zika_zip")
public class Zp01StudyEntrySectionFtoK extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String seaPreg;
    private String seaFirstPreg;
    private String seaAnemia;
    private String seaVaginal;
    private String seaUtiPrior;
    private String seaSexually;
    private String seaPreterm;
    private String seaPreeclampsia;
    private String seaEclampsia;
    private String seaHeart;
    private String seaNeuropathy;
    private String seaGestational;
    private Integer seaTotalPreg;
    private Date seaDeliveryDate1;
    private Integer seaGage1;
    private String seaOutcome1;
    private String seaBdefects1;
    private Date seaDeliveryDate2;
    private Integer seaGage2;
    private String seaOutcome2;
    private String seaBdefects2;
    private Date seaDeliveryDate3;
    private Integer seaGage3;
    private String seaOutcome3;
    private String seaBdefects3;
    private Date seaDeliveryDate4;
    private Integer seaGage4;
    private String seaOutcome4;
    private String seaBdefects4;
    private Date seaDeliveryDate5;
    private Integer seaGage5;
    private String seaOutcome5;
    private String seaBdefects5;
    private Date seaDeliveryDate6;
    private Integer seaGage6;
    private String seaOutcome6;
    private String seaBdefects6;
    private String seaPersisHeadache;
    private String seaDizziness;
    private String seaNausea;
    private String seaVomiting;
    private String seaSeeingLights;
    private String seaSpecifyType;
    private String seaSwelling;
    private String seaFetalMov;
    private String seaMovUsual;
    private String seaMovDecreased;
    private String seaContraction;
    private Integer seaFreqWeek;
    private Integer seaFreqDay;
    private Integer seaFreqHour;
    private Integer seaFreqMin;
    private String seaVagiDischarge;
    private String seaCharacterDisch;//multiple
    private String seaBleeding;
    private String seaYesBleeding;
    private String seaUti;
    private String seaPrenatalCare;
    private String seaMutiv;
    private String seaIron;
    private String seaOften;
    private String seaProvideSym;
    private String seaReminderPreg;
    private String seaReminderProvided;
    private Date seaOneweekDate;
    private Date seaOneweekTime;
    private Date seaNextDate;
    private Date seaNextTime;
    private String seaIdCompleting;
    private Date seaDateCompleted;
    private String seaIdReviewer;
    private Date seaDateReviewed;
    private String seaIdDataEntry;
    private Date seaDateEntered;


    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "sea_preg", nullable = true, length = 1)
    public String getSeaPreg() {
        return seaPreg;
    }

    public void setSeaPreg(String seaPreg) {
        this.seaPreg = seaPreg;
    }

    @Column(name = "sea_first_preg", nullable = true, length = 1)
    public String getSeaFirstPreg() {
        return seaFirstPreg;
    }

    public void setSeaFirstPreg(String seaFirstPreg) {
        this.seaFirstPreg = seaFirstPreg;
    }

    @Column(name = "sea_anemia", nullable = true, length = 1)
    public String getSeaAnemia() {
        return seaAnemia;
    }

    public void setSeaAnemia(String seaAnemia) {
        this.seaAnemia = seaAnemia;
    }

    @Column(name = "sea_vaginal", nullable = true, length = 1)
    public String getSeaVaginal() {
        return seaVaginal;
    }

    public void setSeaVaginal(String seaVaginal) {
        this.seaVaginal = seaVaginal;
    }

    @Column(name = "sea_uti_prior", nullable = true, length = 1)
    public String getSeaUtiPrior() {
        return seaUtiPrior;
    }

    public void setSeaUtiPrior(String seaUtiPrior) {
        this.seaUtiPrior = seaUtiPrior;
    }

    @Column(name = "sea_sexually", nullable = true, length = 1)
    public String getSeaSexually() {
        return seaSexually;
    }

    public void setSeaSexually(String seaSexually) {
        this.seaSexually = seaSexually;
    }

    @Column(name = "sea_preterm", nullable = true, length = 1)
    public String getSeaPreterm() {
        return seaPreterm;
    }

    public void setSeaPreterm(String seaPreterm) {
        this.seaPreterm = seaPreterm;
    }

    @Column(name = "sea_preeclampsia", nullable = true, length = 1)
    public String getSeaPreeclampsia() {
        return seaPreeclampsia;
    }

    public void setSeaPreeclampsia(String seaPreeclampsia) {
        this.seaPreeclampsia = seaPreeclampsia;
    }

    @Column(name = "sea_eclampsia", nullable = true, length = 1)
    public String getSeaEclampsia() {
        return seaEclampsia;
    }

    public void setSeaEclampsia(String seaEclampsia) {
        this.seaEclampsia = seaEclampsia;
    }

    @Column(name = "sea_heart", nullable = true, length = 1)
    public String getSeaHeart() {
        return seaHeart;
    }

    public void setSeaHeart(String seaHeart) {
        this.seaHeart = seaHeart;
    }

    @Column(name = "sea_neuropathy", nullable = true, length = 1)
    public String getSeaNeuropathy() {
        return seaNeuropathy;
    }

    public void setSeaNeuropathy(String seaNeuropathy) {
        this.seaNeuropathy = seaNeuropathy;
    }

    @Column(name = "sea_gestational", nullable = true, length = 1)
    public String getSeaGestational() {
        return seaGestational;
    }

    public void setSeaGestational(String seaGestational) {
        this.seaGestational = seaGestational;
    }

    @Column(name = "sea_total_preg", nullable = true)
    public Integer getSeaTotalPreg() {
        return seaTotalPreg;
    }

    public void setSeaTotalPreg(Integer seaTotalPreg) {
        this.seaTotalPreg = seaTotalPreg;
    }

    @Column(name = "sea_delivery_date1", nullable = true)
    public Date getSeaDeliveryDate1() {
        return seaDeliveryDate1;
    }

    public void setSeaDeliveryDate1(Date seaDeliveryDate1) {
        this.seaDeliveryDate1 = seaDeliveryDate1;
    }

    @Column(name = "sea_gage1", nullable = true)
    public Integer getSeaGage1() {
        return seaGage1;
    }

    public void setSeaGage1(Integer seaGage1) {
        this.seaGage1 = seaGage1;
    }

    @Column(name = "sea_outcome1", nullable = true, length = 1)
    public String getSeaOutcome1() {
        return seaOutcome1;
    }

    public void setSeaOutcome1(String seaOutcome1) {
        this.seaOutcome1 = seaOutcome1;
    }

    @Column(name = "sea_bdefects1", nullable = true, length = 1)
    public String getSeaBdefects1() {
        return seaBdefects1;
    }

    public void setSeaBdefects1(String seaBdefects1) {
        this.seaBdefects1 = seaBdefects1;
    }

    @Column(name = "sea_delivery_date2", nullable = true)
    public Date getSeaDeliveryDate2() {
        return seaDeliveryDate2;
    }

    public void setSeaDeliveryDate2(Date seaDeliveryDate2) {
        this.seaDeliveryDate2 = seaDeliveryDate2;
    }

    @Column(name = "sea_gage2", nullable = true)
    public Integer getSeaGage2() {
        return seaGage2;
    }

    public void setSeaGage2(Integer seaGage2) {
        this.seaGage2 = seaGage2;
    }

    @Column(name = "sea_outcome2", nullable = true, length = 1)
    public String getSeaOutcome2() {
        return seaOutcome2;
    }

    public void setSeaOutcome2(String seaOutcome2) {
        this.seaOutcome2 = seaOutcome2;
    }

    @Column(name = "sea_bdefects2", nullable = true, length = 1)
    public String getSeaBdefects2() {
        return seaBdefects2;
    }

    public void setSeaBdefects2(String seaBdefects2) {
        this.seaBdefects2 = seaBdefects2;
    }

    @Column(name = "sea_delivery_date3", nullable = true)
    public Date getSeaDeliveryDate3() {
        return seaDeliveryDate3;
    }

    public void setSeaDeliveryDate3(Date seaDeliveryDate3) {
        this.seaDeliveryDate3 = seaDeliveryDate3;
    }

    @Column(name = "sea_gage3", nullable = true)
    public Integer getSeaGage3() {
        return seaGage3;
    }

    public void setSeaGage3(Integer seaGage3) {
        this.seaGage3 = seaGage3;
    }

    @Column(name = "sea_outcome3", nullable = true, length = 1)
    public String getSeaOutcome3() {
        return seaOutcome3;
    }

    public void setSeaOutcome3(String seaOutcome3) {
        this.seaOutcome3 = seaOutcome3;
    }

    @Column(name = "sea_bdefects3", nullable = true, length = 1)
    public String getSeaBdefects3() {
        return seaBdefects3;
    }

    public void setSeaBdefects3(String seaBdefects3) {
        this.seaBdefects3 = seaBdefects3;
    }

    @Column(name = "sea_delivery_date4", nullable = true)
    public Date getSeaDeliveryDate4() {
        return seaDeliveryDate4;
    }

    public void setSeaDeliveryDate4(Date seaDeliveryDate4) {
        this.seaDeliveryDate4 = seaDeliveryDate4;
    }

    @Column(name = "sea_gage4", nullable = true)
    public Integer getSeaGage4() {
        return seaGage4;
    }

    public void setSeaGage4(Integer seaGage4) {
        this.seaGage4 = seaGage4;
    }

    @Column(name = "sea_outcome4", nullable = true, length = 1)
    public String getSeaOutcome4() {
        return seaOutcome4;
    }

    public void setSeaOutcome4(String seaOutcome4) {
        this.seaOutcome4 = seaOutcome4;
    }

    @Column(name = "sea_bdefects4", nullable = true, length = 1)
    public String getSeaBdefects4() {
        return seaBdefects4;
    }

    public void setSeaBdefects4(String seaBdefects4) {
        this.seaBdefects4 = seaBdefects4;
    }

    @Column(name = "sea_delivery_date5", nullable = true)
    public Date getSeaDeliveryDate5() {
        return seaDeliveryDate5;
    }

    public void setSeaDeliveryDate5(Date seaDeliveryDate5) {
        this.seaDeliveryDate5 = seaDeliveryDate5;
    }

    @Column(name = "sea_gage5", nullable = true)
    public Integer getSeaGage5() {
        return seaGage5;
    }

    public void setSeaGage5(Integer seaGage5) {
        this.seaGage5 = seaGage5;
    }

    @Column(name = "sea_outcome5", nullable = true, length = 1)
    public String getSeaOutcome5() {
        return seaOutcome5;
    }

    public void setSeaOutcome5(String seaOutcome5) {
        this.seaOutcome5 = seaOutcome5;
    }

    @Column(name = "sea_bdefects5", nullable = true, length = 1)
    public String getSeaBdefects5() {
        return seaBdefects5;
    }

    public void setSeaBdefects5(String seaBdefects5) {
        this.seaBdefects5 = seaBdefects5;
    }

    @Column(name = "sea_delivery_date6", nullable = true)
    public Date getSeaDeliveryDate6() {
        return seaDeliveryDate6;
    }

    public void setSeaDeliveryDate6(Date seaDeliveryDate6) {
        this.seaDeliveryDate6 = seaDeliveryDate6;
    }

    @Column(name = "sea_gage6", nullable = true)
    public Integer getSeaGage6() {
        return seaGage6;
    }

    public void setSeaGage6(Integer seaGage6) {
        this.seaGage6 = seaGage6;
    }

    @Column(name = "sea_outcome6", nullable = true, length = 1)
    public String getSeaOutcome6() {
        return seaOutcome6;
    }

    public void setSeaOutcome6(String seaOutcome6) {
        this.seaOutcome6 = seaOutcome6;
    }

    @Column(name = "sea_bdefects6", nullable = true, length = 1)
    public String getSeaBdefects6() {
        return seaBdefects6;
    }

    public void setSeaBdefects6(String seaBdefects6) {
        this.seaBdefects6 = seaBdefects6;
    }

    @Column(name = "sea_persis_headache", nullable = true, length = 1)
    public String getSeaPersisHeadache() {
        return seaPersisHeadache;
    }

    public void setSeaPersisHeadache(String seaPersisHeadache) {
        this.seaPersisHeadache = seaPersisHeadache;
    }

    @Column(name = "sea_dizziness", nullable = true, length = 1)
    public String getSeaDizziness() {
        return seaDizziness;
    }

    public void setSeaDizziness(String seaDizziness) {
        this.seaDizziness = seaDizziness;
    }

    @Column(name = "sea_nausea", nullable = true, length = 1)
    public String getSeaNausea() {
        return seaNausea;
    }

    public void setSeaNausea(String seaNausea) {
        this.seaNausea = seaNausea;
    }

    @Column(name = "sea_vomiting", nullable = true, length = 1)
    public String getSeaVomiting() {
        return seaVomiting;
    }

    public void setSeaVomiting(String seaVomiting) {
        this.seaVomiting = seaVomiting;
    }

    @Column(name = "sea_seeing_lights", nullable = true, length = 1)
    public String getSeaSeeingLights() {
        return seaSeeingLights;
    }

    public void setSeaSeeingLights(String seaSeeingLights) {
        this.seaSeeingLights = seaSeeingLights;
    }

    @Column(name = "sea_specify_type", nullable = true, length = 1)
    public String getSeaSpecifyType() {
        return seaSpecifyType;
    }

    public void setSeaSpecifyType(String seaSpecifyType) {
        this.seaSpecifyType = seaSpecifyType;
    }

    @Column(name = "sea_swelling", nullable = true, length = 1)
    public String getSeaSwelling() {
        return seaSwelling;
    }

    public void setSeaSwelling(String seaSwelling) {
        this.seaSwelling = seaSwelling;
    }

    @Column(name = "sea_fetal_mov", nullable = true, length = 1)
    public String getSeaFetalMov() {
        return seaFetalMov;
    }

    public void setSeaFetalMov(String seaFetalMov) {
        this.seaFetalMov = seaFetalMov;
    }

    @Column(name = "sea_mov_usual", nullable = true, length = 1)
    public String getSeaMovUsual() {
        return seaMovUsual;
    }

    public void setSeaMovUsual(String seaMovUsual) {
        this.seaMovUsual = seaMovUsual;
    }

    @Column(name = "sea_mov_decreased", nullable = true, length = 1)
    public String getSeaMovDecreased() {
        return seaMovDecreased;
    }

    public void setSeaMovDecreased(String seaMovDecreased) {
        this.seaMovDecreased = seaMovDecreased;
    }

    @Column(name = "sea_contraction", nullable = true, length = 1)
    public String getSeaContraction() {
        return seaContraction;
    }

    public void setSeaContraction(String seaContraction) {
        this.seaContraction = seaContraction;
    }

    @Column(name = "sea_freq_week", nullable = true)
    public Integer getSeaFreqWeek() {
        return seaFreqWeek;
    }

    public void setSeaFreqWeek(Integer seaFreqWeek) {
        this.seaFreqWeek = seaFreqWeek;
    }

    @Column(name = "sea_freq_day", nullable = true)
    public Integer getSeaFreqDay() {
        return seaFreqDay;
    }

    public void setSeaFreqDay(Integer seaFreqDay) {
        this.seaFreqDay = seaFreqDay;
    }

    @Column(name = "sea_freq_hour", nullable = true)
    public Integer getSeaFreqHour() {
        return seaFreqHour;
    }

    public void setSeaFreqHour(Integer seaFreqHour) {
        this.seaFreqHour = seaFreqHour;
    }

    @Column(name = "sea_freq_min", nullable = true)
    public Integer getSeaFreqMin() {
        return seaFreqMin;
    }

    public void setSeaFreqMin(Integer seaFreqMin) {
        this.seaFreqMin = seaFreqMin;
    }

    @Column(name = "sea_vagi_discharge", nullable = true, length = 1)
    public String getSeaVagiDischarge() {
        return seaVagiDischarge;
    }

    public void setSeaVagiDischarge(String seaVagiDischarge) {
        this.seaVagiDischarge = seaVagiDischarge;
    }

    @Column(name = "sea_character_disch", nullable = true, length = 20)
    public String getSeaCharacterDisch() {
        return seaCharacterDisch;
    }

    public void setSeaCharacterDisch(String seaCharacterDisch) {
        this.seaCharacterDisch = seaCharacterDisch;
    }

    @Column(name = "sea_bleeding", nullable = true, length = 1)
    public String getSeaBleeding() {
        return seaBleeding;
    }

    public void setSeaBleeding(String seaBleeding) {
        this.seaBleeding = seaBleeding;
    }

    @Column(name = "sea_yes_bleeding", nullable = true, length = 1)
    public String getSeaYesBleeding() {
        return seaYesBleeding;
    }

    public void setSeaYesBleeding(String seaYesBleeding) {
        this.seaYesBleeding = seaYesBleeding;
    }

    @Column(name = "sea_uti", nullable = true, length = 1)
    public String getSeaUti() {
        return seaUti;
    }

    public void setSeaUti(String seaUti) {
        this.seaUti = seaUti;
    }

    @Column(name = "sea_prenatal_care", nullable = true, length = 1)
    public String getSeaPrenatalCare() {
        return seaPrenatalCare;
    }

    public void setSeaPrenatalCare(String seaPrenatalCare) {
        this.seaPrenatalCare = seaPrenatalCare;
    }

    @Column(name = "sea_mutiv", nullable = true, length = 1)
    public String getSeaMutiv() {
        return seaMutiv;
    }

    public void setSeaMutiv(String seaMutiv) {
        this.seaMutiv = seaMutiv;
    }

    @Column(name = "sea_iron", nullable = true, length = 1)
    public String getSeaIron() {
        return seaIron;
    }

    public void setSeaIron(String seaIron) {
        this.seaIron = seaIron;
    }

    @Column(name = "sea_often", nullable = true, length = 1)
    public String getSeaOften() {
        return seaOften;
    }

    public void setSeaOften(String seaOften) {
        this.seaOften = seaOften;
    }

    @Column(name = "sea_provide_sym", nullable = true, length = 1)
    public String getSeaProvideSym() {
        return seaProvideSym;
    }

    public void setSeaProvideSym(String seaProvideSym) {
        this.seaProvideSym = seaProvideSym;
    }

    @Column(name = "sea_reminder_preg", nullable = true, length = 1)
    public String getSeaReminderPreg() {
        return seaReminderPreg;
    }

    public void setSeaReminderPreg(String seaReminderPreg) {
        this.seaReminderPreg = seaReminderPreg;
    }

    @Column(name = "sea_reminder_provided", nullable = true, length = 1)
    public String getSeaReminderProvided() {
        return seaReminderProvided;
    }

    public void setSeaReminderProvided(String seaReminderProvided) {
        this.seaReminderProvided = seaReminderProvided;
    }

    @Column(name = "sea_oneweek_date", nullable = true)
    public Date getSeaOneweekDate() {
        return seaOneweekDate;
    }

    public void setSeaOneweekDate(Date seaOneweekDate) {
        this.seaOneweekDate = seaOneweekDate;
    }

    @Column(name = "sea_oneweek_time", nullable = true)
    public Date getSeaOneweekTime() {
        return seaOneweekTime;
    }

    public void setSeaOneweekTime(Date seaOneweekTime) {
        this.seaOneweekTime = seaOneweekTime;
    }

    @Column(name = "sea_next_date", nullable = true)
    public Date getSeaNextDate() {
        return seaNextDate;
    }

    public void setSeaNextDate(Date seaNextDate) {
        this.seaNextDate = seaNextDate;
    }

    @Column(name = "sea_next_time", nullable = true)
    public Date getSeaNextTime() {
        return seaNextTime;
    }

    public void setSeaNextTime(Date seaNextTime) {
        this.seaNextTime = seaNextTime;
    }

    @Column(name = "sea_id_completing", nullable = true, length = 1)
    public String getSeaIdCompleting() {
        return seaIdCompleting;
    }

    public void setSeaIdCompleting(String seaIdCompleting) {
        this.seaIdCompleting = seaIdCompleting;
    }

    @Column(name = "sea_date_completed", nullable = true)
    public Date getSeaDateCompleted() {
        return seaDateCompleted;
    }

    public void setSeaDateCompleted(Date seaDateCompleted) {
        this.seaDateCompleted = seaDateCompleted;
    }

    @Column(name = "sea_id_reviewer", nullable = true, length = 1)
    public String getSeaIdReviewer() {
        return seaIdReviewer;
    }

    public void setSeaIdReviewer(String seaIdReviewer) {
        this.seaIdReviewer = seaIdReviewer;
    }

    @Column(name = "sea_date_reviewed", nullable = true)
    public Date getSeaDateReviewed() {
        return seaDateReviewed;
    }

    public void setSeaDateReviewed(Date seaDateReviewed) {
        this.seaDateReviewed = seaDateReviewed;
    }

    @Column(name = "sea_id_data_entry", nullable = true, length = 1)
    public String getSeaIdDataEntry() {
        return seaIdDataEntry;
    }

    public void setSeaIdDataEntry(String seaIdDataEntry) {
        this.seaIdDataEntry = seaIdDataEntry;
    }

    @Column(name = "sea_date_entered", nullable = true)
    public Date getSeaDateEntered() {
        return seaDateEntered;
    }

    public void setSeaDateEntered(Date seaDateEntered) {
        this.seaDateEntered = seaDateEntered;
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
        if (!(o instanceof Zp01StudyEntrySectionFtoK)) return false;

        Zp01StudyEntrySectionFtoK that = (Zp01StudyEntrySectionFtoK) o;

        return (recordId.equals(that.recordId));
    }
}
