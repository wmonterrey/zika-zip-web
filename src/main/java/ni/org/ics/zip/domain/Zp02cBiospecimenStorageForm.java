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
@Table(name = "zp02c_biospecimen_storage_form", catalog = "zika_zip")
public class Zp02cBiospecimenStorageForm extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId; //id del sujeto
    private String bscId; //id de la muestra
    private Date stoStoredDat;
    private String stoSubjType;
    private String stoSpecType;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "bsc_id", nullable = false, length = 25)
    public String getBscId() {
        return bscId;
    }

    public void setBscId(String bscId) {
        this.bscId = bscId;
    }

    @Column(name = "sto_stored_dat", nullable = true)
    public Date getStoStoredDat() {
        return stoStoredDat;
    }

    public void setStoStoredDat(Date stoStoredDat) {
        this.stoStoredDat = stoStoredDat;
    }

    @Column(name = "sto_subj_type", nullable = true, length = 2)
    public String getStoSubjType() {
        return stoSubjType;
    }

    public void setStoSubjType(String stoSubjType) {
        this.stoSubjType = stoSubjType;
    }

    @Column(name = "sto_spec_type", nullable = true, length = 2)
    public String getStoSpecType() {
        return stoSpecType;
    }

    public void setStoSpecType(String stoSpecType) {
        this.stoSpecType = stoSpecType;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return this.recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zp02cBiospecimenStorageForm)) return false;

        Zp02cBiospecimenStorageForm that = (Zp02cBiospecimenStorageForm) o;

        return (recordId.equals(that.recordId));
    }
}
