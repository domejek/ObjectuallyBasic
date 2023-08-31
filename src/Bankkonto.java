public class Bankkonto {
    //Variablendeklaration innerhalb der Klasse
    public String vorname;
    public String nachname;
    private String adresse;
    private double kontostand;
    private double dispositionskredit;
    public Bankkonto(String vorname, String nachname, String adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.kontostand = 0.0;
        this.dispositionskredit = 10000.0;
    }

    // Funktion zum Einzahlen
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Einzahlung erfolgreich: " + betrag + " Euro eingezahlt.");
        } else {
            System.out.println("Ungültiger Betrag für Einzahlung.");
        }
    }
    // Funktion zum Auszahlen
    public void auszahlen(double betrag) {
        if (betrag > 0) {
            if (kontostand + dispositionskredit >= betrag) {
                kontostand -= betrag;
                System.out.println("Auszahlung erfolgreich: " + betrag + " Euro ausgezahlt.");
            } else {
                System.out.println("Nicht ausreichend Guthaben.");
            }
        } else {
            System.out.println("Ungültiger Betrag für Auszahlung.");
        }
    }
    // Funktion für eine Ueberweisung
    public void ueberweisen(double betrag, Bankkonto zielKonto) {
        if (betrag > 0) {
            if (kontostand + dispositionskredit >= betrag) {
                kontostand -= betrag;
                zielKonto.einzahlen(betrag);
                System.out.println("Überweisung erfolgreich: " + betrag + " Euro überwiesen.");
            } else {
                System.out.println("Nicht ausreichend Guthaben für Überweisung.");
            }
        } else {
            System.out.println("Ungültiger Betrag für Überweisung.");
        }
    }

    // Kontostand & Adresse anzeigen
    public void zeigeKontostand() {
        System.out.println("Kontostand: " + kontostand + " Euro");
    }

    public void zeigeAdresse() {
        System.out.println("Adresse: " + adresse);
    }

    //Programmausgabe
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Max", "Mustermann", "Musterstraße 123");
        Bankkonto konto2 = new Bankkonto("Anna", "Beispiel", "Beispielweg 456");

        konto1.einzahlen(5000);
        konto2.einzahlen(3000);

        konto1.ueberweisen(1500, konto2);

        konto1.zeigeKontostand();
        konto2.zeigeKontostand();
    }
}