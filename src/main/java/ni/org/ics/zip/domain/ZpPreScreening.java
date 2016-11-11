package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp_prescreening", catalog = "zika_zip")
public class ZpPreScreening extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String recId;
	private String compId;
	private String cs;
	private Integer consecutive;
    private String verbalConsent;

    @Id
    @Column(name="rec_id", nullable = false, length = 50)
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}

    @Column(name="comp_id", nullable = false, length = 50)
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}

    @Column(name="centro_salud", nullable = false, length = 50)
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}

    @Column(name="consecutive", nullable = false)
	public Integer getConsecutive() {
		return consecutive;
	}
	public void setConsecutive(Integer consecutive) {
		this.consecutive = consecutive;
	}

    @Column(name="verbal_consent", nullable = false, length = 5)
    public String getVerbalConsent() {
        return verbalConsent;
    }

    public void setVerbalConsent(String verbalConsent) {
        this.verbalConsent = verbalConsent;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }
}
