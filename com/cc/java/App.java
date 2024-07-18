public class App {
    public static void main(String[] args) {
        // Instanzierung von drei Mitarbeiter-Objekten
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Schmidt", "Anna", "Entwickler", 2018);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Müller", "Max", "Designer", 2019);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        // Ausgabe der Informationen der Mitarbeiter
        System.out.println(mitarbeiter1.getInfo());
        System.out.println(mitarbeiter2.getInfo());
        System.out.println(mitarbeiter3.getInfo());

        // Ausgabe spezifischer Informationen
        System.out.println(mitarbeiter1.getInfo("vorname"));
        System.out.println(mitarbeiter2.getInfo("funktion"));
        System.out.println(mitarbeiter3.getInfo("eintrittsjahr"));
    }
}
