package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.NumeroDeTarjetaInvalidoException;

public class Tarjeta implements MedioDePago {

	private Long numero;
	private String titular;
	private String fechaVencimiento;
	private Integer codigoSeguridad;

	public Tarjeta(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad)
			throws NumeroDeTarjetaInvalidoException {
		super();
		if (Long.toString(numero).length() != 16) {
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta debe tener 16 digitos.");
		}
		this.numero = numero;
		this.titular = titular;
		this.fechaVencimiento = fechaVencimiento;
		this.codigoSeguridad = codigoSeguridad;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	@Override
	public String getId() {
		return getNumero().toString();
	}

}
