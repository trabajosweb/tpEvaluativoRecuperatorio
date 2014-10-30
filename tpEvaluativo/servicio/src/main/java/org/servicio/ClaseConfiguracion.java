package org.servicio;

import org.dominio.A;
import org.dominio.B;
import org.dominio.C;
import org.dominio.Cliente;
import org.dominio.Factura;
import org.dominio.Monotributista;
import org.dominio.ResponsableInscripto;
import org.repositorio.ClienteRepositorio;
import org.repositorio.FacturaRepositorio;
import org.repositorio.IRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ClaseConfiguracion {
/*Como mínimo se deben mostrar 2 clientes, uno Monotributista con 2 facturas tipo C y otro Responsable Inscripto con 4 facturas (dos A y dos B). 

En las facturas de tipo A se debe incluir el iva. */
	@Bean(name = "a1")
	public Factura a1() {
		return new A(0.21, 001, responsableInscripto());
	}
	@Bean(name = "a2")
	public Factura a2() {
		return new A(0.21, 002, responsableInscripto());
	}
	@Bean(name = "b1")
	public Factura b1() {
		return new B(032, responsableInscripto());
	}
	@Bean(name = "b2")
	public Factura b2() {
		return new B(040, responsableInscripto());
	}
	@Bean(name = "c1")
	public Factura c1() {
		return new C(002,monotributista());
	}
	@Bean(name = "c2")
	public Factura c2() {
		return new C(003,monotributista());
	}

	@Bean(name = "monotributista")
	public Cliente monotributista() {
		return new Monotributista();
	}
	
	@Bean(name = "responsableInscripto")	
	public Cliente responsableInscripto() {
		return new ResponsableInscripto();
	}

	
	@Bean(name = "RepositorioCliente")
	public IRepositorio iClienteRepositorio() {
		return new ClienteRepositorio();
	}
	
	@Bean(name = "RepositorioFactura")
	public IRepositorio iFacturaRepositorio() {
		return new FacturaRepositorio();
	}
}
