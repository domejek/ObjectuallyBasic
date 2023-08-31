// Klassendeklaration
class Warrior{
    // Attribute
    private String rasse;
    private String waffe;
    int level;

    // Konstruktoren
    public Warrior(String rasse, String waffe, int level){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=level;
        if (level > 0)
            this.level=level;

    }
    public Warrior(String rasse, String waffe){
        this.rasse=rasse;
        this.waffe=waffe;
        this.level=0;
    }

    // Methoden
    public String getRasse(){
        return rasse;
    }
    public void setRasse (String rasse){
        this.rasse=rasse;
    }
    public String getWaffe(){
        return rasse;
    }
    public void setWaffe (String waffe){
        this.waffe=waffe;
    }

    public int getLevel(){
        return level;
    }
    public void setLevel (int level){
        this.level=level;
    }
}
