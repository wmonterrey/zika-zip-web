package ni.org.ics.zip.domain;

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
@Table(name = "zp05_ultrasound_exam", catalog = "zika_zip")
public class Zp05UltrasoundExam {

    private String recordId;
    private Date ultDate;
    private Integer ultGaWeeks;
    private Integer ultGaDays;
    private String ultGeDetermined;
    private String ultReason;
    private String ultReasonOther;
    private String ultTime;
    private String ultNameFacility;
    private String ultFacilityid;
    private String ultIdSonographer;
    private String ultIdNa;
    private Integer ultFestiGaWeeks1;
    private Integer ultFestiGaDays1;
    private Date ultFestiDelivery1;
    private Boolean ultFirstYesno1;
    private String ultFabnormal1;
    private String ultFyesSpecify1; //multiple
    private String ultFotherFindings1;
    private String ultFurtherTesting1;
    private Integer ultFnumFetuses;
    private String ultFfetusViable1;
    private String ultFfetalCardia1;
    private Float ultFfetalHeart1;
    private Integer ultFcrl1;
    private String ultFcrlNa1;
    private String ultFfetusViable2;
    private String ultFfetalCardia2;
    private Float ultFfetalHeart2;
    private Integer ultFcrl2;
    private String ultFcrlNa2;
    private String ultFfetusViable3;
    private String ultFfetalCardia3;
    private Float ultFfetalHeart3;
    private Integer ultFcrl3;
    private String ultFcrlNa3;
    private String ultSfindings1;
    private String ultSspecify1;//multiple
    private String ultSfindingsSpecify1;
    private String ultFurtherExamination1;
    private String ultSplacental1;
    private Integer ultSnumFetuses;
    private String ultSfetusViable1;
    private String ultSfetalCardia1;
    private Float ultSfetalHeart1;
    private Integer ultSbiparietal1;
    private Integer ultShead1;
    private String ultMicroceph1;
    private String ultSevMicroceph1;
    private Integer ultSabdominal1;
    private Integer ultSfemur1;
    private Integer ultSfetalWt1;
    private String ultSpresentation1;
    private String ultSfetusViable2;
    private String ultSfetalCardia2;
    private Float ultSfetalHeart2;
    private Integer ultSbiparietal2;
    private Integer ultShead2;
    private String ultMicroceph2;
    private String ultSevMicroceph2;
    private Integer ultSabdominal2;
    private Integer ultSfemur2;
    private Integer ultSfetalWt2;
    private String ultSpresentation2;
    private String ultSfetusViable3;
    private String ultSfetalCardia3;
    private Float ultSfetalHeart3;
    private Integer ultSbiparietal3;
    private Integer ultShead3;
    private String ultMicroceph3;
    private String ultSevMicroceph3;
    private Integer ultSabdominal3;
    private Integer ultSfemur3;
    private Integer ultSfetalWt3;
    private String ultSpresentation3;
    private String ultIdCompleting;
    private Date ultDateCompleted;
    private String ultIdReviewer;
    private Date ultDateReviewed;
    private String ultIdDataEntry;
    private Date ultDateEntered;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "ult_date", nullable = true)
    public Date getUltDate() {
        return ultDate;
    }

    public void setUltDate(Date ultDate) {
        this.ultDate = ultDate;
    }

    @Column(name = "ult_ga_weeks", nullable = true)
    public Integer getUltGaWeeks() {
        return ultGaWeeks;
    }

    public void setUltGaWeeks(Integer ultGaWeeks) {
        this.ultGaWeeks = ultGaWeeks;
    }

    @Column(name = "ult_ga_days", nullable = true)
    public Integer getUltGaDays() {
        return ultGaDays;
    }

    public void setUltGaDays(Integer ultGaDays) {
        this.ultGaDays = ultGaDays;
    }

    @Column(name = "ult_ge_determined", nullable = true, length = 1)
    public String getUltGeDetermined() {
        return ultGeDetermined;
    }

    public void setUltGeDetermined(String ultGeDetermined) {
        this.ultGeDetermined = ultGeDetermined;
    }

    @Column(name = "ult_reason", nullable = true, length = 1)
    public String getUltReason() {
        return ultReason;
    }

    public void setUltReason(String ultReason) {
        this.ultReason = ultReason;
    }

    @Column(name = "ult_reason_other", nullable = true)
    public String getUltReasonOther() {
        return ultReasonOther;
    }

    public void setUltReasonOther(String ultReasonOther) {
        this.ultReasonOther = ultReasonOther;
    }

    @Column(name = "ult_time", nullable = true, length = 1)
    public String getUltTime() {
        return ultTime;
    }

    public void setUltTime(String ultTime) {
        this.ultTime = ultTime;
    }

    @Column(name = "ult_name_facility", nullable = true)
    public String getUltNameFacility() {
        return ultNameFacility;
    }

    public void setUltNameFacility(String ultNameFacility) {
        this.ultNameFacility = ultNameFacility;
    }

    @Column(name = "ult_facilityid", nullable = true, length = 25)
    public String getUltFacilityid() {
        return ultFacilityid;
    }

    public void setUltFacilityid(String ultFacilityid) {
        this.ultFacilityid = ultFacilityid;
    }

    @Column(name = "ult_id_sonographer", nullable = true, length = 25)
    public String getUltIdSonographer() {
        return ultIdSonographer;
    }

    public void setUltIdSonographer(String ultIdSonographer) {
        this.ultIdSonographer = ultIdSonographer;
    }

    @Column(name = "ult_id_na", nullable = true, length = 1)
    public String getUltIdNa() {
        return ultIdNa;
    }

    public void setUltIdNa(String ultIdNa) {
        this.ultIdNa = ultIdNa;
    }

    @Column(name = "ult_festi_ga_weeks1", nullable = true)
    public Integer getUltFestiGaWeeks1() {
        return ultFestiGaWeeks1;
    }

    public void setUltFestiGaWeeks1(Integer ultFestiGaWeeks1) {
        this.ultFestiGaWeeks1 = ultFestiGaWeeks1;
    }

    @Column(name = "ult_festi_ga_days1", nullable = true)
    public Integer getUltFestiGaDays1() {
        return ultFestiGaDays1;
    }

    public void setUltFestiGaDays1(Integer ultFestiGaDays1) {
        this.ultFestiGaDays1 = ultFestiGaDays1;
    }

    @Column(name = "ult_festi_delivery1", nullable = true, length = 1)
    public Date getUltFestiDelivery1() {
        return ultFestiDelivery1;
    }

    public void setUltFestiDelivery1(Date ultFestiDelivery1) {
        this.ultFestiDelivery1 = ultFestiDelivery1;
    }

    @Column(name = "ult_first_yesno1", nullable = true)
    public Boolean getUltFirstYesno1() {
        return ultFirstYesno1;
    }

    public void setUltFirstYesno1(Boolean ultFirstYesno1) {
        this.ultFirstYesno1 = ultFirstYesno1;
    }

    @Column(name = "ult_fabnormal1", nullable = true, length = 1)
    public String getUltFabnormal1() {
        return ultFabnormal1;
    }

    public void setUltFabnormal1(String ultFabnormal1) {
        this.ultFabnormal1 = ultFabnormal1;
    }

    @Column(name = "ult_fyes_specify1", nullable = true, length = 20)
    public String getUltFyesSpecify1() {
        return ultFyesSpecify1;
    }

    public void setUltFyesSpecify1(String ultFyesSpecify1) {
        this.ultFyesSpecify1 = ultFyesSpecify1;
    }

    @Column(name = "ult_fother_findings1", nullable = true)
    public String getUltFotherFindings1() {
        return ultFotherFindings1;
    }

    public void setUltFotherFindings1(String ultFotherFindings1) {
        this.ultFotherFindings1 = ultFotherFindings1;
    }

    @Column(name = "ult_further_testing1", nullable = true, length = 1)
    public String getUltFurtherTesting1() {
        return ultFurtherTesting1;
    }

    public void setUltFurtherTesting1(String ultFurtherTesting1) {
        this.ultFurtherTesting1 = ultFurtherTesting1;
    }

    @Column(name = "ult_fnum_fetuses", nullable = true)
    public Integer getUltFnumFetuses() {
        return ultFnumFetuses;
    }

    public void setUltFnumFetuses(Integer ultFnumFetuses) {
        this.ultFnumFetuses = ultFnumFetuses;
    }

    @Column(name = "ult_ffetus_viable1", nullable = true, length = 1)
    public String getUltFfetusViable1() {
        return ultFfetusViable1;
    }

    public void setUltFfetusViable1(String ultFfetusViable1) {
        this.ultFfetusViable1 = ultFfetusViable1;
    }

    @Column(name = "ult_ffetal_cardia1", nullable = true, length = 1)
    public String getUltFfetalCardia1() {
        return ultFfetalCardia1;
    }

    public void setUltFfetalCardia1(String ultFfetalCardia1) {
        this.ultFfetalCardia1 = ultFfetalCardia1;
    }

    @Column(name = "ult_ffetal_heart1", nullable = true)
    public Float getUltFfetalHeart1() {
        return ultFfetalHeart1;
    }

    public void setUltFfetalHeart1(Float ultFfetalHeart1) {
        this.ultFfetalHeart1 = ultFfetalHeart1;
    }

    @Column(name = "ult_fcrl1", nullable = true)
    public Integer getUltFcrl1() {
        return ultFcrl1;
    }

    public void setUltFcrl1(Integer ultFcrl1) {
        this.ultFcrl1 = ultFcrl1;
    }

    @Column(name = "ult_fcrl_na1", nullable = true, length = 1)
    public String getUltFcrlNa1() {
        return ultFcrlNa1;
    }

    public void setUltFcrlNa1(String ultFcrlNa1) {
        this.ultFcrlNa1 = ultFcrlNa1;
    }

    @Column(name = "ult_ffetus_viable2", nullable = true, length = 1)
    public String getUltFfetusViable2() {
        return ultFfetusViable2;
    }

    public void setUltFfetusViable2(String ultFfetusViable2) {
        this.ultFfetusViable2 = ultFfetusViable2;
    }

    @Column(name = "ult_ffetal_cardia2", nullable = true, length = 1)
    public String getUltFfetalCardia2() {
        return ultFfetalCardia2;
    }

    public void setUltFfetalCardia2(String ultFfetalCardia2) {
        this.ultFfetalCardia2 = ultFfetalCardia2;
    }

    @Column(name = "ult_ffetal_heart2", nullable = true)
    public Float getUltFfetalHeart2() {
        return ultFfetalHeart2;
    }

    public void setUltFfetalHeart2(Float ultFfetalHeart2) {
        this.ultFfetalHeart2 = ultFfetalHeart2;
    }

    @Column(name = "ult_fcrl2", nullable = true)
    public Integer getUltFcrl2() {
        return ultFcrl2;
    }

    public void setUltFcrl2(Integer ultFcrl2) {
        this.ultFcrl2 = ultFcrl2;
    }

    @Column(name = "ult_fcrl_na2", nullable = true, length = 1)
    public String getUltFcrlNa2() {
        return ultFcrlNa2;
    }

    public void setUltFcrlNa2(String ultFcrlNa2) {
        this.ultFcrlNa2 = ultFcrlNa2;
    }

    @Column(name = "ult_ffetus_viable3", nullable = true, length = 1)
    public String getUltFfetusViable3() {
        return ultFfetusViable3;
    }

    public void setUltFfetusViable3(String ultFfetusViable3) {
        this.ultFfetusViable3 = ultFfetusViable3;
    }

    @Column(name = "ult_ffetal_cardia3", nullable = true, length = 1)
    public String getUltFfetalCardia3() {
        return ultFfetalCardia3;
    }

    public void setUltFfetalCardia3(String ultFfetalCardia3) {
        this.ultFfetalCardia3 = ultFfetalCardia3;
    }

    @Column(name = "ult_ffetal_heart3", nullable = true)
    public Float getUltFfetalHeart3() {
        return ultFfetalHeart3;
    }

    public void setUltFfetalHeart3(Float ultFfetalHeart3) {
        this.ultFfetalHeart3 = ultFfetalHeart3;
    }

    @Column(name = "ult_fcrl3", nullable = true)
    public Integer getUltFcrl3() {
        return ultFcrl3;
    }

    public void setUltFcrl3(Integer ultFcrl3) {
        this.ultFcrl3 = ultFcrl3;
    }

    @Column(name = "ult_fcrl_na3", nullable = true, length = 1)
    public String getUltFcrlNa3() {
        return ultFcrlNa3;
    }

    public void setUltFcrlNa3(String ultFcrlNa3) {
        this.ultFcrlNa3 = ultFcrlNa3;
    }

    @Column(name = "ult_sfindings1", nullable = true, length = 1)
    public String getUltSfindings1() {
        return ultSfindings1;
    }

    public void setUltSfindings1(String ultSfindings1) {
        this.ultSfindings1 = ultSfindings1;
    }

    @Column(name = "ult_sspecify1", nullable = true, length = 20)
    public String getUltSspecify1() {
        return ultSspecify1;
    }

    public void setUltSspecify1(String ultSspecify1) {
        this.ultSspecify1 = ultSspecify1;
    }

    @Column(name = "ult_sfindings_specify1", nullable = true)
    public String getUltSfindingsSpecify1() {
        return ultSfindingsSpecify1;
    }

    public void setUltSfindingsSpecify1(String ultSfindingsSpecify1) {
        this.ultSfindingsSpecify1 = ultSfindingsSpecify1;
    }

    @Column(name = "ult_further_examination1", nullable = true, length = 1)
    public String getUltFurtherExamination1() {
        return ultFurtherExamination1;
    }

    public void setUltFurtherExamination1(String ultFurtherExamination1) {
        this.ultFurtherExamination1 = ultFurtherExamination1;
    }

    @Column(name = "ult_splacental1", nullable = true, length = 1)
    public String getUltSplacental1() {
        return ultSplacental1;
    }

    public void setUltSplacental1(String ultSplacental1) {
        this.ultSplacental1 = ultSplacental1;
    }

    @Column(name = "ult_snum_fetuses", nullable = true)
    public Integer getUltSnumFetuses() {
        return ultSnumFetuses;
    }

    public void setUltSnumFetuses(Integer ultSnumFetuses) {
        this.ultSnumFetuses = ultSnumFetuses;
    }

    @Column(name = "ult_sfetus_viable1", nullable = true, length = 1)
    public String getUltSfetusViable1() {
        return ultSfetusViable1;
    }

    public void setUltSfetusViable1(String ultSfetusViable1) {
        this.ultSfetusViable1 = ultSfetusViable1;
    }

    @Column(name = "ult_sfetal_cardia1", nullable = true, length = 1)
    public String getUltSfetalCardia1() {
        return ultSfetalCardia1;
    }

    public void setUltSfetalCardia1(String ultSfetalCardia1) {
        this.ultSfetalCardia1 = ultSfetalCardia1;
    }

    @Column(name = "ult_sfetal_heart1", nullable = true)
    public Float getUltSfetalHeart1() {
        return ultSfetalHeart1;
    }

    public void setUltSfetalHeart1(Float ultSfetalHeart1) {
        this.ultSfetalHeart1 = ultSfetalHeart1;
    }

    @Column(name = "ult_sbiparietal1", nullable = true)
    public Integer getUltSbiparietal1() {
        return ultSbiparietal1;
    }

    public void setUltSbiparietal1(Integer ultSbiparietal1) {
        this.ultSbiparietal1 = ultSbiparietal1;
    }

    @Column(name = "ult_shead1", nullable = true)
    public Integer getUltShead1() {
        return ultShead1;
    }

    public void setUltShead1(Integer ultShead1) {
        this.ultShead1 = ultShead1;
    }

    @Column(name = "ult_microceph1", nullable = true, length = 1)
    public String getUltMicroceph1() {
        return ultMicroceph1;
    }

    public void setUltMicroceph1(String ultMicroceph1) {
        this.ultMicroceph1 = ultMicroceph1;
    }

    @Column(name = "ult_sev_microceph1", nullable = true, length = 1)
    public String getUltSevMicroceph1() {
        return ultSevMicroceph1;
    }

    public void setUltSevMicroceph1(String ultSevMicroceph1) {
        this.ultSevMicroceph1 = ultSevMicroceph1;
    }

    @Column(name = "ult_sabdominal1", nullable = true)
    public Integer getUltSabdominal1() {
        return ultSabdominal1;
    }

    public void setUltSabdominal1(Integer ultSabdominal1) {
        this.ultSabdominal1 = ultSabdominal1;
    }

    @Column(name = "ult_sfemur1", nullable = true)
    public Integer getUltSfemur1() {
        return ultSfemur1;
    }

    public void setUltSfemur1(Integer ultSfemur1) {
        this.ultSfemur1 = ultSfemur1;
    }

    @Column(name = "ult_sfetal_wt1", nullable = true)
    public Integer getUltSfetalWt1() {
        return ultSfetalWt1;
    }

    public void setUltSfetalWt1(Integer ultSfetalWt1) {
        this.ultSfetalWt1 = ultSfetalWt1;
    }

    @Column(name = "ult_spresentation1", nullable = true, length = 1)
    public String getUltSpresentation1() {
        return ultSpresentation1;
    }

    public void setUltSpresentation1(String ultSpresentation1) {
        this.ultSpresentation1 = ultSpresentation1;
    }

    @Column(name = "ult_sfetus_viable2", nullable = true, length = 1)
    public String getUltSfetusViable2() {
        return ultSfetusViable2;
    }

    public void setUltSfetusViable2(String ultSfetusViable2) {
        this.ultSfetusViable2 = ultSfetusViable2;
    }

    @Column(name = "ult_sfetal_cardia2", nullable = true, length = 1)
    public String getUltSfetalCardia2() {
        return ultSfetalCardia2;
    }

    public void setUltSfetalCardia2(String ultSfetalCardia2) {
        this.ultSfetalCardia2 = ultSfetalCardia2;
    }

    @Column(name = "ult_sfetal_heart2", nullable = true)
    public Float getUltSfetalHeart2() {
        return ultSfetalHeart2;
    }

    public void setUltSfetalHeart2(Float ultSfetalHeart2) {
        this.ultSfetalHeart2 = ultSfetalHeart2;
    }

    @Column(name = "ult_sbiparietal2", nullable = true)
    public Integer getUltSbiparietal2() {
        return ultSbiparietal2;
    }

    public void setUltSbiparietal2(Integer ultSbiparietal2) {
        this.ultSbiparietal2 = ultSbiparietal2;
    }

    @Column(name = "ult_shead2", nullable = true)
    public Integer getUltShead2() {
        return ultShead2;
    }

    public void setUltShead2(Integer ultShead2) {
        this.ultShead2 = ultShead2;
    }

    @Column(name = "ult_microceph2", nullable = true, length = 1)
    public String getUltMicroceph2() {
        return ultMicroceph2;
    }

    public void setUltMicroceph2(String ultMicroceph2) {
        this.ultMicroceph2 = ultMicroceph2;
    }

    @Column(name = "ult_sev_microceph2", nullable = true, length = 1)
    public String getUltSevMicroceph2() {
        return ultSevMicroceph2;
    }

    public void setUltSevMicroceph2(String ultSevMicroceph2) {
        this.ultSevMicroceph2 = ultSevMicroceph2;
    }

    @Column(name = "ult_sabdominal2", nullable = true)
    public Integer getUltSabdominal2() {
        return ultSabdominal2;
    }

    public void setUltSabdominal2(Integer ultSabdominal2) {
        this.ultSabdominal2 = ultSabdominal2;
    }

    @Column(name = "ult_sfemur2", nullable = true)
    public Integer getUltSfemur2() {
        return ultSfemur2;
    }

    public void setUltSfemur2(Integer ultSfemur2) {
        this.ultSfemur2 = ultSfemur2;
    }

    @Column(name = "ult_sfetal_wt2", nullable = true)
    public Integer getUltSfetalWt2() {
        return ultSfetalWt2;
    }

    public void setUltSfetalWt2(Integer ultSfetalWt2) {
        this.ultSfetalWt2 = ultSfetalWt2;
    }

    @Column(name = "ult_spresentation2", nullable = true, length = 1)
    public String getUltSpresentation2() {
        return ultSpresentation2;
    }

    public void setUltSpresentation2(String ultSpresentation2) {
        this.ultSpresentation2 = ultSpresentation2;
    }

    @Column(name = "ult_sfetus_viable3", nullable = true, length = 1)
    public String getUltSfetusViable3() {
        return ultSfetusViable3;
    }

    public void setUltSfetusViable3(String ultSfetusViable3) {
        this.ultSfetusViable3 = ultSfetusViable3;
    }

    @Column(name = "ult_sfetal_cardia3", nullable = true, length = 1)
    public String getUltSfetalCardia3() {
        return ultSfetalCardia3;
    }

    public void setUltSfetalCardia3(String ultSfetalCardia3) {
        this.ultSfetalCardia3 = ultSfetalCardia3;
    }

    @Column(name = "ult_sfetal_heart3", nullable = true)
    public Float getUltSfetalHeart3() {
        return ultSfetalHeart3;
    }

    public void setUltSfetalHeart3(Float ultSfetalHeart3) {
        this.ultSfetalHeart3 = ultSfetalHeart3;
    }

    @Column(name = "ult_sbiparietal3", nullable = true)
    public Integer getUltSbiparietal3() {
        return ultSbiparietal3;
    }

    public void setUltSbiparietal3(Integer ultSbiparietal3) {
        this.ultSbiparietal3 = ultSbiparietal3;
    }

    @Column(name = "ult_shead3", nullable = true)
    public Integer getUltShead3() {
        return ultShead3;
    }

    public void setUltShead3(Integer ultShead3) {
        this.ultShead3 = ultShead3;
    }

    @Column(name = "ult_microceph3", nullable = true, length = 1)
    public String getUltMicroceph3() {
        return ultMicroceph3;
    }

    public void setUltMicroceph3(String ultMicroceph3) {
        this.ultMicroceph3 = ultMicroceph3;
    }

    @Column(name = "ult_sev_microceph3", nullable = true, length = 1)
    public String getUltSevMicroceph3() {
        return ultSevMicroceph3;
    }

    public void setUltSevMicroceph3(String ultSevMicroceph3) {
        this.ultSevMicroceph3 = ultSevMicroceph3;
    }

    @Column(name = "ult_sabdominal3", nullable = true)
    public Integer getUltSabdominal3() {
        return ultSabdominal3;
    }

    public void setUltSabdominal3(Integer ultSabdominal3) {
        this.ultSabdominal3 = ultSabdominal3;
    }

    @Column(name = "ult_sfemur3", nullable = true)
    public Integer getUltSfemur3() {
        return ultSfemur3;
    }

    public void setUltSfemur3(Integer ultSfemur3) {
        this.ultSfemur3 = ultSfemur3;
    }

    @Column(name = "ult_sfetal_wt3", nullable = true)
    public Integer getUltSfetalWt3() {
        return ultSfetalWt3;
    }

    public void setUltSfetalWt3(Integer ultSfetalWt3) {
        this.ultSfetalWt3 = ultSfetalWt3;
    }

    @Column(name = "ult_spresentation3", nullable = true, length = 1)
    public String getUltSpresentation3() {
        return ultSpresentation3;
    }

    public void setUltSpresentation3(String ultSpresentation3) {
        this.ultSpresentation3 = ultSpresentation3;
    }

    @Column(name = "ult_id_completing", nullable = true, length = 1)
    public String getUltIdCompleting() {
        return ultIdCompleting;
    }

    public void setUltIdCompleting(String ultIdCompleting) {
        this.ultIdCompleting = ultIdCompleting;
    }

    @Column(name = "ult_date_completed", nullable = true)
    public Date getUltDateCompleted() {
        return ultDateCompleted;
    }

    public void setUltDateCompleted(Date ultDateCompleted) {
        this.ultDateCompleted = ultDateCompleted;
    }

    @Column(name = "ult_id_reviewer", nullable = true, length = 1)
    public String getUltIdReviewer() {
        return ultIdReviewer;
    }

    public void setUltIdReviewer(String ultIdReviewer) {
        this.ultIdReviewer = ultIdReviewer;
    }

    @Column(name = "ult_date_reviewed", nullable = true)
    public Date getUltDateReviewed() {
        return ultDateReviewed;
    }

    public void setUltDateReviewed(Date ultDateReviewed) {
        this.ultDateReviewed = ultDateReviewed;
    }

    @Column(name = "ult_id_data_entry", nullable = true, length = 1)
    public String getUltIdDataEntry() {
        return ultIdDataEntry;
    }

    public void setUltIdDataEntry(String ultIdDataEntry) {
        this.ultIdDataEntry = ultIdDataEntry;
    }

    @Column(name = "ult_date_entered", nullable = true)
    public Date getUltDateEntered() {
        return ultDateEntered;
    }

    public void setUltDateEntered(Date ultDateEntered) {
        this.ultDateEntered = ultDateEntered;
    }
}
