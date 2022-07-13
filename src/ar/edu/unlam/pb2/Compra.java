package ar.edu.unlam.pb2;

public class Compra {

	private Long cuit;
	private Double saldo;

	public Compra(Long cuit, Double saldo) {
		this.cuit = cuit;
		this.saldo = saldo;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
