package TEST;


import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DAO.DAOManager;
import DAO.DAOManagerFactory;
import DAO.DAOManagerHibernateImpl;
import MODEL.Empleat;

// https://www.tutorialspoint.com/jpa/jpa_architecture.htm
// https://www.tutorialspoint.com/jpa/jpa_entity_managers.htm


public class Principal {

	public static void main(String[] args) throws Exception {
		
		DAOManager dao = null; // ??
		
        try {
        	
        	DAOManagerFactory daoFac = new DAOManagerFactory();
        	dao = daoFac.createDAOManager(); 
        	
        	// Testing the method -- createEmployee(Empleat e){ } --
        	// [X] Method createEmployee works
//            Empleat e = new Empleat();
//            e.setId(1969);
//            e.setNom("FERRAN 2");
//            e.setCognom("CHIC");
//            e.setSalari(999999D);
//            e.setDataNaixement(Date.valueOf("1968-11-30"));
//            dao.createEmployee(e);
            
            
            
            // Testing the method -- public double getMaxSalary() { } --
            // [X] Method getMaxSalary works
            double maxSalary = dao.getMaxSalary();
            System.out.println("The MAX salary is --> " + maxSalary);
            
            
            
            
        } catch (Exception e) {
        	e.printStackTrace();

        } finally { dao.close(); }
        
        
        
        
		  /* C.R.U.D. a pelo
		  
		  EntityManagerFactory emfactory = 
				  Persistence.createEntityManagerFactory("ORMEmployee");
		  
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      
	      EntityTransaction t =null;
	      
	      t= entitymanager.getTransaction();
	      t.begin();
	      
	      // C.R.U.D.
	      // persist - CREATE
	      Empleat e = new Empleat( ); 
	      e.setId(9996);
	      e.setCognom("CHIC_2");
	      e.setNom("FERRAN_2");
	      e.setSalari( 40000D );
	      e.setDataNaixement(Date.valueOf("1968-11-30"));
	      entitymanager.persist( e );
	      
	      // find - READ - (Giving the name of our class and id of the row to select)
	      e = entitymanager.find(Empleat.class, 9996);
	      System.out.println(e);
	      
	      // merge - UPDATE
	      e = new Empleat();
	      e.setId(9996);
	      e.setCognom("CHIC_2");
	      e.setNom("FERRAN_2");
	      e.setSalari( 40000D );
	      e.setDataNaixement(Date.valueOf("1968-11-30"));
	      entitymanager.merge(e);
	      
	      // testing the update [V]
	      e = entitymanager.find(Empleat.class, 9996);
	      System.out.println(e);
	      
	      
	      // remove - DELETE -
	      e = entitymanager.find(Empleat.class, 9996);
	      if (e != null) { 
	    	  entitymanager.remove(e); 
	    	  System.out.println("GREAT SUCCESS!"); 
	      }
	      
		  t.commit(); // if there's not a commit after, there's no delete
	      entitymanager.close( );
	      emfactory.close( );
	      */

	}

}
