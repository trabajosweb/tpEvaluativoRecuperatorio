package org.presentacion;

import org.servicio.ClienteServicio;
import org.servicio.IServicio;

public class App 
{
    public static void main( String[] args )
    {
    	IServicio servicioCliente= new ClienteServicio();
    	servicioCliente.guardar();
    	servicioCliente.listar();
    }
}
