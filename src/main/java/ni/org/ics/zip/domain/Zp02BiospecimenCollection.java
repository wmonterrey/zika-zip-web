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
@Table(name = "zp02_biospecimen_collection", catalog = "zika_zip")
public class Zp02BiospecimenCollection extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String redcapEventName;
    private Date bscDov;
    private String bscVisit;
    private String bscMatBldCol;
    private String bscMatBldRsn;
    private String bscMatBldSpecify;
    private String bscMatBldTyp1;
    private String bscMatBldId1;
    private Integer bscMatBldVol1;
    private String bscMatBldTyp2;
    private String bscMatBldId2;
    private Integer bscMatBldVol2;
    private String bscMatBldTyp3;
    private String bscMatBldId3;
    private Integer bscMatBldVol3;
    private String bscMatBldTyp4;
    private String bscMatBldId4;
    private Integer bscMatBldVol4;
    private String bscMatBldTyp5;
    private String bscMatBldId5;
    private Integer bscMatBldVol5;
    private String bscMatBldTyp6;
    private String bscMatBldId6;
    private Integer bscMatBldVol6;
    private String bscMatBldTyp7;
    private String bscMatBldId7;
    private Integer bscMatBldVol7;
    private String bscMatBldTyp8;
    private String bscMatBldId8;
    private Integer bscMatBldVol8;
    private Integer bscMatBldTotVol;
    private String bscMatBldTime;
    private String bscMatBldCom;
    private String bscMatSlvaCol;
    private String bscMatSlvaRsn;
    private String bscMatSlvaSpecify;
    private String bscMatSlvaId;
    private String bscMatSlvaTime;
    private String bscMatSlvaCom;
    private String bscMatVagCol;
    private String bscMatVagRsn;
    private String bscMatVagSpecify;
    private String bscMatVagId;
    private String bscMatVagTime;
    private String bscMatVagCom;
    private String bscMatVstUrnCol;
    private String bscMatVstUrnRsn;
    private String bscMatVstUrnSpecify;
    private String bscMatVstUrnId;
    private String bscMatVstUrnTime;
    private String bscMatVstUrnCom;
    private String bscMatHomUrnCol;
    private String bscMatHomUrnRsn;
    private String bscMatHomUrnSpecify;
    private Integer bscMatHomUrnNum;
    private String bscMatHomUrnId1;
    private Date bscMatHomUrnDat1;
    private String bscMatHomUrnTime1;
    private String bscMatHomUrnCom1;
    private String bscMatHomUrnId2;
    private Date bscMatHomUrnDat2;
    private String bscMatHomUrnTime2;
    private String bscMatHomUrnCom2;
    private String bscMatHomUrnId3;
    private Date bscMatHomUrnDat3;
    private String bscMatHomUrnTime3;
    private String bscMatHomUrnCom3;
    private String bscMatHomUrnId4;
    private Date bscMatHomUrnDat4;
    private String bscMatHomUrnTime4;
    private String bscMatHomUrnCom4;
    private String bscMatOtherCol;
    private String bscMatOtherType; //multiple
    private String bscMatOtherTypeSpecify;
    private String bscMatAmfCol;
    private String bscMatAmfRsn;
    private String bscMatAmfSpecify;
    private String bscMatAmfId;
    private Float bscMatAmfAmount;
    private String bscMatAmfTime;
    private String bscMatAmfCom;
    private String bscMatCordCol;
    private String bscMatCordRsn;
    private String bscMatCordSpecify;
    private String bscMatCordId;
    private String bscMatCordTime;
    private Float bscMatCordAmount;
    private String bscMatCordCom;
    private String bscMatPlacenCol;
    private String bscMatPlacenRsn;
    private String bscMatPlacenSpecify;
    private String bscMatPlacenCircum;
    private String bscMatPlacenId;
    private String bscMatPlacenTime;
    private String bscMatPlacenCom;
    private String bscMatBreastmCol;
    private String bscMatBreastmRsn;
    private String bscMatBreastmSpecify;
    private String bscMatBreastmId;
    private String bscMatBreastmTime;
    private Float bscMatBreastmAmount;
    private String bscMatBreastmCom;
    private String bscMatMiscarr;
    private String bscMatFetaltCol;
    private String bscMatFetaltId;
    private String bscMatFetaltTime;
    private String bscMatFetaltCom;
    private String bscMatdBreastmCol;
    private String bscMatdBreastmRsn;
    private String bscMatdBreastmSpecify;
    private String bscMatdBreastmId;
    private String bscMatdBreastmTime;
    private Float bscMatdBreastmAmou;
    private String bscMatdBreastmCom;
    private String bscPerson1;
    private Date bscCompleteDate1;
    private String bscPerson2;
    private Date bscCompleteDate2;
    private String bscPerson3;
    private Date bscCompleteDate3;
    //campos adicionales que no pertenecen a redcap
    private String addtAnemiaTest;
    private Date addtLastAnemiaTest;
    private String addtLastAnemiaTestUk;
    private String addtAnemiaTestAv;
    private Float addtHematocrit;
    private Float addtHemoglobin;

    //v2.7
    private String bscMatOamfId1;
    private Date bscMatOamfDt1;
    private String bscMatOamfTm1;
    private String bscMatOamfId2;
    private Date bscMatOamfDt2;
    private String bscMatOamfTm2;
    private String bscMatOtherId1;
    private Date bscMatOtherDt1;
    private String bscMatOtherTm1;
    private String bscMatOtherId2;
    private Date bscMatOtherDt2;
    private String bscMatOtherTm2;
    private String bscMatOtherId3;
    private Date bscMatOtherDt3;
    private String bscMatOtherTm3;
    private String bscMatOtherId4;
    private Date bscMatOtherDt4;
    private String bscMatOtherTm4;
    private String bscMatOtherTyp2;
    private String bscMatOtherTyp3;
    private String bscMatOtherTyp4;


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

    @Column(name = "bsc_dov", nullable = true)
    public Date getBscDov() {
        return bscDov;
    }

    public void setBscDov(Date bscDov) {
        this.bscDov = bscDov;
    }

    @Column(name = "bsc_visit", nullable = false, length = 1)
    public String getBscVisit() {
        return bscVisit;
    }

    public void setBscVisit(String bscVisit) {
        this.bscVisit = bscVisit;
    }

    @Column(name = "bsc_mat_bld_col", nullable = true, length = 1)
    public String getBscMatBldCol() {
        return bscMatBldCol;
    }

    public void setBscMatBldCol(String bscMatBldCol) {
        this.bscMatBldCol = bscMatBldCol;
    }

    @Column(name = "bsc_mat_bld_rsn", nullable = true, length = 1)
    public String getBscMatBldRsn() {
        return bscMatBldRsn;
    }

    public void setBscMatBldRsn(String bscMatBldRsn) {
        this.bscMatBldRsn = bscMatBldRsn;
    }

    @Column(name = "bsc_mat_bld_specify", nullable = true)
    public String getBscMatBldSpecify() {
        return bscMatBldSpecify;
    }

    public void setBscMatBldSpecify(String bscMatBldSpecify) {
        this.bscMatBldSpecify = bscMatBldSpecify;
    }

    @Column(name = "bsc_mat_bld_typ_1", nullable = true, length = 1)
    public String getBscMatBldTyp1() {
        return bscMatBldTyp1;
    }

    public void setBscMatBldTyp1(String bscMatBldTyp1) {
        this.bscMatBldTyp1 = bscMatBldTyp1;
    }

    @Column(name = "bsc_mat_bld_id_1", nullable = true, length = 25)
    public String getBscMatBldId1() {
        return bscMatBldId1;
    }

    public void setBscMatBldId1(String bscMatBldId1) {
        this.bscMatBldId1 = bscMatBldId1;
    }

    @Column(name = "bsc_mat_bld_vol_1", nullable = true)
    public Integer getBscMatBldVol1() {
        return bscMatBldVol1;
    }

    public void setBscMatBldVol1(Integer bscMatBldVol1) {
        this.bscMatBldVol1 = bscMatBldVol1;
    }

    @Column(name = "bsc_mat_bld_typ_2", nullable = true, length = 1)
    public String getBscMatBldTyp2() {
        return bscMatBldTyp2;
    }

    public void setBscMatBldTyp2(String bscMatBldTyp2) {
        this.bscMatBldTyp2 = bscMatBldTyp2;
    }

    @Column(name = "bsc_mat_bld_id_2", nullable = true, length = 25)
    public String getBscMatBldId2() {
        return bscMatBldId2;
    }

    public void setBscMatBldId2(String bscMatBldId2) {
        this.bscMatBldId2 = bscMatBldId2;
    }

    @Column(name = "bsc_mat_bld_vol_2", nullable = true)
    public Integer getBscMatBldVol2() {
        return bscMatBldVol2;
    }

    public void setBscMatBldVol2(Integer bscMatBldVol2) {
        this.bscMatBldVol2 = bscMatBldVol2;
    }

    @Column(name = "bsc_mat_bld_typ_3", nullable = true, length = 1)
    public String getBscMatBldTyp3() {
        return bscMatBldTyp3;
    }

    public void setBscMatBldTyp3(String bscMatBldTyp3) {
        this.bscMatBldTyp3 = bscMatBldTyp3;
    }

    @Column(name = "bsc_mat_bld_id_3", nullable = true, length = 25)
    public String getBscMatBldId3() {
        return bscMatBldId3;
    }

    public void setBscMatBldId3(String bscMatBldId3) {
        this.bscMatBldId3 = bscMatBldId3;
    }

    @Column(name = "bsc_mat_bld_vol_3", nullable = true)
    public Integer getBscMatBldVol3() {
        return bscMatBldVol3;
    }

    public void setBscMatBldVol3(Integer bscMatBldVol3) {
        this.bscMatBldVol3 = bscMatBldVol3;
    }

    @Column(name = "bsc_mat_bld_typ_4", nullable = true, length = 1)
    public String getBscMatBldTyp4() {
        return bscMatBldTyp4;
    }

    public void setBscMatBldTyp4(String bscMatBldTyp4) {
        this.bscMatBldTyp4 = bscMatBldTyp4;
    }

    @Column(name = "bsc_mat_bld_id_4", nullable = true, length = 25)
    public String getBscMatBldId4() {
        return bscMatBldId4;
    }

    public void setBscMatBldId4(String bscMatBldId4) {
        this.bscMatBldId4 = bscMatBldId4;
    }

    @Column(name = "bsc_mat_bld_vol_4", nullable = true)
    public Integer getBscMatBldVol4() {
        return bscMatBldVol4;
    }

    public void setBscMatBldVol4(Integer bscMatBldVol4) {
        this.bscMatBldVol4 = bscMatBldVol4;
    }

    @Column(name = "bsc_mat_bld_typ_5", nullable = true, length = 1)
    public String getBscMatBldTyp5() {
        return bscMatBldTyp5;
    }

    public void setBscMatBldTyp5(String bscMatBldTyp5) {
        this.bscMatBldTyp5 = bscMatBldTyp5;
    }

    @Column(name = "bsc_mat_bld_id_5", nullable = true, length = 25)
    public String getBscMatBldId5() {
        return bscMatBldId5;
    }

    public void setBscMatBldId5(String bscMatBldId5) {
        this.bscMatBldId5 = bscMatBldId5;
    }

    @Column(name = "bsc_mat_bld_vol_5", nullable = true)
    public Integer getBscMatBldVol5() {
        return bscMatBldVol5;
    }

    public void setBscMatBldVol5(Integer bscMatBldVol5) {
        this.bscMatBldVol5 = bscMatBldVol5;
    }

    @Column(name = "bsc_mat_bld_typ_6", nullable = true, length = 1)
    public String getBscMatBldTyp6() {
        return bscMatBldTyp6;
    }

    public void setBscMatBldTyp6(String bscMatBldTyp6) {
        this.bscMatBldTyp6 = bscMatBldTyp6;
    }

    @Column(name = "bsc_mat_bld_id_6", nullable = true, length = 25)
    public String getBscMatBldId6() {
        return bscMatBldId6;
    }

    public void setBscMatBldId6(String bscMatBldId6) {
        this.bscMatBldId6 = bscMatBldId6;
    }

    @Column(name = "bsc_mat_bld_vol_6", nullable = true)
    public Integer getBscMatBldVol6() {
        return bscMatBldVol6;
    }

    public void setBscMatBldVol6(Integer bscMatBldVol6) {
        this.bscMatBldVol6 = bscMatBldVol6;
    }

    @Column(name = "bsc_mat_bld_typ_7", nullable = true, length = 1)
    public String getBscMatBldTyp7() {
        return bscMatBldTyp7;
    }

    public void setBscMatBldTyp7(String bscMatBldTyp7) {
        this.bscMatBldTyp7 = bscMatBldTyp7;
    }

    @Column(name = "bsc_mat_bld_id_7", nullable = true, length = 25)
    public String getBscMatBldId7() {
        return bscMatBldId7;
    }

    public void setBscMatBldId7(String bscMatBldId7) {
        this.bscMatBldId7 = bscMatBldId7;
    }

    @Column(name = "bsc_mat_bld_vol_7", nullable = true)
    public Integer getBscMatBldVol7() {
        return bscMatBldVol7;
    }

    public void setBscMatBldVol7(Integer bscMatBldVol7) {
        this.bscMatBldVol7 = bscMatBldVol7;
    }

    @Column(name = "bsc_mat_bld_typ_8", nullable = true, length = 1)
    public String getBscMatBldTyp8() {
        return bscMatBldTyp8;
    }

    public void setBscMatBldTyp8(String bscMatBldTyp8) {
        this.bscMatBldTyp8 = bscMatBldTyp8;
    }

    @Column(name = "bsc_mat_bld_id_8", nullable = true, length = 25)
    public String getBscMatBldId8() {
        return bscMatBldId8;
    }

    public void setBscMatBldId8(String bscMatBldId8) {
        this.bscMatBldId8 = bscMatBldId8;
    }

    @Column(name = "bsc_mat_bld_vol_8", nullable = true)
    public Integer getBscMatBldVol8() {
        return bscMatBldVol8;
    }

    public void setBscMatBldVol8(Integer bscMatBldVol8) {
        this.bscMatBldVol8 = bscMatBldVol8;
    }

    @Column(name = "bsc_mat_bld_tot_vol", nullable = true)
    public Integer getBscMatBldTotVol() {
        return bscMatBldTotVol;
    }

    public void setBscMatBldTotVol(Integer bscMatBldTotVol) {
        this.bscMatBldTotVol = bscMatBldTotVol;
    }

    @Column(name = "bsc_mat_bld_time", nullable = true, length = 50)
    public String getBscMatBldTime() {
        return bscMatBldTime;
    }

    public void setBscMatBldTime(String bscMatBldTime) {
        this.bscMatBldTime = bscMatBldTime;
    }

    @Column(name = "bsc_mat_bld_com", nullable = true)
    public String getBscMatBldCom() {
        return bscMatBldCom;
    }

    public void setBscMatBldCom(String bscMatBldCom) {
        this.bscMatBldCom = bscMatBldCom;
    }

    @Column(name = "bsc_mat_slva_col", nullable = true, length = 1)
    public String getBscMatSlvaCol() {
        return bscMatSlvaCol;
    }

    public void setBscMatSlvaCol(String bscMatSlvaCol) {
        this.bscMatSlvaCol = bscMatSlvaCol;
    }

    @Column(name = "bsc_mat_slva_rsn", nullable = true, length = 1)
    public String getBscMatSlvaRsn() {
        return bscMatSlvaRsn;
    }

    public void setBscMatSlvaRsn(String bscMatSlvaRsn) {
        this.bscMatSlvaRsn = bscMatSlvaRsn;
    }

    @Column(name = "bsc_mat_slva_specify", nullable = true)
    public String getBscMatSlvaSpecify() {
        return bscMatSlvaSpecify;
    }

    public void setBscMatSlvaSpecify(String bscMatSlvaSpecify) {
        this.bscMatSlvaSpecify = bscMatSlvaSpecify;
    }

    @Column(name = "bsc_mat_slva_id", nullable = true, length = 25)
    public String getBscMatSlvaId() {
        return bscMatSlvaId;
    }

    public void setBscMatSlvaId(String bscMatSlvaId) {
        this.bscMatSlvaId = bscMatSlvaId;
    }

    @Column(name = "bsc_mat_slva_time", nullable = true, length = 50)
    public String getBscMatSlvaTime() {
        return bscMatSlvaTime;
    }

    public void setBscMatSlvaTime(String bscMatSlvaTime) {
        this.bscMatSlvaTime = bscMatSlvaTime;
    }

    @Column(name = "bsc_mat_slva_com", nullable = true)
    public String getBscMatSlvaCom() {
        return bscMatSlvaCom;
    }

    public void setBscMatSlvaCom(String bscMatSlvaCom) {
        this.bscMatSlvaCom = bscMatSlvaCom;
    }

    @Column(name = "bsc_mat_vag_col", nullable = true, length = 1)
    public String getBscMatVagCol() {
        return bscMatVagCol;
    }

    public void setBscMatVagCol(String bscMatVagCol) {
        this.bscMatVagCol = bscMatVagCol;
    }

    @Column(name = "bsc_mat_vag_rsn", nullable = true, length = 1)
    public String getBscMatVagRsn() {
        return bscMatVagRsn;
    }

    public void setBscMatVagRsn(String bscMatVagRsn) {
        this.bscMatVagRsn = bscMatVagRsn;
    }

    @Column(name = "bsc_mat_vag_specify", nullable = true)
    public String getBscMatVagSpecify() {
        return bscMatVagSpecify;
    }

    public void setBscMatVagSpecify(String bscMatVagSpecify) {
        this.bscMatVagSpecify = bscMatVagSpecify;
    }

    @Column(name = "bsc_mat_vag_id", nullable = true, length = 25)
    public String getBscMatVagId() {
        return bscMatVagId;
    }

    public void setBscMatVagId(String bscMatVagId) {
        this.bscMatVagId = bscMatVagId;
    }

    @Column(name = "bsc_mat_vag_time", nullable = true, length = 50)
    public String getBscMatVagTime() {
        return bscMatVagTime;
    }

    public void setBscMatVagTime(String bscMatVagTime) {
        this.bscMatVagTime = bscMatVagTime;
    }

    @Column(name = "bsc_mat_vag_com", nullable = true)
    public String getBscMatVagCom() {
        return bscMatVagCom;
    }

    public void setBscMatVagCom(String bscMatVagCom) {
        this.bscMatVagCom = bscMatVagCom;
    }

    @Column(name = "bsc_mat_vst_urn_col", nullable = true, length = 1)
    public String getBscMatVstUrnCol() {
        return bscMatVstUrnCol;
    }

    public void setBscMatVstUrnCol(String bscMatVstUrnCol) {
        this.bscMatVstUrnCol = bscMatVstUrnCol;
    }

    @Column(name = "bsc_mat_vst_urn_rsn", nullable = true, length = 1)
    public String getBscMatVstUrnRsn() {
        return bscMatVstUrnRsn;
    }

    public void setBscMatVstUrnRsn(String bscMatVstUrnRsn) {
        this.bscMatVstUrnRsn = bscMatVstUrnRsn;
    }

    @Column(name = "bsc_mat_vst_urn_specify", nullable = true)
    public String getBscMatVstUrnSpecify() {
        return bscMatVstUrnSpecify;
    }

    public void setBscMatVstUrnSpecify(String bscMatVstUrnSpecify) {
        this.bscMatVstUrnSpecify = bscMatVstUrnSpecify;
    }

    @Column(name = "bsc_mat_vst_urn_id", nullable = true, length = 25)
    public String getBscMatVstUrnId() {
        return bscMatVstUrnId;
    }

    public void setBscMatVstUrnId(String bscMatVstUrnId) {
        this.bscMatVstUrnId = bscMatVstUrnId;
    }

    @Column(name = "bsc_mat_vst_urn_time", nullable = true, length = 50)
    public String getBscMatVstUrnTime() {
        return bscMatVstUrnTime;
    }

    public void setBscMatVstUrnTime(String bscMatVstUrnTime) {
        this.bscMatVstUrnTime = bscMatVstUrnTime;
    }

    @Column(name = "bsc_mat_vst_urn_com", nullable = true)
    public String getBscMatVstUrnCom() {
        return bscMatVstUrnCom;
    }

    public void setBscMatVstUrnCom(String bscMatVstUrnCom) {
        this.bscMatVstUrnCom = bscMatVstUrnCom;
    }

    @Column(name = "bsc_mat_hom_urn_col", nullable = true, length = 1)
    public String getBscMatHomUrnCol() {
        return bscMatHomUrnCol;
    }

    public void setBscMatHomUrnCol(String bscMatHomUrnCol) {
        this.bscMatHomUrnCol = bscMatHomUrnCol;
    }

    @Column(name = "bsc_mat_hom_urn_rsn", nullable = true, length = 1)
    public String getBscMatHomUrnRsn() {
        return bscMatHomUrnRsn;
    }

    public void setBscMatHomUrnRsn(String bscMatHomUrnRsn) {
        this.bscMatHomUrnRsn = bscMatHomUrnRsn;
    }

    @Column(name = "bsc_mat_hom_urn_specify", nullable = true)
    public String getBscMatHomUrnSpecify() {
        return bscMatHomUrnSpecify;
    }

    public void setBscMatHomUrnSpecify(String bscMatHomUrnSpecify) {
        this.bscMatHomUrnSpecify = bscMatHomUrnSpecify;
    }

    @Column(name = "bsc_mat_hom_urn_num", nullable = true)
    public Integer getBscMatHomUrnNum() {
        return bscMatHomUrnNum;
    }

    public void setBscMatHomUrnNum(Integer bscMatHomUrnNum) {
        this.bscMatHomUrnNum = bscMatHomUrnNum;
    }

    @Column(name = "bsc_mat_hom_urn_id1", nullable = true, length = 25)
    public String getBscMatHomUrnId1() {
        return bscMatHomUrnId1;
    }

    public void setBscMatHomUrnId1(String bscMatHomUrnId1) {
        this.bscMatHomUrnId1 = bscMatHomUrnId1;
    }

    @Column(name = "bsc_mat_hom_urn_dat1", nullable = true)
    public Date getBscMatHomUrnDat1() {
        return bscMatHomUrnDat1;
    }

    public void setBscMatHomUrnDat1(Date bscMatHomUrnDat1) {
        this.bscMatHomUrnDat1 = bscMatHomUrnDat1;
    }

    @Column(name = "bsc_mat_hom_urn_time1", nullable = true, length = 50)
    public String getBscMatHomUrnTime1() {
        return bscMatHomUrnTime1;
    }

    public void setBscMatHomUrnTime1(String bscMatHomUrnTime1) {
        this.bscMatHomUrnTime1 = bscMatHomUrnTime1;
    }

    @Column(name = "bsc_mat_hom_urn_com1", nullable = true)
    public String getBscMatHomUrnCom1() {
        return bscMatHomUrnCom1;
    }

    public void setBscMatHomUrnCom1(String bscMatHomUrnCom1) {
        this.bscMatHomUrnCom1 = bscMatHomUrnCom1;
    }

    @Column(name = "bsc_mat_hom_urn_id2", nullable = true, length = 25)
    public String getBscMatHomUrnId2() {
        return bscMatHomUrnId2;
    }

    public void setBscMatHomUrnId2(String bscMatHomUrnId2) {
        this.bscMatHomUrnId2 = bscMatHomUrnId2;
    }

    @Column(name = "bsc_mat_hom_urn_dat2", nullable = true)
    public Date getBscMatHomUrnDat2() {
        return bscMatHomUrnDat2;
    }

    public void setBscMatHomUrnDat2(Date bscMatHomUrnDat2) {
        this.bscMatHomUrnDat2 = bscMatHomUrnDat2;
    }

    @Column(name = "bsc_mat_hom_urn_time2", nullable = true, length = 50)
    public String getBscMatHomUrnTime2() {
        return bscMatHomUrnTime2;
    }

    public void setBscMatHomUrnTime2(String bscMatHomUrnTime2) {
        this.bscMatHomUrnTime2 = bscMatHomUrnTime2;
    }

    @Column(name = "bsc_mat_hom_urn_com2", nullable = true)
    public String getBscMatHomUrnCom2() {
        return bscMatHomUrnCom2;
    }

    public void setBscMatHomUrnCom2(String bscMatHomUrnCom2) {
        this.bscMatHomUrnCom2 = bscMatHomUrnCom2;
    }

    @Column(name = "bsc_mat_hom_urn_id3", nullable = true, length = 25)
    public String getBscMatHomUrnId3() {
        return bscMatHomUrnId3;
    }

    public void setBscMatHomUrnId3(String bscMatHomUrnId3) {
        this.bscMatHomUrnId3 = bscMatHomUrnId3;
    }

    @Column(name = "bsc_mat_hom_urn_dat3", nullable = true)
    public Date getBscMatHomUrnDat3() {
        return bscMatHomUrnDat3;
    }

    public void setBscMatHomUrnDat3(Date bscMatHomUrnDat3) {
        this.bscMatHomUrnDat3 = bscMatHomUrnDat3;
    }

    @Column(name = "bsc_mat_hom_urn_time3", nullable = true, length = 50)
    public String getBscMatHomUrnTime3() {
        return bscMatHomUrnTime3;
    }

    public void setBscMatHomUrnTime3(String bscMatHomUrnTime3) {
        this.bscMatHomUrnTime3 = bscMatHomUrnTime3;
    }

    @Column(name = "bsc_mat_hom_urn_com3", nullable = true)
    public String getBscMatHomUrnCom3() {
        return bscMatHomUrnCom3;
    }

    public void setBscMatHomUrnCom3(String bscMatHomUrnCom3) {
        this.bscMatHomUrnCom3 = bscMatHomUrnCom3;
    }

    @Column(name = "bsc_mat_hom_urn_id4", nullable = true, length = 25)
    public String getBscMatHomUrnId4() {
        return bscMatHomUrnId4;
    }

    public void setBscMatHomUrnId4(String bscMatHomUrnId4) {
        this.bscMatHomUrnId4 = bscMatHomUrnId4;
    }

    @Column(name = "bsc_mat_hom_urn_dat4", nullable = true)
    public Date getBscMatHomUrnDat4() {
        return bscMatHomUrnDat4;
    }

    public void setBscMatHomUrnDat4(Date bscMatHomUrnDat4) {
        this.bscMatHomUrnDat4 = bscMatHomUrnDat4;
    }

    @Column(name = "bsc_mat_hom_urn_time4", nullable = true, length = 50)
    public String getBscMatHomUrnTime4() {
        return bscMatHomUrnTime4;
    }

    public void setBscMatHomUrnTime4(String bscMatHomUrnTime4) {
        this.bscMatHomUrnTime4 = bscMatHomUrnTime4;
    }

    @Column(name = "bsc_mat_hom_urn_com4", nullable = true)
    public String getBscMatHomUrnCom4() {
        return bscMatHomUrnCom4;
    }

    public void setBscMatHomUrnCom4(String bscMatHomUrnCom4) {
        this.bscMatHomUrnCom4 = bscMatHomUrnCom4;
    }

    @Column(name = "bsc_mat_other_col", nullable = true, length = 1)
    public String getBscMatOtherCol() {
        return bscMatOtherCol;
    }

    public void setBscMatOtherCol(String bscMatOtherCol) {
        this.bscMatOtherCol = bscMatOtherCol;
    }

    @Column(name = "bsc_mat_other_type", nullable = true, length = 5)
    public String getBscMatOtherType() {
        return bscMatOtherType;
    }

    public void setBscMatOtherType(String bscMatOtherType) {
        this.bscMatOtherType = bscMatOtherType;
    }

    @Column(name = "bsc_mat_other_type_specify", length = 50 )
    public String getBscMatOtherTypeSpecify() {
        return bscMatOtherTypeSpecify;
    }

    public void setBscMatOtherTypeSpecify(String bscMatOtherTypeSpecify) {
        this.bscMatOtherTypeSpecify = bscMatOtherTypeSpecify;
    }

    @Column(name = "bsc_mat_amf_col", nullable = true, length = 1)
    public String getBscMatAmfCol() {
        return bscMatAmfCol;
    }

    public void setBscMatAmfCol(String bscMatAmfCol) {
        this.bscMatAmfCol = bscMatAmfCol;
    }

    @Column(name = "bsc_mat_amf_rsn", nullable = true, length = 1)
    public String getBscMatAmfRsn() {
        return bscMatAmfRsn;
    }

    public void setBscMatAmfRsn(String bscMatAmfRsn) {
        this.bscMatAmfRsn = bscMatAmfRsn;
    }

    @Column(name = "bsc_mat_amf_specify", nullable = true)
    public String getBscMatAmfSpecify() {
        return bscMatAmfSpecify;
    }

    public void setBscMatAmfSpecify(String bscMatAmfSpecify) {
        this.bscMatAmfSpecify = bscMatAmfSpecify;
    }

    @Column(name = "bsc_mat_amf_id", nullable = true, length = 25)
    public String getBscMatAmfId() {
        return bscMatAmfId;
    }

    public void setBscMatAmfId(String bscMatAmfId) {
        this.bscMatAmfId = bscMatAmfId;
    }

    @Column(name = "bsc_mat_amf_amount", nullable = true)
    public Float getBscMatAmfAmount() {
        return bscMatAmfAmount;
    }

    public void setBscMatAmfAmount(Float bscMatAmfAmount) {
        this.bscMatAmfAmount = bscMatAmfAmount;
    }

    @Column(name = "bsc_mat_amf_time", nullable = true, length = 50)
    public String getBscMatAmfTime() {
        return bscMatAmfTime;
    }

    public void setBscMatAmfTime(String bscMatAmfTime) {
        this.bscMatAmfTime = bscMatAmfTime;
    }

    @Column(name = "bsc_mat_amf_com", nullable = true)
    public String getBscMatAmfCom() {
        return bscMatAmfCom;
    }

    public void setBscMatAmfCom(String bscMatAmfCom) {
        this.bscMatAmfCom = bscMatAmfCom;
    }

    @Column(name = "bsc_mat_cord_col", nullable = true, length = 1)
    public String getBscMatCordCol() {
        return bscMatCordCol;
    }

    public void setBscMatCordCol(String bscMatCordCol) {
        this.bscMatCordCol = bscMatCordCol;
    }

    @Column(name = "bsc_mat_cord_rsn", nullable = true, length = 1)
    public String getBscMatCordRsn() {
        return bscMatCordRsn;
    }

    public void setBscMatCordRsn(String bscMatCordRsn) {
        this.bscMatCordRsn = bscMatCordRsn;
    }

    @Column(name = "bsc_mat_cord_specify", nullable = true)
    public String getBscMatCordSpecify() {
        return bscMatCordSpecify;
    }

    public void setBscMatCordSpecify(String bscMatCordSpecify) {
        this.bscMatCordSpecify = bscMatCordSpecify;
    }

    @Column(name = "bsc_mat_cord_id", nullable = true, length = 25)
    public String getBscMatCordId() {
        return bscMatCordId;
    }

    public void setBscMatCordId(String bscMatCordId) {
        this.bscMatCordId = bscMatCordId;
    }

    @Column(name = "bsc_mat_cord_time", nullable = true, length = 50)
    public String getBscMatCordTime() {
        return bscMatCordTime;
    }

    public void setBscMatCordTime(String bscMatCordTime) {
        this.bscMatCordTime = bscMatCordTime;
    }

    @Column(name = "bsc_mat_cord_amount", nullable = true)
    public Float getBscMatCordAmount() {
        return bscMatCordAmount;
    }

    public void setBscMatCordAmount(Float bscMatCordAmount) {
        this.bscMatCordAmount = bscMatCordAmount;
    }

    @Column(name = "bsc_mat_cord_com", nullable = true)
    public String getBscMatCordCom() {
        return bscMatCordCom;
    }

    public void setBscMatCordCom(String bscMatCordCom) {
        this.bscMatCordCom = bscMatCordCom;
    }

    @Column(name = "bsc_mat_placen_col", nullable = true, length = 1)
    public String getBscMatPlacenCol() {
        return bscMatPlacenCol;
    }

    public void setBscMatPlacenCol(String bscMatPlacenCol) {
        this.bscMatPlacenCol = bscMatPlacenCol;
    }

    @Column(name = "bsc_mat_placen_rsn", nullable = true, length = 1)
    public String getBscMatPlacenRsn() {
        return bscMatPlacenRsn;
    }

    public void setBscMatPlacenRsn(String bscMatPlacenRsn) {
        this.bscMatPlacenRsn = bscMatPlacenRsn;
    }

    @Column(name = "bsc_mat_placen_specify", nullable = true)
    public String getBscMatPlacenSpecify() {
        return bscMatPlacenSpecify;
    }

    public void setBscMatPlacenSpecify(String bscMatPlacenSpecify) {
        this.bscMatPlacenSpecify = bscMatPlacenSpecify;
    }

    @Column(name = "bsc_mat_placen_circum", nullable = true, length = 1)
    public String getBscMatPlacenCircum() {
        return bscMatPlacenCircum;
    }

    public void setBscMatPlacenCircum(String bscMatPlacenCircum) {
        this.bscMatPlacenCircum = bscMatPlacenCircum;
    }

    @Column(name = "bsc_mat_placen_id", nullable = true, length = 25)
    public String getBscMatPlacenId() {
        return bscMatPlacenId;
    }

    public void setBscMatPlacenId(String bscMatPlacenId) {
        this.bscMatPlacenId = bscMatPlacenId;
    }

    @Column(name = "bsc_mat_placen_time", nullable = true, length = 50)
    public String getBscMatPlacenTime() {
        return bscMatPlacenTime;
    }

    public void setBscMatPlacenTime(String bscMatPlacenTime) {
        this.bscMatPlacenTime = bscMatPlacenTime;
    }

    @Column(name = "bsc_mat_placen_com", nullable = true)
    public String getBscMatPlacenCom() {
        return bscMatPlacenCom;
    }

    public void setBscMatPlacenCom(String bscMatPlacenCom) {
        this.bscMatPlacenCom = bscMatPlacenCom;
    }

    @Column(name = "bsc_mat_breastm_col", nullable = true, length = 1)
    public String getBscMatBreastmCol() {
        return bscMatBreastmCol;
    }

    public void setBscMatBreastmCol(String bscMatBreastmCol) {
        this.bscMatBreastmCol = bscMatBreastmCol;
    }

    @Column(name = "bsc_mat_breastm_rsn", nullable = true, length = 1)
    public String getBscMatBreastmRsn() {
        return bscMatBreastmRsn;
    }

    public void setBscMatBreastmRsn(String bscMatBreastmRsn) {
        this.bscMatBreastmRsn = bscMatBreastmRsn;
    }

    @Column(name = "bsc_mat_breastm_specify", nullable = true)
    public String getBscMatBreastmSpecify() {
        return bscMatBreastmSpecify;
    }

    public void setBscMatBreastmSpecify(String bscMatBreastmSpecify) {
        this.bscMatBreastmSpecify = bscMatBreastmSpecify;
    }

    @Column(name = "bsc_mat_breastm_id", nullable = true, length = 25)
    public String getBscMatBreastmId() {
        return bscMatBreastmId;
    }

    public void setBscMatBreastmId(String bscMatBreastmId) {
        this.bscMatBreastmId = bscMatBreastmId;
    }

    @Column(name = "bsc_mat_breastm_time", nullable = true, length = 50)
    public String getBscMatBreastmTime() {
        return bscMatBreastmTime;
    }

    public void setBscMatBreastmTime(String bscMatBreastmTime) {
        this.bscMatBreastmTime = bscMatBreastmTime;
    }

    @Column(name = "bsc_mat_breastm_amount", nullable = true)
    public Float getBscMatBreastmAmount() {
        return bscMatBreastmAmount;
    }

    public void setBscMatBreastmAmount(Float bscMatBreastmAmount) {
        this.bscMatBreastmAmount = bscMatBreastmAmount;
    }

    @Column(name = "bsc_mat_breastm_com", nullable = true)
    public String getBscMatBreastmCom() {
        return bscMatBreastmCom;
    }

    public void setBscMatBreastmCom(String bscMatBreastmCom) {
        this.bscMatBreastmCom = bscMatBreastmCom;
    }

    @Column(name = "bsc_mat_miscarr", nullable = true, length = 1)
    public String getBscMatMiscarr() {
        return bscMatMiscarr;
    }

    public void setBscMatMiscarr(String bscMatMiscarr) {
        this.bscMatMiscarr = bscMatMiscarr;
    }

    @Column(name = "bsc_mat_fetalt_col", nullable = true, length = 1)
    public String getBscMatFetaltCol() {
        return bscMatFetaltCol;
    }

    public void setBscMatFetaltCol(String bscMatFetaltCol) {
        this.bscMatFetaltCol = bscMatFetaltCol;
    }

    @Column(name = "bsc_mat_fetalt_id", nullable = true, length = 25)
    public String getBscMatFetaltId() {
        return bscMatFetaltId;
    }

    public void setBscMatFetaltId(String bscMatFetaltId) {
        this.bscMatFetaltId = bscMatFetaltId;
    }

    @Column(name = "bsc_mat_fetalt_time", nullable = true, length = 50)
    public String getBscMatFetaltTime() {
        return bscMatFetaltTime;
    }

    public void setBscMatFetaltTime(String bscMatFetaltTime) {
        this.bscMatFetaltTime = bscMatFetaltTime;
    }

    @Column(name = "bsc_mat_fetalt_com", nullable = true)
    public String getBscMatFetaltCom() {
        return bscMatFetaltCom;
    }

    public void setBscMatFetaltCom(String bscMatFetaltCom) {
        this.bscMatFetaltCom = bscMatFetaltCom;
    }

    @Column(name = "bsc_matd_breastm_col", nullable = true, length = 1)
    public String getBscMatdBreastmCol() {
        return bscMatdBreastmCol;
    }

    public void setBscMatdBreastmCol(String bscMatdBreastmCol) {
        this.bscMatdBreastmCol = bscMatdBreastmCol;
    }

    @Column(name = "bsc_matd_breastm_rsn", nullable = true, length = 1)
    public String getBscMatdBreastmRsn() {
        return bscMatdBreastmRsn;
    }

    public void setBscMatdBreastmRsn(String bscMatdBreastmRsn) {
        this.bscMatdBreastmRsn = bscMatdBreastmRsn;
    }

    @Column(name = "bsc_matd_breastm_specify", nullable = true)
    public String getBscMatdBreastmSpecify() {
        return bscMatdBreastmSpecify;
    }

    public void setBscMatdBreastmSpecify(String bscMatdBreastmSpecify) {
        this.bscMatdBreastmSpecify = bscMatdBreastmSpecify;
    }

    @Column(name = "bsc_matd_breastm_id", nullable = true, length = 25)
    public String getBscMatdBreastmId() {
        return bscMatdBreastmId;
    }

    public void setBscMatdBreastmId(String bscMatdBreastmId) {
        this.bscMatdBreastmId = bscMatdBreastmId;
    }

    @Column(name = "bsc_matd_breastm_time", nullable = true, length = 50)
    public String getBscMatdBreastmTime() {
        return bscMatdBreastmTime;
    }

    public void setBscMatdBreastmTime(String bscMatdBreastmTime) {
        this.bscMatdBreastmTime = bscMatdBreastmTime;
    }

    @Column(name = "bsc_matd_breastm_amou", nullable = true)
    public Float getBscMatdBreastmAmou() {
        return bscMatdBreastmAmou;
    }

    public void setBscMatdBreastmAmou(Float bscMatdBreastmAmou) {
        this.bscMatdBreastmAmou = bscMatdBreastmAmou;
    }

    @Column(name = "bsc_matd_breastm_com", nullable = true)
    public String getBscMatdBreastmCom() {
        return bscMatdBreastmCom;
    }

    public void setBscMatdBreastmCom(String bscMatdBreastmCom) {
        this.bscMatdBreastmCom = bscMatdBreastmCom;
    }

    @Column(name = "bsc_person1", nullable = true, length = 50)
    public String getBscPerson1() {
        return bscPerson1;
    }

    public void setBscPerson1(String bscPerson1) {
        this.bscPerson1 = bscPerson1;
    }

    @Column(name = "bsc_complete_date1", nullable = true)
    public Date getBscCompleteDate1() {
        return bscCompleteDate1;
    }

    public void setBscCompleteDate1(Date bscCompleteDate1) {
        this.bscCompleteDate1 = bscCompleteDate1;
    }

    @Column(name = "bsc_person2", nullable = true, length = 50)
    public String getBscPerson2() {
        return bscPerson2;
    }

    public void setBscPerson2(String bscPerson2) {
        this.bscPerson2 = bscPerson2;
    }

    @Column(name = "bsc_complete_date2", nullable = true)
    public Date getBscCompleteDate2() {
        return bscCompleteDate2;
    }

    public void setBscCompleteDate2(Date bscCompleteDate2) {
        this.bscCompleteDate2 = bscCompleteDate2;
    }

    @Column(name = "bsc_person3", nullable = true, length = 50)
    public String getBscPerson3() {
        return bscPerson3;
    }

    public void setBscPerson3(String bscPerson3) {
        this.bscPerson3 = bscPerson3;
    }

    @Column(name = "bsc_complete_date3", nullable = true)
    public Date getBscCompleteDate3() {
        return bscCompleteDate3;
    }

    public void setBscCompleteDate3(Date bscCompleteDate3) {
        this.bscCompleteDate3 = bscCompleteDate3;
    }

    //campos adicionales que no pertenecen a redcap

    @Column(name = "bsc_addt_anemiatest_col", nullable = true, length = 1)
    public String getAddtAnemiaTest() {
        return addtAnemiaTest;
    }

    public void setAddtAnemiaTest(String addtAnemiaTest) {
        this.addtAnemiaTest = addtAnemiaTest;
    }

    @Column(name = "bsc_addt_lastanemiatest_date", nullable = true)
    public Date getAddtLastAnemiaTest() {
        return addtLastAnemiaTest;
    }

    public void setAddtLastAnemiaTest(Date addtLastAnemiaTest) {
        this.addtLastAnemiaTest = addtLastAnemiaTest;
    }

    @Column(name = "bsc_addt_lastanemiatest_ref", nullable = true, length = 1)
    public String getAddtLastAnemiaTestUk() {
        return addtLastAnemiaTestUk;
    }

    public void setAddtLastAnemiaTestUk(String addtLastAnemiaTestUk) {
        this.addtLastAnemiaTestUk = addtLastAnemiaTestUk;
    }

    @Column(name = "bsc_addt_anemiatest_av", nullable = true, length = 1)
    public String getAddtAnemiaTestAv() {
        return addtAnemiaTestAv;
    }

    public void setAddtAnemiaTestAv(String addtAnemiaTestAv) {
        this.addtAnemiaTestAv = addtAnemiaTestAv;
    }

    @Column(name = "bsc_addt_hematocrit", nullable = true)
    public Float getAddtHematocrit() {
        return addtHematocrit;
    }

    public void setAddtHematocrit(Float addtHematocrit) {
        this.addtHematocrit = addtHematocrit;
    }

    @Column(name = "bsc_addt_hemoglobin", nullable = true)
    public Float getAddtHemoglobin() {
        return addtHemoglobin;
    }

    public void setAddtHemoglobin(Float addtHemoglobin) {
        this.addtHemoglobin = addtHemoglobin;
    }

    //v2.7
    @Column(name = "bsc_mat_oamf_id1", length = 25)
    public String getBscMatOamfId1() {
        return bscMatOamfId1;
    }

    public void setBscMatOamfId1(String bscMatOamfId1) {
        this.bscMatOamfId1 = bscMatOamfId1;
    }

    @Column(name = "bsc_mat_oamf_dt1")
    public Date getBscMatOamfDt1() {
        return bscMatOamfDt1;
    }

    public void setBscMatOamfDt1(Date bscMatOamfDt1) {
        this.bscMatOamfDt1 = bscMatOamfDt1;
    }

    @Column(name = "bsc_mat_oamf_tm1", length = 25)
    public String getBscMatOamfTm1() {
        return bscMatOamfTm1;
    }

    public void setBscMatOamfTm1(String bscMatOamfTm1) {
        this.bscMatOamfTm1 = bscMatOamfTm1;
    }

    @Column(name = "bsc_mat_oamf_id2", length = 25)
    public String getBscMatOamfId2() {
        return bscMatOamfId2;
    }

    public void setBscMatOamfId2(String bscMatOamfId2) {
        this.bscMatOamfId2 = bscMatOamfId2;
    }

    @Column(name = "bsc_mat_oamf_dt2")
    public Date getBscMatOamfDt2() {
        return bscMatOamfDt2;
    }

    public void setBscMatOamfDt2(Date bscMatOamfDt2) {
        this.bscMatOamfDt2 = bscMatOamfDt2;
    }

    @Column(name = "bsc_mat_oamf_tm2", length = 25)
    public String getBscMatOamfTm2() {
        return bscMatOamfTm2;
    }

    public void setBscMatOamfTm2(String bscMatOamfTm2) {
        this.bscMatOamfTm2 = bscMatOamfTm2;
    }

    @Column(name = "bsc_mat_other_id1", length = 25)
    public String getBscMatOtherId1() {
        return bscMatOtherId1;
    }

    public void setBscMatOtherId1(String bscMatOtherId1) {
        this.bscMatOtherId1 = bscMatOtherId1;
    }

    @Column(name = "bsc_mat_other_dt1")
    public Date getBscMatOtherDt1() {
        return bscMatOtherDt1;
    }

    public void setBscMatOtherDt1(Date bscMatOtherDt1) {
        this.bscMatOtherDt1 = bscMatOtherDt1;
    }

    @Column(name = "bsc_mat_other_tm1", length = 25)
    public String getBscMatOtherTm1() {
        return bscMatOtherTm1;
    }

    public void setBscMatOtherTm1(String bscMatOtherTm1) {
        this.bscMatOtherTm1 = bscMatOtherTm1;
    }

    @Column(name = "bsc_mat_other_id2", length = 25)
    public String getBscMatOtherId2() {
        return bscMatOtherId2;
    }

    public void setBscMatOtherId2(String bscMatOtherId2) {
        this.bscMatOtherId2 = bscMatOtherId2;
    }

    @Column(name = "bsc_mat_other_dt2")
    public Date getBscMatOtherDt2() {
        return bscMatOtherDt2;
    }

    public void setBscMatOtherDt2(Date bscMatOtherDt2) {
        this.bscMatOtherDt2 = bscMatOtherDt2;
    }

    @Column(name = "bsc_mat_other_tm2", length = 25)
    public String getBscMatOtherTm2() {
        return bscMatOtherTm2;
    }

    public void setBscMatOtherTm2(String bscMatOtherTm2) {
        this.bscMatOtherTm2 = bscMatOtherTm2;
    }

    @Column(name = "bsc_mat_other_id3", length = 25)
    public String getBscMatOtherId3() {
        return bscMatOtherId3;
    }

    public void setBscMatOtherId3(String bscMatOtherId3) {
        this.bscMatOtherId3 = bscMatOtherId3;
    }

    @Column(name = "bsc_mat_other_dt3")
    public Date getBscMatOtherDt3() {
        return bscMatOtherDt3;
    }

    public void setBscMatOtherDt3(Date bscMatOtherDt3) {
        this.bscMatOtherDt3 = bscMatOtherDt3;
    }

    @Column(name = "bsc_mat_other_tm3", length = 25)
    public String getBscMatOtherTm3() {
        return bscMatOtherTm3;
    }

    public void setBscMatOtherTm3(String bscMatOtherTm3) {
        this.bscMatOtherTm3 = bscMatOtherTm3;
    }

    @Column(name = "bsc_mat_other_id4", length = 25)
    public String getBscMatOtherId4() {
        return bscMatOtherId4;
    }

    public void setBscMatOtherId4(String bscMatOtherId4) {
        this.bscMatOtherId4 = bscMatOtherId4;
    }

    @Column(name = "bsc_mat_other_dt4")
    public Date getBscMatOtherDt4() {
        return bscMatOtherDt4;
    }

    public void setBscMatOtherDt4(Date bscMatOtherDt4) {
        this.bscMatOtherDt4 = bscMatOtherDt4;
    }

    @Column(name = "bsc_mat_other_tm4", length = 25)
    public String getBscMatOtherTm4() {
        return bscMatOtherTm4;
    }

    public void setBscMatOtherTm4(String bscMatOtherTm4) {
        this.bscMatOtherTm4 = bscMatOtherTm4;
    }

    @Column(name = "bsc_mat_other_typ2", length = 50)
    public String getBscMatOtherTyp2() {
        return bscMatOtherTyp2;
    }

    public void setBscMatOtherTyp2(String bscMatOtherTyp2) {
        this.bscMatOtherTyp2 = bscMatOtherTyp2;
    }

    @Column(name = "bsc_mat_other_typ3", length = 50)
    public String getBscMatOtherTyp3() {
        return bscMatOtherTyp3;
    }

    public void setBscMatOtherTyp3(String bscMatOtherTyp3) {
        this.bscMatOtherTyp3 = bscMatOtherTyp3;
    }

    @Column(name = "bsc_mat_other_typ4", length = 50)
    public String getBscMatOtherTyp4() {
        return bscMatOtherTyp4;
    }

    public void setBscMatOtherTyp4(String bscMatOtherTyp4) {
        this.bscMatOtherTyp4 = bscMatOtherTyp4;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return recordId + "," + redcapEventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zp02BiospecimenCollection)) return false;

        Zp02BiospecimenCollection that = (Zp02BiospecimenCollection) o;

        if (!recordId.equals(that.recordId) ) return false;
        if (!redcapEventName.equals(that.redcapEventName)) return false;

        return true;
    }
}
