package voiture;

public class Voiture {

	// attributes
	private String marque;
	private int vitesseMax;
	private int acceleration;
	private int vitesse;

	// méthodes
	// constructeur
	public Voiture(String marque, int vitesse, int acceleration) {
		this.marque = marque;
		this.vitesseMax = vitesse;
		this.acceleration = acceleration;
		this.vitesse = 0;
		System.out.printf("Nouvelle voiture %s [%d, %d]%n", marque, vitesse, acceleration);
	}

	// méthode publique
	public void accelere() {
		if (vitesse + acceleration <= vitesseMax) {
			vitesse += acceleration;
		} else {
			System.out.println(marque + " Trop rapide !");
			vitesse = vitesseMax;
		}
		System.out.println(marque + " Vroum ! " + vitesse);
	}

}
