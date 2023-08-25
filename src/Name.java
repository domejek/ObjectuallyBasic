public class Name {
    public static void main(String[] args) {
        Schueler s1 = new Schueler();
        s1.vorname="Dominik";
        s1.nachname="Jeksties";
        s1.alter=24;

        Schueler s2 = new Schueler();
        s2.vorname="HU";
        s2.nachname="Uh";
        s2.alter=21;

        System.out.println(s1.nachname);
    }

    public static void printSchueler (Schueler s){
        System.out.println("Vorname: " +s.vorname + "\n" +
                            "Nachname:" +s.nachname + "\n" +
                            "Alter:" +s.alter + "\n");
    }
}

class Schueler{
    String vorname;
    String nachname;
    int alter;
}