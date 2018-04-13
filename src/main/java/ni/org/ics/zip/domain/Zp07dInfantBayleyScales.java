package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ics on 1/6/2017.
 */
@Entity
@Table(name = "zp07d_bayley_scales", catalog = "zika_zip")
public class Zp07dInfantBayleyScales extends BaseMetaData implements Auditable {

    private String recordId;
    private String redcapEventName;
    private Date infantVisitdt;
    private String infantDone;
    private String infantReaNot;
    private String infantNreaOther;
    private Date infantPerfdt;
    private String infantEnglish;
    private String infantPrilanguage;
    private String infantParentlan;
    private String infantBayenglish;
    private String infantMed;
    private String infantMedDay;
    private String infantTypMed;
    private String infantCoguAttem;
    private String infantCograScore;
    private String infantCogscScore;
    private String infantCogcoScore;
    private String infantCogValid;
    private String infantReaInvali;
    private String infantInvaOther;
    private String infantResAtte;
    private String infantRetoScore;
    private String infantRescScore;
    private String infantExsuAtte;
    private String infantExtoScore;
    private String infantExscScore;
    private String infantSuScore;
    private String infantSucomScore;
    private String infantLangValid;
    private String infantRelanInvalid;
    private String infantRelanOther;
    private String infantFmsAtte;
    private String infantFmtoScore;
    private String infantFmscScore;
    private String infantGmsuattm;
    private String infantGmtoScore;
    private String infantGmscScore;
    private String infantMssuScore;
    private String infantMscoscore;
    private String infantMtValid;
    private String infantMtInvalid;
    private String infantMtinvOther;
    private String infantSesAtte;
    private String infantSetoSore;
    private String infantSescScre;
    private String infantSecoScre;
    private String infantSemoValid;
    private String infantSemoInvalid;
    private String infantSemoinvOther;
    private String infantCog76;
    private String infantCircuEvalu;
    private String infantExplain;
    private String infantBaidCom;
    private Date infantBadtCom;
    private String infantBaeyeIdRevi;
    private Date infantBadtRevi;
    private String infantBaidEntry;
    private Date infantBadtEnt;

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

    @Column(name = "infant_visitdt", nullable = false)
    public Date getInfantVisitdt() {
        return infantVisitdt;
    }

    public void setInfantVisitdt(Date infantVisitdt) {
        this.infantVisitdt = infantVisitdt;
    }

    @Column(name = "infant_done", length = 1)
    public String getInfantDone() {
        return infantDone;
    }

    public void setInfantDone(String infantDone) {
        this.infantDone = infantDone;
    }

    @Column(name = "infant_rea_not", length = 100)
    public String getInfantReaNot() {
        return infantReaNot;
    }

    public void setInfantReaNot(String infantReaNot) {
        this.infantReaNot = infantReaNot;
    }

    @Column(name = "infant_nrea_other", length = 1)
    public String getInfantNreaOther() {
        return infantNreaOther;
    }

    public void setInfantNreaOther(String infantNreaOther) {
        this.infantNreaOther = infantNreaOther;
    }

    @Column(name = "infant_perfdt")
    public Date getInfantPerfdt() {
        return infantPerfdt;
    }

    public void setInfantPerfdt(Date infantPerfdt) {
        this.infantPerfdt = infantPerfdt;
    }

    @Column(name = "infant_english", length = 1)
    public String getInfantEnglish() {
        return infantEnglish;
    }

    public void setInfantEnglish(String infantEnglish) {
        this.infantEnglish = infantEnglish;
    }

    @Column(name = "infant_prilanguage", length = 50)
    public String getInfantPrilanguage() {
        return infantPrilanguage;
    }

    public void setInfantPrilanguage(String infantPrilanguage) {
        this.infantPrilanguage = infantPrilanguage;
    }

    @Column(name = "infant_parentlan", length = 50)
    public String getInfantParentlan() {
        return infantParentlan;
    }

    public void setInfantParentlan(String infantParentlan) {
        this.infantParentlan = infantParentlan;
    }

    @Column(name = "infant_bayenglish", length = 1)
    public String getInfantBayenglish() {
        return infantBayenglish;
    }

    public void setInfantBayenglish(String infantBayenglish) {
        this.infantBayenglish = infantBayenglish;
    }

    @Column(name = "infant_med", length = 1)
    public String getInfantMed() {
        return infantMed;
    }

    public void setInfantMed(String infantMed) {
        this.infantMed = infantMed;
    }

    @Column(name = "infant_med_day", length = 1)
    public String getInfantMedDay() {
        return infantMedDay;
    }

    public void setInfantMedDay(String infantMedDay) {
        this.infantMedDay = infantMedDay;
    }

    @Column(name = "infant_typ_med", length = 50)
    public String getInfantTypMed() {
        return infantTypMed;
    }

    public void setInfantTypMed(String infantTypMed) {
        this.infantTypMed = infantTypMed;
    }

    @Column(name = "infant_cogu_attem", length = 1)
    public String getInfantCoguAttem() {
        return infantCoguAttem;
    }

    public void setInfantCoguAttem(String infantCoguAttem) {
        this.infantCoguAttem = infantCoguAttem;
    }

    @Column(name = "infant_cogra_score", length = 3)
    public String getInfantCograScore() {
        return infantCograScore;
    }

    public void setInfantCograScore(String infantCograScore) {
        this.infantCograScore = infantCograScore;
    }

    @Column(name = "infant_cogsc_score", length = 2)
    public String getInfantCogscScore() {
        return infantCogscScore;
    }

    public void setInfantCogscScore(String infantCogscScore) {
        this.infantCogscScore = infantCogscScore;
    }

    @Column(name = "infant_cogco_score", length = 3)
    public String getInfantCogcoScore() {
        return infantCogcoScore;
    }

    public void setInfantCogcoScore(String infantCogcoScore) {
        this.infantCogcoScore = infantCogcoScore;
    }

    @Column(name = "infant_cog_valid", length = 1)
    public String getInfantCogValid() {
        return infantCogValid;
    }

    public void setInfantCogValid(String infantCogValid) {
        this.infantCogValid = infantCogValid;
    }

    @Column(name = "infant_rea_invali", length = 1)
    public String getInfantReaInvali() {
        return infantReaInvali;
    }

    public void setInfantReaInvali(String infantReaInvali) {
        this.infantReaInvali = infantReaInvali;
    }

    @Column(name = "infant_inva_other", length = 100)
    public String getInfantInvaOther() {
        return infantInvaOther;
    }

    public void setInfantInvaOther(String infantInvaOther) {
        this.infantInvaOther = infantInvaOther;
    }

    @Column(name = "infant_res_atte", length = 1)
    public String getInfantResAtte() {
        return infantResAtte;
    }

    public void setInfantResAtte(String infantResAtte) {
        this.infantResAtte = infantResAtte;
    }

    @Column(name = "infant_reto_score", length = 3)
    public String getInfantRetoScore() {
        return infantRetoScore;
    }

    public void setInfantRetoScore(String infantRetoScore) {
        this.infantRetoScore = infantRetoScore;
    }

    @Column(name = "infant_resc_score", length = 2)
    public String getInfantRescScore() {
        return infantRescScore;
    }

    public void setInfantRescScore(String infantRescScore) {
        this.infantRescScore = infantRescScore;
    }

    @Column(name = "infant_exsu_atte", length = 1)
    public String getInfantExsuAtte() {
        return infantExsuAtte;
    }

    public void setInfantExsuAtte(String infantExsuAtte) {
        this.infantExsuAtte = infantExsuAtte;
    }

    @Column(name = "infant_exto_score", length = 3)
    public String getInfantExtoScore() {
        return infantExtoScore;
    }

    public void setInfantExtoScore(String infantExtoScore) {
        this.infantExtoScore = infantExtoScore;
    }

    @Column(name = "infant_exsc_score", length = 2)
    public String getInfantExscScore() {
        return infantExscScore;
    }

    public void setInfantExscScore(String infantExscScore) {
        this.infantExscScore = infantExscScore;
    }

    @Column(name = "infant_su_score", length = 2)
    public String getInfantSuScore() {
        return infantSuScore;
    }

    public void setInfantSuScore(String infantSuScore) {
        this.infantSuScore = infantSuScore;
    }

    @Column(name = "infant_sucom_score", length = 3)
    public String getInfantSucomScore() {
        return infantSucomScore;
    }

    public void setInfantSucomScore(String infantSucomScore) {
        this.infantSucomScore = infantSucomScore;
    }

    @Column(name = "infant_lang_valid", length = 1)
    public String getInfantLangValid() {
        return infantLangValid;
    }

    public void setInfantLangValid(String infantLangValid) {
        this.infantLangValid = infantLangValid;
    }

    @Column(name = "infant_relan_invalid", length = 1)
    public String getInfantRelanInvalid() {
        return infantRelanInvalid;
    }

    public void setInfantRelanInvalid(String infantRelanInvalid) {
        this.infantRelanInvalid = infantRelanInvalid;
    }

    @Column(name = "infant_relan_other", length = 100)
    public String getInfantRelanOther() {
        return infantRelanOther;
    }

    public void setInfantRelanOther(String infantRelanOther) {
        this.infantRelanOther = infantRelanOther;
    }

    @Column(name = "infant_fms_atte", length = 1)
    public String getInfantFmsAtte() {
        return infantFmsAtte;
    }

    public void setInfantFmsAtte(String infantFmsAtte) {
        this.infantFmsAtte = infantFmsAtte;
    }

    @Column(name = "infant_fmto_score", length = 3)
    public String getInfantFmtoScore() {
        return infantFmtoScore;
    }

    public void setInfantFmtoScore(String infantFmtoScore) {
        this.infantFmtoScore = infantFmtoScore;
    }

    @Column(name = "infant_fmsc_score", length = 2)
    public String getInfantFmscScore() {
        return infantFmscScore;
    }

    public void setInfantFmscScore(String infantFmscScore) {
        this.infantFmscScore = infantFmscScore;
    }

    @Column(name = "infant_gmsuattm", length = 1)
    public String getInfantGmsuattm() {
        return infantGmsuattm;
    }

    public void setInfantGmsuattm(String infantGmsuattm) {
        this.infantGmsuattm = infantGmsuattm;
    }

    @Column(name = "infant_gmto_score", length = 3)
    public String getInfantGmtoScore() {
        return infantGmtoScore;
    }

    public void setInfantGmtoScore(String infantGmtoScore) {
        this.infantGmtoScore = infantGmtoScore;
    }

    @Column(name = "infant_gmsc_score", length = 2)
    public String getInfantGmscScore() {
        return infantGmscScore;
    }

    public void setInfantGmscScore(String infantGmscScore) {
        this.infantGmscScore = infantGmscScore;
    }

    @Column(name = "infant_mssu_score", length = 2)
    public String getInfantMssuScore() {
        return infantMssuScore;
    }

    public void setInfantMssuScore(String infantMssuScore) {
        this.infantMssuScore = infantMssuScore;
    }

    @Column(name = "infant_mscoscore", length = 3)
    public String getInfantMscoscore() {
        return infantMscoscore;
    }

    public void setInfantMscoscore(String infantMscoscore) {
        this.infantMscoscore = infantMscoscore;
    }

    @Column(name = "infant_mt_valid", length = 1)
    public String getInfantMtValid() {
        return infantMtValid;
    }

    public void setInfantMtValid(String infantMtValid) {
        this.infantMtValid = infantMtValid;
    }

    @Column(name = "infant_mt_invalid", length = 1)
    public String getInfantMtInvalid() {
        return infantMtInvalid;
    }

    public void setInfantMtInvalid(String infantMtInvalid) {
        this.infantMtInvalid = infantMtInvalid;
    }

    @Column(name = "infant_mtinv_other", length = 100)
    public String getInfantMtinvOther() {
        return infantMtinvOther;
    }

    public void setInfantMtinvOther(String infantMtinvOther) {
        this.infantMtinvOther = infantMtinvOther;
    }

    @Column(name = "infant_ses_atte", length = 1)
    public String getInfantSesAtte() {
        return infantSesAtte;
    }

    public void setInfantSesAtte(String infantSesAtte) {
        this.infantSesAtte = infantSesAtte;
    }

    @Column(name = "infant_seto_sore", length = 3)
    public String getInfantSetoSore() {
        return infantSetoSore;
    }

    public void setInfantSetoSore(String infantSetoSore) {
        this.infantSetoSore = infantSetoSore;
    }

    @Column(name = "infant_sesc_scre", length = 2)
    public String getInfantSescScre() {
        return infantSescScre;
    }

    public void setInfantSescScre(String infantSescScre) {
        this.infantSescScre = infantSescScre;
    }

    @Column(name = "infant_seco_scre", length = 3)
    public String getInfantSecoScre() {
        return infantSecoScre;
    }

    public void setInfantSecoScre(String infantSecoScre) {
        this.infantSecoScre = infantSecoScre;
    }

    @Column(name = "infant_semo_valid", length = 1)
    public String getInfantSemoValid() {
        return infantSemoValid;
    }

    public void setInfantSemoValid(String infantSemoValid) {
        this.infantSemoValid = infantSemoValid;
    }

    @Column(name = "infant_semo_invalid", length = 1)
    public String getInfantSemoInvalid() {
        return infantSemoInvalid;
    }

    public void setInfantSemoInvalid(String infantSemoInvalid) {
        this.infantSemoInvalid = infantSemoInvalid;
    }

    @Column(name = "infant_semoinv_other", length = 100)
    public String getInfantSemoinvOther() {
        return infantSemoinvOther;
    }

    public void setInfantSemoinvOther(String infantSemoinvOther) {
        this.infantSemoinvOther = infantSemoinvOther;
    }

    @Column(name = "infant_cog_76", length = 1)
    public String getInfantCog76() {
        return infantCog76;
    }

    public void setInfantCog76(String infantCog76) {
        this.infantCog76 = infantCog76;
    }

    @Column(name = "infant_circu_evalu", length = 1)
    public String getInfantCircuEvalu() {
        return infantCircuEvalu;
    }

    public void setInfantCircuEvalu(String infantCircuEvalu) {
        this.infantCircuEvalu = infantCircuEvalu;
    }

    @Column(name = "infant_explain", length = 100)
    public String getInfantExplain() {
        return infantExplain;
    }

    public void setInfantExplain(String infantExplain) {
        this.infantExplain = infantExplain;
    }

    @Column(name = "infant_baid_com", length = 50)
    public String getInfantBaidCom() {
        return infantBaidCom;
    }

    public void setInfantBaidCom(String infantBaidCom) {
        this.infantBaidCom = infantBaidCom;
    }

    @Column(name = "infant_badt_com")
    public Date getInfantBadtCom() {
        return infantBadtCom;
    }

    public void setInfantBadtCom(Date infantBadtCom) {
        this.infantBadtCom = infantBadtCom;
    }

    @Column(name = "infant_baeye_id_revi", length = 50)
    public String getInfantBaeyeIdRevi() {
        return infantBaeyeIdRevi;
    }

    public void setInfantBaeyeIdRevi(String infantBaeyeIdRevi) {
        this.infantBaeyeIdRevi = infantBaeyeIdRevi;
    }

    @Column(name = "infant_badt_revi")
    public Date getInfantBadtRevi() {
        return infantBadtRevi;
    }

    public void setInfantBadtRevi(Date infantBadtRevi) {
        this.infantBadtRevi = infantBadtRevi;
    }

    @Column(name = "infant_baid_entry", length = 50)
    public String getInfantBaidEntry() {
        return infantBaidEntry;
    }

    public void setInfantBaidEntry(String infantBaidEntry) {
        this.infantBaidEntry = infantBaidEntry;
    }

    @Column(name = "infant_badt_ent")
    public Date getInfantBadtEnt() {
        return infantBadtEnt;
    }

    public void setInfantBadtEnt(Date infantBadtEnt) {
        this.infantBadtEnt = infantBadtEnt;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "ZP07d{" + recordId + ", " + redcapEventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zp07dInfantBayleyScales)) return false;

        Zp07dInfantBayleyScales that = (Zp07dInfantBayleyScales) o;

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
