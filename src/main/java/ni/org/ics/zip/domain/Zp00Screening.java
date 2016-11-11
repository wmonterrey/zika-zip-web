package ni.org.ics.zip.domain;

import javax.persistence.*;
import ni.org.ics.zip.domain.audit.Auditable;

import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp00_screening", catalog = "zika_zip")
public class Zp00Screening extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String recordId;
    private String preScreenId;
    private String redcapEventName;
    private Date scrVisitDate;
    private String scrRemain;
    private Integer scrAge;
    private String scrAge15;
    private String scrPregnant;
    private Integer scrPreWeeks;
    private Integer scrPreDays;
    private String scrPregant13;
    private String scrZikaOther;
    private String scrMeetCriteria;
    private String scrConsentObta;
    private String scrObDobDay;
    private String scrObDobMon;
    private Integer scrObDobYear;
    private Integer scrObAge;
    private String scrObAssent;
    private String scrConsentA;
    private String scrConsentB;
    private String scrConsentC;
    private String scrConsentD;
    private String scrConsentE;
    private String scrConsentF;
    private String scrPreviousZip;
    private String scrPreviousStudyId;
    private String scrPreStudyNa;
    private String scrReasonNot;
    private String scrReasonOther;
    private String scrIdCompleting;
    private Date scrDateCompleted;
    private String scrIdReviewer;
    private Date scrDateReviewed;
    private String scrIdDataEntry;
    private Date scrDateEntered;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "prescreen_id", nullable = true, length = 50)
    public String getPreScreenId() {
        return preScreenId;
    }

    public void setPreScreenId(String preScreenId) {
        this.preScreenId = preScreenId;
    }

    @Column(name = "redcap_event_name", nullable = true, length = 100)
    public String getRedcapEventName() {
        return redcapEventName;
    }

    public void setRedcapEventName(String redcapEventName) {
        this.redcapEventName = redcapEventName;
    }

    @Column(name = "scr_visit_date", nullable = false)
    public Date getScrVisitDate() {
        return scrVisitDate;
    }

    public void setScrVisitDate(Date scrVisitDate) {
        this.scrVisitDate = scrVisitDate;
    }

    @Column(name = "scr_remain", nullable = false, length = 2)
    public String getScrRemain() {
        return scrRemain;
    }

    public void setScrRemain(String scrRemain) {
        this.scrRemain = scrRemain;
    }

    @Column(name = "scr_age", nullable = true)
    public Integer getScrAge() {
        return scrAge;
    }

    public void setScrAge(Integer scrAge) {
        this.scrAge = scrAge;
    }

    @Column(name = "scr_age_15", nullable = true, length = 1)
    public String getScrAge15() {
        return scrAge15;
    }

    public void setScrAge15(String scrAge15) {
        this.scrAge15 = scrAge15;
    }

    @Column(name = "scr_pregnant", nullable = true, length = 2)
    public String getScrPregnant() {
        return scrPregnant;
    }

    public void setScrPregnant(String scrPregnant) {
        this.scrPregnant = scrPregnant;
    }

    @Column(name = "scr_pre_weeks", nullable = true)
    public Integer getScrPreWeeks() {
        return scrPreWeeks;
    }

    public void setScrPreWeeks(Integer scrPreWeeks) {
        this.scrPreWeeks = scrPreWeeks;
    }

    @Column(name = "scr_pre_days", nullable = true)
    public Integer getScrPreDays() {
        return scrPreDays;
    }

    public void setScrPreDays(Integer scrPreDays) {
        this.scrPreDays = scrPreDays;
    }

    @Column(name = "scr_pregant_13", nullable = true, length = 1)
    public String getScrPregant13() {
        return scrPregant13;
    }

    public void setScrPregant13(String scrPregant13) {
        this.scrPregant13 = scrPregant13;
    }

    @Column(name = "scr_zika_other", nullable = true, length = 1)
    public String getScrZikaOther() {
        return scrZikaOther;
    }

    public void setScrZikaOther(String scrZikaOther) {
        this.scrZikaOther = scrZikaOther;
    }

    @Column(name = "scr_meet_criteria", nullable = true, length = 1)
    public String getScrMeetCriteria() {
        return scrMeetCriteria;
    }

    public void setScrMeetCriteria(String scrMeetCriteria) {
        this.scrMeetCriteria = scrMeetCriteria;
    }

    @Column(name = "scr_consent_obta", nullable = true, length = 1)
    public String getScrConsentObta() {
        return scrConsentObta;
    }

    public void setScrConsentObta(String scrConsentObta) {
        this.scrConsentObta = scrConsentObta;
    }

    @Column(name = "scr_ob_dob_day", nullable = true, length = 2)
    public String getScrObDobDay() {
        return scrObDobDay;
    }

    public void setScrObDobDay(String scrObDobDay) {
        this.scrObDobDay = scrObDobDay;
    }

    @Column(name = "scr_ob_dob_mon", nullable = true, length = 2)
    public String getScrObDobMon() {
        return scrObDobMon;
    }

    public void setScrObDobMon(String scrObDobMon) {
        this.scrObDobMon = scrObDobMon;
    }

    @Column(name = "scr_ob_dob_year", nullable = true)
    public Integer getScrObDobYear() {
        return scrObDobYear;
    }

    public void setScrObDobYear(Integer scrObDobYear) {
        this.scrObDobYear = scrObDobYear;
    }

    @Column(name = "scr_ob_age", nullable = true)
    public Integer getScrObAge() {
        return scrObAge;
    }

    public void setScrObAge(Integer scrObAge) {
        this.scrObAge = scrObAge;
    }

    @Column(name = "scr_ob_assent", nullable = true, length = 2)
    public String getScrObAssent() {
        return scrObAssent;
    }

    public void setScrObAssent(String scrObAssent) {
        this.scrObAssent = scrObAssent;
    }

    @Column(name = "scr_consent_a", nullable = true, length = 2)
    public String getScrConsentA() {
        return scrConsentA;
    }

    public void setScrConsentA(String scrConsentA) {
        this.scrConsentA = scrConsentA;
    }

    @Column(name = "scr_consent_b", nullable = true, length = 2)
    public String getScrConsentB() {
        return scrConsentB;
    }

    public void setScrConsentB(String scrConsentB) {
        this.scrConsentB = scrConsentB;
    }

    @Column(name = "scr_consent_c", nullable = true, length = 2)
    public String getScrConsentC() {
        return scrConsentC;
    }

    public void setScrConsentC(String scrConsentC) {
        this.scrConsentC = scrConsentC;
    }

    @Column(name = "scr_consent_d", nullable = true, length = 2)
    public String getScrConsentD() {
        return scrConsentD;
    }

    public void setScrConsentD(String scrConsentD) {
        this.scrConsentD = scrConsentD;
    }

    @Column(name = "scr_consent_e", nullable = true, length = 2)
    public String getScrConsentE() {
        return scrConsentE;
    }

    public void setScrConsentE(String scrConsentE) {
        this.scrConsentE = scrConsentE;
    }

    @Column(name = "scr_consent_f", nullable = true, length = 2)
    public String getScrConsentF() {
        return scrConsentF;
    }

    public void setScrConsentF(String scrConsentF) {
        this.scrConsentF = scrConsentF;
    }

    @Column(name = "scr_previous_zip", nullable = true, length = 2)
    public String getScrPreviousZip() {
        return scrPreviousZip;
    }

    public void setScrPreviousZip(String scrPreviousZip) {
        this.scrPreviousZip = scrPreviousZip;
    }

    @Column(name = "scr_previous_studyid", nullable = true)
    public String getScrPreviousStudyId() {
        return scrPreviousStudyId;
    }

    public void setScrPreviousStudyId(String scrPreviousStudyId) {
        this.scrPreviousStudyId = scrPreviousStudyId;
    }

    @Column(name = "scr_prestudyna", nullable = true, length = 1)
    public String getScrPreStudyNa() {
        return scrPreStudyNa;
    }

    public void setScrPreStudyNa(String scrPreStudyNa) {
        this.scrPreStudyNa = scrPreStudyNa;
    }

    @Column(name = "scr_reason_not", nullable = true, length = 2)
    public String getScrReasonNot() {
        return scrReasonNot;
    }

    public void setScrReasonNot(String scrReasonNot) {
        this.scrReasonNot = scrReasonNot;
    }

    @Column(name = "scr_reason_other", nullable = true)
    public String getScrReasonOther() {
        return scrReasonOther;
    }

    public void setScrReasonOther(String scrReasonOther) {
        this.scrReasonOther = scrReasonOther;
    }

    @Column(name = "scr_id_completing", nullable = false, length = 50)
    public String getScrIdCompleting() {
        return scrIdCompleting;
    }

    public void setScrIdCompleting(String scrIdCompleting) {
        this.scrIdCompleting = scrIdCompleting;
    }

    @Column(name = "scr_date_completed", nullable = false)
    public Date getScrDateCompleted() {
        return scrDateCompleted;
    }

    public void setScrDateCompleted(Date scrDateCompleted) {
        this.scrDateCompleted = scrDateCompleted;
    }

    @Column(name = "scr_id_reviewer", nullable = false, length = 50)
    public String getScrIdReviewer() {
        return scrIdReviewer;
    }

    public void setScrIdReviewer(String scrIdReviewer) {
        this.scrIdReviewer = scrIdReviewer;
    }

    @Column(name = "scr_date_reviewed", nullable = false)
    public Date getScrDateReviewed() {
        return scrDateReviewed;
    }

    public void setScrDateReviewed(Date scrDateReviewed) {
        this.scrDateReviewed = scrDateReviewed;
    }

    @Column(name = "scr_id_data_entry", nullable = false, length = 50)
    public String getScrIdDataEntry() {
        return scrIdDataEntry;
    }

    public void setScrIdDataEntry(String scrIdDataEntry) {
        this.scrIdDataEntry = scrIdDataEntry;
    }

    @Column(name = "scr_date_entered", nullable = false)
    public Date getScrDateEntered() {
        return scrDateEntered;
    }

    public void setScrDateEntered(Date scrDateEntered) {
        this.scrDateEntered = scrDateEntered;
    }

	@Override
	public boolean isFieldAuditable(String fieldname) {
		return true;
	}
	
	@Override
	public String toString(){
		return this.recordId;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Zp00Screening))
			return false;
		
		Zp00Screening castOther = (Zp00Screening) other;

		return (this.getRecordId().equals(castOther.getRecordId()));
	}
}

