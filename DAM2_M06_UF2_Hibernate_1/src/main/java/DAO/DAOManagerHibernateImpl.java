package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getMaxSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
