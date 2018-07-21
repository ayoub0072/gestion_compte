package org.GesBanEntities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_compte",discriminatorType=DiscriminatorType.STRING,length=2)
public abstract class compte implements Serializable {
	
	@Id
	
	private String numCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name="codeClient")
	private client clients;
	@ManyToOne
	@JoinColumn(name="codeEmploye")
	private employe employes;
	
	@OneToMany(mappedBy="Compte",fetch=FetchType.LAZY)
	private Collection<operation> operations;

	public compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public compte(String numCompte, Date dateCreation, double solde) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public client getClients() {
		return clients;
	}

	public void setClients(client clients) {
		this.clients = clients;
	}

	public employe getEmployes() {
		return employes;
	}

	public void setEmployes(employe employes) {
		this.employes = employes;
	}

	public Collection<operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<operation> operations) {
		this.operations = operations;
	}
	

}
