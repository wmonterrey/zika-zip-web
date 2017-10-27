package ni.org.ics.zip.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.joda.time.DateTime;

import ni.org.ics.zip.domain.audit.Auditable;
import ni.org.ics.zip.domain.catalogs.AppointmentType;
import ni.org.ics.zip.domain.catalogs.Cs;
import ni.org.ics.zip.domain.catalogs.Provider;
import ni.org.ics.zip.domain.catalogs.Speciality;
import ni.org.ics.zip.domain.catalogs.SubjectType;

@Entity
@Table(name = "zp_agenda_estudio", catalog = "zika_zip")
public class ZpAgendaEstudio extends BaseMetaData implements Auditable, Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private Date appointmentDateTime;
    private String provider;
    private String healtUnit;
    private String recordId;
 
	private String subjectType; // Tipo de agenda - Mujer o nino 
    private String appointmentType; // Tipo de cita  - General o Especialidad o Ultra Sonido
    private String specialityType; // si es especialidad , definir que tipo
    private String cellNumAuth; // El paciente autoriza el uso de su telefono para envio de SMS
   
	private String smsNumber;
    private String asistio;
    private String obs;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false, length = 11)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "FECHA_HORA_CITA", nullable = false, length = 50)
	public Date getAppointmentDateTime() {
		return appointmentDateTime;
	}
	public void setAppointmentDateTime(Date appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}
	
	//@ManyToOne
	@Column(name="PROVEEDOR", nullable = false, length = 50)
	//@ForeignKey(name = "PRO_CITAS_FK")
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	//@ManyToOne
	@Column(name="US", nullable = false, length = 50)
	//@ForeignKey(name = "US_CITAS_FK")
	public String getHealtUnit() {
		return healtUnit;
	}
	
	public void setHealtUnit(String healtUnit) {
		this.healtUnit = healtUnit;
	}
	@Column(name = "RECORD_ID", nullable = false, length = 25)
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	//@ManyToOne
	@Column(name="TIPO_SUJETO", nullable = false, length = 50)
	//@ForeignKey(name = "TSUJ_CITAS_FK")
	public String getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}
	
	//@ManyToOne
	@Column(name="TIPO_CITA", nullable = false, length = 50)
	//@ForeignKey(name = "TCITA_CITAS_FK")
	public String getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}
	
	//@ManyToOne
	@Column(name="ESPECIALISTA", nullable = false, length = 50)
	//@ForeignKey(name = "ESP_CITAS_FK")
	public String getSpecialityType() {
		return specialityType;
	}
	public void setSpecialityType(String specialityType) {
		this.specialityType = specialityType;
	}
	
	
	
	@Column(name="NumeroMensaje", nullable=true, length=25)
	public String getSMSNumber() {
		return this.smsNumber;
	}
	public void setSMSNumber(String number) {
		this.smsNumber= number;
	}
	
	@Column(name="AutorizaSms", nullable=false, length=1)
	public String getCellNumAuth() {
			return cellNumAuth;
		}
	public void setCellNumAuth(String cellNumAuth) {
			this.cellNumAuth = cellNumAuth;
		}
	
	
	@Column(name = "OBSERVACIONES", nullable = false, length = 500)
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	@Column(name="Asistio", nullable = false,length=1)
	public String getAsistio() {
		return asistio;
	}
	public void setAsistio(String st) {
		this.asistio = st;
	}
	
	public ZpAgendaEstudio() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
	@Override
	public boolean equals(Object other) {
		
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ZpAgendaEstudio))
			return false;
		
		ZpAgendaEstudio castOther = (ZpAgendaEstudio) other;

		return (this.id == castOther.id);
	}
	@Override
	public boolean isFieldAuditable(String fieldname) {
		return true;
	}
    
}
