package org.GesBanEntities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupes")
public class groupe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numGroupe;
	private String nomGroupe;
	
	@ManyToMany(mappedBy="groupes")
	private Collection<employe> employes;

	public groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public groupe(Long numGroupe, String nomGroupe, Collection<employe> employes) {
		super();
		this.numGroupe = numGroupe;
		this.nomGroupe = nomGroupe;
		this.employes = employes;
	}

	public Long getNumGroupe() {
		return numGroupe;
	}

	public void setNumGroupe(Long numGroupe) {
		this.numGroupe = numGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public Collection<employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Collection<employe> employes) {
		this.employes = employes;
	}
	
	
}
