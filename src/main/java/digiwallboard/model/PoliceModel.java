package digiwallboard.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import digiwallboard.model.Polica;
import digiwallboard.util.HibernateUtil;


public class PoliceModel {
	protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public boolean create(Polica product) {
		boolean result = true;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			result = false;
		} finally {
			session.close();
		}
		return result;
	}
}
