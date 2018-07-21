package org.GesBanEntities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class employe implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	
	private String nomEmploye;
	
	@ManyToOne
	@JoinColumn(name="code_emp_sup")
	private employe superhiearch; //association reflexible
	
	@ManyToMany
	@JoinColumn(name="emp_grp")
	private Collection<groupe>groupes;

	public employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employe(Long codeEmploye, String nomEmploye, employe superhiearch) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
		this.superhiearch = superhiearch;
	}

	public long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public employe getSuperhiearch() {
		return superhiearch;
	}

	public void setSuperhiearch(employe superhiearch) {
		this.superhiearch = superhiearch;
	}

	public Collection<groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<groupe> groupes) {
		this.groupes = groupes;
	}
	
	
}
