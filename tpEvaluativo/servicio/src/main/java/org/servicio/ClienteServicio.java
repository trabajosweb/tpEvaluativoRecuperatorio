package org.servicio;

import java.util.ArrayList;
import java.util.List;

import org.dominio.Cliente;
import org.dominio.Factura;
import org.dominio.Monotributista;
import org.dominio.ResponsableInscripto;
import org.repositorio.IRepositorio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClienteServicio implements IServicio {

	ApplicationContext context = new AnnotationConfigApplicationContext(ClaseConfiguracion.class);
	IRepositorio repositorio= (IRepositorio) context.getBean("RepositorioCliente");
	public void guardar() {
	
	    Cliente  cliente1  = (ResponsableInscripto)  context.getBean("responsableInscripto");	
	    Cliente  cliente2  = (Monotributista)  context.getBean("monotributista");	
		
	    List<Factura> lista= new ArrayList<Factura>();
	    lista.add((Factura) context.getBean("a1"));
	    lista.add((Factura) context.getBean("a2"));
	    lista.add((Factura) context.getBean("b1"));
	    lista.add((Factura) context.getBean("b2"));
		
		cliente1.setNombre("Rodriguez Pablo");
		cliente1.setTelefono("4458575");
		cliente1.setCuit("27-854758-4");
		cliente1.setListaFactura(lista);
	    
		repositorio.guardar(cliente1);

		  List<Factura> listaC2= new ArrayList<Factura>();
		    listaC2.add((Factura) context.getBean("c1"));
		    listaC2.add((Factura) context.getBean("c2"));
			cliente2.setNombre("Perez Gabriel");
			cliente2.setTelefono("4424545");
			cliente2.setCuit("27-33564752-4");
			cliente2.setListaFactura(listaC2);
		    
			repositorio.guardar(cliente2);
	}

	public void listar() {
		List<Cliente> lista = null;
		try {
			lista= repositorio.listar();
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		} 

}
