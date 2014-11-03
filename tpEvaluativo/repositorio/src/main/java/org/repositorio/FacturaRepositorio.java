package org.repositorio;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import org.dominio.Factura;

public class FacturaRepositorio implements IRepositorio {

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
			Query consulta = pm.newQuery(Factura.class);
			consulta.setClass(Factura.class);
			List<Factura> res = (List<Factura>) consulta.execute();

			for (Factura f : res) {
				System.out.println(f.toString());
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
