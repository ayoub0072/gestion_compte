package org.GesBanEntities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class compte_epargne extends compte {

	private double taux;

	public compte_epargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public compte_epargne(String numCompte, Date dateCreation, double solde) {
		super(numCompte, dateCreation, solde);
		// TODO Auto-generated constructor stub
	}

	public compte_epargne(String numCompte, Date dateCreation, double solde, double taux) {
		super(numCompte, dateCreation, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
