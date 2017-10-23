package ni.org.ics.zip.domain.catalogs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import ni.org.ics.zip.domain.BaseMetaData;
import ni.org.ics.zip.domain.audit.Auditable;


@Entity
@Table(name = "providers", catalog = "zika_zip")
public class Provider extends BaseMetaData implements Auditable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String us;
	private String speciality;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false, length =11)
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "NOMBRE", nullable = false, length =255)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name = "ESPECIALIDAD", nullable = true, length =255)
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	@Column(name = "CS", nullable = true, length =255)
	public String getUs() {
		return us;
	}
	
	public void setUs(String us) {
		this.us = us;
	}
	
	/*
	@ManyToOne
	@JoinColumn(name="CS", insertable = false, updatable = false)
	@ForeignKey(name = "US_PROVEEDORES_FK")
	public Cs getUs() {
		return us;
	}
	public void setUs(Cs us) {
		this.us = us;
	}
	@ManyToOne
	@JoinColumn(name="ESPECIALIDAD", insertable = false, updatable = false)
	@ForeignKey(name = "ESP_PROVEEDORES_FK")
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	
	*/
	@Override
	public String toString(){
		return name;
	}
	@Override
	public boolean equals(Object other) {
		
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Provider))
			return false;
		
		Provider castOther = (Provider) other;

		return (this.id == castOther.id);
	}
	@Override
	public boolean isFieldAuditable(String fieldname) {
		// TODO Auto-generated method stub
		return true;
	}
}
