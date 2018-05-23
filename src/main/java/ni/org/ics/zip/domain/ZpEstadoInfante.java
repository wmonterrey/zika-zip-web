package ni.org.ics.zip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ni.org.ics.zip.domain.audit.Auditable;

import java.util.Date;

/**
 * Created by FIRSTICT on 2/10/2017.
 * V1.0
 */
@Entity
@Table(name = "zp_estado_infante", catalog = "zika_zip")
public class ZpEstadoInfante extends BaseMetaData implements Auditable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String recordId;
    private char nacimiento = '0';
    private char mes3 = '0';
    private char mes6 = '0';
    private char mes12 = '0';

    public ZpEstadoInfante(){

    }

    public ZpEstadoInfante(String recordId, char nacimiento, char mes3,
                           char mes6, char mes12, Date recordDate, String recordUser, char pasive,
                           Integer idInstancia, String instancePath, String estado,
                           String start, String end, String deviceid, String simserial,
                           String phonenumber, Date today) {
        super(recordDate, recordUser, pasive,
                idInstancia, instancePath, estado,
                start, end, deviceid, simserial,
                phonenumber, today);
        this.recordId = recordId;
        this.nacimiento = nacimiento;
        this.mes3 = mes3;
        this.mes6 = mes6;
        this.mes12 = mes12;
    }

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name="nacimiento", nullable = false, length = 1)
    public char getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(char nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Column(name="mes_3", nullable = false, length = 1)
    public char getMes3() {
        return mes3;
    }

    public void setMes3(char mes3) {
        this.mes3 = mes3;
    }

    @Column(name="mes_6", nullable = false, length = 1)
    public char getMes6() {
        return mes6;
    }

    public void setMes6(char mes6) {
        this.mes6 = mes6;
    }

    @Column(name="mes_12", nullable = false, length = 1)
    public char getMes12() {
        return mes12;
    }

    public void setMes12(char mes12) {
        this.mes12 = mes12;
    }

	@Override
	public boolean isFieldAuditable(String fieldname) {
		// TODO Auto-generated method stub
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
		if (!(other instanceof ZpEstadoInfante))
			return false;
		
		ZpEstadoInfante castOther = (ZpEstadoInfante) other;

		return (this.getRecordId().equals(castOther.getRecordId()));
	}
}
