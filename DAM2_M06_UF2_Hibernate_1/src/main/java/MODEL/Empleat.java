package MODEL;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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
	
	/* Empty Constructor & Constructor w/ parameters */
	public Empleat(){}
	
	public Empleat(Long id, String cognom, String nom, 
					Date dataNaixement, double salari) {
		this.id = id;
		this.cognom = cognom;
		this.nom = nom;
		this.dataNaixement = dataNaixement;
		this.salari = salari;
	}
	
	/* Getters & Setters */
	public static long getSerialversionuid() { return serialVersionUID;}
	public void setSalari(Double salari) {this.salari = salari;}
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getCognom() {return cognom;}
	public void setCognom(String cognom) {this.cognom = cognom;}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public Date getDataNaixement() {return dataNaixement;}
	public void setDataNaixement(Date dataNaixement) {this.dataNaixement = dataNaixement;}
	public double getSalari() {return salari;}
	public void setSalari(double salari) {this.salari = salari;}

	@Override
	public String toString() {
		return "Empleat [id=" + id + ", cognom=" + cognom + ", nom=" + nom + ", dataNaixement=" + dataNaixement
				+ ", salari=" + salari + "]";
	}

	/* hashCode & equals generated by Eclipse */
	@Override
	public int hashCode() {
		return Objects.hash(cognom, dataNaixement, id, nom, salari);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleat other = (Empleat) obj;
		return Objects.equals(cognom, other.cognom) && Objects.equals(dataNaixement, other.dataNaixement)
				&& Objects.equals(id, other.id) && Objects.equals(nom, other.nom)
				&& Objects.equals(salari, other.salari);
	}
}
