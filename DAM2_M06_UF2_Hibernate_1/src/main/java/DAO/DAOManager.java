package DAO;
import MODEL.Empleat;

public interface DAOManager extends AutoCloseable{

	public void createEmployee(Empleat e);
	public double getMaxSalary();
	
}