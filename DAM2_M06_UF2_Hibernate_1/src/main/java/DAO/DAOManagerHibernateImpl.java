package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;

import MODEL.Empleat;

public class DAOManagerHibernateImpl implements DAOManager{
    
    
	private EntityManagerFactory eManFact;
    private EntityManager eMan;
    private EntityTransaction eTransact;
    
    public DAOManagerHibernateImpl() {
        try {

            eManFact = Persistence.createEntityManagerFactory("ORMEmployee");
            eMan = eManFact.createEntityManager();
            eTransact = eMan.getTransaction();
            
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
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
    public void close() {
        // Cierra el EntityManager y el EntityManagerFactory al finalizar
        if (eMan != null && eMan.isOpen()) {
            eMan.close();
        }
        if (eManFact != null && eManFact.isOpen()) {
            eManFact.close();
        }
    }

}
