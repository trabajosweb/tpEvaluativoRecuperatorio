package org.presentacion;

import org.servicio.ClaseConfiguracion;
import org.servicio.IServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ClaseConfiguracion.class);
		IServicio servicioCliente = (IServicio) context
				.getBean("ServicioCliente");
		servicioCliente.guardar();
		servicioCliente.listar();
	}
}
