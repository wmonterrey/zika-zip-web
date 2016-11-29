package ni.org.ics.zip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ni.org.ics.zip.domain.audit.Auditable;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp_estado_embarazada", catalog = "zika_zip")
public class ZpEstadoEmbarazada extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String recordId;
	private char ingreso = '0';
	private char sem2 = '0';
	private char sem4 = '0';
	private char sem6 = '0';
	private char sem8 = '0';
	private char sem10 = '0';
	private char sem12 = '0';
	private char sem14 = '0';
	private char sem16 = '0';
	private char sem18 = '0';
	private char sem20 = '0';
	private char sem22 = '0';
	private char sem24 = '0';
	private char sem26 = '0';
	private char sem28 = '0';
	private char sem30 = '0';
	private char sem32 = '0';
	private char sem34 = '0';
	private char sem36 = '0';
	private char sem38 = '0';
	private char sem40 = '0';
	private char sem42 = '0';
	private char sem44 = '0';
	private char parto = '0';
	private char posparto = '0';
	
	@Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name="ingreso", nullable = false, length = 1)
	public char getIngreso() {
		return ingreso;
	}

	public void setIngreso(char ingreso) {
		this.ingreso = ingreso;
	}

	@Column(name="sem4", nullable = false, length = 1)
	public char getSem4() {
		return sem4;
	}

	public void setSem4(char sem4) {
		this.sem4 = sem4;
	}

	@Column(name="sem8", nullable = false, length = 1)
	public char getSem8() {
		return sem8;
	}

	public void setSem8(char sem8) {
		this.sem8 = sem8;
	}

	@Column(name="sem12", nullable = false, length = 1)
	public char getSem12() {
		return sem12;
	}

	public void setSem12(char sem12) {
		this.sem12 = sem12;
	}

	@Column(name="sem16", nullable = false, length = 1)
	public char getSem16() {
		return sem16;
	}

	public void setSem16(char sem16) {
		this.sem16 = sem16;
	}

	@Column(name="sem20", nullable = false, length = 1)
	public char getSem20() {
		return sem20;
	}

	public void setSem20(char sem20) {
		this.sem20 = sem20;
	}

	@Column(name="sem24", nullable = false, length = 1)
	public char getSem24() {
		return sem24;
	}

	public void setSem24(char sem24) {
		this.sem24 = sem24;
	}

	@Column(name="sem28", nullable = false, length = 1)
	public char getSem28() {
		return sem28;
	}

	public void setSem28(char sem28) {
		this.sem28 = sem28;
	}

	@Column(name="sem32", nullable = false, length = 1)
	public char getSem32() {
		return sem32;
	}

	public void setSem32(char sem32) {
		this.sem32 = sem32;
	}

	@Column(name="sem36", nullable = false, length = 1)
	public char getSem36() {
		return sem36;
	}

	public void setSem36(char sem36) {
		this.sem36 = sem36;
	}

	@Column(name="sem40", nullable = false, length = 1)
	public char getSem40() {
		return sem40;
	}

	public void setSem40(char sem40) {
		this.sem40 = sem40;
	}

	@Column(name="sem44", nullable = false, length = 1)
	public char getSem44() {
		return sem44;
	}

	public void setSem44(char sem44) {
		this.sem44 = sem44;
	}

	@Column(name="parto", nullable = false, length = 1)
	public char getParto() {
		return parto;
	}

	public void setParto(char parto) {
		this.parto = parto;
	}

	@Column(name="posparto", nullable = false, length = 1)
	public char getPosparto() {
		return posparto;
	}

	public void setPosparto(char posparto) {
		this.posparto = posparto;
	}
	
	//Nuevos campos

	@Column(name="sem2", nullable = false, length = 1)
	public char getSem2() {
		return sem2;
	}

	public void setSem2(char sem2) {
		this.sem2 = sem2;
	}

	@Column(name="sem6", nullable = false, length = 1)
	public char getSem6() {
		return sem6;
	}

	public void setSem6(char sem6) {
		this.sem6 = sem6;
	}

	@Column(name="sem10", nullable = false, length = 1)
	public char getSem10() {
		return sem10;
	}

	public void setSem10(char sem10) {
		this.sem10 = sem10;
	}

	@Column(name="sem14", nullable = false, length = 1)
	public char getSem14() {
		return sem14;
	}

	public void setSem14(char sem14) {
		this.sem14 = sem14;
	}

	@Column(name="sem18", nullable = false, length = 1)
	public char getSem18() {
		return sem18;
	}

	public void setSem18(char sem18) {
		this.sem18 = sem18;
	}

	@Column(name="sem22", nullable = false, length = 1)
	public char getSem22() {
		return sem22;
	}

	public void setSem22(char sem22) {
		this.sem22 = sem22;
	}

	@Column(name="sem26", nullable = false, length = 1)
	public char getSem26() {
		return sem26;
	}

	public void setSem26(char sem26) {
		this.sem26 = sem26;
	}

	@Column(name="sem30", nullable = false, length = 1)
	public char getSem30() {
		return sem30;
	}

	public void setSem30(char sem30) {
		this.sem30 = sem30;
	}

	@Column(name="sem34", nullable = false, length = 1)
	public char getSem34() {
		return sem34;
	}

	public void setSem34(char sem34) {
		this.sem34 = sem34;
	}

	@Column(name="sem38", nullable = false, length = 1)
	public char getSem38() {
		return sem38;
	}

	public void setSem38(char sem38) {
		this.sem38 = sem38;
	}

	@Column(name="sem42", nullable = false, length = 1)
	public char getSem42() {
		return sem42;
	}

	public void setSem42(char sem42) {
		this.sem42 = sem42;
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
		if (!(other instanceof ZpEstadoEmbarazada))
			return false;
		
		ZpEstadoEmbarazada castOther = (ZpEstadoEmbarazada) other;

		return (this.getRecordId().equals(castOther.getRecordId()));
	}
	
    
}
