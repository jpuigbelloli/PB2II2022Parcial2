package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.ExcedeLimiteDeCompraException;
import ar.edu.unlam.pb2.excepciones.SaldoInsuficienteException;

public interface Pagadora {
	
	public Boolean pagar(double importe) throws SaldoInsuficienteException, ExcedeLimiteDeCompraException;
	
	
}
