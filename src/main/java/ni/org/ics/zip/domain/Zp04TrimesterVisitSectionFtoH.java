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
@Table(name = "zp04_trimester_visit_section_f_to_h", catalog = "zika_zip")
public class Zp04TrimesterVisitSectionFtoH extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private String triBugNuisInd;
    private String triPestStorHomeInd;
    private String triPestAppHomeInd;
    private String triPestAppDay;
    private String triPestAppMonth;
    private String triPestAppYear;
    private String triPestAppName;
    private String triHomeTrtdInsctInd;
    private String triHomeTrtdLoc;
    private String triHomeTrtdEntity;
    private String triHomeTrtdNames;
    private String triTrtmntAppDay;
    private String triTrtmntAppMonth;
    private String triTrtmntAppYear;
    private String triLwnTrtmntAppInd;
    private String triLwnTrtmntAppDay;
    private String triLwnTrtmntAppMonth;
    private String triLwnTrtmntAppYear;
    private String triLwnTrtmntAppName;
    private String triMosqRepInd;
    private String triMosqRepTyp;
    private String triMosqRepNameSpray;
    private String triMosqRepDkSpray;
    private String triMosqRepNameLotion;
    private String triMosqRepDkLotion;
    private String triMosqRepNameSpiral;
    private String triMosqRepDkSpiral;
    private String triMosqRepNamePlugin;
    private String triMosqRepDkPlugin;
    private String triMosqRepNameOther;
    private String triMosqRepDkOther;
    private Date triNextVisitDat;
    private String triNextVisitTime;
    private String triCompId;
    private Date triCompDat;
    private String triRevId;
    private Date triRevDat;
    private String triEntId;
    private Date triEntDat;


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

    @Column(name = "tri_bug_nuis_ind", nullable = true, length = 1)
    public String getTriBugNuisInd() {
        return triBugNuisInd;
    }

    public void setTriBugNuisInd(String triBugNuisInd) {
        this.triBugNuisInd = triBugNuisInd;
    }

    @Column(name = "tri_pest_stor_home_ind", nullable = true, length = 1)
    public String getTriPestStorHomeInd() {
        return triPestStorHomeInd;
    }

    public void setTriPestStorHomeInd(String triPestStorHomeInd) {
        this.triPestStorHomeInd = triPestStorHomeInd;
    }

    @Column(name = "tri_pest_app_home_ind", nullable = true, length = 1)
    public String getTriPestAppHomeInd() {
        return triPestAppHomeInd;
    }

    public void setTriPestAppHomeInd(String triPestAppHomeInd) {
        this.triPestAppHomeInd = triPestAppHomeInd;
    }

    @Column(name = "tri_pest_app_day", nullable = true, length = 2)
    public String getTriPestAppDay() {
        return triPestAppDay;
    }

    public void setTriPestAppDay(String triPestAppDay) {
        this.triPestAppDay = triPestAppDay;
    }

    @Column(name = "tri_pest_app_month", nullable = true, length = 2)
    public String getTriPestAppMonth() {
        return triPestAppMonth;
    }

    public void setTriPestAppMonth(String triPestAppMonth) {
        this.triPestAppMonth = triPestAppMonth;
    }

    @Column(name = "tri_pest_app_year", nullable = true, length = 4)
    public String getTriPestAppYear() {
        return triPestAppYear;
    }

    public void setTriPestAppYear(String triPestAppYear) {
        this.triPestAppYear = triPestAppYear;
    }

    @Column(name = "tri_pest_app_name", nullable = true)
    public String getTriPestAppName() {
        return triPestAppName;
    }

    public void setTriPestAppName(String triPestAppName) {
        this.triPestAppName = triPestAppName;
    }

    @Column(name = "tri_home_trtd_insct_ind", nullable = true, length = 1)
    public String getTriHomeTrtdInsctInd() {
        return triHomeTrtdInsctInd;
    }

    public void setTriHomeTrtdInsctInd(String triHomeTrtdInsctInd) {
        this.triHomeTrtdInsctInd = triHomeTrtdInsctInd;
    }

    @Column(name = "tri_home_trtd_loc", nullable = true, length = 1)
    public String getTriHomeTrtdLoc() {
        return triHomeTrtdLoc;
    }

    public void setTriHomeTrtdLoc(String triHomeTrtdLoc) {
        this.triHomeTrtdLoc = triHomeTrtdLoc;
    }

    @Column(name = "tri_home_trtd_entity", nullable = true, length = 1)
    public String getTriHomeTrtdEntity() {
        return triHomeTrtdEntity;
    }

    public void setTriHomeTrtdEntity(String triHomeTrtdEntity) {
        this.triHomeTrtdEntity = triHomeTrtdEntity;
    }

    @Column(name = "tri_home_trtd_names", nullable = true)
    public String getTriHomeTrtdNames() {
        return triHomeTrtdNames;
    }

    public void setTriHomeTrtdNames(String triHomeTrtdNames) {
        this.triHomeTrtdNames = triHomeTrtdNames;
    }

    @Column(name = "tri_trtmnt_app_day", nullable = true, length = 2)
    public String getTriTrtmntAppDay() {
        return triTrtmntAppDay;
    }

    public void setTriTrtmntAppDay(String triTrtmntAppDay) {
        this.triTrtmntAppDay = triTrtmntAppDay;
    }

    @Column(name = "tri_trtmnt_app_month", nullable = true, length = 2)
    public String getTriTrtmntAppMonth() {
        return triTrtmntAppMonth;
    }

    public void setTriTrtmntAppMonth(String triTrtmntAppMonth) {
        this.triTrtmntAppMonth = triTrtmntAppMonth;
    }

    @Column(name = "tri_trtmnt_app_year", nullable = true, length = 4)
    public String getTriTrtmntAppYear() {
        return triTrtmntAppYear;
    }

    public void setTriTrtmntAppYear(String triTrtmntAppYear) {
        this.triTrtmntAppYear = triTrtmntAppYear;
    }

    @Column(name = "tri_lwn_trtmnt_app_ind", nullable = true, length = 1)
    public String getTriLwnTrtmntAppInd() {
        return triLwnTrtmntAppInd;
    }

    public void setTriLwnTrtmntAppInd(String triLwnTrtmntAppInd) {
        this.triLwnTrtmntAppInd = triLwnTrtmntAppInd;
    }

    @Column(name = "tri_lwn_trtmnt_app_day", nullable = true, length = 2)
    public String getTriLwnTrtmntAppDay() {
        return triLwnTrtmntAppDay;
    }

    public void setTriLwnTrtmntAppDay(String triLwnTrtmntAppDay) {
        this.triLwnTrtmntAppDay = triLwnTrtmntAppDay;
    }

    @Column(name = "tri_lwn_trtmnt_app_month", nullable = true, length = 2)
    public String getTriLwnTrtmntAppMonth() {
        return triLwnTrtmntAppMonth;
    }

    public void setTriLwnTrtmntAppMonth(String triLwnTrtmntAppMonth) {
        this.triLwnTrtmntAppMonth = triLwnTrtmntAppMonth;
    }

    @Column(name = "tri_lwn_trtmnt_app_year", nullable = true, length = 4)
    public String getTriLwnTrtmntAppYear() {
        return triLwnTrtmntAppYear;
    }

    public void setTriLwnTrtmntAppYear(String triLwnTrtmntAppYear) {
        this.triLwnTrtmntAppYear = triLwnTrtmntAppYear;
    }

    @Column(name = "tri_lwn_trtmnt_app_name", nullable = true)
    public String getTriLwnTrtmntAppName() {
        return triLwnTrtmntAppName;
    }

    public void setTriLwnTrtmntAppName(String triLwnTrtmntAppName) {
        this.triLwnTrtmntAppName = triLwnTrtmntAppName;
    }

    @Column(name = "tri_mosq_rep_ind", nullable = true, length = 1)
    public String getTriMosqRepInd() {
        return triMosqRepInd;
    }

    public void setTriMosqRepInd(String triMosqRepInd) {
        this.triMosqRepInd = triMosqRepInd;
    }

    @Column(name = "tri_mosq_rep_typ", nullable = true, length = 25)
    public String getTriMosqRepTyp() {
        return triMosqRepTyp;
    }

    public void setTriMosqRepTyp(String triMosqRepTyp) {
        this.triMosqRepTyp = triMosqRepTyp;
    }

    @Column(name = "tri_mosq_rep_name_spray", nullable = true)
    public String getTriMosqRepNameSpray() {
        return triMosqRepNameSpray;
    }

    public void setTriMosqRepNameSpray(String triMosqRepNameSpray) {
        this.triMosqRepNameSpray = triMosqRepNameSpray;
    }

    @Column(name = "tri_mosq_rep_dk_spray", nullable = true, length = 1)
    public String getTriMosqRepDkSpray() {
        return triMosqRepDkSpray;
    }

    public void setTriMosqRepDkSpray(String triMosqRepDkSpray) {
        this.triMosqRepDkSpray = triMosqRepDkSpray;
    }

    @Column(name = "tri_mosq_rep_name_lotion", nullable = true)
    public String getTriMosqRepNameLotion() {
        return triMosqRepNameLotion;
    }

    public void setTriMosqRepNameLotion(String triMosqRepNameLotion) {
        this.triMosqRepNameLotion = triMosqRepNameLotion;
    }

    @Column(name = "tri_mosq_rep_dk_lotion", nullable = true, length = 1)
    public String getTriMosqRepDkLotion() {
        return triMosqRepDkLotion;
    }

    public void setTriMosqRepDkLotion(String triMosqRepDkLotion) {
        this.triMosqRepDkLotion = triMosqRepDkLotion;
    }

    @Column(name = "tri_mosq_rep_name_spiral", nullable = true)
    public String getTriMosqRepNameSpiral() {
        return triMosqRepNameSpiral;
    }

    public void setTriMosqRepNameSpiral(String triMosqRepNameSpiral) {
        this.triMosqRepNameSpiral = triMosqRepNameSpiral;
    }

    @Column(name = "tri_mosq_rep_dk_spiral", nullable = true, length = 1)
    public String getTriMosqRepDkSpiral() {
        return triMosqRepDkSpiral;
    }

    public void setTriMosqRepDkSpiral(String triMosqRepDkSpiral) {
        this.triMosqRepDkSpiral = triMosqRepDkSpiral;
    }

    @Column(name = "tri_mosq_rep_name_plugin", nullable = true)
    public String getTriMosqRepNamePlugin() {
        return triMosqRepNamePlugin;
    }

    public void setTriMosqRepNamePlugin(String triMosqRepNamePlugin) {
        this.triMosqRepNamePlugin = triMosqRepNamePlugin;
    }

    @Column(name = "tri_mosq_rep_dk_plugin", nullable = true, length = 1)
    public String getTriMosqRepDkPlugin() {
        return triMosqRepDkPlugin;
    }

    public void setTriMosqRepDkPlugin(String triMosqRepDkPlugin) {
        this.triMosqRepDkPlugin = triMosqRepDkPlugin;
    }

    @Column(name = "tri_mosq_rep_name_other", nullable = true)
    public String getTriMosqRepNameOther() {
        return triMosqRepNameOther;
    }

    public void setTriMosqRepNameOther(String triMosqRepNameOther) {
        this.triMosqRepNameOther = triMosqRepNameOther;
    }

    @Column(name = "tri_mosq_rep_dk_other", nullable = true, length = 1)
    public String getTriMosqRepDkOther() {
        return triMosqRepDkOther;
    }

    public void setTriMosqRepDkOther(String triMosqRepDkOther) {
        this.triMosqRepDkOther = triMosqRepDkOther;
    }

    @Column(name = "tri_next_visit_dat", nullable = true)
    public Date getTriNextVisitDat() {
        return triNextVisitDat;
    }

    public void setTriNextVisitDat(Date triNextVisitDat) {
        this.triNextVisitDat = triNextVisitDat;
    }

    @Column(name = "tri_next_visit_time", nullable = true, length = 25)
    public String getTriNextVisitTime() {
        return triNextVisitTime;
    }

    public void setTriNextVisitTime(String triNextVisitTime) {
        this.triNextVisitTime = triNextVisitTime;
    }

    @Column(name = "tri_comp_id", nullable = true, length = 50)
    public String getTriCompId() {
        return triCompId;
    }

    public void setTriCompId(String triCompId) {
        this.triCompId = triCompId;
    }

    @Column(name = "tri_comp_dat", nullable = true)
    public Date getTriCompDat() {
        return triCompDat;
    }

    public void setTriCompDat(Date triCompDat) {
        this.triCompDat = triCompDat;
    }

    @Column(name = "tri_rev_id", nullable = true, length = 50)
    public String getTriRevId() {
        return triRevId;
    }

    public void setTriRevId(String triRevId) {
        this.triRevId = triRevId;
    }

    @Column(name = "tri_rev_dat", nullable = true)
    public Date getTriRevDat() {
        return triRevDat;
    }

    public void setTriRevDat(Date triRevDat) {
        this.triRevDat = triRevDat;
    }

    @Column(name = "tri_ent_id", nullable = true, length = 50)
    public String getTriEntId() {
        return triEntId;
    }

    public void setTriEntId(String triEntId) {
        this.triEntId = triEntId;
    }

    @Column(name = "tri_ent_dat", nullable = true)
    public Date getTriEntDat() {
        return triEntDat;
    }

    public void setTriEntDat(Date triEntDat) {
        this.triEntDat = triEntDat;
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
        if (!(o instanceof Zp04TrimesterVisitSectionFtoH)) return false;

        Zp04TrimesterVisitSectionFtoH that = (Zp04TrimesterVisitSectionFtoH) o;

        return (recordId.equals(that.recordId));
    }
}
