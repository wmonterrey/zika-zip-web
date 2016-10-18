package ni.org.ics.zip.domain;

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
@Table(name = "zp04_trimester_visit_section_a_to_d", catalog = "zika_zip")
public class Zp04TrimesterVisitSectionAtoD {

    private String recordId;
    private Date triDov;
    private String triVisitTyp;
    private String triOccChange;
    private String triPrimJobInd;
    private String triPrimJobTitle;
    private String triPrimJobTitleRef;
    private String triPrimJobDat;
    private String triPrimJobYear;
    private String triPrimJobHours;
    private String triPrimJobHoursRef;
    private String triPrimJobSetting;
    private String triPrimJobSetRef;
    private String triPrimJobSetSpecify;
    private String triPrevJobInd;
    private String triPrevJobTitle;
    private String triPrevJobTitleRef;
    private String triPrevJobDat;
    private String triPrevJobYear;
    private String triPrevJobHours;
    private String triPrevJobHoursRef;
    private String triPrevJobSetting;
    private String triPrevJobSetRef;
    private String triPrevJobSetSpecify;
    private String triHusbJobInd;
    private String triHusbJobTitle;
    private String triHusbJobTitleRef;
    private String triHusbJobSet;
    private String triHusbJobSetRef;
    private String triHusbJobSetSpecify;
    private String triHouseSitInd;
    private String triCity;
    private String triState;
    private String triCountry;
    private String triResidRef;
    private String triCurrResidDur;
    private String triCurrResidDurRef;
    private String triNbhoodTyp;
    private String triResidTyp;
    private String triResidTypSpecify;
    private String triFloorMat;
    private String triFloorMatSpecify;
    private String triWallMat;
    private String triWallMatSpecify;
    private String triRoofMat;
    private String triRoofMatSpecify;
    private String triTrashDispos;
    private String triTrashDisposSpecify;
    private Integer triNumTotalRooms;
    private Integer triNumSleepRooms;
    private Integer triNumPeople;
    private String triScreensInd;
    private String triHouseAmenities;//multiple
    private String triTransAccess;//multiple
    private String triPrimWaterSrc;
    private String triWaterContainInd;
    private String triWaterContainTyp;
    private String triWaterConSpecify;
    private String triWaterTreatHome;
    private String triWaterTreatFreq;
    private String triToiletTyp;
    private String triToiletTypSpecify;
    private String triOpSewageInd;
    private String triAnimalsInd;
    private String triAnimalTyp;//multiple
    private String triAnimalSpecify;
    private Integer triNumOtherAnimal;
    private Integer triNumCattle;
    private Integer triNumPig;
    private Integer triNumFowl;
    private Integer triNumGoatsSheep;
    private String triDrugUseInd;
    private String triSmokeInd;
    private String triSmokeEverInd;
    private String triSmokeCigPrevInd;
    private String triYearsSmoked;
    private String triYearsSmokedRef;
    private Float triNumCigDay;
    private String triNumCigRef;
    private String triLastCig;
    private String triHouseSmokeInd;
    private String triNumHrsSmoke;
    private String triNumHrsSmokeRef;
    private String triLastDrink;
    private String triDaysDrink;
    private String triNumDrinks;
    private String triMarijuanaInd;
    private String triOtherDrugsInd;
    private String triOtherDrugs1;
    private String triOtherDrugs2;
    private String triOtherDrugs3;
    private String triOtherDrugs4;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "tri_dov", nullable = true)
    public Date getTriDov() {
        return triDov;
    }

    public void setTriDov(Date triDov) {
        this.triDov = triDov;
    }

    @Column(name = "tri_visit_typ", nullable = true, length = 1)
    public String getTriVisitTyp() {
        return triVisitTyp;
    }

    public void setTriVisitTyp(String triVisitTyp) {
        this.triVisitTyp = triVisitTyp;
    }

    @Column(name = "tri_occ_change", nullable = true, length = 1)
    public String getTriOccChange() {
        return triOccChange;
    }

    public void setTriOccChange(String triOccChange) {
        this.triOccChange = triOccChange;
    }

    @Column(name = "tri_prim_job_ind", nullable = true, length = 1)
    public String getTriPrimJobInd() {
        return triPrimJobInd;
    }

    public void setTriPrimJobInd(String triPrimJobInd) {
        this.triPrimJobInd = triPrimJobInd;
    }

    @Column(name = "tri_prim_job_title", nullable = true)
    public String getTriPrimJobTitle() {
        return triPrimJobTitle;
    }

    public void setTriPrimJobTitle(String triPrimJobTitle) {
        this.triPrimJobTitle = triPrimJobTitle;
    }

    @Column(name = "tri_prim_job_title_ref", nullable = true, length = 1)
    public String getTriPrimJobTitleRef() {
        return triPrimJobTitleRef;
    }

    public void setTriPrimJobTitleRef(String triPrimJobTitleRef) {
        this.triPrimJobTitleRef = triPrimJobTitleRef;
    }

    @Column(name = "tri_prim_job_dat", nullable = true, length = 2)
    public String getTriPrimJobDat() {
        return triPrimJobDat;
    }

    public void setTriPrimJobDat(String triPrimJobDat) {
        this.triPrimJobDat = triPrimJobDat;
    }

    @Column(name = "tri_prim_job_year", nullable = true, length = 4)
    public String getTriPrimJobYear() {
        return triPrimJobYear;
    }

    public void setTriPrimJobYear(String triPrimJobYear) {
        this.triPrimJobYear = triPrimJobYear;
    }

    @Column(name = "tri_prim_job_hours", nullable = true, length = 2)
    public String getTriPrimJobHours() {
        return triPrimJobHours;
    }

    public void setTriPrimJobHours(String triPrimJobHours) {
        this.triPrimJobHours = triPrimJobHours;
    }

    @Column(name = "tri_prim_job_hours_ref", nullable = true, length = 1)
    public String getTriPrimJobHoursRef() {
        return triPrimJobHoursRef;
    }

    public void setTriPrimJobHoursRef(String triPrimJobHoursRef) {
        this.triPrimJobHoursRef = triPrimJobHoursRef;
    }

    @Column(name = "tri_prim_job_setting", nullable = true, length = 3)
    public String getTriPrimJobSetting() {
        return triPrimJobSetting;
    }

    public void setTriPrimJobSetting(String triPrimJobSetting) {
        this.triPrimJobSetting = triPrimJobSetting;
    }

    @Column(name = "tri_prim_job_set_ref", nullable = true, length = 1)
    public String getTriPrimJobSetRef() {
        return triPrimJobSetRef;
    }

    public void setTriPrimJobSetRef(String triPrimJobSetRef) {
        this.triPrimJobSetRef = triPrimJobSetRef;
    }

    @Column(name = "tri_prim_job_set_specify", nullable = true)
    public String getTriPrimJobSetSpecify() {
        return triPrimJobSetSpecify;
    }

    public void setTriPrimJobSetSpecify(String triPrimJobSetSpecify) {
        this.triPrimJobSetSpecify = triPrimJobSetSpecify;
    }

    @Column(name = "tri_prev_job_ind", nullable = true, length = 1)
    public String getTriPrevJobInd() {
        return triPrevJobInd;
    }

    public void setTriPrevJobInd(String triPrevJobInd) {
        this.triPrevJobInd = triPrevJobInd;
    }

    @Column(name = "tri_prev_job_title", nullable = true)
    public String getTriPrevJobTitle() {
        return triPrevJobTitle;
    }

    public void setTriPrevJobTitle(String triPrevJobTitle) {
        this.triPrevJobTitle = triPrevJobTitle;
    }

    @Column(name = "tri_prev_job_title_ref", nullable = true, length = 1)
    public String getTriPrevJobTitleRef() {
        return triPrevJobTitleRef;
    }

    public void setTriPrevJobTitleRef(String triPrevJobTitleRef) {
        this.triPrevJobTitleRef = triPrevJobTitleRef;
    }

    @Column(name = "tri_prev_job_dat", nullable = true, length = 2)
    public String getTriPrevJobDat() {
        return triPrevJobDat;
    }

    public void setTriPrevJobDat(String triPrevJobDat) {
        this.triPrevJobDat = triPrevJobDat;
    }

    @Column(name = "tri_prev_job_year", nullable = true, length = 4)
    public String getTriPrevJobYear() {
        return triPrevJobYear;
    }

    public void setTriPrevJobYear(String triPrevJobYear) {
        this.triPrevJobYear = triPrevJobYear;
    }

    @Column(name = "tri_prev_job_hours", nullable = true, length = 2)
    public String getTriPrevJobHours() {
        return triPrevJobHours;
    }

    public void setTriPrevJobHours(String triPrevJobHours) {
        this.triPrevJobHours = triPrevJobHours;
    }

    @Column(name = "tri_prev_job_hours_ref", nullable = true, length = 1)
    public String getTriPrevJobHoursRef() {
        return triPrevJobHoursRef;
    }

    public void setTriPrevJobHoursRef(String triPrevJobHoursRef) {
        this.triPrevJobHoursRef = triPrevJobHoursRef;
    }

    @Column(name = "tri_prev_job_setting", nullable = true, length = 3)
    public String getTriPrevJobSetting() {
        return triPrevJobSetting;
    }

    public void setTriPrevJobSetting(String triPrevJobSetting) {
        this.triPrevJobSetting = triPrevJobSetting;
    }

    @Column(name = "tri_prev_job_set_ref", nullable = true, length = 1)
    public String getTriPrevJobSetRef() {
        return triPrevJobSetRef;
    }

    public void setTriPrevJobSetRef(String triPrevJobSetRef) {
        this.triPrevJobSetRef = triPrevJobSetRef;
    }

    @Column(name = "tri_prev_job_set_specify", nullable = true)
    public String getTriPrevJobSetSpecify() {
        return triPrevJobSetSpecify;
    }

    public void setTriPrevJobSetSpecify(String triPrevJobSetSpecify) {
        this.triPrevJobSetSpecify = triPrevJobSetSpecify;
    }

    @Column(name = "tri_husb_job_ind", nullable = true, length = 1)
    public String getTriHusbJobInd() {
        return triHusbJobInd;
    }

    public void setTriHusbJobInd(String triHusbJobInd) {
        this.triHusbJobInd = triHusbJobInd;
    }

    @Column(name = "tri_husb_job_title", nullable = true)
    public String getTriHusbJobTitle() {
        return triHusbJobTitle;
    }

    public void setTriHusbJobTitle(String triHusbJobTitle) {
        this.triHusbJobTitle = triHusbJobTitle;
    }

    @Column(name = "tri_husb_job_title_ref", nullable = true, length = 1)
    public String getTriHusbJobTitleRef() {
        return triHusbJobTitleRef;
    }

    public void setTriHusbJobTitleRef(String triHusbJobTitleRef) {
        this.triHusbJobTitleRef = triHusbJobTitleRef;
    }

    @Column(name = "tri_husb_job_set", nullable = true, length = 3)
    public String getTriHusbJobSet() {
        return triHusbJobSet;
    }

    public void setTriHusbJobSet(String triHusbJobSet) {
        this.triHusbJobSet = triHusbJobSet;
    }

    @Column(name = "tri_husb_job_set_ref", nullable = true, length = 1)
    public String getTriHusbJobSetRef() {
        return triHusbJobSetRef;
    }

    public void setTriHusbJobSetRef(String triHusbJobSetRef) {
        this.triHusbJobSetRef = triHusbJobSetRef;
    }

    @Column(name = "tri_husb_job_set_specify", nullable = true)
    public String getTriHusbJobSetSpecify() {
        return triHusbJobSetSpecify;
    }

    public void setTriHusbJobSetSpecify(String triHusbJobSetSpecify) {
        this.triHusbJobSetSpecify = triHusbJobSetSpecify;
    }

    @Column(name = "tri_house_sit_ind", nullable = true, length = 1)
    public String getTriHouseSitInd() {
        return triHouseSitInd;
    }

    public void setTriHouseSitInd(String triHouseSitInd) {
        this.triHouseSitInd = triHouseSitInd;
    }

    @Column(name = "tri_city", nullable = true, length = 100)
    public String getTriCity() {
        return triCity;
    }

    public void setTriCity(String triCity) {
        this.triCity = triCity;
    }

    @Column(name = "tri_state", nullable = true, length = 50)
    public String getTriState() {
        return triState;
    }

    public void setTriState(String triState) {
        this.triState = triState;
    }

    @Column(name = "tri_country", nullable = true, length = 50)
    public String getTriCountry() {
        return triCountry;
    }

    public void setTriCountry(String triCountry) {
        this.triCountry = triCountry;
    }

    @Column(name = "tri_resid_ref", nullable = true, length = 1)
    public String getTriResidRef() {
        return triResidRef;
    }

    public void setTriResidRef(String triResidRef) {
        this.triResidRef = triResidRef;
    }

    @Column(name = "tri_curr_resid_dur", nullable = true, length = 4)
    public String getTriCurrResidDur() {
        return triCurrResidDur;
    }

    public void setTriCurrResidDur(String triCurrResidDur) {
        this.triCurrResidDur = triCurrResidDur;
    }

    @Column(name = "tri_curr_resid_dur_ref", nullable = true, length = 1)
    public String getTriCurrResidDurRef() {
        return triCurrResidDurRef;
    }

    public void setTriCurrResidDurRef(String triCurrResidDurRef) {
        this.triCurrResidDurRef = triCurrResidDurRef;
    }

    @Column(name = "tri_nbhood_typ", nullable = true, length = 1)
    public String getTriNbhoodTyp() {
        return triNbhoodTyp;
    }

    public void setTriNbhoodTyp(String triNbhoodTyp) {
        this.triNbhoodTyp = triNbhoodTyp;
    }

    @Column(name = "tri_resid_typ", nullable = true, length = 2)
    public String getTriResidTyp() {
        return triResidTyp;
    }

    public void setTriResidTyp(String triResidTyp) {
        this.triResidTyp = triResidTyp;
    }

    @Column(name = "tri_resid_typ_specify", nullable = true)
    public String getTriResidTypSpecify() {
        return triResidTypSpecify;
    }

    public void setTriResidTypSpecify(String triResidTypSpecify) {
        this.triResidTypSpecify = triResidTypSpecify;
    }

    @Column(name = "tri_floor_mat", nullable = true, length = 2)
    public String getTriFloorMat() {
        return triFloorMat;
    }

    public void setTriFloorMat(String triFloorMat) {
        this.triFloorMat = triFloorMat;
    }

    @Column(name = "tri_floor_mat_specify", nullable = true)
    public String getTriFloorMatSpecify() {
        return triFloorMatSpecify;
    }

    public void setTriFloorMatSpecify(String triFloorMatSpecify) {
        this.triFloorMatSpecify = triFloorMatSpecify;
    }

    @Column(name = "tri_wall_mat", nullable = true, length = 2)
    public String getTriWallMat() {
        return triWallMat;
    }

    public void setTriWallMat(String triWallMat) {
        this.triWallMat = triWallMat;
    }

    @Column(name = "tri_wall_mat_specify", nullable = true)
    public String getTriWallMatSpecify() {
        return triWallMatSpecify;
    }

    public void setTriWallMatSpecify(String triWallMatSpecify) {
        this.triWallMatSpecify = triWallMatSpecify;
    }

    @Column(name = "tri_roof_mat", nullable = true, length = 2)
    public String getTriRoofMat() {
        return triRoofMat;
    }

    public void setTriRoofMat(String triRoofMat) {
        this.triRoofMat = triRoofMat;
    }

    @Column(name = "tri_roof_mat_specify", nullable = true)
    public String getTriRoofMatSpecify() {
        return triRoofMatSpecify;
    }

    public void setTriRoofMatSpecify(String triRoofMatSpecify) {
        this.triRoofMatSpecify = triRoofMatSpecify;
    }

    @Column(name = "tri_trash_dispos", nullable = true, length = 2)
    public String getTriTrashDispos() {
        return triTrashDispos;
    }

    public void setTriTrashDispos(String triTrashDispos) {
        this.triTrashDispos = triTrashDispos;
    }

    @Column(name = "tri_trash_dispos_specify", nullable = true)
    public String getTriTrashDisposSpecify() {
        return triTrashDisposSpecify;
    }

    public void setTriTrashDisposSpecify(String triTrashDisposSpecify) {
        this.triTrashDisposSpecify = triTrashDisposSpecify;
    }

    @Column(name = "tri_num_total_rooms", nullable = true)
    public Integer getTriNumTotalRooms() {
        return triNumTotalRooms;
    }

    public void setTriNumTotalRooms(Integer triNumTotalRooms) {
        this.triNumTotalRooms = triNumTotalRooms;
    }

    @Column(name = "tri_num_sleep_rooms", nullable = true)
    public Integer getTriNumSleepRooms() {
        return triNumSleepRooms;
    }

    public void setTriNumSleepRooms(Integer triNumSleepRooms) {
        this.triNumSleepRooms = triNumSleepRooms;
    }

    @Column(name = "tri_num_people", nullable = true)
    public Integer getTriNumPeople() {
        return triNumPeople;
    }

    public void setTriNumPeople(Integer triNumPeople) {
        this.triNumPeople = triNumPeople;
    }

    @Column(name = "tri_screens_ind", nullable = true, length = 1)
    public String getTriScreensInd() {
        return triScreensInd;
    }

    public void setTriScreensInd(String triScreensInd) {
        this.triScreensInd = triScreensInd;
    }

    @Column(name = "tri_house_amenities", nullable = true, length = 25)
    public String getTriHouseAmenities() {
        return triHouseAmenities;
    }

    public void setTriHouseAmenities(String triHouseAmenities) {
        this.triHouseAmenities = triHouseAmenities;
    }

    @Column(name = "tri_trans_access", nullable = true, length = 25)
    public String getTriTransAccess() {
        return triTransAccess;
    }

    public void setTriTransAccess(String triTransAccess) {
        this.triTransAccess = triTransAccess;
    }

    @Column(name = "tri_prim_water_src", nullable = true, length = 2)
    public String getTriPrimWaterSrc() {
        return triPrimWaterSrc;
    }

    public void setTriPrimWaterSrc(String triPrimWaterSrc) {
        this.triPrimWaterSrc = triPrimWaterSrc;
    }

    @Column(name = "tri_water_contain_ind", nullable = true, length = 1)
    public String getTriWaterContainInd() {
        return triWaterContainInd;
    }

    public void setTriWaterContainInd(String triWaterContainInd) {
        this.triWaterContainInd = triWaterContainInd;
    }

    @Column(name = "tri_water_contain_typ", nullable = true, length = 2)
    public String getTriWaterContainTyp() {
        return triWaterContainTyp;
    }

    public void setTriWaterContainTyp(String triWaterContainTyp) {
        this.triWaterContainTyp = triWaterContainTyp;
    }

    @Column(name = "tri_water_con_specify", nullable = true)
    public String getTriWaterConSpecify() {
        return triWaterConSpecify;
    }

    public void setTriWaterConSpecify(String triWaterConSpecify) {
        this.triWaterConSpecify = triWaterConSpecify;
    }

    @Column(name = "tri_water_treat_home", nullable = true, length = 1)
    public String getTriWaterTreatHome() {
        return triWaterTreatHome;
    }

    public void setTriWaterTreatHome(String triWaterTreatHome) {
        this.triWaterTreatHome = triWaterTreatHome;
    }

    @Column(name = "tri_water_treat_freq", nullable = true, length = 2)
    public String getTriWaterTreatFreq() {
        return triWaterTreatFreq;
    }

    public void setTriWaterTreatFreq(String triWaterTreatFreq) {
        this.triWaterTreatFreq = triWaterTreatFreq;
    }

    @Column(name = "tri_toilet_typ", nullable = true, length = 2)
    public String getTriToiletTyp() {
        return triToiletTyp;
    }

    public void setTriToiletTyp(String triToiletTyp) {
        this.triToiletTyp = triToiletTyp;
    }

    @Column(name = "tri_toilet_typ_specify", nullable = true)
    public String getTriToiletTypSpecify() {
        return triToiletTypSpecify;
    }

    public void setTriToiletTypSpecify(String triToiletTypSpecify) {
        this.triToiletTypSpecify = triToiletTypSpecify;
    }

    @Column(name = "tri_op_sewage_ind", nullable = true, length = 1)
    public String getTriOpSewageInd() {
        return triOpSewageInd;
    }

    public void setTriOpSewageInd(String triOpSewageInd) {
        this.triOpSewageInd = triOpSewageInd;
    }

    @Column(name = "tri_animals_ind", nullable = true, length = 1)
    public String getTriAnimalsInd() {
        return triAnimalsInd;
    }

    public void setTriAnimalsInd(String triAnimalsInd) {
        this.triAnimalsInd = triAnimalsInd;
    }

    @Column(name = "tri_animal_typ", nullable = true, length = 20)
    public String getTriAnimalTyp() {
        return triAnimalTyp;
    }

    public void setTriAnimalTyp(String triAnimalTyp) {
        this.triAnimalTyp = triAnimalTyp;
    }

    @Column(name = "tri_animal_specify", nullable = true)
    public String getTriAnimalSpecify() {
        return triAnimalSpecify;
    }

    public void setTriAnimalSpecify(String triAnimalSpecify) {
        this.triAnimalSpecify = triAnimalSpecify;
    }

    @Column(name = "tri_num_other_animal", nullable = true)
    public Integer getTriNumOtherAnimal() {
        return triNumOtherAnimal;
    }

    public void setTriNumOtherAnimal(Integer triNumOtherAnimal) {
        this.triNumOtherAnimal = triNumOtherAnimal;
    }

    @Column(name = "tri_num_cattle", nullable = true)
    public Integer getTriNumCattle() {
        return triNumCattle;
    }

    public void setTriNumCattle(Integer triNumCattle) {
        this.triNumCattle = triNumCattle;
    }

    @Column(name = "tri_num_pig", nullable = true)
    public Integer getTriNumPig() {
        return triNumPig;
    }

    public void setTriNumPig(Integer triNumPig) {
        this.triNumPig = triNumPig;
    }

    @Column(name = "tri_num_fowl", nullable = true)
    public Integer getTriNumFowl() {
        return triNumFowl;
    }

    public void setTriNumFowl(Integer triNumFowl) {
        this.triNumFowl = triNumFowl;
    }

    @Column(name = "tri_num_goats_sheep", nullable = true)
    public Integer getTriNumGoatsSheep() {
        return triNumGoatsSheep;
    }

    public void setTriNumGoatsSheep(Integer triNumGoatsSheep) {
        this.triNumGoatsSheep = triNumGoatsSheep;
    }

    @Column(name = "tri_drug_use_ind", nullable = true, length = 1)
    public String getTriDrugUseInd() {
        return triDrugUseInd;
    }

    public void setTriDrugUseInd(String triDrugUseInd) {
        this.triDrugUseInd = triDrugUseInd;
    }

    @Column(name = "tri_smoke_ind", nullable = true, length = 1)
    public String getTriSmokeInd() {
        return triSmokeInd;
    }

    public void setTriSmokeInd(String triSmokeInd) {
        this.triSmokeInd = triSmokeInd;
    }

    @Column(name = "tri_smoke_ever_ind", nullable = true, length = 1)
    public String getTriSmokeEverInd() {
        return triSmokeEverInd;
    }

    public void setTriSmokeEverInd(String triSmokeEverInd) {
        this.triSmokeEverInd = triSmokeEverInd;
    }

    @Column(name = "tri_smoke_cig_prev_ind", nullable = true, length = 1)
    public String getTriSmokeCigPrevInd() {
        return triSmokeCigPrevInd;
    }

    public void setTriSmokeCigPrevInd(String triSmokeCigPrevInd) {
        this.triSmokeCigPrevInd = triSmokeCigPrevInd;
    }

    @Column(name = "tri_years_smoked", nullable = true, length = 4)
    public String getTriYearsSmoked() {
        return triYearsSmoked;
    }

    public void setTriYearsSmoked(String triYearsSmoked) {
        this.triYearsSmoked = triYearsSmoked;
    }

    @Column(name = "tri_years_smoked_ref", nullable = true, length = 1)
    public String getTriYearsSmokedRef() {
        return triYearsSmokedRef;
    }

    public void setTriYearsSmokedRef(String triYearsSmokedRef) {
        this.triYearsSmokedRef = triYearsSmokedRef;
    }

    @Column(name = "tri_num_cig_day", nullable = true)
    public Float getTriNumCigDay() {
        return triNumCigDay;
    }

    public void setTriNumCigDay(Float triNumCigDay) {
        this.triNumCigDay = triNumCigDay;
    }

    @Column(name = "tri_num_cig_ref", nullable = true, length = 1)
    public String getTriNumCigRef() {
        return triNumCigRef;
    }

    public void setTriNumCigRef(String triNumCigRef) {
        this.triNumCigRef = triNumCigRef;
    }

    @Column(name = "tri_last_cig", nullable = true, length = 2)
    public String getTriLastCig() {
        return triLastCig;
    }

    public void setTriLastCig(String triLastCig) {
        this.triLastCig = triLastCig;
    }

    @Column(name = "tri_house_smoke_ind", nullable = true, length = 1)
    public String getTriHouseSmokeInd() {
        return triHouseSmokeInd;
    }

    public void setTriHouseSmokeInd(String triHouseSmokeInd) {
        this.triHouseSmokeInd = triHouseSmokeInd;
    }

    @Column(name = "tri_num_hrs_smoke", nullable = true, length = 5)
    public String getTriNumHrsSmoke() {
        return triNumHrsSmoke;
    }

    public void setTriNumHrsSmoke(String triNumHrsSmoke) {
        this.triNumHrsSmoke = triNumHrsSmoke;
    }

    @Column(name = "tri_num_hrs_smoke_ref", nullable = true, length = 1)
    public String getTriNumHrsSmokeRef() {
        return triNumHrsSmokeRef;
    }

    public void setTriNumHrsSmokeRef(String triNumHrsSmokeRef) {
        this.triNumHrsSmokeRef = triNumHrsSmokeRef;
    }

    @Column(name = "tri_last_drink", nullable = true, length = 2)
    public String getTriLastDrink() {
        return triLastDrink;
    }

    public void setTriLastDrink(String triLastDrink) {
        this.triLastDrink = triLastDrink;
    }

    @Column(name = "tri_days_drink", nullable = true, length = 2)
    public String getTriDaysDrink() {
        return triDaysDrink;
    }

    public void setTriDaysDrink(String triDaysDrink) {
        this.triDaysDrink = triDaysDrink;
    }

    @Column(name = "tri_num_drinks", nullable = true, length = 2)
    public String getTriNumDrinks() {
        return triNumDrinks;
    }

    public void setTriNumDrinks(String triNumDrinks) {
        this.triNumDrinks = triNumDrinks;
    }

    @Column(name = "tri_marijuana_ind", nullable = true, length = 1)
    public String getTriMarijuanaInd() {
        return triMarijuanaInd;
    }

    public void setTriMarijuanaInd(String triMarijuanaInd) {
        this.triMarijuanaInd = triMarijuanaInd;
    }

    @Column(name = "tri_other_drugs_ind", nullable = true, length = 1)
    public String getTriOtherDrugsInd() {
        return triOtherDrugsInd;
    }

    public void setTriOtherDrugsInd(String triOtherDrugsInd) {
        this.triOtherDrugsInd = triOtherDrugsInd;
    }

    @Column(name = "tri_other_drugs_1", nullable = true)
    public String getTriOtherDrugs1() {
        return triOtherDrugs1;
    }

    public void setTriOtherDrugs1(String triOtherDrugs1) {
        this.triOtherDrugs1 = triOtherDrugs1;
    }

    @Column(name = "tri_other_drugs_2", nullable = true)
    public String getTriOtherDrugs2() {
        return triOtherDrugs2;
    }

    public void setTriOtherDrugs2(String triOtherDrugs2) {
        this.triOtherDrugs2 = triOtherDrugs2;
    }

    @Column(name = "tri_other_drugs_3", nullable = true)
    public String getTriOtherDrugs3() {
        return triOtherDrugs3;
    }

    public void setTriOtherDrugs3(String triOtherDrugs3) {
        this.triOtherDrugs3 = triOtherDrugs3;
    }

    @Column(name = "tri_other_drugs_4", nullable = true)
    public String getTriOtherDrugs4() {
        return triOtherDrugs4;
    }

    public void setTriOtherDrugs4(String triOtherDrugs4) {
        this.triOtherDrugs4 = triOtherDrugs4;
    }
}
