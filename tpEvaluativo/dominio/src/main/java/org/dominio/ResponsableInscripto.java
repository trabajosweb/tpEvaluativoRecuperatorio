package org.dominio;

import java.util.List;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class ResponsableInscripto extends Cliente{

	public ResponsableInscripto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponsableInscripto(String nombre, String telefono, String cuit,
			List<Factura> listaFactura) {
		super(nombre, telefono, cuit, listaFactura);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
