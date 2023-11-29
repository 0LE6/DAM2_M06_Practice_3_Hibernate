package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import MODEL.Empleat;

public class DAOManagerHibernateImpl implements DAOManager{

	EntityManagerFactory emfactory = 
			  Persistence.createEntityManagerFactory("ORMEmployee");
	  
    EntityManager entitymanager = emfactory.createEntityManager( );
    
    EntityTransaction t =null;
    
    /*
     	EntityManagerFactory eManFact = 
			Persistence.createEntityManagerFactory("ORMEmployee");
	
	EntityManager eMan =  eManFact.createEntityManager( );
	
	EntityTransaction = null;
     */
	
	public DAOManagerHibernateImpl() {
		
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
