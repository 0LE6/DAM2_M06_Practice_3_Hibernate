package TEST;


import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import MODEL.Empleat;


public class Principal {

	public static void main(String[] args) {
		
		  EntityManagerFactory emfactory = 
				  Persistence.createEntityManagerFactory("ORMEmployee");
		  
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      
	      EntityTransaction t =null;
	      
	      t= entitymanager.getTransaction();
	      t.begin();
	      
	      // C.R.U.D.
	      // persist - CREATE
	      Empleat e = new Empleat( ); 
	      //e.setId(9996);
//	      e.setCognom("CHIC");
//	      e.setNom("FERRAN");
//	      e.setSalari( 40000D );
//	      e.setDataNaixement(Date.valueOf("1968-11-30"));
//	      entitymanager.persist( e );
	      
	      // find - READ (Giving the name of our class and id of the row to select)
	      e = entitymanager.find(Empleat.class, 9996);
	      System.out.println(e);
	      
	      // merge - UPDATE
	      
	      t.commit();
	      
	      

	      entitymanager.close( );
	      emfactory.close( );

	}

}
