package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ics on 18/1/2018.
 */
@Entity
@Table(name = "zp00a_infant_screening", catalog = "zika_zip")
public class Zp00aInfantScreening extends BaseMetaData implements Auditable {

    private String recordId;
    private String pregnantId;
    private String redcapEventName;
    private Date infVisitDt;
    private String infRemain;
    private String infConsent;
    private String infConsenta;
    private String infConsentb;
    private String infConsentc;
    private String infConsentd;
    private String infInfid;
    private String infReasonno;
    private String infReasonOther;
    private String infIdCompleting;
    private Date infDateCompleted;
    private String infIdReviewer;
    private Date infDateReviewed;
    private String infIdDataEntry;
    private Date infDateEntered;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "pregnant_id", nullable = false, length = 25)
    public String getPregnantId() {
        return pregnantId;
    }

    public void setPregnantId(String pregnantId) {
        this.pregnantId = pregnantId;
    }

    @Column(name = "redcap_event_name", nullable = true, length = 100)
    public String getRedcapEventName() {
        return redcapEventName;
    }

    public void setRedcapEventName(String redcapEventName) {
        this.redcapEventName = redcapEventName;
    }

    @Column(name = "inf_visit_dt", nullable = false)
    public Date getInfVisitDt() {
        return infVisitDt;
    }

    public void setInfVisitDt(Date infVisitDt) {
        this.infVisitDt = infVisitDt;
    }

    @Column(name = "inf_remain", nullable = false, length = 2)
    public String getInfRemain() {
        return infRemain;
    }

    public void setInfRemain(String infRemain) {
        this.infRemain = infRemain;
    }

    @Column(name = "inf_consent", nullable = false, length = 2)
    public String getInfConsent() {
        return infConsent;
    }

    public void setInfConsent(String infConsent) {
        this.infConsent = infConsent;
    }

    @Column(name = "inf_consent_a", length = 2)
    public String getInfConsenta() {
        return infConsenta;
    }

    public void setInfConsenta(String infConsenta) {
        this.infConsenta = infConsenta;
    }

    @Column(name = "inf_consent_b", length = 2)
    public String getInfConsentb() {
        return infConsentb;
    }

    public void setInfConsentb(String infConsentb) {
        this.infConsentb = infConsentb;
    }

    @Column(name = "inf_consent_c", length = 2)
    public String getInfConsentc() {
        return infConsentc;
    }

    public void setInfConsentc(String infConsentc) {
        this.infConsentc = infConsentc;
    }

    @Column(name = "inf_consent_d", length = 2)
    public String getInfConsentd() {
        return infConsentd;
    }

    public void setInfConsentd(String infConsentd) {
        this.infConsentd = infConsentd;
    }

    @Column(name = "inf_infid", length = 50)
    public String getInfInfid() {
        return infInfid;
    }

    public void setInfInfid(String infInfid) {
        this.infInfid = infInfid;
    }

    @Column(name = "inf_reasonno", length = 2)
    public String getInfReasonno() {
        return infReasonno;
    }

    public void setInfReasonno(String infReasonno) {
        this.infReasonno = infReasonno;
    }

    @Column(name = "inf_reason_other")
    public String getInfReasonOther() {
        return infReasonOther;
    }

    public void setInfReasonOther(String infReasonOther) {
        this.infReasonOther = infReasonOther;
    }

    @Column(name = "inf_id_completing", nullable = false, length = 50)
    public String getInfIdCompleting() {
        return infIdCompleting;
    }

    public void setInfIdCompleting(String infIdCompleting) {
        this.infIdCompleting = infIdCompleting;
    }

    @Column(name = "inf_date_completed", nullable = false)
    public Date getInfDateCompleted() {
        return infDateCompleted;
    }

    public void setInfDateCompleted(Date infDateCompleted) {
        this.infDateCompleted = infDateCompleted;
    }

    @Column(name = "inf_id_reviewer", nullable = false, length = 50)
    public String getInfIdReviewer() {
        return infIdReviewer;
    }

    public void setInfIdReviewer(String infIdReviewer) {
        this.infIdReviewer = infIdReviewer;
    }

    @Column(name = "inf_date_reviewed", nullable = false)
    public Date getInfDateReviewed() {
        return infDateReviewed;
    }

    public void setInfDateReviewed(Date infDateReviewed) {
        this.infDateReviewed = infDateReviewed;
    }

    @Column(name = "inf_id_data_entry", nullable = false, length = 50)
    public String getInfIdDataEntry() {
        return infIdDataEntry;
    }

    public void setInfIdDataEntry(String infIdDataEntry) {
        this.infIdDataEntry = infIdDataEntry;
    }

    @Column(name = "inf_date_entered", nullable = false)
    public Date getInfDateEntered() {
        return infDateEntered;
    }

    public void setInfDateEntered(Date infDateEntered) {
        this.infDateEntered = infDateEntered;
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
        if (!(other instanceof Zp00aInfantScreening))
            return false;

        Zp00aInfantScreening castOther = (Zp00aInfantScreening) other;

        return (this.getRecordId().equals(castOther.getRecordId()));
    }
}
