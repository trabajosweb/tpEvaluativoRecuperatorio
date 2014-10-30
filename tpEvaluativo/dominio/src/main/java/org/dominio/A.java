package org.dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class A extends Factura{
	Double IVA;

	public Double getIVA() {
		return IVA;
	}

	public void setIVA(Double iVA) {
		IVA = iVA;
	}

	public A(Double IVA,int numero, Cliente cliente) {
		super(numero, cliente);
		this.IVA=IVA;
	}

	
	@Override
	public String toString() {
		return super.toString()+"IVA "+ IVA;
	}
	
}
