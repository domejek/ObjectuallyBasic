public class Held {
    public static void Main (String[] argv){
        Warrior char1 = new Warrior("Mensch","Sword",10);
        Warrior char2 = new Warrior("Zwerg","Axt");
    }
    public static void printHeld (Warrior w){
        System.out.println("Rasse: " +w.rasse + "\n" +
                "Waffe:" +w.waffe + "\n" +
                "Level:" +w.level + "\n");
    }
}

// Klassendeklaration
class Warrior{
    // Attribute
    String rasse;
    String waffe;
    int level;

    // Konstruktoren
    public Warrior(String rasse, String waffe, int level){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=level;
    }
    public Warrior(String rasse, String waffe){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=0;
    }
}
