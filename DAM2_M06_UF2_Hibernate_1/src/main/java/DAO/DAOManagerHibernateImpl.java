package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import MODEL.Empleat;

public class DAOManagerHibernateImpl implements DAOManager {
    
    
	private EntityManagerFactory eManFact;
    private EntityManager eMan;
    
    public DAOManagerHibernateImpl() {
        try {

            eManFact = Persistence.createEntityManagerFactory("ORMEmployee");
            eMan = eManFact.createEntityManager();
            
        } catch (Exception e) { e.printStackTrace(); }
    }

	
    @Override
    public void createEmployee(Empleat e) {
    	
        EntityTransaction transaction = null;

        try {
            transaction = eMan.getTransaction();
            transaction.begin();

            // Operación de persistencia
            eMan.persist(e);

            // Confirma la transacción
            transaction.commit();
        } catch (Exception ex) {
            // Manejo de errores y rollback en caso de excepción
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }



	@Override
	public double getMaxSalary() {
		
		// TASK : is correct this method?
		Double salary = 0.0;
		try {

			// NOTE : the SELECT is done on our class, not the table
			// for that reason we use "salari" instead of "salary" and 
			// "Empleat" instead of "Employee".
            Query query = 
            		eMan.createQuery("SELECT MAX(e.salari) FROM Empleat e");

            salary = (Double) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
		return (salary != null) ? salary : 0;
	}
	
	@Override
    public void close() {
        // Closing the EntityManager y el EntityManagerFactory 
        if (eMan != null && eMan.isOpen()) {
            eMan.close();
        }
        if (eManFact != null && eManFact.isOpen()) {
            eManFact.close();
        }
    }

}
