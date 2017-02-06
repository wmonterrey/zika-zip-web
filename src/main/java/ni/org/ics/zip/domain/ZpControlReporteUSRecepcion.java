package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp_reporte_us_recepcion", catalog = "zika_zip")
public class ZpControlReporteUSRecepcion extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String evento;
	private Date fechaDato;
	private Date fechaHoraLLegada;
    private String lugarLlegada;
    private String persona;

    @Id
    @Column(name="codigo", nullable = false, length = 50)
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Column(name="evento", nullable = false, length = 50)
    public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
    @Id
    @Column(name="fecha_dato", nullable = false, length = 50)
    public Date getFechaDato() {
		return fechaDato;
	}
	public void setFechaDato(Date fechaDato) {
		this.fechaDato = fechaDato;
	}
	@Column(name="fecha_llegada", nullable = false, length = 50)
    public Date getFechaHoraLLegada() {
        return fechaHoraLLegada;
    }
    public void setFechaHoraLLegada(Date fechaHoraLLegada) {
        this.fechaHoraLLegada = fechaHoraLLegada;
    }

    @Column(name="lugar", nullable = false, length = 50)
    public String getLugarLlegada() {
		return lugarLlegada;
	}
	public void setLugarLlegada(String lugarLlegada) {
		this.lugarLlegada = lugarLlegada;
	}

    @Column(name="persona", nullable = false, length = 50)
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }
}
