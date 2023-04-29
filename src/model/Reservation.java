package model;


public abstract class Reservation {
	private int jour;
	private int mois;
	public Reservation(int jour,int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + " : ";
		// Erreur dans les tests ;-)
		// "Le 10/12 : table n°2 pour le premier service.\n";
		// "Le 10/12\nTable 3 pour le premier service."
	}
}
