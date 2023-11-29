package MODEL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="EMPLOYEE")
@Entity
public class Empleat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="LASTNAME")
	private String cognom;
	
	@Column(name="FIRSTNAME")
	private String nom;
	
	@Column(name="BIRTHDATE")
	private Date dataNaixement;
	
	@Column(name="SALARY")
	private Double salari;
	
	public Empleat(){}
	
	public Empleat(Long id, String cognom, String nom, 
					Date dataNaixement, double salari) {
		this.id = id;
		this.cognom = cognom;
		this.nom = nom;
		this.dataNaixement = dataNaixement;
		this.salari = salari;
		}
	public static long getSerialversionuid() { return serialVersionUID;}
	public void setSalari(Double salari) {this.salari = salari;}
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getCognom() {return cognom;}
	public void setCognom(String cognom) {this.cognom = cognom;}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public Date getDataNaixement() {return dataNaixement;}
	public void setDataNaixement(Date dataNaixement)
	{this.dataNaixement = dataNaixement;}
	public double getSalari() {return salari;}
	public void setSalari(double salari) {this.salari = salari;}
	
	@Override
	public String toString() { return "lol"; }
//@Override
//public int hashCode() {/*CODE OF THE hashCode METHOD*/ }
//@Override
//public boolean equals(Object obj) { /*CODE OF THE equals METHOD*/ } 
	}
