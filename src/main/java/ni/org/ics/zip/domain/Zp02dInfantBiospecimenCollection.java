package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Entity
@Table(name="zp02d_infant_biospecimen_collection", catalog = "zika_zip")
public class Zp02dInfantBiospecimenCollection extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private Date infantDov;
    private String whomAddtVisit;
    private String infantAddtVisit;
    private String infantAddtVisitOther;
    private String infantMatBldCol;
    private String infantMatBldRsn;
    private String infantMatBldSpecify;
    private String infantMatBldTyp1;
    private String infantMatBldId1;
    private Integer infantMatBldVol1;
    private String infantMatBldTyp2;
    private String infantMatBldId2;
    private Integer infantMatBldVol2;
    private String infantMatBldTyp3;
    private String infantMatBldId3;
    private Integer infantMatBldVol3;
    private String infantMatBldTyp4;
    private String infantMatBldId4;
    private Integer infantMatBldVol4;
    private String infantMatBldTyp5;
    private String infantMatBldId5;
    private Integer infantMatBldVol5;
    private String infantMatBldTyp6;
    private String infantMatBldId6;
    private Integer infantMatBldVol6;
    private String infantMatBldTyp7;
    private String infantMatBldId7;
    private Integer infantMatBldVol7;
    private String infantMatBldTyp8;
    private String infantMatBldId8;
    private Integer infantMatBldVol8;
    private Integer infantMatBldTotVol;
    private String infantMatBldTime;
    private String infantMatBldCom;
    private String infantMatSlvaCol;
    private String infantMatSlvaRsn;
    private String infantMatSlvaSpecify;
    private String infantMatSlvaId;
    private String infantMatSlvaTime;
    private String infantMatSlvaCom;
    private String infantMatVstUrnCol;
    private String infantMatVstUrnRsn;
    private String infantMatVstUrnSpecify;
    private String infantMatVstUrnId;
    private String infantMatVstUrnTime;
    private String infantMatVstUrnCom;
    private String infantPerson1;
    private Date infantCompleteDate1;
    private String infantPerson2;
    private Date infantCompleteDate2;
    private String infantPerson3;
    private Date infantCompleteDate3;

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

    @Column(name = "infant_dov", nullable = true)
    public Date getInfantDov() {
        return infantDov;
    }

    public void setInfantDov(Date infantDov) {
        this.infantDov = infantDov;
    }

    @Column(name = "whom_addt_visit", nullable = true, length = 1)
    public String getWhomAddtVisit() {
        return whomAddtVisit;
    }

    public void setWhomAddtVisit(String whomAddtVisit) {
        this.whomAddtVisit = whomAddtVisit;
    }

    @Column(name = "infant_addt_visit", nullable = true, length = 1)
    public String getInfantAddtVisit() {
        return infantAddtVisit;
    }

    public void setInfantAddtVisit(String infantAddtVisit) {
        this.infantAddtVisit = infantAddtVisit;
    }

    @Column(name = "infant_addt_visit_other", nullable = true)
    public String getInfantAddtVisitOther() {
        return infantAddtVisitOther;
    }

    public void setInfantAddtVisitOther(String infantAddtVisitOther) {
        this.infantAddtVisitOther = infantAddtVisitOther;
    }

    @Column(name = "infant_mat_bld_col", nullable = true, length = 1)
    public String getInfantMatBldCol() {
        return infantMatBldCol;
    }

    public void setInfantMatBldCol(String infantMatBldCol) {
        this.infantMatBldCol = infantMatBldCol;
    }

    @Column(name = "infant_mat_bld_rsn", nullable = true, length = 1)
    public String getInfantMatBldRsn() {
        return infantMatBldRsn;
    }

    public void setInfantMatBldRsn(String infantMatBldRsn) {
        this.infantMatBldRsn = infantMatBldRsn;
    }

    @Column(name = "infant_mat_bld_specify", nullable = true)
    public String getInfantMatBldSpecify() {
        return infantMatBldSpecify;
    }

    public void setInfantMatBldSpecify(String infantMatBldSpecify) {
        this.infantMatBldSpecify = infantMatBldSpecify;
    }

    @Column(name = "infant_mat_bld_typ_1", nullable = true, length = 1)
    public String getInfantMatBldTyp1() {
        return infantMatBldTyp1;
    }

    public void setInfantMatBldTyp1(String infantMatBldTyp1) {
        this.infantMatBldTyp1 = infantMatBldTyp1;
    }

    @Column(name = "infant_mat_bld_id_1", nullable = true, length = 25)
    public String getInfantMatBldId1() {
        return infantMatBldId1;
    }

    public void setInfantMatBldId1(String infantMatBldId1) {
        this.infantMatBldId1 = infantMatBldId1;
    }

    @Column(name = "infant_mat_bld_vol_1", nullable = true)
    public Integer getInfantMatBldVol1() {
        return infantMatBldVol1;
    }

    public void setInfantMatBldVol1(Integer infantMatBldVol1) {
        this.infantMatBldVol1 = infantMatBldVol1;
    }

    @Column(name = "infant_mat_bld_typ_2", nullable = true, length = 1)
    public String getInfantMatBldTyp2() {
        return infantMatBldTyp2;
    }

    public void setInfantMatBldTyp2(String infantMatBldTyp2) {
        this.infantMatBldTyp2 = infantMatBldTyp2;
    }

    @Column(name = "infant_mat_bld_id_2", nullable = true, length = 25)
    public String getInfantMatBldId2() {
        return infantMatBldId2;
    }

    public void setInfantMatBldId2(String infantMatBldId2) {
        this.infantMatBldId2 = infantMatBldId2;
    }

    @Column(name = "infant_mat_bld_vol_2", nullable = true)
    public Integer getInfantMatBldVol2() {
        return infantMatBldVol2;
    }

    public void setInfantMatBldVol2(Integer infantMatBldVol2) {
        this.infantMatBldVol2 = infantMatBldVol2;
    }

    @Column(name = "infant_mat_bld_typ_3", nullable = true, length = 1)
    public String getInfantMatBldTyp3() {
        return infantMatBldTyp3;
    }

    public void setInfantMatBldTyp3(String infantMatBldTyp3) {
        this.infantMatBldTyp3 = infantMatBldTyp3;
    }

    @Column(name = "infant_mat_bld_id_3", nullable = true, length = 25)
    public String getInfantMatBldId3() {
        return infantMatBldId3;
    }

    public void setInfantMatBldId3(String infantMatBldId3) {
        this.infantMatBldId3 = infantMatBldId3;
    }

    @Column(name = "infant_mat_bld_vol_3", nullable = true)
    public Integer getInfantMatBldVol3() {
        return infantMatBldVol3;
    }

    public void setInfantMatBldVol3(Integer infantMatBldVol3) {
        this.infantMatBldVol3 = infantMatBldVol3;
    }

    @Column(name = "infant_mat_bld_typ_4", nullable = true, length = 1)
    public String getInfantMatBldTyp4() {
        return infantMatBldTyp4;
    }

    public void setInfantMatBldTyp4(String infantMatBldTyp4) {
        this.infantMatBldTyp4 = infantMatBldTyp4;
    }

    @Column(name = "infant_mat_bld_id_4", nullable = true, length = 25)
    public String getInfantMatBldId4() {
        return infantMatBldId4;
    }

    public void setInfantMatBldId4(String infantMatBldId4) {
        this.infantMatBldId4 = infantMatBldId4;
    }

    @Column(name = "infant_mat_bld_vol_4", nullable = true)
    public Integer getInfantMatBldVol4() {
        return infantMatBldVol4;
    }

    public void setInfantMatBldVol4(Integer infantMatBldVol4) {
        this.infantMatBldVol4 = infantMatBldVol4;
    }

    @Column(name = "infant_mat_bld_typ_5", nullable = true, length = 1)
    public String getInfantMatBldTyp5() {
        return infantMatBldTyp5;
    }

    public void setInfantMatBldTyp5(String infantMatBldTyp5) {
        this.infantMatBldTyp5 = infantMatBldTyp5;
    }

    @Column(name = "infant_mat_bld_id_5", nullable = true, length = 25)
    public String getInfantMatBldId5() {
        return infantMatBldId5;
    }

    public void setInfantMatBldId5(String infantMatBldId5) {
        this.infantMatBldId5 = infantMatBldId5;
    }

    @Column(name = "infant_mat_bld_vol_5", nullable = true)
    public Integer getInfantMatBldVol5() {
        return infantMatBldVol5;
    }

    public void setInfantMatBldVol5(Integer infantMatBldVol5) {
        this.infantMatBldVol5 = infantMatBldVol5;
    }

    @Column(name = "infant_mat_bld_typ_6", nullable = true, length = 1)
    public String getInfantMatBldTyp6() {
        return infantMatBldTyp6;
    }

    public void setInfantMatBldTyp6(String infantMatBldTyp6) {
        this.infantMatBldTyp6 = infantMatBldTyp6;
    }

    @Column(name = "infant_mat_bld_id_6", nullable = true, length = 25)
    public String getInfantMatBldId6() {
        return infantMatBldId6;
    }

    public void setInfantMatBldId6(String infantMatBldId6) {
        this.infantMatBldId6 = infantMatBldId6;
    }

    @Column(name = "infant_mat_bld_vol_6", nullable = true)
    public Integer getInfantMatBldVol6() {
        return infantMatBldVol6;
    }

    public void setInfantMatBldVol6(Integer infantMatBldVol6) {
        this.infantMatBldVol6 = infantMatBldVol6;
    }

    @Column(name = "infant_mat_bld_typ_7", nullable = true, length = 1)
    public String getInfantMatBldTyp7() {
        return infantMatBldTyp7;
    }

    public void setInfantMatBldTyp7(String infantMatBldTyp7) {
        this.infantMatBldTyp7 = infantMatBldTyp7;
    }

    @Column(name = "infant_mat_bld_id_7", nullable = true, length = 25)
    public String getInfantMatBldId7() {
        return infantMatBldId7;
    }

    public void setInfantMatBldId7(String infantMatBldId7) {
        this.infantMatBldId7 = infantMatBldId7;
    }

    @Column(name = "infant_mat_bld_vol_7", nullable = true)
    public Integer getInfantMatBldVol7() {
        return infantMatBldVol7;
    }

    public void setInfantMatBldVol7(Integer infantMatBldVol7) {
        this.infantMatBldVol7 = infantMatBldVol7;
    }

    @Column(name = "infant_mat_bld_typ_8", nullable = true, length = 1)
    public String getInfantMatBldTyp8() {
        return infantMatBldTyp8;
    }

    public void setInfantMatBldTyp8(String infantMatBldTyp8) {
        this.infantMatBldTyp8 = infantMatBldTyp8;
    }

    @Column(name = "infant_mat_bld_id_8", nullable = true, length = 25)
    public String getInfantMatBldId8() {
        return infantMatBldId8;
    }

    public void setInfantMatBldId8(String infantMatBldId8) {
        this.infantMatBldId8 = infantMatBldId8;
    }

    @Column(name = "infant_mat_bld_vol_8", nullable = true)
    public Integer getInfantMatBldVol8() {
        return infantMatBldVol8;
    }

    public void setInfantMatBldVol8(Integer infantMatBldVol8) {
        this.infantMatBldVol8 = infantMatBldVol8;
    }

    @Column(name = "infant_mat_bld_tot_vol", nullable = true)
    public Integer getInfantMatBldTotVol() {
        return infantMatBldTotVol;
    }

    public void setInfantMatBldTotVol(Integer infantMatBldTotVol) {
        this.infantMatBldTotVol = infantMatBldTotVol;
    }

    @Column(name = "infant_mat_bld_time", nullable = true, length = 50)
    public String getInfantMatBldTime() {
        return infantMatBldTime;
    }

    public void setInfantMatBldTime(String infantMatBldTime) {
        this.infantMatBldTime = infantMatBldTime;
    }

    @Column(name = "infant_mat_bld_com", nullable = true)
    public String getInfantMatBldCom() {
        return infantMatBldCom;
    }

    public void setInfantMatBldCom(String infantMatBldCom) {
        this.infantMatBldCom = infantMatBldCom;
    }

    @Column(name = "infant_mat_slva_col", nullable = true, length = 1)
    public String getInfantMatSlvaCol() {
        return infantMatSlvaCol;
    }

    public void setInfantMatSlvaCol(String infantMatSlvaCol) {
        this.infantMatSlvaCol = infantMatSlvaCol;
    }

    @Column(name = "infant_mat_slva_rsn", nullable = true, length = 1)
    public String getInfantMatSlvaRsn() {
        return infantMatSlvaRsn;
    }

    public void setInfantMatSlvaRsn(String infantMatSlvaRsn) {
        this.infantMatSlvaRsn = infantMatSlvaRsn;
    }

    @Column(name = "infant_mat_slva_specify", nullable = true)
    public String getInfantMatSlvaSpecify() {
        return infantMatSlvaSpecify;
    }

    public void setInfantMatSlvaSpecify(String infantMatSlvaSpecify) {
        this.infantMatSlvaSpecify = infantMatSlvaSpecify;
    }

    @Column(name = "infant_mat_slva_id", nullable = true, length = 25)
    public String getInfantMatSlvaId() {
        return infantMatSlvaId;
    }

    public void setInfantMatSlvaId(String infantMatSlvaId) {
        this.infantMatSlvaId = infantMatSlvaId;
    }

    @Column(name = "infant_mat_slva_time", nullable = true, length = 50)
    public String getInfantMatSlvaTime() {
        return infantMatSlvaTime;
    }

    public void setInfantMatSlvaTime(String infantMatSlvaTime) {
        this.infantMatSlvaTime = infantMatSlvaTime;
    }

    @Column(name = "infant_mat_slva_com", nullable = true)
    public String getInfantMatSlvaCom() {
        return infantMatSlvaCom;
    }

    public void setInfantMatSlvaCom(String infantMatSlvaCom) {
        this.infantMatSlvaCom = infantMatSlvaCom;
    }

    @Column(name = "infant_mat_vst_urn_col", nullable = true, length = 1)
    public String getInfantMatVstUrnCol() {
        return infantMatVstUrnCol;
    }

    public void setInfantMatVstUrnCol(String infantMatVstUrnCol) {
        this.infantMatVstUrnCol = infantMatVstUrnCol;
    }

    @Column(name = "infant_mat_vst_urn_rsn", nullable = true, length = 1)
    public String getInfantMatVstUrnRsn() {
        return infantMatVstUrnRsn;
    }

    public void setInfantMatVstUrnRsn(String infantMatVstUrnRsn) {
        this.infantMatVstUrnRsn = infantMatVstUrnRsn;
    }

    @Column(name = "infant_mat_vst_urn_specify", nullable = true)
    public String getInfantMatVstUrnSpecify() {
        return infantMatVstUrnSpecify;
    }

    public void setInfantMatVstUrnSpecify(String infantMatVstUrnSpecify) {
        this.infantMatVstUrnSpecify = infantMatVstUrnSpecify;
    }

    @Column(name = "infant_mat_vst_urn_id", nullable = true, length = 25)
    public String getInfantMatVstUrnId() {
        return infantMatVstUrnId;
    }

    public void setInfantMatVstUrnId(String infantMatVstUrnId) {
        this.infantMatVstUrnId = infantMatVstUrnId;
    }

    @Column(name = "infant_mat_vst_urn_time", nullable = true, length = 50)
    public String getInfantMatVstUrnTime() {
        return infantMatVstUrnTime;
    }

    public void setInfantMatVstUrnTime(String infantMatVstUrnTime) {
        this.infantMatVstUrnTime = infantMatVstUrnTime;
    }

    @Column(name = "infant_mat_vst_urn_com", nullable = true)
    public String getInfantMatVstUrnCom() {
        return infantMatVstUrnCom;
    }

    public void setInfantMatVstUrnCom(String infantMatVstUrnCom) {
        this.infantMatVstUrnCom = infantMatVstUrnCom;
    }

    @Column(name = "infant_person1", nullable = true, length = 50)
    public String getInfantPerson1() {
        return infantPerson1;
    }

    public void setInfantPerson1(String infantPerson1) {
        this.infantPerson1 = infantPerson1;
    }

    @Column(name = "infant_complete_date1", nullable = true)
    public Date getInfantCompleteDate1() {
        return infantCompleteDate1;
    }

    public void setInfantCompleteDate1(Date infantCompleteDate1) {
        this.infantCompleteDate1 = infantCompleteDate1;
    }

    @Column(name = "infant_person2", nullable = true, length = 50)
    public String getInfantPerson2() {
        return infantPerson2;
    }

    public void setInfantPerson2(String infantPerson2) {
        this.infantPerson2 = infantPerson2;
    }

    @Column(name = "infant_complete_date2", nullable = true)
    public Date getInfantCompleteDate2() {
        return infantCompleteDate2;
    }

    public void setInfantCompleteDate2(Date infantCompleteDate2) {
        this.infantCompleteDate2 = infantCompleteDate2;
    }

    @Column(name = "infant_person3", nullable = true, length = 50)
    public String getInfantPerson3() {
        return infantPerson3;
    }

    public void setInfantPerson3(String infantPerson3) {
        this.infantPerson3 = infantPerson3;
    }

    @Column(name = "infant_complete_date3", nullable = true)
    public Date getInfantCompleteDate3() {
        return infantCompleteDate3;
    }

    public void setInfantCompleteDate3(Date infantCompleteDate3) {
        this.infantCompleteDate3 = infantCompleteDate3;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "Zp02d{" + recordId + ", " + redcapEventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zp02dInfantBiospecimenCollection)) return false;

        Zp02dInfantBiospecimenCollection that = (Zp02dInfantBiospecimenCollection) o;

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
