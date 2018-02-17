package miw.ws.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@XmlRootElement(name="excursion")
@Table(name = "Excursion")
public class Excursion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "origen")
	private String origen;
	
	@Column(name = "destino")
	private String destino;
	
	@Column(name = "fecha")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fecha;
	
	@Column(name = "hora")
	private String hora;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "estado")
	private Status estado;
	
	@Column(name="plazas")
	private int plazas;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public Status getEstado() {
		return estado;
	}

	public void setEstado(Status estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Excursion [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", hora=" + hora
				+ ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
	

}
