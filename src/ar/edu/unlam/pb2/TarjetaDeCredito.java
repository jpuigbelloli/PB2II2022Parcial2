package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.ExcedeLimiteDeCompraException;
import ar.edu.unlam.pb2.excepciones.NumeroDeTarjetaInvalidoException;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {

	private double LimiteDeCompraEnPesos;
	private double LimiteDeCompraEnDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad)
			throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaVencimiento, codigoSeguridad);
	}

	public TarjetaDeCredito(Long numero, String titular, String fechaVencimiento, Integer codigoSeguridad,
			double LimiteDeCompraEnPesos, double LimiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		super(numero, titular, fechaVencimiento, codigoSeguridad);
		this.LimiteDeCompraEnPesos = LimiteDeCompraEnPesos;
		this.LimiteDeCompraEnDolares = LimiteDeCompraEnDolares;
	}

	public double getLimiteDeCompraEnPesos() {
		return LimiteDeCompraEnPesos;
	}

	public void setLimiteDeCompraEnPesos(double limiteDeCompraEnPesos) {
		LimiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public double getLimiteDeCompraEnDolares() {
		return LimiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(double limiteDeCompraEnDolares) {
		LimiteDeCompraEnDolares = limiteDeCompraEnDolares;
	}

	@Override
	public Boolean pagar(double importe) throws ExcedeLimiteDeCompraException{
		Boolean pagada = false;
		if (importe <= LimiteDeCompraEnPesos) {
			LimiteDeCompraEnPesos -= importe;
			pagada = true;
		} else {
			throw new ExcedeLimiteDeCompraException("Tu limite no es suficiente.");
		}
		return pagada;
	}
		

}
