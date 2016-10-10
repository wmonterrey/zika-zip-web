package ni.org.ics.zip.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/10/2016.
 * V1.0
 */
public class Zp02BiospecimenCollectionSectionB {

    private String recordId;
    private Date bscDov;
    private Boolean bscMatBldCol;
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
    private Boolean bscMatSlvaCol;
    private String bscMatSlvaRsn;
    private String bscMatSlvaSpecify;
    private String bscMatSlvaId;
    private String bscMatSlvaTime;
    private String bscMatSlvaCom;
    private Boolean bscMatVagCol;
    private String bscMatVagRsn;
    private String bscMatVagSpecify;
    private String bscMatVagId;
    private String bscMatVagTime;
    private String bscMatVagCom;
    private Boolean bscMatVstUrnCol;
    private String bscMatVstUrnRsn;
    private String bscMatVstUrnSpecify;
    private String bscMatVstUrnId;
    private String bscMatVstUrnTime;
    private String bscMatVstUrnCom;
    private Boolean bscMatHomUrnCol;
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
    private Boolean bscMatOtherCol;
    private String bscMatOtherType;
    private String bscMatOtherTypeSpecify;
    private String bscPerson1;
    private Date bscCompleteDate1;
    private String bscPerson2;
    private Date bscCompleteDate2;
    private String bscPerson3;
    private Date bscCompleteDate3;

    @Id
    @Column(name = "record_id", nullable = false)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "bsc_dov", nullable = false, length = 1)
    public Date getBscDov() {
        return bscDov;
    }

    public void setBscDov(Date bscDov) {
        this.bscDov = bscDov;
    }

    @Column(name = "bsc_mat_bld_col", nullable = false)
    public Boolean getBscMatBldCol() {
        return bscMatBldCol;
    }

    public void setBscMatBldCol(Boolean bscMatBldCol) {
        this.bscMatBldCol = bscMatBldCol;
    }

    @Column(name = "bsc_mat_bld_rsn", nullable = false, length = 1)
    public String getBscMatBldRsn() {
        return bscMatBldRsn;
    }

    public void setBscMatBldRsn(String bscMatBldRsn) {
        this.bscMatBldRsn = bscMatBldRsn;
    }

    @Column(name = "bsc_mat_bld_specify", nullable = false, length = 1)
    public String getBscMatBldSpecify() {
        return bscMatBldSpecify;
    }

    public void setBscMatBldSpecify(String bscMatBldSpecify) {
        this.bscMatBldSpecify = bscMatBldSpecify;
    }

    @Column(name = "bsc_mat_bld_typ_1", nullable = false, length = 1)
    public String getBscMatBldTyp1() {
        return bscMatBldTyp1;
    }

    public void setBscMatBldTyp1(String bscMatBldTyp1) {
        this.bscMatBldTyp1 = bscMatBldTyp1;
    }

    @Column(name = "bsc_mat_bld_id_1", nullable = false, length = 1)
    public String getBscMatBldId1() {
        return bscMatBldId1;
    }

    public void setBscMatBldId1(String bscMatBldId1) {
        this.bscMatBldId1 = bscMatBldId1;
    }

    @Column(name = "bsc_mat_bld_vol_1", nullable = false)
    public Integer getBscMatBldVol1() {
        return bscMatBldVol1;
    }

    public void setBscMatBldVol1(Integer bscMatBldVol1) {
        this.bscMatBldVol1 = bscMatBldVol1;
    }

    @Column(name = "bsc_mat_bld_typ_2", nullable = false, length = 1)
    public String getBscMatBldTyp2() {
        return bscMatBldTyp2;
    }

    public void setBscMatBldTyp2(String bscMatBldTyp2) {
        this.bscMatBldTyp2 = bscMatBldTyp2;
    }

    @Column(name = "bsc_mat_bld_id_2", nullable = false, length = 1)
    public String getBscMatBldId2() {
        return bscMatBldId2;
    }

    public void setBscMatBldId2(String bscMatBldId2) {
        this.bscMatBldId2 = bscMatBldId2;
    }

    @Column(name = "bsc_mat_bld_vol_2", nullable = false)
    public Integer getBscMatBldVol2() {
        return bscMatBldVol2;
    }

    public void setBscMatBldVol2(Integer bscMatBldVol2) {
        this.bscMatBldVol2 = bscMatBldVol2;
    }

    @Column(name = "bsc_mat_bld_typ_3", nullable = false, length = 1)
    public String getBscMatBldTyp3() {
        return bscMatBldTyp3;
    }

    public void setBscMatBldTyp3(String bscMatBldTyp3) {
        this.bscMatBldTyp3 = bscMatBldTyp3;
    }

    @Column(name = "bsc_mat_bld_id_3", nullable = false, length = 1)
    public String getBscMatBldId3() {
        return bscMatBldId3;
    }

    public void setBscMatBldId3(String bscMatBldId3) {
        this.bscMatBldId3 = bscMatBldId3;
    }

    @Column(name = "bsc_mat_bld_vol_3", nullable = false)
    public Integer getBscMatBldVol3() {
        return bscMatBldVol3;
    }

    public void setBscMatBldVol3(Integer bscMatBldVol3) {
        this.bscMatBldVol3 = bscMatBldVol3;
    }

    @Column(name = "bsc_mat_bld_typ_4", nullable = false, length = 1)
    public String getBscMatBldTyp4() {
        return bscMatBldTyp4;
    }

    public void setBscMatBldTyp4(String bscMatBldTyp4) {
        this.bscMatBldTyp4 = bscMatBldTyp4;
    }

    @Column(name = "bsc_mat_bld_id_4", nullable = false, length = 1)
    public String getBscMatBldId4() {
        return bscMatBldId4;
    }

    public void setBscMatBldId4(String bscMatBldId4) {
        this.bscMatBldId4 = bscMatBldId4;
    }

    @Column(name = "bsc_mat_bld_vol_4", nullable = false)
    public Integer getBscMatBldVol4() {
        return bscMatBldVol4;
    }

    public void setBscMatBldVol4(Integer bscMatBldVol4) {
        this.bscMatBldVol4 = bscMatBldVol4;
    }

    @Column(name = "bsc_mat_bld_typ_5", nullable = false, length = 1)
    public String getBscMatBldTyp5() {
        return bscMatBldTyp5;
    }

    public void setBscMatBldTyp5(String bscMatBldTyp5) {
        this.bscMatBldTyp5 = bscMatBldTyp5;
    }

    @Column(name = "bsc_mat_bld_id_5", nullable = false, length = 1)
    public String getBscMatBldId5() {
        return bscMatBldId5;
    }

    public void setBscMatBldId5(String bscMatBldId5) {
        this.bscMatBldId5 = bscMatBldId5;
    }

    @Column(name = "bsc_mat_bld_vol_5", nullable = false)
    public Integer getBscMatBldVol5() {
        return bscMatBldVol5;
    }

    public void setBscMatBldVol5(Integer bscMatBldVol5) {
        this.bscMatBldVol5 = bscMatBldVol5;
    }

    @Column(name = "bsc_mat_bld_typ_6", nullable = false, length = 1)
    public String getBscMatBldTyp6() {
        return bscMatBldTyp6;
    }

    public void setBscMatBldTyp6(String bscMatBldTyp6) {
        this.bscMatBldTyp6 = bscMatBldTyp6;
    }

    @Column(name = "bsc_mat_bld_id_6", nullable = false, length = 1)
    public String getBscMatBldId6() {
        return bscMatBldId6;
    }

    public void setBscMatBldId6(String bscMatBldId6) {
        this.bscMatBldId6 = bscMatBldId6;
    }

    @Column(name = "bsc_mat_bld_vol_6", nullable = false)
    public Integer getBscMatBldVol6() {
        return bscMatBldVol6;
    }

    public void setBscMatBldVol6(Integer bscMatBldVol6) {
        this.bscMatBldVol6 = bscMatBldVol6;
    }

    @Column(name = "bsc_mat_bld_typ_7", nullable = false, length = 1)
    public String getBscMatBldTyp7() {
        return bscMatBldTyp7;
    }

    public void setBscMatBldTyp7(String bscMatBldTyp7) {
        this.bscMatBldTyp7 = bscMatBldTyp7;
    }

    @Column(name = "bsc_mat_bld_id_7", nullable = false, length = 1)
    public String getBscMatBldId7() {
        return bscMatBldId7;
    }

    public void setBscMatBldId7(String bscMatBldId7) {
        this.bscMatBldId7 = bscMatBldId7;
    }

    @Column(name = "bsc_mat_bld_vol_7", nullable = false)
    public Integer getBscMatBldVol7() {
        return bscMatBldVol7;
    }

    public void setBscMatBldVol7(Integer bscMatBldVol7) {
        this.bscMatBldVol7 = bscMatBldVol7;
    }

    @Column(name = "bsc_mat_bld_typ_8", nullable = false, length = 1)
    public String getBscMatBldTyp8() {
        return bscMatBldTyp8;
    }

    public void setBscMatBldTyp8(String bscMatBldTyp8) {
        this.bscMatBldTyp8 = bscMatBldTyp8;
    }

    @Column(name = "bsc_mat_bld_id_8", nullable = false, length = 1)
    public String getBscMatBldId8() {
        return bscMatBldId8;
    }

    public void setBscMatBldId8(String bscMatBldId8) {
        this.bscMatBldId8 = bscMatBldId8;
    }

    @Column(name = "bsc_mat_bld_vol_8", nullable = false)
    public Integer getBscMatBldVol8() {
        return bscMatBldVol8;
    }

    public void setBscMatBldVol8(Integer bscMatBldVol8) {
        this.bscMatBldVol8 = bscMatBldVol8;
    }

    @Column(name = "bsc_mat_bld_tot_vol", nullable = false)
    public Integer getBscMatBldTotVol() {
        return bscMatBldTotVol;
    }

    public void setBscMatBldTotVol(Integer bscMatBldTotVol) {
        this.bscMatBldTotVol = bscMatBldTotVol;
    }

    @Column(name = "bsc_mat_bld_time", nullable = false, length = 1)
    public String getBscMatBldTime() {
        return bscMatBldTime;
    }

    public void setBscMatBldTime(String bscMatBldTime) {
        this.bscMatBldTime = bscMatBldTime;
    }

    @Column(name = "bsc_mat_bld_com", nullable = false)
    public String getBscMatBldCom() {
        return bscMatBldCom;
    }

    public void setBscMatBldCom(String bscMatBldCom) {
        this.bscMatBldCom = bscMatBldCom;
    }

    @Column(name = "bsc_mat_slva_col", nullable = false)
    public Boolean getBscMatSlvaCol() {
        return bscMatSlvaCol;
    }

    public void setBscMatSlvaCol(Boolean bscMatSlvaCol) {
        this.bscMatSlvaCol = bscMatSlvaCol;
    }

    @Column(name = "bsc_mat_slva_rsn", nullable = false, length = 1)
    public String getBscMatSlvaRsn() {
        return bscMatSlvaRsn;
    }

    public void setBscMatSlvaRsn(String bscMatSlvaRsn) {
        this.bscMatSlvaRsn = bscMatSlvaRsn;
    }

    @Column(name = "bsc_mat_slva_specify", nullable = false)
    public String getBscMatSlvaSpecify() {
        return bscMatSlvaSpecify;
    }

    public void setBscMatSlvaSpecify(String bscMatSlvaSpecify) {
        this.bscMatSlvaSpecify = bscMatSlvaSpecify;
    }

    @Column(name = "bsc_mat_slva_id", nullable = false, length = 1)
    public String getBscMatSlvaId() {
        return bscMatSlvaId;
    }

    public void setBscMatSlvaId(String bscMatSlvaId) {
        this.bscMatSlvaId = bscMatSlvaId;
    }

    @Column(name = "bsc_mat_slva_time", nullable = false, length = 1)
    public String getBscMatSlvaTime() {
        return bscMatSlvaTime;
    }

    public void setBscMatSlvaTime(String bscMatSlvaTime) {
        this.bscMatSlvaTime = bscMatSlvaTime;
    }

    @Column(name = "bsc_mat_slva_com", nullable = false)
    public String getBscMatSlvaCom() {
        return bscMatSlvaCom;
    }

    public void setBscMatSlvaCom(String bscMatSlvaCom) {
        this.bscMatSlvaCom = bscMatSlvaCom;
    }

    @Column(name = "bsc_mat_vag_col", nullable = false)
    public Boolean getBscMatVagCol() {
        return bscMatVagCol;
    }

    public void setBscMatVagCol(Boolean bscMatVagCol) {
        this.bscMatVagCol = bscMatVagCol;
    }

    @Column(name = "bsc_mat_vag_rsn", nullable = false, length = 1)
    public String getBscMatVagRsn() {
        return bscMatVagRsn;
    }

    public void setBscMatVagRsn(String bscMatVagRsn) {
        this.bscMatVagRsn = bscMatVagRsn;
    }

    @Column(name = "bsc_mat_vag_specify", nullable = false)
    public String getBscMatVagSpecify() {
        return bscMatVagSpecify;
    }

    public void setBscMatVagSpecify(String bscMatVagSpecify) {
        this.bscMatVagSpecify = bscMatVagSpecify;
    }

    @Column(name = "bsc_mat_vag_id", nullable = false, length = 1)
    public String getBscMatVagId() {
        return bscMatVagId;
    }

    public void setBscMatVagId(String bscMatVagId) {
        this.bscMatVagId = bscMatVagId;
    }

    @Column(name = "bsc_mat_vag_time", nullable = false, length = 1)
    public String getBscMatVagTime() {
        return bscMatVagTime;
    }

    public void setBscMatVagTime(String bscMatVagTime) {
        this.bscMatVagTime = bscMatVagTime;
    }

    @Column(name = "bsc_mat_vag_com", nullable = false)
    public String getBscMatVagCom() {
        return bscMatVagCom;
    }

    public void setBscMatVagCom(String bscMatVagCom) {
        this.bscMatVagCom = bscMatVagCom;
    }

    @Column(name = "bsc_mat_vst_urn_col", nullable = false)
    public Boolean getBscMatVstUrnCol() {
        return bscMatVstUrnCol;
    }

    public void setBscMatVstUrnCol(Boolean bscMatVstUrnCol) {
        this.bscMatVstUrnCol = bscMatVstUrnCol;
    }

    @Column(name = "bsc_mat_vst_urn_rsn", nullable = false, length = 1)
    public String getBscMatVstUrnRsn() {
        return bscMatVstUrnRsn;
    }

    public void setBscMatVstUrnRsn(String bscMatVstUrnRsn) {
        this.bscMatVstUrnRsn = bscMatVstUrnRsn;
    }

    @Column(name = "bsc_mat_vst_urn_specify", nullable = false)
    public String getBscMatVstUrnSpecify() {
        return bscMatVstUrnSpecify;
    }

    public void setBscMatVstUrnSpecify(String bscMatVstUrnSpecify) {
        this.bscMatVstUrnSpecify = bscMatVstUrnSpecify;
    }

    @Column(name = "bsc_mat_vst_urn_id", nullable = false, length = 1)
    public String getBscMatVstUrnId() {
        return bscMatVstUrnId;
    }

    public void setBscMatVstUrnId(String bscMatVstUrnId) {
        this.bscMatVstUrnId = bscMatVstUrnId;
    }

    @Column(name = "bsc_mat_vst_urn_time", nullable = false, length = 1)
    public String getBscMatVstUrnTime() {
        return bscMatVstUrnTime;
    }

    public void setBscMatVstUrnTime(String bscMatVstUrnTime) {
        this.bscMatVstUrnTime = bscMatVstUrnTime;
    }

    @Column(name = "bsc_mat_vst_urn_com", nullable = false)
    public String getBscMatVstUrnCom() {
        return bscMatVstUrnCom;
    }

    public void setBscMatVstUrnCom(String bscMatVstUrnCom) {
        this.bscMatVstUrnCom = bscMatVstUrnCom;
    }

    @Column(name = "bsc_mat_hom_urn_col", nullable = false)
    public Boolean getBscMatHomUrnCol() {
        return bscMatHomUrnCol;
    }

    public void setBscMatHomUrnCol(Boolean bscMatHomUrnCol) {
        this.bscMatHomUrnCol = bscMatHomUrnCol;
    }

    @Column(name = "bsc_mat_hom_urn_rsn", nullable = false, length = 1)
    public String getBscMatHomUrnRsn() {
        return bscMatHomUrnRsn;
    }

    public void setBscMatHomUrnRsn(String bscMatHomUrnRsn) {
        this.bscMatHomUrnRsn = bscMatHomUrnRsn;
    }

    @Column(name = "bsc_mat_hom_urn_specify", nullable = false)
    public String getBscMatHomUrnSpecify() {
        return bscMatHomUrnSpecify;
    }

    public void setBscMatHomUrnSpecify(String bscMatHomUrnSpecify) {
        this.bscMatHomUrnSpecify = bscMatHomUrnSpecify;
    }

    @Column(name = "bsc_mat_hom_urn_num", nullable = false)
    public Integer getBscMatHomUrnNum() {
        return bscMatHomUrnNum;
    }

    public void setBscMatHomUrnNum(Integer bscMatHomUrnNum) {
        this.bscMatHomUrnNum = bscMatHomUrnNum;
    }

    @Column(name = "bsc_mat_hom_urn_id1", nullable = false, length = 1)
    public String getBscMatHomUrnId1() {
        return bscMatHomUrnId1;
    }

    public void setBscMatHomUrnId1(String bscMatHomUrnId1) {
        this.bscMatHomUrnId1 = bscMatHomUrnId1;
    }

    @Column(name = "bsc_mat_hom_urn_dat1", nullable = false)
    public Date getBscMatHomUrnDat1() {
        return bscMatHomUrnDat1;
    }

    public void setBscMatHomUrnDat1(Date bscMatHomUrnDat1) {
        this.bscMatHomUrnDat1 = bscMatHomUrnDat1;
    }

    @Column(name = "bsc_mat_hom_urn_time1", nullable = false, length = 1)
    public String getBscMatHomUrnTime1() {
        return bscMatHomUrnTime1;
    }

    public void setBscMatHomUrnTime1(String bscMatHomUrnTime1) {
        this.bscMatHomUrnTime1 = bscMatHomUrnTime1;
    }

    @Column(name = "bsc_mat_hom_urn_com1", nullable = false)
    public String getBscMatHomUrnCom1() {
        return bscMatHomUrnCom1;
    }

    public void setBscMatHomUrnCom1(String bscMatHomUrnCom1) {
        this.bscMatHomUrnCom1 = bscMatHomUrnCom1;
    }

    @Column(name = "bsc_mat_hom_urn_id2", nullable = false, length = 1)
    public String getBscMatHomUrnId2() {
        return bscMatHomUrnId2;
    }

    public void setBscMatHomUrnId2(String bscMatHomUrnId2) {
        this.bscMatHomUrnId2 = bscMatHomUrnId2;
    }

    @Column(name = "bsc_mat_hom_urn_dat2", nullable = false)
    public Date getBscMatHomUrnDat2() {
        return bscMatHomUrnDat2;
    }

    public void setBscMatHomUrnDat2(Date bscMatHomUrnDat2) {
        this.bscMatHomUrnDat2 = bscMatHomUrnDat2;
    }

    @Column(name = "bsc_mat_hom_urn_time2", nullable = false, length = 1)
    public String getBscMatHomUrnTime2() {
        return bscMatHomUrnTime2;
    }

    public void setBscMatHomUrnTime2(String bscMatHomUrnTime2) {
        this.bscMatHomUrnTime2 = bscMatHomUrnTime2;
    }

    @Column(name = "bsc_mat_hom_urn_com2", nullable = false)
    public String getBscMatHomUrnCom2() {
        return bscMatHomUrnCom2;
    }

    public void setBscMatHomUrnCom2(String bscMatHomUrnCom2) {
        this.bscMatHomUrnCom2 = bscMatHomUrnCom2;
    }

    @Column(name = "bsc_mat_hom_urn_id3", nullable = false, length = 1)
    public String getBscMatHomUrnId3() {
        return bscMatHomUrnId3;
    }

    public void setBscMatHomUrnId3(String bscMatHomUrnId3) {
        this.bscMatHomUrnId3 = bscMatHomUrnId3;
    }

    @Column(name = "bsc_mat_hom_urn_dat3", nullable = false)
    public Date getBscMatHomUrnDat3() {
        return bscMatHomUrnDat3;
    }

    public void setBscMatHomUrnDat3(Date bscMatHomUrnDat3) {
        this.bscMatHomUrnDat3 = bscMatHomUrnDat3;
    }

    @Column(name = "bsc_mat_hom_urn_time3", nullable = false, length = 1)
    public String getBscMatHomUrnTime3() {
        return bscMatHomUrnTime3;
    }

    public void setBscMatHomUrnTime3(String bscMatHomUrnTime3) {
        this.bscMatHomUrnTime3 = bscMatHomUrnTime3;
    }

    @Column(name = "bsc_mat_hom_urn_com3", nullable = false)
    public String getBscMatHomUrnCom3() {
        return bscMatHomUrnCom3;
    }

    public void setBscMatHomUrnCom3(String bscMatHomUrnCom3) {
        this.bscMatHomUrnCom3 = bscMatHomUrnCom3;
    }

    @Column(name = "bsc_mat_hom_urn_id4", nullable = false, length = 1)
    public String getBscMatHomUrnId4() {
        return bscMatHomUrnId4;
    }

    public void setBscMatHomUrnId4(String bscMatHomUrnId4) {
        this.bscMatHomUrnId4 = bscMatHomUrnId4;
    }

    @Column(name = "bsc_mat_hom_urn_dat4", nullable = false)
    public Date getBscMatHomUrnDat4() {
        return bscMatHomUrnDat4;
    }

    public void setBscMatHomUrnDat4(Date bscMatHomUrnDat4) {
        this.bscMatHomUrnDat4 = bscMatHomUrnDat4;
    }

    @Column(name = "bsc_mat_hom_urn_time4", nullable = false, length = 1)
    public String getBscMatHomUrnTime4() {
        return bscMatHomUrnTime4;
    }

    public void setBscMatHomUrnTime4(String bscMatHomUrnTime4) {
        this.bscMatHomUrnTime4 = bscMatHomUrnTime4;
    }

    @Column(name = "bsc_mat_hom_urn_com4", nullable = false)
    public String getBscMatHomUrnCom4() {
        return bscMatHomUrnCom4;
    }

    public void setBscMatHomUrnCom4(String bscMatHomUrnCom4) {
        this.bscMatHomUrnCom4 = bscMatHomUrnCom4;
    }

    @Column(name = "bsc_mat_other_col", nullable = false)
    public Boolean getBscMatOtherCol() {
        return bscMatOtherCol;
    }

    public void setBscMatOtherCol(Boolean bscMatOtherCol) {
        this.bscMatOtherCol = bscMatOtherCol;
    }

    @Column(name = "bsc_mat_other_type", nullable = false, length = 1)
    public String getBscMatOtherType() {
        return bscMatOtherType;
    }

    public void setBscMatOtherType(String bscMatOtherType) {
        this.bscMatOtherType = bscMatOtherType;
    }

    @Column(name = "bsc_mat_other_type_specify", nullable = false)
    public String getBscMatOtherTypeSpecify() {
        return bscMatOtherTypeSpecify;
    }

    public void setBscMatOtherTypeSpecify(String bscMatOtherTypeSpecify) {
        this.bscMatOtherTypeSpecify = bscMatOtherTypeSpecify;
    }

    @Column(name = "bsc_person1", nullable = false, length = 50)
    public String getBscPerson1() {
        return bscPerson1;
    }

    public void setBscPerson1(String bscPerson1) {
        this.bscPerson1 = bscPerson1;
    }

    @Column(name = "bsc_complete_date1", nullable = false)
    public Date getBscCompleteDate1() {
        return bscCompleteDate1;
    }

    public void setBscCompleteDate1(Date bscCompleteDate1) {
        this.bscCompleteDate1 = bscCompleteDate1;
    }

    @Column(name = "bsc_person2", nullable = false, length = 50)
    public String getBscPerson2() {
        return bscPerson2;
    }

    public void setBscPerson2(String bscPerson2) {
        this.bscPerson2 = bscPerson2;
    }

    @Column(name = "bsc_complete_date2", nullable = false)
    public Date getBscCompleteDate2() {
        return bscCompleteDate2;
    }

    public void setBscCompleteDate2(Date bscCompleteDate2) {
        this.bscCompleteDate2 = bscCompleteDate2;
    }

    @Column(name = "bsc_person3", nullable = false, length = 50)
    public String getBscPerson3() {
        return bscPerson3;
    }

    public void setBscPerson3(String bscPerson3) {
        this.bscPerson3 = bscPerson3;
    }

    @Column(name = "bsc_complete_date3", nullable = false)
    public Date getBscCompleteDate3() {
        return bscCompleteDate3;
    }

    public void setBscCompleteDate3(Date bscCompleteDate3) {
        this.bscCompleteDate3 = bscCompleteDate3;
    }
}
