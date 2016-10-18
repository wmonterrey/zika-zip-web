package ni.org.ics.zip.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp01_study_entry_section_a_to_d", catalog = "zika_zip")
public class Zp01StudyEntrySectionAtoD {

    private String recordId;
    private Date seaVdate;
    private Date seaPtdate;
    private String seaTresults;
    private Date seaLmpdate;
    private String seaLmpunknown;
    private Integer seaGaWeek;
    private Integer seaGaDay;
    private Date seaEddLmp;
    private String seaTriultrasound;
    private String seaUltravailable;
    private String seaUltraDay;
    private String seaUltraMonth;
    private String seaUltraYear;
    private Integer seaAgweeks;
    private Integer seaAgdays;
    private Date seaEdd;
    private String seaEddUsed;
    private Float seaPreWt;
    private String seaPrewtUnit;
    private Float seaCurHt;
    private String seaCurhtUnit;
    private Float seaMotherWt;
    private String seaMotherwtUnit;
    private Float seaHem;
    private Integer seaSystolic;
    private Integer seaDiastolic;
    private Float seaTemp;
    private String seaTmpUnit;
    private String seaCity;
    private String seaState;
    private String seaCountry;
    private String seaLive;
    private Integer seaAgeLeave;
    private String seaLeavena;
    private String seaMstatus;
    private String seaRace;
    private String seaEthnicityOther;
    private String seaDegreeYou;
    private Float seaYdegreeYears;
    private String seaDegreeSpouse;
    private Float seaSdegreeYears;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "sea_vdate", nullable = true)
    public Date getSeaVdate() {
        return seaVdate;
    }

    public void setSeaVdate(Date seaVdate) {
        this.seaVdate = seaVdate;
    }

    @Column(name = "sea_ptdate", nullable = true)
    public Date getSeaPtdate() {
        return seaPtdate;
    }

    public void setSeaPtdate(Date seaPtdate) {
        this.seaPtdate = seaPtdate;
    }

    @Column(name = "sea_tresults", nullable = true)
    public String getSeaTresults() {
        return seaTresults;
    }

    public void setSeaTresults(String seaTresults) {
        this.seaTresults = seaTresults;
    }

    @Column(name = "sea_lmpdate", nullable = true)
    public Date getSeaLmpdate() {
        return seaLmpdate;
    }

    public void setSeaLmpdate(Date seaLmpdate) {
        this.seaLmpdate = seaLmpdate;
    }

    @Column(name = "sea_lmpunknown", nullable = true, length = 1)
    public String getSeaLmpunknown() {
        return seaLmpunknown;
    }

    public void setSeaLmpunknown(String seaLmpunknown) {
        this.seaLmpunknown = seaLmpunknown;
    }

    @Column(name = "sea_ga_week", nullable = true)
    public Integer getSeaGaWeek() {
        return seaGaWeek;
    }

    public void setSeaGaWeek(Integer seaGaWeek) {
        this.seaGaWeek = seaGaWeek;
    }

    @Column(name = "sea_ga_day", nullable = true)
    public Integer getSeaGaDay() {
        return seaGaDay;
    }

    public void setSeaGaDay(Integer seaGaDay) {
        this.seaGaDay = seaGaDay;
    }

    @Column(name = "sea_edd_lmp", nullable = true)
    public Date getSeaEddLmp() {
        return seaEddLmp;
    }

    public void setSeaEddLmp(Date seaEddLmp) {
        this.seaEddLmp = seaEddLmp;
    }

    @Column(name = "sea_triultrasound", nullable = true, length = 1)
    public String getSeaTriultrasound() {
        return seaTriultrasound;
    }

    public void setSeaTriultrasound(String seaTriultrasound) {
        this.seaTriultrasound = seaTriultrasound;
    }

    @Column(name = "sea_ultravailable", nullable = true, length = 1)
    public String getSeaUltravailable() {
        return seaUltravailable;
    }

    public void setSeaUltravailable(String seaUltravailable) {
        this.seaUltravailable = seaUltravailable;
    }

    @Column(name = "sea_ultra_day", nullable = true, length = 2)
    public String getSeaUltraDay() {
        return seaUltraDay;
    }

    public void setSeaUltraDay(String seaUltraDay) {
        this.seaUltraDay = seaUltraDay;
    }

    @Column(name = "sea_ultra_month", nullable = true, length = 2)
    public String getSeaUltraMonth() {
        return seaUltraMonth;
    }

    public void setSeaUltraMonth(String seaUltraMonth) {
        this.seaUltraMonth = seaUltraMonth;
    }

    @Column(name = "sea_ultra_year", nullable = true, length = 4)
    public String getSeaUltraYear() {
        return seaUltraYear;
    }

    public void setSeaUltraYear(String seaUltraYear) {
        this.seaUltraYear = seaUltraYear;
    }

    @Column(name = "sea_agweeks", nullable = true)
    public Integer getSeaAgweeks() {
        return seaAgweeks;
    }

    public void setSeaAgweeks(Integer seaAgweeks) {
        this.seaAgweeks = seaAgweeks;
    }

    @Column(name = "sea_agdays", nullable = true)
    public Integer getSeaAgdays() {
        return seaAgdays;
    }

    public void setSeaAgdays(Integer seaAgdays) {
        this.seaAgdays = seaAgdays;
    }

    @Column(name = "sea_edd", nullable = true)
    public Date getSeaEdd() {
        return seaEdd;
    }

    public void setSeaEdd(Date seaEdd) {
        this.seaEdd = seaEdd;
    }

    @Column(name = "sea_edd_used", nullable = true)
    public String getSeaEddUsed() {
        return seaEddUsed;
    }

    public void setSeaEddUsed(String seaEddUsed) {
        this.seaEddUsed = seaEddUsed;
    }

    @Column(name = "sea_pre_wt", nullable = true)
    public Float getSeaPreWt() {
        return seaPreWt;
    }

    public void setSeaPreWt(Float seaPreWt) {
        this.seaPreWt = seaPreWt;
    }

    @Column(name = "sea_prewt_unit", nullable = true)
    public String getSeaPrewtUnit() {
        return seaPrewtUnit;
    }

    public void setSeaPrewtUnit(String seaPrewtUnit) {
        this.seaPrewtUnit = seaPrewtUnit;
    }

    @Column(name = "sea_cur_ht", nullable = true)
    public Float getSeaCurHt() {
        return seaCurHt;
    }

    public void setSeaCurHt(Float seaCurHt) {
        this.seaCurHt = seaCurHt;
    }

    @Column(name = "sea_curht_unit", nullable = true)
    public String getSeaCurhtUnit() {
        return seaCurhtUnit;
    }

    public void setSeaCurhtUnit(String seaCurhtUnit) {
        this.seaCurhtUnit = seaCurhtUnit;
    }

    @Column(name = "sea_mother_wt", nullable = true)
    public Float getSeaMotherWt() {
        return seaMotherWt;
    }

    public void setSeaMotherWt(Float seaMotherWt) {
        this.seaMotherWt = seaMotherWt;
    }

    @Column(name = "sea_motherwt_unit", nullable = true)
    public String getSeaMotherwtUnit() {
        return seaMotherwtUnit;
    }

    public void setSeaMotherwtUnit(String seaMotherwtUnit) {
        this.seaMotherwtUnit = seaMotherwtUnit;
    }

    @Column(name = "sea_hem", nullable = true)
    public Float getSeaHem() {
        return seaHem;
    }

    public void setSeaHem(Float seaHem) {
        this.seaHem = seaHem;
    }

    @Column(name = "sea_systolic", nullable = true)
    public Integer getSeaSystolic() {
        return seaSystolic;
    }

    public void setSeaSystolic(Integer seaSystolic) {
        this.seaSystolic = seaSystolic;
    }

    @Column(name = "sea_diastolic", nullable = true)
    public Integer getSeaDiastolic() {
        return seaDiastolic;
    }

    public void setSeaDiastolic(Integer seaDiastolic) {
        this.seaDiastolic = seaDiastolic;
    }

    @Column(name = "sea_temp", nullable = true)
    public Float getSeaTemp() {
        return seaTemp;
    }

    public void setSeaTemp(Float seaTemp) {
        this.seaTemp = seaTemp;
    }

    @Column(name = "sea_tmp_unit", nullable = true)
    public String getSeaTmpUnit() {
        return seaTmpUnit;
    }

    public void setSeaTmpUnit(String seaTmpUnit) {
        this.seaTmpUnit = seaTmpUnit;
    }

    @Column(name = "sea_city", nullable = true)
    public String getSeaCity() {
        return seaCity;
    }

    public void setSeaCity(String seaCity) {
        this.seaCity = seaCity;
    }

    @Column(name = "sea_state", nullable = true)
    public String getSeaState() {
        return seaState;
    }

    public void setSeaState(String seaState) {
        this.seaState = seaState;
    }

    @Column(name = "sea_country", nullable = true)
    public String getSeaCountry() {
        return seaCountry;
    }

    public void setSeaCountry(String seaCountry) {
        this.seaCountry = seaCountry;
    }

    @Column(name = "sea_live", nullable = true, length = 1)
    public String getSeaLive() {
        return seaLive;
    }

    public void setSeaLive(String seaLive) {
        this.seaLive = seaLive;
    }

    @Column(name = "sea_age_leave", nullable = true)
    public Integer getSeaAgeLeave() {
        return seaAgeLeave;
    }

    public void setSeaAgeLeave(Integer seaAgeLeave) {
        this.seaAgeLeave = seaAgeLeave;
    }

    @Column(name = "sea_leavena", nullable = true, length = 1)
    public String getSeaLeavena() {
        return seaLeavena;
    }

    public void setSeaLeavena(String seaLeavena) {
        this.seaLeavena = seaLeavena;
    }

    @Column(name = "sea_mstatus", nullable = true, length = 2)
    public String getSeaMstatus() {
        return seaMstatus;
    }

    public void setSeaMstatus(String seaMstatus) {
        this.seaMstatus = seaMstatus;
    }

    @Column(name = "sea_race", nullable = true, length = 2)
    public String getSeaRace() {
        return seaRace;
    }

    public void setSeaRace(String seaRace) {
        this.seaRace = seaRace;
    }

    @Column(name = "sea_ethnicity_other", nullable = true)
    public String getSeaEthnicityOther() {
        return seaEthnicityOther;
    }

    public void setSeaEthnicityOther(String seaEthnicityOther) {
        this.seaEthnicityOther = seaEthnicityOther;
    }

    @Column(name = "sea_degree_you", nullable = true, length = 2)
    public String getSeaDegreeYou() {
        return seaDegreeYou;
    }

    public void setSeaDegreeYou(String seaDegreeYou) {
        this.seaDegreeYou = seaDegreeYou;
    }

    @Column(name = "sea_ydegree_years", nullable = true)
    public Float getSeaYdegreeYears() {
        return seaYdegreeYears;
    }

    public void setSeaYdegreeYears(Float seaYdegreeYears) {
        this.seaYdegreeYears = seaYdegreeYears;
    }

    @Column(name = "sea_degree_spouse", nullable = true, length = 2)
    public String getSeaDegreeSpouse() {
        return seaDegreeSpouse;
    }

    public void setSeaDegreeSpouse(String seaDegreeSpouse) {
        this.seaDegreeSpouse = seaDegreeSpouse;
    }

    @Column(name = "sea_sdegree_years", nullable = true)
    public Float getSeaSdegreeYears() {
        return seaSdegreeYears;
    }

    public void setSeaSdegreeYears(Float seaSdegreeYears) {
        this.seaSdegreeYears = seaSdegreeYears;
    }
}
