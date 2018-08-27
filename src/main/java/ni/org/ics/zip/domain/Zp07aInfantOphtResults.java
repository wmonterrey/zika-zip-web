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
 //   private String infantReferralOphth;
    private String infantEyeFile;
    private String infantEyeCom;
    private String infantEyComdetail;
    private String infantEyidCom;
    private Date infantEydtCom;
    private String infantEyidRevi;
    private Date infantEydtRevi;
    private String infantEyidEntry;
    private Date infantEydtEnt;

    //v2.6
    private String infantMicrocep;
    private String infantCongCataract;
    private String infantGlaucoma;
    private String infantMyopia;
    private String infantBlindness;
    private String infantOtherDisease;
    private String infantOtherSpecify;
    private Float infantGestAge;
    private String infantLight;
    private String infantFixFollow;
    private String infantFacialExpression;
    private String infantSmile;
    private String infantPtosis;
    private String infantCataract;
    private String infantOtherLens;
    private String infantLenOhterSpec;
    private String infantNystagmus;
    private String infantIntraPress;
    private Integer infantTonoLeft;
    private Integer infantTonoRight;
    private String infantFocalSpecify;
    private String infantAbnoVascu;
    private String infantFovealLoss;
    private String infantRetinaColoboma;
    private String infantAtrophy;
    private String infantColoboma;
    private Float infantDiscLeft;
    private Float infantDiscRight;
    private String infantHypoplasia;


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

    @Column(name = "infant_oph_type", length = 12)
    public String getInfantOphType() {
        return infantOphType;
    }

    public void setInfantOphType(String infantOphType) {
        this.infantOphType = infantOphType;
    }

    @Column(name = "infant_eye_calci", length = 2)
    public String getInfantEyeCalci() {
        return infantEyeCalci;
    }

    public void setInfantEyeCalci(String infantEyeCalci) {
        this.infantEyeCalci = infantEyeCalci;
    }

    @Column(name = "infant_choriore", length = 2)
    public String getInfantChoriore() {
        return infantChoriore;
    }

    public void setInfantChoriore(String infantChoriore) {
        this.infantChoriore = infantChoriore;
    }

    @Column(name = "infant_focal_pm", length = 2)
    public String getInfantFocalPm() {
        return infantFocalPm;
    }

    public void setInfantFocalPm(String infantFocalPm) {
        this.infantFocalPm = infantFocalPm;
    }

    @Column(name = "infant_choriore_atro", length = 2)
    public String getInfantChorioreAtro() {
        return infantChorioreAtro;
    }

    public void setInfantChorioreAtro(String infantChorioreAtro) {
        this.infantChorioreAtro = infantChorioreAtro;
    }

    @Column(name = "infant_microph", length = 2)
    public String getInfantMicroph() {
        return infantMicroph;
    }

    public void setInfantMicroph(String infantMicroph) {
        this.infantMicroph = infantMicroph;
    }

    @Column(name = "infant_microcornea", length = 2)
    public String getInfantMicrocornea() {
        return infantMicrocornea;
    }

    public void setInfantMicrocornea(String infantMicrocornea) {
        this.infantMicrocornea = infantMicrocornea;
    }

    @Column(name = "infant_iris_colobo", length = 2)
    public String getInfantIrisColobo() {
        return infantIrisColobo;
    }

    public void setInfantIrisColobo(String infantIrisColobo) {
        this.infantIrisColobo = infantIrisColobo;
    }

    @Column(name = "infant_optic_nerve", length = 2)
    public String getInfantOpticNerve() {
        return infantOpticNerve;
    }

    public void setInfantOpticNerve(String infantOpticNerve) {
        this.infantOpticNerve = infantOpticNerve;
    }

    @Column(name = "infant_sub_luxated", length = 2)
    public String getInfantSubLuxated() {
        return infantSubLuxated;
    }

    public void setInfantSubLuxated(String infantSubLuxated) {
        this.infantSubLuxated = infantSubLuxated;
    }

    @Column(name = "infant_strabismus", length = 2)
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

   /* @Column(name = "infant_referral_ophth", length = 1)
    public String getInfantReferralOphth() {
        return infantReferralOphth;
    }

    public void setInfantReferralOphth(String infantReferralOphth) {
        this.infantReferralOphth = infantReferralOphth;
    }*/

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

    //v2.6

    @Column(name = "infant_microcep", length = 2)
    public String getInfantMicrocep() {
        return infantMicrocep;
    }

    public void setInfantMicrocep(String infantMicrocep) {
        this.infantMicrocep = infantMicrocep;
    }

    @Column(name = "infant_cong_cataract", length = 2)
    public String getInfantCongCataract() {
        return infantCongCataract;
    }

    public void setInfantCongCataract(String infantCongCataract) {
        this.infantCongCataract = infantCongCataract;
    }

    @Column(name = "infant_glaucoma", length = 2)
    public String getInfantGlaucoma() {
        return infantGlaucoma;
    }

    public void setInfantGlaucoma(String infantGlaucoma) {
        this.infantGlaucoma = infantGlaucoma;
    }

    @Column(name = "infant_myopia", length = 2)
    public String getInfantMyopia() {
        return infantMyopia;
    }

    public void setInfantMyopia(String infantMyopia) {
        this.infantMyopia = infantMyopia;
    }

    @Column(name = "infant_blindness", length = 2)
    public String getInfantBlindness() {
        return infantBlindness;
    }

    public void setInfantBlindness(String infantBlindness) {
        this.infantBlindness = infantBlindness;
    }

    @Column(name = "infant_other_disease", length = 2)
    public String getInfantOtherDisease() {
        return infantOtherDisease;
    }

    public void setInfantOtherDisease(String infantOtherDisease) {
        this.infantOtherDisease = infantOtherDisease;
    }

    @Column(name = "infant_other_specify", length = 100)
    public String getInfantOtherSpecify() {
        return infantOtherSpecify;
    }

    public void setInfantOtherSpecify(String infantOtherSpecify) {
        this.infantOtherSpecify = infantOtherSpecify;
    }

    @Column(name = "infant_gest_age")
    public Float getInfantGestAge() {
        return infantGestAge;
    }

    public void setInfantGestAge(Float infantGestAge) {
        this.infantGestAge = infantGestAge;
    }

    @Column(name = "infant_light", length = 2)
    public String getInfantLight() {
        return infantLight;
    }

    public void setInfantLight(String infantLight) {
        this.infantLight = infantLight;
    }

    @Column(name = "infant_fix_follow", length = 2)
    public String getInfantFixFollow() {
        return infantFixFollow;
    }

    public void setInfantFixFollow(String infantFixFollow) {
        this.infantFixFollow = infantFixFollow;
    }

    @Column(name = "infant_facial_expression", length = 2)
    public String getInfantFacialExpression() {
        return infantFacialExpression;
    }

    public void setInfantFacialExpression(String infantFacialExpression) {
        this.infantFacialExpression = infantFacialExpression;
    }

    @Column(name = "infant_smile", length = 2)
    public String getInfantSmile() {
        return infantSmile;
    }

    public void setInfantSmile(String infantSmile) {
        this.infantSmile = infantSmile;
    }

    @Column(name = "infant_ptosis", length = 2)
    public String getInfantPtosis() {
        return infantPtosis;
    }

    public void setInfantPtosis(String infantPtosis) {
        this.infantPtosis = infantPtosis;
    }

    @Column(name = "infant_cataract", length = 2)
    public String getInfantCataract() {
        return infantCataract;
    }

    public void setInfantCataract(String infantCataract) {
        this.infantCataract = infantCataract;
    }

    @Column(name = "infant_other_lens", length = 2)
    public String getInfantOtherLens() {
        return infantOtherLens;
    }

    public void setInfantOtherLens(String infantOtherLens) {
        this.infantOtherLens = infantOtherLens;
    }

    @Column(name = "infant_len_ohter_spec", length = 100)
    public String getInfantLenOhterSpec() {
        return infantLenOhterSpec;
    }

    public void setInfantLenOhterSpec(String infantLenOhterSpec) {
        this.infantLenOhterSpec = infantLenOhterSpec;
    }

    @Column(name = "infant_nystagmus", length = 2)
    public String getInfantNystagmus() {
        return infantNystagmus;
    }

    public void setInfantNystagmus(String infantNystagmus) {
        this.infantNystagmus = infantNystagmus;
    }

    @Column(name = "infant_intra_press", length = 2)
    public String getInfantIntraPress() {
        return infantIntraPress;
    }

    public void setInfantIntraPress(String infantIntraPress) {
        this.infantIntraPress = infantIntraPress;
    }

    @Column(name = "infant_tono_left")
    public Integer getInfantTonoLeft() {
        return infantTonoLeft;
    }

    public void setInfantTonoLeft(Integer infantTonoLeft) {
        this.infantTonoLeft = infantTonoLeft;
    }

    @Column(name = "infant_tono_right")
    public Integer getInfantTonoRight() {
        return infantTonoRight;
    }

    public void setInfantTonoRight(Integer infantTonoRight) {
        this.infantTonoRight = infantTonoRight;
    }

    @Column(name = "infant_focal_specify", length = 100)
    public String getInfantFocalSpecify() {
        return infantFocalSpecify;
    }

    public void setInfantFocalSpecify(String infantFocalSpecify) {
        this.infantFocalSpecify = infantFocalSpecify;
    }

    @Column(name = "infant_abno_vascu", length = 2)
    public String getInfantAbnoVascu() {
        return infantAbnoVascu;
    }

    public void setInfantAbnoVascu(String infantAbnoVascu) {
        this.infantAbnoVascu = infantAbnoVascu;
    }

    @Column(name = "infant_foveal_loss", length = 2)
    public String getInfantFovealLoss() {
        return infantFovealLoss;
    }

    public void setInfantFovealLoss(String infantFovealLoss) {
        this.infantFovealLoss = infantFovealLoss;
    }

    @Column(name = "infant_retina_coloboma", length = 2)
    public String getInfantRetinaColoboma() {
        return infantRetinaColoboma;
    }

    public void setInfantRetinaColoboma(String infantRetinaColoboma) {
        this.infantRetinaColoboma = infantRetinaColoboma;
    }

    @Column(name = "infant_atrophy", length = 2)
    public String getInfantAtrophy() {
        return infantAtrophy;
    }

    public void setInfantAtrophy(String infantAtrophy) {
        this.infantAtrophy = infantAtrophy;
    }

    @Column(name = "infant_coloboma", length = 2)
    public String getInfantColoboma() {
        return infantColoboma;
    }

    public void setInfantColoboma(String infantColoboma) {
        this.infantColoboma = infantColoboma;
    }

    @Column(name = "infant_disc_left")
    public Float getInfantDiscLeft() {
        return infantDiscLeft;
    }

    public void setInfantDiscLeft(Float infantDiscLeft) {
        this.infantDiscLeft = infantDiscLeft;
    }

    @Column(name = "infant_disc_right")
    public Float getInfantDiscRight() {
        return infantDiscRight;
    }

    public void setInfantDiscRight(Float infantDiscRight) {
        this.infantDiscRight = infantDiscRight;
    }

    @Column(name = "infant_hypoplasia", length = 2)
    public String getInfantHypoplasia() {
        return infantHypoplasia;
    }

    public void setInfantHypoplasia(String infantHypoplasia) {
        this.infantHypoplasia = infantHypoplasia;
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
