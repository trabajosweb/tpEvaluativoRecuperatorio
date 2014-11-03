package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class C extends Factura {

	public C(int numero, Cliente cliente) {
		super(numero, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Factura 'C'";
	}

}
