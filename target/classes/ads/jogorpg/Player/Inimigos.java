package ads.jogorpg.Player;
public class Inimigos {
   private String Name,Type;
   private int vida, stregth, Magic, Stamina, Level, Defense, critical;

    public Inimigos() {}

    public Inimigos(String Name, String Type, int vida, int stregth, int Magic, int Stamina, int Level, int Defense, int critical) {
        this.Name = Name;
        this.Type = Type;
        this.vida = vida;
        this.stregth = stregth;
        this.Magic = Magic;
        this.Stamina = Stamina;
        this.Level = Level;
        this.Defense = Defense;
        this.critical = critical;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getStregth() {
        return stregth;
    }

    public void setStregth(int stregth) {
        this.stregth = stregth;
    }

    public int getMagic() {
        return Magic;
    }

    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    public int getStamina() {
        return Stamina;
    }

    public void setStamina(int Stamina) {
        this.Stamina = Stamina;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }
   
   
}
