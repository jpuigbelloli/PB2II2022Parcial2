package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Consumidor {

	private String nombre;
	private Integer dni;
	private HashSet<MedioDePago> mediosDePago;

	public Consumidor(Integer dni, String nombre) {
		this.mediosDePago = new HashSet<MedioDePago>();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	// agrego los medios de pago del consumidor (tarjeta, cuenta, etc)
	public void agregarMedioDePago(MedioDePago medioPago_param) {
		Boolean medioEncontrado = false;
		for (MedioDePago medioDePago : mediosDePago) {
			if (medioDePago.getId().equals(medioPago_param.getId())) {
				medioEncontrado = true;
			}
		}
		if (!medioEncontrado) {
			mediosDePago.add(medioPago_param);
		}
	}

	public Integer getCantidadMediosDePago() {
		return mediosDePago.size();
	}

	public Pagadora getMedioPagador(long numeroTarjeta) {
		for (MedioDePago medioDePago : mediosDePago) {
			if(medioDePago.getId().equals(numeroTarjeta)) {
				return (Pagadora) mediosDePago;
			}
		}
		return null;
	}

	
	
	
}
