package digiwallboard.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityTransaction;

import digiwallboard.model.Polica;
import digiwallboard.util.HibernateUtil;


public class PoliceDAO {

	public static Polica getPolica() {

        Transaction transaction = null;
        Polica p = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            String hql = "SELECT count(*) from Polica";
            
            
            @SuppressWarnings("deprecation") 
			Query query = session.createQuery(hql);
                        
             p = (Polica)query.uniqueResult();
            
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
        System.out.println(p);
        
		return p;
		
    }
  
}
