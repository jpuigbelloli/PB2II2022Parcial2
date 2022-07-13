package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;

public class Billetera {

	private String nombre;
	private HashMap<Long, Comercio> comercios;
	private HashSet<Consumidor> consumidores;

	public Billetera(String nombre) {
		this.nombre = nombre;
		this.comercios = new HashMap<Long, Comercio>();
		this.consumidores = new HashSet<Consumidor>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// put recibe 2 parametros, clave y objeto
	public void agregarComercio(Comercio comercio) {
		comercios.put(comercio.getCuit(), comercio);
	}

	public Integer getCantidadDeComercios() {
		return comercios.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		consumidores.add(consumidor);
	}

	public Integer getCantidadDeConsumidores() {
		return consumidores.size();
	}

	public Comercio buscarComercio(Long cuit) {
		return comercios.get(cuit);
	}

	public void agregarMedioDePago(int dni, MedioDePago medioPago) {
		for (Consumidor consumidor : consumidores) {
			if (dni == consumidor.getDni()) {
				consumidor.agregarMedioDePago(medioPago);
			}
		}
	}

	public Integer getCantidadDeMediosDePago(int dni) {
		for (Consumidor consumidor : consumidores) {
			if (dni == consumidor.getDni()) {
				return consumidor.getCantidadMediosDePago();
			}
		}
		return 0;
	}

	public Compra generarCodigoQR(long cuit, double importe) {
		Compra compra = new Compra(cuit, importe);
		return compra;
	}

	public Consumidor traerConsumidor(Integer dni) {
		for (Consumidor consumidor : consumidores) {
			if (consumidor.getDni().equals(dni)) {
				return consumidor;
			}
		}
		return null;
	}

	public Boolean pagar(Compra codigoQR, Pagadora medioPagador) {
		
		return null;
	}

}
