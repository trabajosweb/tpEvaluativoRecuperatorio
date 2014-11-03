package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Factura {
	protected int numero;
	protected Cliente cliente;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Factura(int numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", cliente=" + cliente.getNombre()
				+ "]";
	}

}
