package org.repositorio;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import org.dominio.Cliente;

public class ClienteRepositorio implements IRepositorio {
	public void guardar(Object objeto) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			pm.makePersistent(objeto);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public List listar() {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query consulta = pm.newQuery(Cliente.class);
			consulta.setClass(Cliente.class);
			List<Cliente> res = (List<Cliente>) consulta.execute();

			for (Cliente c : res) {
				System.out.println(c.toString());
			}
			tx.commit();
			return res;

		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}
}
