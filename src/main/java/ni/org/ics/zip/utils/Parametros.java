package ni.org.ics.zip.utils;

import java.io.Serializable;

import javax.persistence.*;

import ni.org.ics.zip.domain.audit.Auditable;


@Entity
@Table(name = "parameters", catalog = "zika_zip")
public class Parametros  implements Serializable, Auditable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String value;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false, length =11)	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "Name", nullable = false, length =255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "Value", nullable = false, length =255)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
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
		if (!(other instanceof Parametros))
			return false;
		
		Parametros castOther = (Parametros) other;

		return (this.id == castOther.id);
	}
	@Override
	public boolean isFieldAuditable(String fieldname) {
		// TODO Auto-generated method stub
		return false;
	}



}
