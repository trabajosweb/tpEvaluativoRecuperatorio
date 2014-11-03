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

	private IRepositorio repositorio;

	public IRepositorio getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	public void guardar() {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ClaseConfiguracion.class);
		List<Factura> lista = new ArrayList<Factura>();
		lista.add((A) context.getBean("a1"));
		lista.add((A) context.getBean("a2"));
		lista.add((B) context.getBean("b1"));
		lista.add((B) context.getBean("b2"));
		lista.add((C) context.getBean("c1"));
		lista.add((C) context.getBean("c2"));
		repositorio = (IRepositorio) context.getBean("RepositorioFactura");
		for (Factura f : lista) {
			getRepositorio().guardar(f);
		}
	}

	public void listar() {
		try {
			getRepositorio().listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
