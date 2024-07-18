public class Mitarbeiter {
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    // Methode getInfo
    public String getInfo(String parameter) {
        switch (parameter.toLowerCase()) {
            case "name":
                return this.name;
            case "vorname":
                return this.vorname;
            case "funktion":
                return this.funktion;
            case "eintrittsjahr":
                return String.valueOf(this.eintrittsjahr);
            default:
                return "Ungültiger Parameter";
        }
    }

    // Methode getInfo ohne Parameter
    public String getInfo() {
        return "Name: " + this.name + ", Vorname: " + this.vorname + ", Funktion: " + this.funktion + ", Eintrittsjahr: " + this.eintrittsjahr;
    }
}
