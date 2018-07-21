package org.GesBanEntities;

import java.sql.Date;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class compte_courant extends compte {
	
	private double decouvert;

	public compte_courant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public compte_courant(String numCompte, Date dateCreation, double solde) {
		super(numCompte, dateCreation, solde);
		// TODO Auto-generated constructor stub
	}

	public compte_courant(String numCompte, Date dateCreation, double solde, double decouvert) {
		super(numCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	

}
