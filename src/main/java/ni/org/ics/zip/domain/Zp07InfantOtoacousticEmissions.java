package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ics on 2/2/2018.
 * V1.0
 */

@Entity
@Table(name = "zp07_infant_otoacoustic_ems", catalog = "zika_zip")
public class Zp07InfantOtoacousticEmissions extends BaseMetaData implements Auditable {

    private String recordId;
    private String redcapEventName;
    private Date infantVisitDate;
    private String infantStatus;
    private String infantVisit;
    private Integer infantAgeMonths;
    private String infantOae;
    private String infantOphthType;
    private String infantHearingOverall;
    private String infantRoae;
    private String infantRaabr;
    private String infantLoae;
    private String infantLaabr;
    private String infantComments2;
    private String infantIdCompleting;
    private Date infantDtComp;
    private String infantIdReviewer;
    private Date infantDtReview;
    private String infantIdDataEntry;
    private Date infantDtEnter;
    private Date infantHearDt;

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

    @Column(name = "infant_visit_date", nullable = false)
    public Date getInfantVisitDate() {
        return infantVisitDate;
    }

    public void setInfantVisitDate(Date infantVisitDate) {
        this.infantVisitDate = infantVisitDate;
    }

    @Column(name = "infant_status", nullable = false, length = 1)
    public String getInfantStatus() {
        return infantStatus;
    }

    public void setInfantStatus(String infantStatus) {
        this.infantStatus = infantStatus;
    }

    @Column(name = "infant_visit", nullable = false, length = 1)
    public String getInfantVisit() {
        return infantVisit;
    }

    public void setInfantVisit(String infantVisit) {
        this.infantVisit = infantVisit;
    }

    @Column(name = "infant_ageMonths")
    public Integer getInfantAgeMonths() {
        return infantAgeMonths;
    }

    public void setInfantAgeMonths(Integer infantAgeMonths) {
        this.infantAgeMonths = infantAgeMonths;
    }

    @Column(name = "infant_oae", nullable = false, length = 2)
    public String getInfantOae() {
        return infantOae;
    }

    public void setInfantOae(String infantOae) {
        this.infantOae = infantOae;
    }

    @Column(name = "infant_ophth_type", length = 2)
    public String getInfantOphthType() {
        return infantOphthType;
    }

    public void setInfantOphthType(String infantOphthType) {
        this.infantOphthType = infantOphthType;
    }

    @Column(name = "infant_hearing_overall", length = 2)
    public String getInfantHearingOverall() {
        return infantHearingOverall;
    }

    public void setInfantHearingOverall(String infantHearingOverall) {
        this.infantHearingOverall = infantHearingOverall;
    }

    @Column(name = "infant_roae", length = 2)
    public String getInfantRoae() {
        return infantRoae;
    }

    public void setInfantRoae(String infantRoae) {
        this.infantRoae = infantRoae;
    }

    @Column(name = "infant_raabr", length = 2)
    public String getInfantRaabr() {
        return infantRaabr;
    }

    public void setInfantRaabr(String infantRaabr) {
        this.infantRaabr = infantRaabr;
    }

    @Column(name = "infant_loae", length = 2)
    public String getInfantLoae() {
        return infantLoae;
    }

    public void setInfantLoae(String infantLoae) {
        this.infantLoae = infantLoae;
    }

    @Column(name = "infant_laabr", length = 2)
    public String getInfantLaabr() {
        return infantLaabr;
    }

    public void setInfantLaabr(String infantLaabr) {
        this.infantLaabr = infantLaabr;
    }

    @Column(name = "infant_comments2", length = 100)
    public String getInfantComments2() {
        return infantComments2;
    }

    public void setInfantComments2(String infantComments2) {
        this.infantComments2 = infantComments2;
    }

    @Column(name = "infant_id_completing", length = 50)
    public String getInfantIdCompleting() {
        return infantIdCompleting;
    }

    public void setInfantIdCompleting(String infantIdCompleting) {
        this.infantIdCompleting = infantIdCompleting;
    }

    @Column(name = "infant_dt_comp")
    public Date getInfantDtComp() {
        return infantDtComp;
    }

    public void setInfantDtComp(Date infantDtComp) {
        this.infantDtComp = infantDtComp;
    }

    @Column(name = "infant_id_reviewer", length = 50)
    public String getInfantIdReviewer() {
        return infantIdReviewer;
    }

    public void setInfantIdReviewer(String infantIdReviewer) {
        this.infantIdReviewer = infantIdReviewer;
    }

    @Column(name = "infant_dt_review")
    public Date getInfantDtReview() {
        return infantDtReview;
    }

    public void setInfantDtReview(Date infantDtReview) {
        this.infantDtReview = infantDtReview;
    }

    @Column(name = "infant_id_data_entry", length = 50)
    public String getInfantIdDataEntry() {
        return infantIdDataEntry;
    }

    public void setInfantIdDataEntry(String infantIdDataEntry) {
        this.infantIdDataEntry = infantIdDataEntry;
    }

    @Column(name = "infant_dt_enter")
    public Date getInfantDtEnter() {
        return infantDtEnter;
    }

    public void setInfantDtEnter(Date infantDtEnter) {
        this.infantDtEnter = infantDtEnter;
    }


    @Column(name = "infant_hear_dt")
    public Date getInfantHearDt() {
        return infantHearDt;
    }

    public void setInfantHearDt(Date infantHearDt) {
        this.infantHearDt = infantHearDt;
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
        if (!(other instanceof Zp07InfantOtoacousticEmissions))
            return false;

        Zp07InfantOtoacousticEmissions castOther = (Zp07InfantOtoacousticEmissions) other;

        return (this.getRecordId().equals(castOther.getRecordId()));
    }
}
