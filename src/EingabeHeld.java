import java.util.Scanner;
public class EingabeHeld {
    public static void Main (String [] argv){
        System.out.println("Rasse: ");
        Scanner sc = new Scanner(System.in);
        //WarriorE char1 = new WarriorE (sc.nextLine(),sc.nextLine(),sc.nextLine()
    }
}
class WarriorE{
    // Attribute
    String rasse ="";
    String waffe ="";
    int level;

    // Konstruktoren
    public WarriorE(String rasse, String waffe, int level){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=level;
    }
    public WarriorE(String rasse, String waffe){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=0;
    }
}