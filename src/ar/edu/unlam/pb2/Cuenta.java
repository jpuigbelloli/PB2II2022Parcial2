package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.ExcedeLimiteDeCompraException;
import ar.edu.unlam.pb2.excepciones.SaldoInsuficienteException;

public abstract class Cuenta implements Pagadora, MedioDePago {

	private String entidad;
	private String titular;
	private double saldo;

	public Cuenta(String entidad, String titular) {
		super();
		this.entidad = entidad;
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public Boolean pagar(double importe) throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		Boolean pagada = false;
		if (importe <= saldo) {
			saldo -= importe;
			pagada = true;
		} else {
			throw new SaldoInsuficienteException("El saldo es insuficiente.");
		}
		return pagada;
	}

}
