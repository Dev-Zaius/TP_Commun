package model;

public class Client {
	private String nom;
	private String prenom;
	private String adresseMail;
	private String mdp;
	//private int nbReservation = 0;
	//private Reservation[] reservations = new Reservation[100];

	private Reservation[] reservations = new Reservation[100]; 
	private int nbReservation = 0;

	public Client(String nom, String prenom, String adresseMail, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public boolean connecterClient(String mdp) {
		return mdp.equals(this.mdp);
	}
	
	public void ajouterReservation(Reservation reservation) {
		reservations[nbReservation++] = reservation;
	}

	// UNIQUEMENT POUR VERIFICATION
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("nom=" + nom + ", prenom=" + prenom);
		chaine.append(", adresseMail=" + adresseMail + ", mdp=" + mdp + "\n");
		for (int i = 0 ; i < nbReservation ; i++) {
			chaine.append(reservations[i].toString());
		}
		return chaine.toString();
	}
}