package org.GesBanEntities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)

public abstract class operation implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numOperation;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="numCompte")
	private compte comptes;
	@ManyToOne
	@JoinColumn(name="codeEmploye")
	private employe employes;
	public operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public operation(Long numOperation, Date dateOperation, double montant, compte comptes, employe employes) {
		super();
		this.numOperation = numOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.comptes = comptes;
		this.employes = employes;
	}
	public Long getNumOperation() {
		return numOperation;
	}
	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public compte getComptes() {
		return comptes;
	}
	public void setComptes(compte comptes) {
		this.comptes = comptes;
	}
	public employe getEmployes() {
		return employes;
	}
	public void setEmployes(employe employes) {
		this.employes = employes;
	}
	
	
}
