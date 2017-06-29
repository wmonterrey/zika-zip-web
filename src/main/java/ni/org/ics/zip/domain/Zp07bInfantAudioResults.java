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
@Table(name = "zp07b_infant_audio_results", catalog = "zika_zip")
public class Zp07bInfantAudioResults extends BaseMetaData implements Auditable {

    private String recordId;
    private String redcapEventName;
    private Date infantAudioDate;
    private String infantAudioAir;
    private String infantAr500rt;
    private String infantAr500lft;
    private String infantAr500vra;
    private String infantAr1000rt;
    private String infantAr1000lft;
    private String infantAr1000vra;
    private String infantAr2000rt;
    private String infantAr2000lft;
    private String infantAr2000vra;
    private String infantAr4000rt;
    private String infantAr4000lft;
    private String infantAr4000vra;
    private String infantTransducer;
    private String infantAudioBone;
    private String infantUnmask1;
    private String infantUnmask2;
    private String infantUnmask3;
    private String infantUnmask4;
    private String infantImtanceRt;
    private String infantImrtReas;
    private Float infantImrtMl;
    private String infantImrtDapa;
    private Float infantImrtAdmi;
    private String infantImrtTym;
    private String infantImtanceLt;
    private String infantImltReas;
    private Float infantImltMl;
    private String infantImltDapa;
    private Float infantImltAdmi;
    private String infantImltTym;
    private String infantImltProbe;
    private String infantOe;
    private String infatnOetype;
    private String infantOert;
    private String infantOertRea;
    private String infantOert19;
    private String infantOert29;
    private String infantOert39;
    private String infantOert49;
    private String infantOelt;
    private String infantOeltRea;
    private String infantOelt19;
    private String infantOelt29;
    private String infantOelt39;
    private String infantOelt49;
    private String infantAbr;
    private String infantAb500rt;
    private String infantAb500lt;
    private String infantAb1000rt;
    private String infantAb1000lt;
    private String infantAb2000rt;
    private String infantAb2000lt;
    private String infantEarphone;
    private String infantImpress;
    private String infantTypeRt;
    private String infantTypeLt;
    private String infantTypeSound;
    private String infantExtentRt;
    private String infantExtentLt;
    private String infantExtentSound;
    private String infantConfigRt;
    private String infantConfigLt;
    private String infantConfigSound;
    private String infantExamReliable;
    private String infantRenotReliable;
    private String infantNreliableOther;
    private String infantAutocom;
    private String infantComAudo;
    private String infantAuLne;
    private String infantAuFne;
    private Integer infantAuPhone;
    private String infantAuSignat;
    private Date infantAuDate;
    private String infantAuidCom;
    private Date infantAudtCom;
    private String infantAueyeIdRevi;
    private Date infantAudtRevi;
    private String infantAuidEntry;
    private Date infantAudtEnt;


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

    @Column(name = "infant_audio_date", nullable = false)
    public Date getInfantAudioDate() {
        return infantAudioDate;
    }

    public void setInfantAudioDate(Date infantAudioDate) {
        this.infantAudioDate = infantAudioDate;
    }

    @Column(name = "infant_audio_air", length = 1)
    public String getInfantAudioAir() {
        return infantAudioAir;
    }

    public void setInfantAudioAir(String infantAudioAir) {
        this.infantAudioAir = infantAudioAir;
    }

    @Column(name = "infant_ar500rt", length = 5)
    public String getInfantAr500rt() {
        return infantAr500rt;
    }

    public void setInfantAr500rt(String infantAr500rt) {
        this.infantAr500rt = infantAr500rt;
    }

    @Column(name = "infant_ar500lft", length = 5)
    public String getInfantAr500lft() {
        return infantAr500lft;
    }

    public void setInfantAr500lft(String infantAr500lft) {
        this.infantAr500lft = infantAr500lft;
    }

    @Column(name = "infant_ar500vra", length = 5)
    public String getInfantAr500vra() {
        return infantAr500vra;
    }

    public void setInfantAr500vra(String infantAr500vra) {
        this.infantAr500vra = infantAr500vra;
    }

    @Column(name = "infant_ar1000rt", length = 5)
    public String getInfantAr1000rt() {
        return infantAr1000rt;
    }

    public void setInfantAr1000rt(String infantAr1000rt) {
        this.infantAr1000rt = infantAr1000rt;
    }

    @Column(name = "infant_ar1000lft", length = 5)
    public String getInfantAr1000lft() {
        return infantAr1000lft;
    }

    public void setInfantAr1000lft(String infantAr1000lft) {
        this.infantAr1000lft = infantAr1000lft;
    }

    @Column(name = "infant_ar1000vra", length = 5)
    public String getInfantAr1000vra() {
        return infantAr1000vra;
    }

    public void setInfantAr1000vra(String infantAr1000vra) {
        this.infantAr1000vra = infantAr1000vra;
    }

    @Column(name = "infant_ar2000rt", length = 5)
    public String getInfantAr2000rt() {
        return infantAr2000rt;
    }

    public void setInfantAr2000rt(String infantAr2000rt) {
        this.infantAr2000rt = infantAr2000rt;
    }

    @Column(name = "infant_ar2000lft", length = 5)
    public String getInfantAr2000lft() {
        return infantAr2000lft;
    }

    public void setInfantAr2000lft(String infantAr2000lft) {
        this.infantAr2000lft = infantAr2000lft;
    }

    @Column(name = "infant_ar2000vra", length = 5)
    public String getInfantAr2000vra() {
        return infantAr2000vra;
    }

    public void setInfantAr2000vra(String infantAr2000vra) {
        this.infantAr2000vra = infantAr2000vra;
    }

    @Column(name = "infant_ar4000rt", length = 5)
    public String getInfantAr4000rt() {
        return infantAr4000rt;
    }

    public void setInfantAr4000rt(String infantAr4000rt) {
        this.infantAr4000rt = infantAr4000rt;
    }

    @Column(name = "infant_ar4000lft", length = 5)
    public String getInfantAr4000lft() {
        return infantAr4000lft;
    }

    public void setInfantAr4000lft(String infantAr4000lft) {
        this.infantAr4000lft = infantAr4000lft;
    }

    @Column(name = "infant_ar4000vra", length = 5)
    public String getInfantAr4000vra() {
        return infantAr4000vra;
    }

    public void setInfantAr4000vra(String infantAr4000vra) {
        this.infantAr4000vra = infantAr4000vra;
    }

    @Column(name = "infant_transducer", length = 1)
    public String getInfantTransducer() {
        return infantTransducer;
    }

    public void setInfantTransducer(String infantTransducer) {
        this.infantTransducer = infantTransducer;
    }

    @Column(name = "infant_audio_bone", length = 1)
    public String getInfantAudioBone() {
        return infantAudioBone;
    }

    public void setInfantAudioBone(String infantAudioBone) {
        this.infantAudioBone = infantAudioBone;
    }

    @Column(name = "infant_unmask1", length = 5)
    public String getInfantUnmask1() {
        return infantUnmask1;
    }

    public void setInfantUnmask1(String infantUnmask1) {
        this.infantUnmask1 = infantUnmask1;
    }

    @Column(name = "infant_unmask2", length = 5)
    public String getInfantUnmask2() {
        return infantUnmask2;
    }

    public void setInfantUnmask2(String infantUnmask2) {
        this.infantUnmask2 = infantUnmask2;
    }

    @Column(name = "infant_unmask3", length = 5)
    public String getInfantUnmask3() {
        return infantUnmask3;
    }

    public void setInfantUnmask3(String infantUnmask3) {
        this.infantUnmask3 = infantUnmask3;
    }

    @Column(name = "infant_unmask4", length = 5)
    public String getInfantUnmask4() {
        return infantUnmask4;
    }

    public void setInfantUnmask4(String infantUnmask4) {
        this.infantUnmask4 = infantUnmask4;
    }

    @Column(name = "infant_imtance_rt", length = 1)
    public String getInfantImtanceRt() {
        return infantImtanceRt;
    }

    public void setInfantImtanceRt(String infantImtanceRt) {
        this.infantImtanceRt = infantImtanceRt;
    }

    @Column(name = "infant_imrt_reas", length = 100)
    public String getInfantImrtReas() {
        return infantImrtReas;
    }

    public void setInfantImrtReas(String infantImrtReas) {
        this.infantImrtReas = infantImrtReas;
    }

    @Column(name = "infant_imrt_ml")
    public Float getInfantImrtMl() {
        return infantImrtMl;
    }

    public void setInfantImrtMl(Float infantImrtMl) {
        this.infantImrtMl = infantImrtMl;
    }

    @Column(name = "infant_imrt_dapa", length = 5)
    public String getInfantImrtDapa() {
        return infantImrtDapa;
    }

    public void setInfantImrtDapa(String infantImrtDapa) {
        this.infantImrtDapa = infantImrtDapa;
    }

    @Column(name = "infant_imrt_admi")
    public Float getInfantImrtAdmi() {
        return infantImrtAdmi;
    }

    public void setInfantImrtAdmi(Float infantImrtAdmi) {
        this.infantImrtAdmi = infantImrtAdmi;
    }

    @Column(name = "infant_imrt_tym", length = 5)
    public String getInfantImrtTym() {
        return infantImrtTym;
    }

    public void setInfantImrtTym(String infantImrtTym) {
        this.infantImrtTym = infantImrtTym;
    }

    @Column(name = "infant_imtance_lt", length = 1)
    public String getInfantImtanceLt() {
        return infantImtanceLt;
    }

    public void setInfantImtanceLt(String infantImtanceLt) {
        this.infantImtanceLt = infantImtanceLt;
    }

    @Column(name = "infant_imlt_reas", length = 100)
    public String getInfantImltReas() {
        return infantImltReas;
    }

    public void setInfantImltReas(String infantImltReas) {
        this.infantImltReas = infantImltReas;
    }

    @Column(name = "infant_imlt_ml")
    public Float getInfantImltMl() {
        return infantImltMl;
    }

    public void setInfantImltMl(Float infantImltMl) {
        this.infantImltMl = infantImltMl;
    }

    @Column(name = "infant_imlt_dapa", length = 5)
    public String getInfantImltDapa() {
        return infantImltDapa;
    }

    public void setInfantImltDapa(String infantImltDapa) {
        this.infantImltDapa = infantImltDapa;
    }

    @Column(name = "infant_imlt_admi")
    public Float getInfantImltAdmi() {
        return infantImltAdmi;
    }

    public void setInfantImltAdmi(Float infantImltAdmi) {
        this.infantImltAdmi = infantImltAdmi;
    }

    @Column(name = "infant_imlt_tym", length = 5)
    public String getInfantImltTym() {
        return infantImltTym;
    }

    public void setInfantImltTym(String infantImltTym) {
        this.infantImltTym = infantImltTym;
    }

    @Column(name = "infant_imlt_probe", length = 4)
    public String getInfantImltProbe() {
        return infantImltProbe;
    }

    public void setInfantImltProbe(String infantImltProbe) {
        this.infantImltProbe = infantImltProbe;
    }

    @Column(name = "infant_oe", length = 1)
    public String getInfantOe() {
        return infantOe;
    }

    public void setInfantOe(String infantOe) {
        this.infantOe = infantOe;
    }

    @Column(name = "infatn_oetype", length = 1)
    public String getInfatnOetype() {
        return infatnOetype;
    }

    public void setInfatnOetype(String infatnOetype) {
        this.infatnOetype = infatnOetype;
    }

    @Column(name = "infant_oert", length = 1)
    public String getInfantOert() {
        return infantOert;
    }

    public void setInfantOert(String infantOert) {
        this.infantOert = infantOert;
    }

    @Column(name = "infant_oert_rea", length = 100)
    public String getInfantOertRea() {
        return infantOertRea;
    }

    public void setInfantOertRea(String infantOertRea) {
        this.infantOertRea = infantOertRea;
    }

    @Column(name = "infant_oert_19", length = 1)
    public String getInfantOert19() {
        return infantOert19;
    }

    public void setInfantOert19(String infantOert19) {
        this.infantOert19 = infantOert19;
    }

    @Column(name = "infant_oert_29", length = 1)
    public String getInfantOert29() {
        return infantOert29;
    }

    public void setInfantOert29(String infantOert29) {
        this.infantOert29 = infantOert29;
    }

    @Column(name = "infant_oert_39", length = 1)
    public String getInfantOert39() {
        return infantOert39;
    }

    public void setInfantOert39(String infantOert39) {
        this.infantOert39 = infantOert39;
    }

    @Column(name = "infant_oert_49", length = 1)
    public String getInfantOert49() {
        return infantOert49;
    }

    public void setInfantOert49(String infantOert49) {
        this.infantOert49 = infantOert49;
    }

    @Column(name = "infant_oelt", length = 1)
    public String getInfantOelt() {
        return infantOelt;
    }

    public void setInfantOelt(String infantOelt) {
        this.infantOelt = infantOelt;
    }

    @Column(name = "infant_oelt_rea", length = 100)
    public String getInfantOeltRea() {
        return infantOeltRea;
    }

    public void setInfantOeltRea(String infantOeltRea) {
        this.infantOeltRea = infantOeltRea;
    }

    @Column(name = "infant_oelt_19", length = 1)
    public String getInfantOelt19() {
        return infantOelt19;
    }

    public void setInfantOelt19(String infantOelt19) {
        this.infantOelt19 = infantOelt19;
    }

    @Column(name = "infant_oelt_29", length = 1)
    public String getInfantOelt29() {
        return infantOelt29;
    }

    public void setInfantOelt29(String infantOelt29) {
        this.infantOelt29 = infantOelt29;
    }

    @Column(name = "infant_oelt_39", length = 1)
    public String getInfantOelt39() {
        return infantOelt39;
    }

    public void setInfantOelt39(String infantOelt39) {
        this.infantOelt39 = infantOelt39;
    }

    @Column(name = "infant_oelt_49", length = 1)
    public String getInfantOelt49() {
        return infantOelt49;
    }

    public void setInfantOelt49(String infantOelt49) {
        this.infantOelt49 = infantOelt49;
    }


    @Column(name = "infant_abr", length = 1)
    public String getInfantAbr() {
        return infantAbr;
    }

    public void setInfantAbr(String infantAbr) {
        this.infantAbr = infantAbr;
    }

    @Column(name = "infant_ab500rt", length = 5)
    public String getInfantAb500rt() {
        return infantAb500rt;
    }

    public void setInfantAb500rt(String infantAb500rt) {
        this.infantAb500rt = infantAb500rt;
    }

    @Column(name = "infant_ab500lt", length = 5)
    public String getInfantAb500lt() {
        return infantAb500lt;
    }

    public void setInfantAb500lt(String infantAb500lt) {
        this.infantAb500lt = infantAb500lt;
    }

    @Column(name = "infant_ab1000rt", length = 5)
    public String getInfantAb1000rt() {
        return infantAb1000rt;
    }

    public void setInfantAb1000rt(String infantAb1000rt) {
        this.infantAb1000rt = infantAb1000rt;
    }

    @Column(name = "infant_ab1000lt", length = 5)
    public String getInfantAb1000lt() {
        return infantAb1000lt;
    }

    public void setInfantAb1000lt(String infantAb1000lt) {
        this.infantAb1000lt = infantAb1000lt;
    }

    @Column(name = "infant_ab2000rt", length = 5)
    public String getInfantAb2000rt() {
        return infantAb2000rt;
    }

    public void setInfantAb2000rt(String infantAb2000rt) {
        this.infantAb2000rt = infantAb2000rt;
    }

    @Column(name = "infant_ab2000lt", length = 5)
    public String getInfantAb2000lt() {
        return infantAb2000lt;
    }

    public void setInfantAb2000lt(String infantAb2000lt) {
        this.infantAb2000lt = infantAb2000lt;
    }

    @Column(name = "infant_earphone", length = 1)
    public String getInfantEarphone() {
        return infantEarphone;
    }

    public void setInfantEarphone(String infantEarphone) {
        this.infantEarphone = infantEarphone;
    }

    @Column(name = "infant_impress", length = 1)
    public String getInfantImpress() {
        return infantImpress;
    }

    public void setInfantImpress(String infantImpress) {
        this.infantImpress = infantImpress;
    }

    @Column(name = "infant_type_rt", length = 1)
    public String getInfantTypeRt() {
        return infantTypeRt;
    }

    public void setInfantTypeRt(String infantTypeRt) {
        this.infantTypeRt = infantTypeRt;
    }

    @Column(name = "infant_type_lt", length = 1)
    public String getInfantTypeLt() {
        return infantTypeLt;
    }

    public void setInfantTypeLt(String infantTypeLt) {
        this.infantTypeLt = infantTypeLt;
    }

    @Column(name = "infant_type_sound", length = 1)
    public String getInfantTypeSound() {
        return infantTypeSound;
    }

    public void setInfantTypeSound(String infantTypeSound) {
        this.infantTypeSound = infantTypeSound;
    }

    @Column(name = "infant_extent_rt", length = 1)
    public String getInfantExtentRt() {
        return infantExtentRt;
    }

    public void setInfantExtentRt(String infantExtentRt) {
        this.infantExtentRt = infantExtentRt;
    }

    @Column(name = "infant_extent_lt", length = 1)
    public String getInfantExtentLt() {
        return infantExtentLt;
    }

    public void setInfantExtentLt(String infantExtentLt) {
        this.infantExtentLt = infantExtentLt;
    }

    @Column(name = "infant_extent_sound", length = 1)
    public String getInfantExtentSound() {
        return infantExtentSound;
    }

    public void setInfantExtentSound(String infantExtentSound) {
        this.infantExtentSound = infantExtentSound;
    }

    @Column(name = "infant_config_rt", length = 1)
    public String getInfantConfigRt() {
        return infantConfigRt;
    }

    public void setInfantConfigRt(String infantConfigRt) {
        this.infantConfigRt = infantConfigRt;
    }

    @Column(name = "infant_config_lt", length = 1)
    public String getInfantConfigLt() {
        return infantConfigLt;
    }

    public void setInfantConfigLt(String infantConfigLt) {
        this.infantConfigLt = infantConfigLt;
    }

    @Column(name = "infant_config_sound", length = 1)
    public String getInfantConfigSound() {
        return infantConfigSound;
    }

    public void setInfantConfigSound(String infantConfigSound) {
        this.infantConfigSound = infantConfigSound;
    }

    @Column(name = "infant_exam_reliable", length = 1)
    public String getInfantExamReliable() {
        return infantExamReliable;
    }

    public void setInfantExamReliable(String infantExamReliable) {
        this.infantExamReliable = infantExamReliable;
    }

    @Column(name = "infant_renot_reliable", length = 1)
    public String getInfantRenotReliable() {
        return infantRenotReliable;
    }

    public void setInfantRenotReliable(String infantRenotReliable) {
        this.infantRenotReliable = infantRenotReliable;
    }

    @Column(name = "infant_nreliable_other", length = 100)
    public String getInfantNreliableOther() {
        return infantNreliableOther;
    }

    public void setInfantNreliableOther(String infantNreliableOther) {
        this.infantNreliableOther = infantNreliableOther;
    }

    @Column(name = "infant_autocom", length = 1)
    public String getInfantAutocom() {
        return infantAutocom;
    }

    public void setInfantAutocom(String infantAutocom) {
        this.infantAutocom = infantAutocom;
    }

    @Column(name = "infant_com_audo", length = 100)
    public String getInfantComAudo() {
        return infantComAudo;
    }

    public void setInfantComAudo(String infantComAudo) {
        this.infantComAudo = infantComAudo;
    }

    @Column(name = "infant_au_lne", length = 100)
    public String getInfantAuLne() {
        return infantAuLne;
    }

    public void setInfantAuLne(String infantAuLne) {
        this.infantAuLne = infantAuLne;
    }

    @Column(name = "infant_au_fne", length = 100)
    public String getInfantAuFne() {
        return infantAuFne;
    }

    public void setInfantAuFne(String infantAuFne) {
        this.infantAuFne = infantAuFne;
    }

    @Column(name = "infant_au_phone")
    public Integer getInfantAuPhone() {
        return infantAuPhone;
    }

    public void setInfantAuPhone(Integer infantAuPhone) {
        this.infantAuPhone = infantAuPhone;
    }

    @Column(name = "infant_au_signat", length = 100)
    public String getInfantAuSignat() {
        return infantAuSignat;
    }

    public void setInfantAuSignat(String infantAuSignat) {
        this.infantAuSignat = infantAuSignat;
    }

    @Column(name = "infant_au_date")
    public Date getInfantAuDate() {
        return infantAuDate;
    }

    public void setInfantAuDate(Date infantAuDate) {
        this.infantAuDate = infantAuDate;
    }

    @Column(name = "infant_auid_com", length = 50)
    public String getInfantAuidCom() {
        return infantAuidCom;
    }

    public void setInfantAuidCom(String infantAuidCom) {
        this.infantAuidCom = infantAuidCom;
    }

    @Column(name = "infant_audt_com")
    public Date getInfantAudtCom() {
        return infantAudtCom;
    }

    public void setInfantAudtCom(Date infantAudtCom) {
        this.infantAudtCom = infantAudtCom;
    }

    @Column(name = "infant_aueye_id_revi", length = 50)
    public String getInfantAueyeIdRevi() {
        return infantAueyeIdRevi;
    }

    public void setInfantAueyeIdRevi(String infantAueyeIdRevi) {
        this.infantAueyeIdRevi = infantAueyeIdRevi;
    }

    @Column(name = "infant_audt_revi")
    public Date getInfantAudtRevi() {
        return infantAudtRevi;
    }

    public void setInfantAudtRevi(Date infantAudtRevi) {
        this.infantAudtRevi = infantAudtRevi;
    }

    @Column(name = "infant_auid_entry", length = 50)
    public String getInfantAuidEntry() {
        return infantAuidEntry;
    }

    public void setInfantAuidEntry(String infantAuidEntry) {
        this.infantAuidEntry = infantAuidEntry;
    }

    @Column(name = "infant_audt_ent")
    public Date getInfantAudtEnt() {
        return infantAudtEnt;
    }

    public void setInfantAudtEnt(Date infantAudtEnt) {
        this.infantAudtEnt = infantAudtEnt;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "ZP07b{" + recordId + ", " + redcapEventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zp07bInfantAudioResults)) return false;

        Zp07bInfantAudioResults that = (Zp07bInfantAudioResults) o;

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
