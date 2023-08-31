import java.util.Random;
class OneVsOne {
    private String name;
    private int kraft;
    private int geschicklichkeit;
    private int gesundheit;
    private String gesinnung;

    public OneVsOne(String name, int kraft, int geschicklichkeit, int gesundheit, String gesinnung) {
        this.name = name;
        this.kraft = Math.min(100, Math.max(0, kraft));
        this.geschicklichkeit = Math.min(100, Math.max(0, geschicklichkeit));
        this.gesundheit = Math.min(100, Math.max(0, gesundheit));
        this.gesinnung = gesinnung;
    }

    public String getName() {
        return name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public boolean istLebendig() {
        return gesundheit > 0;
    }

    public void nehmeSchaden(int schaden) {
        gesundheit = Math.max(0, gesundheit - schaden);
    }

    public int angriffswert() {
        return kraft + new Random().nextInt(21) - 10;
    }

    public int ausweichwert() {
        return geschicklichkeit + new Random().nextInt(21) - 10;
    }

    public String gesinnungsAktion() {
        if (gesinnung.equalsIgnoreCase("gut")) {
            return "rettet ein unschuldiges Leben!";
        } else {
            return "bricht in finsteres Lachen aus!";
        }
    }
}

class Kampfspiel {
    public static void kampf(OneVsOne held1, OneVsOne held2) {
        System.out.println("Kampf zwischen " + held1.getName() + " und " + held2.getName() + " beginnt!");

        while (held1.istLebendig() && held2.istLebendig()) {
            int schaden1 = Math.max(0, held1.angriffswert() - held2.ausweichwert());
            int schaden2 = Math.max(0, held2.angriffswert() - held1.ausweichwert());

            held2.nehmeSchaden(schaden1);
            held1.nehmeSchaden(schaden2);

            System.out.println(held1.getName() + " fügt " + held2.getName() + " " + schaden1 + " Schaden zu.");
            System.out.println(held2.getName() + " fügt " + held1.getName() + " " + schaden2 + " Schaden zu.");
        }

        if (held1.istLebendig()) {
            System.out.println(held1.getName() + " gewinnt! Er " + held1.gesinnungsAktion());
        } else {
            System.out.println(held2.getName() + " gewinnt! Er " + held2.gesinnungsAktion());
        }
    }

    public static void main(String[] args) {
        OneVsOne held1 = new OneVsOne("Gandalf", 80, 60, 90, "gut");
        OneVsOne held2 = new OneVsOne("Sauron", 95, 40, 85, "böse");
        kampf(held1, held2);
    }
}

