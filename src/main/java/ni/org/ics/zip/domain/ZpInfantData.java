package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 2/7/2017.
 * V1.0
 */
@Entity
@Table(name = "zp_datos_infante", catalog = "zika_zip")
public class ZpInfantData extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String pregnantId;
    private Date infantBirthDate;
    private String infantMode;
    private String infantDeliveryWho;
    private String infantDeliveryOccur;
    private String infantHospitalId;
    private String infantClinicId;
    private String infantDeliveryOther;
    private String infantNumBirth;
    private String infantFetalOutcome;
    private String infantCauseDeath;
    private String infantSexBaby;

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

    @Column(name = "infant_delivery_date", nullable = true)
    public Date getInfantBirthDate() {
        return infantBirthDate;
    }

    public void setInfantBirthDate(Date infantBirthDate) {
        this.infantBirthDate = infantBirthDate;
    }

    @Column(name = "infant_mode", nullable = true, length = 2)
    public String getInfantMode() {
        return infantMode;
    }

    public void setInfantMode(String infantMode) {
        this.infantMode = infantMode;
    }

    @Column(name = "infant_delivery_who", nullable = true, length = 2)
    public String getInfantDeliveryWho() {
        return infantDeliveryWho;
    }

    public void setInfantDeliveryWho(String infantDeliveryWho) {
        this.infantDeliveryWho = infantDeliveryWho;
    }

    @Column(name = "infant_delivery_occur", nullable = true, length = 2)
    public String getInfantDeliveryOccur() {
        return infantDeliveryOccur;
    }

    public void setInfantDeliveryOccur(String infantDeliveryOccur) {
        this.infantDeliveryOccur = infantDeliveryOccur;
    }

    @Column(name = "infant_hospital_id", nullable = true, length = 25)
    public String getInfantHospitalId() {
        return infantHospitalId;
    }

    public void setInfantHospitalId(String infantHospitalId) {
        this.infantHospitalId = infantHospitalId;
    }

    @Column(name = "infant_clinic_id", nullable = true, length = 25)
    public String getInfantClinicId() {
        return infantClinicId;
    }

    public void setInfantClinicId(String infantClinicId) {
        this.infantClinicId = infantClinicId;
    }

    @Column(name = "infant_delivery_other", nullable = true)
    public String getInfantDeliveryOther() {
        return infantDeliveryOther;
    }

    public void setInfantDeliveryOther(String infantDeliveryOther) {
        this.infantDeliveryOther = infantDeliveryOther;
    }

    @Column(name = "infant_num_birth", nullable = true, length = 1)
    public String getInfantNumBirth() {
        return infantNumBirth;
    }

    public void setInfantNumBirth(String infantNumBirth) {
        this.infantNumBirth = infantNumBirth;
    }

    @Column(name = "infant_fetal_outcome", nullable = true, length = 2)
    public String getInfantFetalOutcome() {
        return infantFetalOutcome;
    }

    public void setInfantFetalOutcome(String infantFetalOutcome1) {
        this.infantFetalOutcome = infantFetalOutcome1;
    }

    @Column(name = "infant_cause_death", nullable = true)
    public String getInfantCauseDeath() {
        return infantCauseDeath;
    }

    public void setInfantCauseDeath(String infantCauseDeath) {
        this.infantCauseDeath = infantCauseDeath;
    }

    @Column(name = "infant_sex_baby", nullable = true, length = 1)
    public String getInfantSexBaby() {
        return infantSexBaby;
    }

    public void setInfantSexBaby(String infantSexBaby) {
        this.infantSexBaby = infantSexBaby;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZpInfantData)) return false;

        ZpInfantData zpInfantData = (ZpInfantData) o;

        if (!recordId.equals(zpInfantData.recordId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return recordId.hashCode();
    }
}
