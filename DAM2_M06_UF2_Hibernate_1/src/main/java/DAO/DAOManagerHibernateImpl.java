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
		
		eTransact.begin();
		e.setId(e.getId());
		e.setCognom(e.getNom());
		e.setNom(e.getNom());
		e.setSalari(e.getSalari());
		e.setDataNaixement(e.getDataNaixement());
		eMan.persist(e); 
		
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
