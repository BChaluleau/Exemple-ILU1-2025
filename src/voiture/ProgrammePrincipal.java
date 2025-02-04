package voiture;

public class ProgrammePrincipal {

	public static void main(String[] args) {
		System.out.printf("Hello, world.\n");

		Voiture voitureCourse = new Voiture("Formule1", 300, 120);
		Voiture voiturePourrie = new Voiture("Pourrie", 90, 25);

		for (int i = 0; i < 5; i++) {
			voitureCourse.accelere();
			voiturePourrie.accelere();
		}

	}

}
