package org.GesBanEntities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class client implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code_client;
	private String nom;
	
	@OneToMany(mappedBy="Client",fetch=FetchType.LAZY)
	private Collection<compte> compte;
	
	
	public client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public client(Long code_client, String nom, Collection<org.GesBanEntities.compte> compte) {
		super();
		this.code_client = code_client;
		this.nom = nom;
		this.compte = compte;
	}
	public Long getCode_client() {
		return code_client;
	}
	public void setCode_client(Long code_client) {
		this.code_client = code_client;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<compte> getCompte() {
		return compte;
	}
	public void setCompte(Collection<compte> compte) {
		this.compte = compte;
	}
	

}
