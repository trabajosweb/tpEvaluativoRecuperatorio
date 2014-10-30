package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.A;
import org.dominio.B;
import org.dominio.C;
import org.dominio.Factura;
import org.repositorio.IRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FacturaServicio implements IServicio {

	ApplicationContext context = new AnnotationConfigApplicationContext(ClaseConfiguracion.class);
	IRepositorio repositorio= (IRepositorio) context.getBean("RepositorioFactura");
	public void guardar() {

	    List<Factura> lista= new ArrayList<Factura>();
		lista.add((A) context.getBean("a1"));
		lista.add((A) context.getBean("a2"));
		lista.add((B) context.getBean("b1"));
		lista.add((B) context.getBean("b2"));
		lista.add((C) context.getBean("c1"));
		lista.add((C) context.getBean("c2"));
	    for(Factura f: lista)
		repositorio.guardar(f);
	}

	public void listar() {
		List<Factura> lista = null;
		try {
			lista= repositorio.listar();
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		} 

}
