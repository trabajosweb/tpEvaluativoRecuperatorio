package org.dominio;

import java.util.List;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE) 
public class Cliente {
	String nombre;
	String telefono;
	String cuit;
	
	@Persistent(mappedBy="cliente")
    @Join
	List<Factura> listaFacturas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public List<Factura> getListaFactura() {
		return listaFacturas;
	}
	public void setListaFactura(List<Factura> listaFactura) {
		this.listaFacturas = listaFactura;
	}
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String telefono, String cuit,
			List<Factura> listaFactura) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.cuit = cuit;
		this.listaFacturas = listaFactura;
	}
	@Override
	public String toString() {
		String datos="";
		for (Factura f : listaFacturas) {
			datos+= f.toString()+"\n";
			}
		String cad = "\n nombre=" + nombre + "\n telefono=" + telefono + "\n cuit=" + cuit + " \n lista Facturas \n" +  datos + "";
		return cad;
	}
	
	
}
