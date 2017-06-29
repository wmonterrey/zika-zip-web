package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ics on 31/5/2017.
 */

@Entity
@Table(name = "zp07a_infant_opht_results", catalog = "zika_zip")
public class Zp07aInfantOphtResults extends BaseMetaData implements Auditable {

    private String recordId;
    private String redcapEventName;
    private Date infantOphthDt;
    private String infantOphType;
    private String infantEyeCalci;
    private String infantChoriore;
    private String infantFocalPm;
    private String infantChorioreAtro;
    private String infantMicroph;
    private String infantMicrocornea;
    private String infantIrisColobo;
    private String infantOpticNerve;
    private String infantSubLuxated;
    private String infantStrabismus;
    private String infantEyeOther;
    private String infantEyeOtherSpecify;
    private String infantReferralOphth;
    private String infantEyeFile;
    private String infantEyeCom;
    private String infantEyComdetail;
    private String infantEyidCom;
    private Date infantEydtCom;
    private String infantEyidRevi;
    private Date infantEydtRevi;
    private String infantEyidEntry;
    private Date infantEydtEnt;

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

    @Column(name = "infant_ophth_dt", nullable = false)
    public Date getInfantOphthDt() {
        return infantOphthDt;
    }

    public void setInfantOphthDt(Date infantOphthDt) {
        this.infantOphthDt = infantOphthDt;
    }

    @Column(name = "infant_oph_type", length = 1)
    public String getInfantOphType() {
        return infantOphType;
    }

    public void setInfantOphType(String infantOphType) {
        this.infantOphType = infantOphType;
    }

    @Column(name = "infant_eye_calci", length = 1)
    public String getInfantEyeCalci() {
        return infantEyeCalci;
    }

    public void setInfantEyeCalci(String infantEyeCalci) {
        this.infantEyeCalci = infantEyeCalci;
    }

    @Column(name = "infant_choriore", length = 1)
    public String getInfantChoriore() {
        return infantChoriore;
    }

    public void setInfantChoriore(String infantChoriore) {
        this.infantChoriore = infantChoriore;
    }

    @Column(name = "infant_focal_pm", length = 1)
    public String getInfantFocalPm() {
        return infantFocalPm;
    }

    public void setInfantFocalPm(String infantFocalPm) {
        this.infantFocalPm = infantFocalPm;
    }

    @Column(name = "infant_choriore_atro", length = 1)
    public String getInfantChorioreAtro() {
        return infantChorioreAtro;
    }

    public void setInfantChorioreAtro(String infantChorioreAtro) {
        this.infantChorioreAtro = infantChorioreAtro;
    }

    @Column(name = "infant_microph", length = 1)
    public String getInfantMicroph() {
        return infantMicroph;
    }

    public void setInfantMicroph(String infantMicroph) {
        this.infantMicroph = infantMicroph;
    }

    @Column(name = "infant_microcornea", length = 1)
    public String getInfantMicrocornea() {
        return infantMicrocornea;
    }

    public void setInfantMicrocornea(String infantMicrocornea) {
        this.infantMicrocornea = infantMicrocornea;
    }

    @Column(name = "infant_iris_colobo", length = 1)
    public String getInfantIrisColobo() {
        return infantIrisColobo;
    }

    public void setInfantIrisColobo(String infantIrisColobo) {
        this.infantIrisColobo = infantIrisColobo;
    }

    @Column(name = "infant_optic_nerve", length = 1)
    public String getInfantOpticNerve() {
        return infantOpticNerve;
    }

    public void setInfantOpticNerve(String infantOpticNerve) {
        this.infantOpticNerve = infantOpticNerve;
    }

    @Column(name = "infant_sub_luxated", length = 1)
    public String getInfantSubLuxated() {
        return infantSubLuxated;
    }

    public void setInfantSubLuxated(String infantSubLuxated) {
        this.infantSubLuxated = infantSubLuxated;
    }

    @Column(name = "infant_strabismus", length = 1)
    public String getInfantStrabismus() {
        return infantStrabismus;
    }

    public void setInfantStrabismus(String infantStrabismus) {
        this.infantStrabismus = infantStrabismus;
    }

    @Column(name = "infant_eye_other", length = 1)
    public String getInfantEyeOther() {
        return infantEyeOther;
    }

    public void setInfantEyeOther(String infantEyeOther) {
        this.infantEyeOther = infantEyeOther;
    }

    @Column(name = "infant_eye_other_specify", length = 100)
    public String getInfantEyeOtherSpecify() {
        return infantEyeOtherSpecify;
    }

    public void setInfantEyeOtherSpecify(String infantEyeOtherSpecify) {
        this.infantEyeOtherSpecify = infantEyeOtherSpecify;
    }

    @Column(name = "infant_referral_ophth", length = 1)
    public String getInfantReferralOphth() {
        return infantReferralOphth;
    }

    public void setInfantReferralOphth(String infantReferralOphth) {
        this.infantReferralOphth = infantReferralOphth;
    }

    @Column(name = "infant_eye_file", length = 100)
    public String getInfantEyeFile() {
        return infantEyeFile;
    }

    public void setInfantEyeFile(String infantEyeFile) {
        this.infantEyeFile = infantEyeFile;
    }




    @Column(name = "infant_eye_com", length = 1)
    public String getInfantEyeCom() {
        return infantEyeCom;
    }

    public void setInfantEyeCom(String infantEyeCom) {
        this.infantEyeCom = infantEyeCom;
    }

    @Column(name = "infant_ey_comdetail", length = 100)
    public String getInfantEyComdetail() {
        return infantEyComdetail;
    }

    public void setInfantEyComdetail(String infantEyComdetail) {
        this.infantEyComdetail = infantEyComdetail;
    }

    @Column(name = "infant_eyid_com", length = 50)
    public String getInfantEyidCom() {
        return infantEyidCom;
    }

    public void setInfantEyidCom(String infantEyidCom) {
        this.infantEyidCom = infantEyidCom;
    }

    @Column(name = "infant_eydt_com")
    public Date getInfantEydtCom() {
        return infantEydtCom;
    }

    public void setInfantEydtCom(Date infantEydtCom) {
        this.infantEydtCom = infantEydtCom;
    }

    @Column(name = "infant_eyid_revi", length = 50)
    public String getInfantEyidRevi() {
        return infantEyidRevi;
    }

    public void setInfantEyidRevi(String infantEyidRevi) {
        this.infantEyidRevi = infantEyidRevi;
    }

    @Column(name = "infant_eydt_revi")
    public Date getInfantEydtRevi() {
        return infantEydtRevi;
    }

    public void setInfantEydtRevi(Date infantEydtRevi) {
        this.infantEydtRevi = infantEydtRevi;
    }

    @Column(name = "infant_eyid_entry", length = 50)
    public String getInfantEyidEntry() {
        return infantEyidEntry;
    }

    public void setInfantEyidEntry(String infantEyidEntry) {
        this.infantEyidEntry = infantEyidEntry;
    }

    @Column(name = "infant_eydt_ent")
    public Date getInfantEydtEnt() {
        return infantEydtEnt;
    }

    public void setInfantEydtEnt(Date infantEydtEnt) {
        this.infantEydtEnt = infantEydtEnt;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "ZP07a{" + recordId + ", " + redcapEventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zp07aInfantOphtResults)) return false;

        Zp07aInfantOphtResults that = (Zp07aInfantOphtResults) o;

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
