package ni.org.ics.zip.utils;
import java.io.Serializable;




public class Evento {
	
	/**
	 * 
	 */

	String title;
	String start;
	String end;
	Boolean allDay;
	String color;
	int id;
	String description;
	String numeroid;
	String fechacita;
	String horacita;
	String unidadsalud;
	String proveedor;
	String especialidad;
	String numerotelefono;
	String asistio;
	String tipoAgenda;
	
	public String getTipoAgenda() {
		return tipoAgenda;
	}

	public void setTipoAgenda(String tipoAgenda) {
		this.tipoAgenda = tipoAgenda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroid() {
		return numeroid;
	}

	public void setNumeroid(String numeroid) {
		this.numeroid = numeroid;
	}

	public String getFechacita() {
		return fechacita;
	}

	public void setFechacita(String fechacita) {
		this.fechacita = fechacita;
	}

	public String getHoracita() {
		return horacita;
	}

	public void setHoracita(String horacita) {
		this.horacita = horacita;
	}

	public String getUnidadsalud() {
		return unidadsalud;
	}

	public void setUnidadsalud(String unidadsalud) {
		this.unidadsalud = unidadsalud;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNumerotelefono() {
		return numerotelefono;
	}

	public void setNumerotelefono(String numerotelefono) {
		this.numerotelefono = numerotelefono;
	}

	public String getAsistio() {
		return asistio;
	}

	public void setAsistio(String asistio) {
		this.asistio = asistio;
	}

	public String getDescripcion() {
		return description;
	}

	public void setDescripcion(String descripcion) {
		this.description = descripcion;
	}

	public Boolean getAllDay() {
		return allDay;
	}

	public void setAllDay(Boolean allDay) {
		this.allDay = allDay;
	}

	public Evento() {	
		//super();
		
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Evento(String title, String start, String end, Boolean allDay, String color, int id, String description,
			String numeroid, String fechacita, String horacita, String unidadsalud, String proveedor,
			String especialidad, String numerotelefono, String asistio, String tipoAgenda) {
		super();
		this.title = title;
		this.start = start;
		this.end = end;
		this.allDay = allDay;
		this.color = color;
		this.id = id;
		this.description = description;
		this.numeroid = numeroid;
		this.fechacita = fechacita;
		this.horacita = horacita;
		this.unidadsalud = unidadsalud;
		this.proveedor = proveedor;
		this.especialidad = especialidad;
		this.numerotelefono = numerotelefono;
		this.asistio = asistio;
		this.tipoAgenda = tipoAgenda;
	}

	
	

}
