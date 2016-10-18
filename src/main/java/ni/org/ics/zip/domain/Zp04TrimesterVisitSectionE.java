package ni.org.ics.zip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by FIRSTICT on 10/10/2016.
 * V1.0
 */
@Entity
@Table(name = "zp04_trimester_visit_section_e", catalog = "zika_zip")
public class Zp04TrimesterVisitSectionE {

    private String recordId;
    private String tri24HrsDeodorant;
    private String triBrandDeodorant;
    private String triFragFreeDeodorant;
    private String tri24HrsHairGel;
    private String triBrandHairGel;
    private String triFragFreeHairGel;
    private String tri24HrsConditioner;
    private String triBrandConditioner;
    private String triFragFreeConditioner;
    private String tri24HrsShampoo;
    private String triBrandShampoo;
    private String triFragFreeShampoo;
    private String tri24HrsOtherHair;
    private String triBrandOtherHair;
    private String triFragFreeOtherHair;
    private String tri24HrsPerfume;
    private String triBrandPerfume;
    private String triFragFreePerfume;
    private String tri24HrsBarSoap;
    private String triBrandBarSoap;
    private String triFragFreeBarSoap;
    private String tri24HrsLiqSoap;
    private String triBrandLiqSoap;
    private String triFragFreeLiqSoap;
    private String tri24HrsLotion;
    private String triBrandLotion;
    private String triFragFreeLotion;
    private String tri24HrsShavCream;
    private String triBrandShavCream;
    private String triFragFreeShavCream;
    private String tri24HrsColorCos;
    private String triBrandColorCos;
    private String triFragFreeColorCos;
    private String tri24HrsSunscreen;
    private String triBrandSunscreen;
    private String triFragFreeSunscreen;
    private String tri24HrsNailPol;
    private String triBrandNailPol;
    private String triFragFreeNailPol;
    private String tri24HrsFurnPol;
    private String triBrandFurnPol;
    private String triFragFreeFurnPol;
    private String tri24HrsCleaners;
    private String triBrandCleaners;
    private String triFragFreeCleaners;
    private String tri24HrsFloorWax;
    private String triBrandFloorWax;
    private String triFragFreeFloorWax;
    private String tri24HrsSoftnr;
    private String triBrandSoftnr;
    private String triFragFreeSoftnr;
    private String tri24HrsLaundDet;
    private String triBrandLaundDet;
    private String triFragFreeLaundDet;
    private String tri24HrsLaundStrch;
    private String triBrandLaundStrch;
    private String triFragFreeLaundStrch;
    private String tri24HrsPaint;
    private String triBrandPaint;
    private String triFragFreePaint;
    private String tri24HrsSolvents;
    private String triBrandSolvents;
    private String triFragFreeSolvents;
    private String tri24HrsCarWax;
    private String triBrandCarWax;
    private String triFragFreeCarWax;
    private String tri24HrsPest;
    private String triBrandPest;
    private String triFragFreePest;
    private String tri24HrsFleaTickPrev;
    private String triBrandFleaTickPrev;
    private String triFleaTickPrev;
    private String tri24HrsFleaTickSpry;
    private String triBrandFleaTickSpry;
    private String triFleaTickSpry;
    private String tri24HrsCaritin;
    private String triBrandCaritin;
    private String triFragFreeCaritin;
    private String tri24HrsZyrtec;
    private String triBrandZyrtec;
    private String triFragFreeZyrtec;
    private String tri24HrsVita;
    private String triBrandVita;
    private String triFragFreeVita;
    private String tri24HrsHerbal;
    private String triBrandHerbal;
    private String triFragFreeHerbal;
    private String tri24HrsCreatine;
    private String triBrandCreatine;
    private String triFragFreeCreatine;
    private String tri24HrsProtein;
    private String triBrandProtein;
    private String triFragFreeProtein;
    private String tri24HrsDiuretic;
    private String triBrandDiuretic;
    private String triFragFreeDiuretic;
    private String tri24HrsInsulin;
    private String triBrandInsulin;
    private String triFragFreeInsulin;
    private String tri24HrsMouthwsh;
    private String triBrandMouthwsh;
    private String triFragFreeMouthwsh;
    private String triFragFreeOverall;
    private String triSurgInd;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "tri_24_hrs_deodorant", nullable = true, length = 1)
    public String getTri24HrsDeodorant() {
        return tri24HrsDeodorant;
    }

    public void setTri24HrsDeodorant(String tri24HrsDeodorant) {
        this.tri24HrsDeodorant = tri24HrsDeodorant;
    }

    @Column(name = "tri_brand_deodorant", nullable = true)
    public String getTriBrandDeodorant() {
        return triBrandDeodorant;
    }

    public void setTriBrandDeodorant(String triBrandDeodorant) {
        this.triBrandDeodorant = triBrandDeodorant;
    }

    @Column(name = "tri_frag_free_deodorant", nullable = true, length = 1)
    public String getTriFragFreeDeodorant() {
        return triFragFreeDeodorant;
    }

    public void setTriFragFreeDeodorant(String triFragFreeDeodorant) {
        this.triFragFreeDeodorant = triFragFreeDeodorant;
    }

    @Column(name = "tri_24_hrs_hair_gel", nullable = true, length = 1)
    public String getTri24HrsHairGel() {
        return tri24HrsHairGel;
    }

    public void setTri24HrsHairGel(String tri24HrsHairGel) {
        this.tri24HrsHairGel = tri24HrsHairGel;
    }

    @Column(name = "tri_brand_hair_gel", nullable = true)
    public String getTriBrandHairGel() {
        return triBrandHairGel;
    }

    public void setTriBrandHairGel(String triBrandHairGel) {
        this.triBrandHairGel = triBrandHairGel;
    }

    @Column(name = "tri_frag_free_hair_gel", nullable = true, length = 1)
    public String getTriFragFreeHairGel() {
        return triFragFreeHairGel;
    }

    public void setTriFragFreeHairGel(String triFragFreeHairGel) {
        this.triFragFreeHairGel = triFragFreeHairGel;
    }

    @Column(name = "tri_24_hrs_conditioner", nullable = true, length = 1)
    public String getTri24HrsConditioner() {
        return tri24HrsConditioner;
    }

    public void setTri24HrsConditioner(String tri24HrsConditioner) {
        this.tri24HrsConditioner = tri24HrsConditioner;
    }

    @Column(name = "tri_brand_conditioner", nullable = true)
    public String getTriBrandConditioner() {
        return triBrandConditioner;
    }

    public void setTriBrandConditioner(String triBrandConditioner) {
        this.triBrandConditioner = triBrandConditioner;
    }

    @Column(name = "tri_frag_free_conditioner", nullable = true, length = 1)
    public String getTriFragFreeConditioner() {
        return triFragFreeConditioner;
    }

    public void setTriFragFreeConditioner(String triFragFreeConditioner) {
        this.triFragFreeConditioner = triFragFreeConditioner;
    }

    @Column(name = "tri_24_hrs_shampoo", nullable = true, length = 1)
    public String getTri24HrsShampoo() {
        return tri24HrsShampoo;
    }

    public void setTri24HrsShampoo(String tri24HrsShampoo) {
        this.tri24HrsShampoo = tri24HrsShampoo;
    }

    @Column(name = "tri_brand_shampoo", nullable = true)
    public String getTriBrandShampoo() {
        return triBrandShampoo;
    }

    public void setTriBrandShampoo(String triBrandShampoo) {
        this.triBrandShampoo = triBrandShampoo;
    }

    @Column(name = "tri_frag_free_shampoo", nullable = true, length = 1)
    public String getTriFragFreeShampoo() {
        return triFragFreeShampoo;
    }

    public void setTriFragFreeShampoo(String triFragFreeShampoo) {
        this.triFragFreeShampoo = triFragFreeShampoo;
    }

    @Column(name = "tri_24_hrs_other_hair", nullable = true, length = 1)
    public String getTri24HrsOtherHair() {
        return tri24HrsOtherHair;
    }

    public void setTri24HrsOtherHair(String tri24HrsOtherHair) {
        this.tri24HrsOtherHair = tri24HrsOtherHair;
    }

    @Column(name = "tri_brand_other_hair", nullable = true)
    public String getTriBrandOtherHair() {
        return triBrandOtherHair;
    }

    public void setTriBrandOtherHair(String triBrandOtherHair) {
        this.triBrandOtherHair = triBrandOtherHair;
    }

    @Column(name = "tri_frag_free_other_hair", nullable = true, length = 1)
    public String getTriFragFreeOtherHair() {
        return triFragFreeOtherHair;
    }

    public void setTriFragFreeOtherHair(String triFragFreeOtherHair) {
        this.triFragFreeOtherHair = triFragFreeOtherHair;
    }

    @Column(name = "tri_24_hrs_perfume", nullable = true, length = 1)
    public String getTri24HrsPerfume() {
        return tri24HrsPerfume;
    }

    public void setTri24HrsPerfume(String tri24HrsPerfume) {
        this.tri24HrsPerfume = tri24HrsPerfume;
    }

    @Column(name = "tri_brand_perfume", nullable = true)
    public String getTriBrandPerfume() {
        return triBrandPerfume;
    }

    public void setTriBrandPerfume(String triBrandPerfume) {
        this.triBrandPerfume = triBrandPerfume;
    }

    @Column(name = "tri_frag_free_perfume", nullable = true, length = 1)
    public String getTriFragFreePerfume() {
        return triFragFreePerfume;
    }

    public void setTriFragFreePerfume(String triFragFreePerfume) {
        this.triFragFreePerfume = triFragFreePerfume;
    }

    @Column(name = "tri_24_hrs_bar_soap", nullable = true, length = 1)
    public String getTri24HrsBarSoap() {
        return tri24HrsBarSoap;
    }

    public void setTri24HrsBarSoap(String tri24HrsBarSoap) {
        this.tri24HrsBarSoap = tri24HrsBarSoap;
    }

    @Column(name = "tri_brand_bar_soap", nullable = true)
    public String getTriBrandBarSoap() {
        return triBrandBarSoap;
    }

    public void setTriBrandBarSoap(String triBrandBarSoap) {
        this.triBrandBarSoap = triBrandBarSoap;
    }

    @Column(name = "tri_frag_free_bar_soap", nullable = true, length = 1)
    public String getTriFragFreeBarSoap() {
        return triFragFreeBarSoap;
    }

    public void setTriFragFreeBarSoap(String triFragFreeBarSoap) {
        this.triFragFreeBarSoap = triFragFreeBarSoap;
    }

    @Column(name = "tri_24_hrs_liq_soap", nullable = true, length = 1)
    public String getTri24HrsLiqSoap() {
        return tri24HrsLiqSoap;
    }

    public void setTri24HrsLiqSoap(String tri24HrsLiqSoap) {
        this.tri24HrsLiqSoap = tri24HrsLiqSoap;
    }

    @Column(name = "tri_brand_liq_soap", nullable = true)
    public String getTriBrandLiqSoap() {
        return triBrandLiqSoap;
    }

    public void setTriBrandLiqSoap(String triBrandLiqSoap) {
        this.triBrandLiqSoap = triBrandLiqSoap;
    }

    @Column(name = "tri_frag_free_liq_soap", nullable = true, length = 1)
    public String getTriFragFreeLiqSoap() {
        return triFragFreeLiqSoap;
    }

    public void setTriFragFreeLiqSoap(String triFragFreeLiqSoap) {
        this.triFragFreeLiqSoap = triFragFreeLiqSoap;
    }

    @Column(name = "tri_24_hrs_lotion", nullable = true, length = 1)
    public String getTri24HrsLotion() {
        return tri24HrsLotion;
    }

    public void setTri24HrsLotion(String tri24HrsLotion) {
        this.tri24HrsLotion = tri24HrsLotion;
    }

    @Column(name = "tri_brand_lotion", nullable = true)
    public String getTriBrandLotion() {
        return triBrandLotion;
    }

    public void setTriBrandLotion(String triBrandLotion) {
        this.triBrandLotion = triBrandLotion;
    }

    @Column(name = "tri_frag_free_lotion", nullable = true, length = 1)
    public String getTriFragFreeLotion() {
        return triFragFreeLotion;
    }

    public void setTriFragFreeLotion(String triFragFreeLotion) {
        this.triFragFreeLotion = triFragFreeLotion;
    }

    @Column(name = "tri_24_hrs_shav_cream", nullable = true, length = 1)
    public String getTri24HrsShavCream() {
        return tri24HrsShavCream;
    }

    public void setTri24HrsShavCream(String tri24HrsShavCream) {
        this.tri24HrsShavCream = tri24HrsShavCream;
    }

    @Column(name = "tri_brand_shav_cream", nullable = true)
    public String getTriBrandShavCream() {
        return triBrandShavCream;
    }

    public void setTriBrandShavCream(String triBrandShavCream) {
        this.triBrandShavCream = triBrandShavCream;
    }

    @Column(name = "tri_frag_free_shav_cream", nullable = true, length = 1)
    public String getTriFragFreeShavCream() {
        return triFragFreeShavCream;
    }

    public void setTriFragFreeShavCream(String triFragFreeShavCream) {
        this.triFragFreeShavCream = triFragFreeShavCream;
    }

    @Column(name = "tri_24_hrs_color_cos", nullable = true, length = 1)
    public String getTri24HrsColorCos() {
        return tri24HrsColorCos;
    }

    public void setTri24HrsColorCos(String tri24HrsColorCos) {
        this.tri24HrsColorCos = tri24HrsColorCos;
    }

    @Column(name = "tri_brand_color_cos", nullable = true)
    public String getTriBrandColorCos() {
        return triBrandColorCos;
    }

    public void setTriBrandColorCos(String triBrandColorCos) {
        this.triBrandColorCos = triBrandColorCos;
    }

    @Column(name = "tri_frag_free_color_cos", nullable = true, length = 1)
    public String getTriFragFreeColorCos() {
        return triFragFreeColorCos;
    }

    public void setTriFragFreeColorCos(String triFragFreeColorCos) {
        this.triFragFreeColorCos = triFragFreeColorCos;
    }

    @Column(name = "tri_24_hrs_sunscreen", nullable = true, length = 1)
    public String getTri24HrsSunscreen() {
        return tri24HrsSunscreen;
    }

    public void setTri24HrsSunscreen(String tri24HrsSunscreen) {
        this.tri24HrsSunscreen = tri24HrsSunscreen;
    }

    @Column(name = "tri_brand_sunscreen", nullable = true)
    public String getTriBrandSunscreen() {
        return triBrandSunscreen;
    }

    public void setTriBrandSunscreen(String triBrandSunscreen) {
        this.triBrandSunscreen = triBrandSunscreen;
    }

    @Column(name = "tri_frag_free_sunscreen", nullable = true, length = 1)
    public String getTriFragFreeSunscreen() {
        return triFragFreeSunscreen;
    }

    public void setTriFragFreeSunscreen(String triFragFreeSunscreen) {
        this.triFragFreeSunscreen = triFragFreeSunscreen;
    }

    @Column(name = "tri_24_hrs_nail_pol", nullable = true, length = 1)
    public String getTri24HrsNailPol() {
        return tri24HrsNailPol;
    }

    public void setTri24HrsNailPol(String tri24HrsNailPol) {
        this.tri24HrsNailPol = tri24HrsNailPol;
    }

    @Column(name = "tri_brand_nail_pol", nullable = true)
    public String getTriBrandNailPol() {
        return triBrandNailPol;
    }

    public void setTriBrandNailPol(String triBrandNailPol) {
        this.triBrandNailPol = triBrandNailPol;
    }

    @Column(name = "tri_frag_free_nail_pol", nullable = true, length = 1)
    public String getTriFragFreeNailPol() {
        return triFragFreeNailPol;
    }

    public void setTriFragFreeNailPol(String triFragFreeNailPol) {
        this.triFragFreeNailPol = triFragFreeNailPol;
    }

    @Column(name = "tri_24_hrs_furn_pol", nullable = true, length = 1)
    public String getTri24HrsFurnPol() {
        return tri24HrsFurnPol;
    }

    public void setTri24HrsFurnPol(String tri24HrsFurnPol) {
        this.tri24HrsFurnPol = tri24HrsFurnPol;
    }

    @Column(name = "tri_brand_furn_pol", nullable = true)
    public String getTriBrandFurnPol() {
        return triBrandFurnPol;
    }

    public void setTriBrandFurnPol(String triBrandFurnPol) {
        this.triBrandFurnPol = triBrandFurnPol;
    }

    @Column(name = "tri_frag_free_furn_pol", nullable = true, length = 1)
    public String getTriFragFreeFurnPol() {
        return triFragFreeFurnPol;
    }

    public void setTriFragFreeFurnPol(String triFragFreeFurnPol) {
        this.triFragFreeFurnPol = triFragFreeFurnPol;
    }

    @Column(name = "tri_24_hrs_cleaners", nullable = true, length = 1)
    public String getTri24HrsCleaners() {
        return tri24HrsCleaners;
    }

    public void setTri24HrsCleaners(String tri24HrsCleaners) {
        this.tri24HrsCleaners = tri24HrsCleaners;
    }

    @Column(name = "tri_brand_cleaners", nullable = true)
    public String getTriBrandCleaners() {
        return triBrandCleaners;
    }

    public void setTriBrandCleaners(String triBrandCleaners) {
        this.triBrandCleaners = triBrandCleaners;
    }

    @Column(name = "tri_frag_free_cleaners", nullable = true, length = 1)
    public String getTriFragFreeCleaners() {
        return triFragFreeCleaners;
    }

    public void setTriFragFreeCleaners(String triFragFreeCleaners) {
        this.triFragFreeCleaners = triFragFreeCleaners;
    }

    @Column(name = "tri_24_hrs_floor_wax", nullable = true, length = 1)
    public String getTri24HrsFloorWax() {
        return tri24HrsFloorWax;
    }

    public void setTri24HrsFloorWax(String tri24HrsFloorWax) {
        this.tri24HrsFloorWax = tri24HrsFloorWax;
    }

    @Column(name = "tri_brand_floor_wax", nullable = true)
    public String getTriBrandFloorWax() {
        return triBrandFloorWax;
    }

    public void setTriBrandFloorWax(String triBrandFloorWax) {
        this.triBrandFloorWax = triBrandFloorWax;
    }

    @Column(name = "tri_frag_free_floor_wax", nullable = true, length = 1)
    public String getTriFragFreeFloorWax() {
        return triFragFreeFloorWax;
    }

    public void setTriFragFreeFloorWax(String triFragFreeFloorWax) {
        this.triFragFreeFloorWax = triFragFreeFloorWax;
    }

    @Column(name = "tri_24_hrs_softnr", nullable = true, length = 1)
    public String getTri24HrsSoftnr() {
        return tri24HrsSoftnr;
    }

    public void setTri24HrsSoftnr(String tri24HrsSoftnr) {
        this.tri24HrsSoftnr = tri24HrsSoftnr;
    }

    @Column(name = "tri_brand_softnr", nullable = true)
    public String getTriBrandSoftnr() {
        return triBrandSoftnr;
    }

    public void setTriBrandSoftnr(String triBrandSoftnr) {
        this.triBrandSoftnr = triBrandSoftnr;
    }

    @Column(name = "tri_frag_free_softnr", nullable = true, length = 1)
    public String getTriFragFreeSoftnr() {
        return triFragFreeSoftnr;
    }

    public void setTriFragFreeSoftnr(String triFragFreeSoftnr) {
        this.triFragFreeSoftnr = triFragFreeSoftnr;
    }

    @Column(name = "tri_24_hrs_laund_det", nullable = true, length = 1)
    public String getTri24HrsLaundDet() {
        return tri24HrsLaundDet;
    }

    public void setTri24HrsLaundDet(String tri24HrsLaundDet) {
        this.tri24HrsLaundDet = tri24HrsLaundDet;
    }

    @Column(name = "tri_brand_laund_det", nullable = true)
    public String getTriBrandLaundDet() {
        return triBrandLaundDet;
    }

    public void setTriBrandLaundDet(String triBrandLaundDet) {
        this.triBrandLaundDet = triBrandLaundDet;
    }

    @Column(name = "tri_frag_free_laund_det", nullable = true, length = 1)
    public String getTriFragFreeLaundDet() {
        return triFragFreeLaundDet;
    }

    public void setTriFragFreeLaundDet(String triFragFreeLaundDet) {
        this.triFragFreeLaundDet = triFragFreeLaundDet;
    }

    @Column(name = "tri_24_hrs_laund_strch", nullable = true, length = 1)
    public String getTri24HrsLaundStrch() {
        return tri24HrsLaundStrch;
    }

    public void setTri24HrsLaundStrch(String tri24HrsLaundStrch) {
        this.tri24HrsLaundStrch = tri24HrsLaundStrch;
    }

    @Column(name = "tri_brand_laund_strch", nullable = true)
    public String getTriBrandLaundStrch() {
        return triBrandLaundStrch;
    }

    public void setTriBrandLaundStrch(String triBrandLaundStrch) {
        this.triBrandLaundStrch = triBrandLaundStrch;
    }

    @Column(name = "tri_frag_free_laund_strch", nullable = true, length = 1)
    public String getTriFragFreeLaundStrch() {
        return triFragFreeLaundStrch;
    }

    public void setTriFragFreeLaundStrch(String triFragFreeLaundStrch) {
        this.triFragFreeLaundStrch = triFragFreeLaundStrch;
    }

    @Column(name = "tri_24_hrs_paint", nullable = true, length = 1)
    public String getTri24HrsPaint() {
        return tri24HrsPaint;
    }

    public void setTri24HrsPaint(String tri24HrsPaint) {
        this.tri24HrsPaint = tri24HrsPaint;
    }

    @Column(name = "tri_brand_paint", nullable = true)
    public String getTriBrandPaint() {
        return triBrandPaint;
    }

    public void setTriBrandPaint(String triBrandPaint) {
        this.triBrandPaint = triBrandPaint;
    }

    @Column(name = "tri_frag_free_paint", nullable = true, length = 1)
    public String getTriFragFreePaint() {
        return triFragFreePaint;
    }

    public void setTriFragFreePaint(String triFragFreePaint) {
        this.triFragFreePaint = triFragFreePaint;
    }

    @Column(name = "tri_24_hrs_solvents", nullable = true, length = 1)
    public String getTri24HrsSolvents() {
        return tri24HrsSolvents;
    }

    public void setTri24HrsSolvents(String tri24HrsSolvents) {
        this.tri24HrsSolvents = tri24HrsSolvents;
    }

    @Column(name = "tri_brand_solvents", nullable = true)
    public String getTriBrandSolvents() {
        return triBrandSolvents;
    }

    public void setTriBrandSolvents(String triBrandSolvents) {
        this.triBrandSolvents = triBrandSolvents;
    }

    @Column(name = "tri_frag_free_solvents", nullable = true, length = 1)
    public String getTriFragFreeSolvents() {
        return triFragFreeSolvents;
    }

    public void setTriFragFreeSolvents(String triFragFreeSolvents) {
        this.triFragFreeSolvents = triFragFreeSolvents;
    }

    @Column(name = "tri_24_hrs_car_wax", nullable = true, length = 1)
    public String getTri24HrsCarWax() {
        return tri24HrsCarWax;
    }

    public void setTri24HrsCarWax(String tri24HrsCarWax) {
        this.tri24HrsCarWax = tri24HrsCarWax;
    }

    @Column(name = "tri_brand_car_wax", nullable = true)
    public String getTriBrandCarWax() {
        return triBrandCarWax;
    }

    public void setTriBrandCarWax(String triBrandCarWax) {
        this.triBrandCarWax = triBrandCarWax;
    }

    @Column(name = "tri_frag_free_car_wax", nullable = true, length = 1)
    public String getTriFragFreeCarWax() {
        return triFragFreeCarWax;
    }

    public void setTriFragFreeCarWax(String triFragFreeCarWax) {
        this.triFragFreeCarWax = triFragFreeCarWax;
    }

    @Column(name = "tri_24_hrs_pest", nullable = true, length = 1)
    public String getTri24HrsPest() {
        return tri24HrsPest;
    }

    public void setTri24HrsPest(String tri24HrsPest) {
        this.tri24HrsPest = tri24HrsPest;
    }

    @Column(name = "tri_brand_pest", nullable = true)
    public String getTriBrandPest() {
        return triBrandPest;
    }

    public void setTriBrandPest(String triBrandPest) {
        this.triBrandPest = triBrandPest;
    }

    @Column(name = "tri_frag_free_pest", nullable = true, length = 1)
    public String getTriFragFreePest() {
        return triFragFreePest;
    }

    public void setTriFragFreePest(String triFragFreePest) {
        this.triFragFreePest = triFragFreePest;
    }

    @Column(name = "tri_24_hrs_flea_tick_prev", nullable = true, length = 1)
    public String getTri24HrsFleaTickPrev() {
        return tri24HrsFleaTickPrev;
    }

    public void setTri24HrsFleaTickPrev(String tri24HrsFleaTickPrev) {
        this.tri24HrsFleaTickPrev = tri24HrsFleaTickPrev;
    }

    @Column(name = "tri_brand_flea_tick_prev", nullable = true)
    public String getTriBrandFleaTickPrev() {
        return triBrandFleaTickPrev;
    }

    public void setTriBrandFleaTickPrev(String triBrandFleaTickPrev) {
        this.triBrandFleaTickPrev = triBrandFleaTickPrev;
    }

    @Column(name = "tri_flea_tick_prev", nullable = true)
    public String getTriFleaTickPrev() {
        return triFleaTickPrev;
    }

    public void setTriFleaTickPrev(String triFleaTickPrev) {
        this.triFleaTickPrev = triFleaTickPrev;
    }

    @Column(name = "tri_24_hrs_flea_tick_spry", nullable = true, length = 1)
    public String getTri24HrsFleaTickSpry() {
        return tri24HrsFleaTickSpry;
    }

    public void setTri24HrsFleaTickSpry(String tri24HrsFleaTickSpry) {
        this.tri24HrsFleaTickSpry = tri24HrsFleaTickSpry;
    }

    @Column(name = "tri_brand_flea_tick_spry", nullable = true)
    public String getTriBrandFleaTickSpry() {
        return triBrandFleaTickSpry;
    }

    public void setTriBrandFleaTickSpry(String triBrandFleaTickSpry) {
        this.triBrandFleaTickSpry = triBrandFleaTickSpry;
    }

    @Column(name = "tri_flea_tick_spry", nullable = true)
    public String getTriFleaTickSpry() {
        return triFleaTickSpry;
    }

    public void setTriFleaTickSpry(String triFleaTickSpry) {
        this.triFleaTickSpry = triFleaTickSpry;
    }

    @Column(name = "tri_24_hrs_caritin", nullable = true, length = 1)
    public String getTri24HrsCaritin() {
        return tri24HrsCaritin;
    }

    public void setTri24HrsCaritin(String tri24HrsCaritin) {
        this.tri24HrsCaritin = tri24HrsCaritin;
    }

    @Column(name = "tri_brand_caritin", nullable = true)
    public String getTriBrandCaritin() {
        return triBrandCaritin;
    }

    public void setTriBrandCaritin(String triBrandCaritin) {
        this.triBrandCaritin = triBrandCaritin;
    }

    @Column(name = "tri_frag_free_caritin", nullable = true, length = 1)
    public String getTriFragFreeCaritin() {
        return triFragFreeCaritin;
    }

    public void setTriFragFreeCaritin(String triFragFreeCaritin) {
        this.triFragFreeCaritin = triFragFreeCaritin;
    }

    @Column(name = "tri_24_hrs_zyrtec", nullable = true, length = 1)
    public String getTri24HrsZyrtec() {
        return tri24HrsZyrtec;
    }

    public void setTri24HrsZyrtec(String tri24HrsZyrtec) {
        this.tri24HrsZyrtec = tri24HrsZyrtec;
    }

    @Column(name = "tri_brand_zyrtec", nullable = true)
    public String getTriBrandZyrtec() {
        return triBrandZyrtec;
    }

    public void setTriBrandZyrtec(String triBrandZyrtec) {
        this.triBrandZyrtec = triBrandZyrtec;
    }

    @Column(name = "tri_frag_free_zyrtec", nullable = true, length = 1)
    public String getTriFragFreeZyrtec() {
        return triFragFreeZyrtec;
    }

    public void setTriFragFreeZyrtec(String triFragFreeZyrtec) {
        this.triFragFreeZyrtec = triFragFreeZyrtec;
    }

    @Column(name = "tri_24_hrs_vita", nullable = true, length = 1)
    public String getTri24HrsVita() {
        return tri24HrsVita;
    }

    public void setTri24HrsVita(String tri24HrsVita) {
        this.tri24HrsVita = tri24HrsVita;
    }

    @Column(name = "tri_brand_vita", nullable = true)
    public String getTriBrandVita() {
        return triBrandVita;
    }

    public void setTriBrandVita(String triBrandVita) {
        this.triBrandVita = triBrandVita;
    }

    @Column(name = "tri_frag_free_vita", nullable = true, length = 1)
    public String getTriFragFreeVita() {
        return triFragFreeVita;
    }

    public void setTriFragFreeVita(String triFragFreeVita) {
        this.triFragFreeVita = triFragFreeVita;
    }

    @Column(name = "tri_24_hrs_herbal", nullable = true, length = 1)
    public String getTri24HrsHerbal() {
        return tri24HrsHerbal;
    }

    public void setTri24HrsHerbal(String tri24HrsHerbal) {
        this.tri24HrsHerbal = tri24HrsHerbal;
    }

    @Column(name = "tri_brand_herbal", nullable = true)
    public String getTriBrandHerbal() {
        return triBrandHerbal;
    }

    public void setTriBrandHerbal(String triBrandHerbal) {
        this.triBrandHerbal = triBrandHerbal;
    }

    @Column(name = "tri_frag_free_herbal", nullable = true, length = 1)
    public String getTriFragFreeHerbal() {
        return triFragFreeHerbal;
    }

    public void setTriFragFreeHerbal(String triFragFreeHerbal) {
        this.triFragFreeHerbal = triFragFreeHerbal;
    }

    @Column(name = "tri_24_hrs_creatine", nullable = true, length = 1)
    public String getTri24HrsCreatine() {
        return tri24HrsCreatine;
    }

    public void setTri24HrsCreatine(String tri24HrsCreatine) {
        this.tri24HrsCreatine = tri24HrsCreatine;
    }

    @Column(name = "tri_brand_creatine", nullable = true)
    public String getTriBrandCreatine() {
        return triBrandCreatine;
    }

    public void setTriBrandCreatine(String triBrandCreatine) {
        this.triBrandCreatine = triBrandCreatine;
    }

    @Column(name = "tri_frag_free_creatine", nullable = true, length = 1)
    public String getTriFragFreeCreatine() {
        return triFragFreeCreatine;
    }

    public void setTriFragFreeCreatine(String triFragFreeCreatine) {
        this.triFragFreeCreatine = triFragFreeCreatine;
    }

    @Column(name = "tri_24_hrs_protein", nullable = true, length = 1)
    public String getTri24HrsProtein() {
        return tri24HrsProtein;
    }

    public void setTri24HrsProtein(String tri24HrsProtein) {
        this.tri24HrsProtein = tri24HrsProtein;
    }

    @Column(name = "tri_brand_protein", nullable = true)
    public String getTriBrandProtein() {
        return triBrandProtein;
    }

    public void setTriBrandProtein(String triBrandProtein) {
        this.triBrandProtein = triBrandProtein;
    }

    @Column(name = "tri_frag_free_protein", nullable = true, length = 1)
    public String getTriFragFreeProtein() {
        return triFragFreeProtein;
    }

    public void setTriFragFreeProtein(String triFragFreeProtein) {
        this.triFragFreeProtein = triFragFreeProtein;
    }

    @Column(name = "tri_24_hrs_diuretic", nullable = true, length = 1)
    public String getTri24HrsDiuretic() {
        return tri24HrsDiuretic;
    }

    public void setTri24HrsDiuretic(String tri24HrsDiuretic) {
        this.tri24HrsDiuretic = tri24HrsDiuretic;
    }

    @Column(name = "tri_brand_diuretic", nullable = true)
    public String getTriBrandDiuretic() {
        return triBrandDiuretic;
    }

    public void setTriBrandDiuretic(String triBrandDiuretic) {
        this.triBrandDiuretic = triBrandDiuretic;
    }

    @Column(name = "tri_frag_free_diuretic", nullable = true, length = 1)
    public String getTriFragFreeDiuretic() {
        return triFragFreeDiuretic;
    }

    public void setTriFragFreeDiuretic(String triFragFreeDiuretic) {
        this.triFragFreeDiuretic = triFragFreeDiuretic;
    }

    @Column(name = "tri_24_hrs_insulin", nullable = true, length = 1)
    public String getTri24HrsInsulin() {
        return tri24HrsInsulin;
    }

    public void setTri24HrsInsulin(String tri24HrsInsulin) {
        this.tri24HrsInsulin = tri24HrsInsulin;
    }

    @Column(name = "tri_brand_insulin", nullable = true)
    public String getTriBrandInsulin() {
        return triBrandInsulin;
    }

    public void setTriBrandInsulin(String triBrandInsulin) {
        this.triBrandInsulin = triBrandInsulin;
    }

    @Column(name = "tri_frag_free_insulin", nullable = true, length = 1)
    public String getTriFragFreeInsulin() {
        return triFragFreeInsulin;
    }

    public void setTriFragFreeInsulin(String triFragFreeInsulin) {
        this.triFragFreeInsulin = triFragFreeInsulin;
    }

    @Column(name = "tri_24_hrs_mouthwsh", nullable = true, length = 1)
    public String getTri24HrsMouthwsh() {
        return tri24HrsMouthwsh;
    }

    public void setTri24HrsMouthwsh(String tri24HrsMouthwsh) {
        this.tri24HrsMouthwsh = tri24HrsMouthwsh;
    }

    @Column(name = "tri_brand_mouthwsh", nullable = true)
    public String getTriBrandMouthwsh() {
        return triBrandMouthwsh;
    }

    public void setTriBrandMouthwsh(String triBrandMouthwsh) {
        this.triBrandMouthwsh = triBrandMouthwsh;
    }

    @Column(name = "tri_frag_free_mouthwsh", nullable = true, length = 1)
    public String getTriFragFreeMouthwsh() {
        return triFragFreeMouthwsh;
    }

    public void setTriFragFreeMouthwsh(String triFragFreeMouthwsh) {
        this.triFragFreeMouthwsh = triFragFreeMouthwsh;
    }

    @Column(name = "tri_frag_free_overall", nullable = true, length = 1)
    public String getTriFragFreeOverall() {
        return triFragFreeOverall;
    }

    public void setTriFragFreeOverall(String triFragFreeOverall) {
        this.triFragFreeOverall = triFragFreeOverall;
    }

    @Column(name = "tri_surg_ind", nullable = true, length = 1)
    public String getTriSurgInd() {
        return triSurgInd;
    }

    public void setTriSurgInd(String triSurgInd) {
        this.triSurgInd = triSurgInd;
    }

}
