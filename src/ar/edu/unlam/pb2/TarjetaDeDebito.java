package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.NumeroDeTarjetaInvalidoException;
import ar.edu.unlam.pb2.excepciones.SaldoInsuficienteException;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {

	private double saldo;

	public TarjetaDeDebito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad)
			throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaVencimiento, codigoSeguridad);
	}

	public TarjetaDeDebito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad, double saldo)
			throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaVencimiento, codigoSeguridad);
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Boolean pagar(double importe) throws SaldoInsuficienteException{
		Boolean pagada = false;
		if (importe <= saldo) {
			saldo -= importe;
			pagada = true;
		} else {
			throw new SaldoInsuficienteException("Saldo insuficiente.");
		}
		return pagada;
	}
	
	
}
