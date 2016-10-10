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
@Table(name = "zp02b_biospecimen_results", catalog = "zika_zip")
public class Zp02bBiospecimenResults {

    private String recordId; //id del sujeto
    private String bscId; //id de la muestra
    private String resTestTyp;
    private Date resConductDat;
    private String resResult;
    private Date resEnteredDat;

    @Id
    @Column(name = "record_id", nullable = false)
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

    @Column(name = "res_test_typ", nullable = false, length = 2)
    public String getResTestTyp() {
        return resTestTyp;
    }

    public void setResTestTyp(String resTestTyp) {
        this.resTestTyp = resTestTyp;
    }

    @Column(name = "res_conduct_dat", nullable = false)
    public Date getResConductDat() {
        return resConductDat;
    }

    public void setResConductDat(Date resConductDat) {
        this.resConductDat = resConductDat;
    }

    @Column(name = "res_result", nullable = false, length = 2)
    public String getResResult() {
        return resResult;
    }

    public void setResResult(String resResult) {
        this.resResult = resResult;
    }

    @Column(name = "res_entered_dat", nullable = false)
    public Date getResEnteredDat() {
        return resEnteredDat;
    }

    public void setResEnteredDat(Date resEnteredDat) {
        this.resEnteredDat = resEnteredDat;
    }
}
