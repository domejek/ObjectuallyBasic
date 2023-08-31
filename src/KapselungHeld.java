public class KapselungHeld {
    public static void main (String ... args){
        Warrior char1 = new Warrior("Mensch","Sword",10);
        Warrior char2 = new Warrior("Zwerg","Axt", 20);

        // Aufruf von getter/setter
        System.out.println(char1.getLevel());
        System.out.println(char2.getLevel());
    }
}
