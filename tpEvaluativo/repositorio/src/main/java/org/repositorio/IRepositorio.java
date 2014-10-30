package org.repositorio;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public interface IRepositorio {
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("SQLite"); 
	
	public void guardar(Object objeto);
	public List listar();
}
