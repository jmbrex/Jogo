package ads.jogorpg.Player;
public class Personagens {
   private String Name,Classe;
   private int vida, vidaMax, stregth, Magic, Stamina, StaminaMax, Level, Defense, Critical, InimigosDerrotados, Dungeons, IDPlayer;
   char Sex;

    public Personagens() {}

    public Personagens(String Name, String Classe,char Sex, int vida, int vidaMax, int stregth, int Magic, int Stamina, int StaminaMax, int Level, int Defense, int Critical, int InimigosDerrotados, int Dungeons, int IDPlayer) {
        this.Name = Name;
        this.Classe = Classe;
        this.vida = vida;
        this.vidaMax = vidaMax;
        this.stregth = stregth;
        this.Magic = Magic;
        this.Stamina = Stamina;
        this.StaminaMax = StaminaMax;
        this.Level = Level;
        this.Defense = Defense;
        this.Critical = Critical;
        this.InimigosDerrotados = InimigosDerrotados;
        this.Dungeons = Dungeons;
        this.Sex = Sex;
        this.IDPlayer = IDPlayer; 
    }

    
    
    public void criarPersonagem(String Classe, String Name, char Sex){
        this.setClasse(Classe);
        this.setName(Name);
        this.setSex(Sex);
        Atributos at = new Atributos();
        at.Atributos(this);
    }

    public int getIDPlayer() {
        return IDPlayer;
    }

    public void setIDPlayer(int IDPlayer) {
        this.IDPlayer = IDPlayer;
    }

    public int getCritical() {
        return Critical;
    }

    public void setCritical(int Critical) {
        this.Critical = Critical;
    }
    
    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getStaminaMax() {
        return StaminaMax;
    }

    public void setStaminaMax(int StaminaMax) {
        this.StaminaMax = StaminaMax;
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

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
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

    public char getSex() {
        return Sex;
    }

    public void setSex(char Sex) {
        this.Sex = Sex;
    }

    public int getInimigosDerrotados() {
        return InimigosDerrotados;
    }

    public void setInimigosDerrotados(int InimigosDerrotados) {
        this.InimigosDerrotados = InimigosDerrotados;
    }

    public int getDungeons() {
        return Dungeons;
    }

    public void setDungeons(int Dungeons) {
        this.Dungeons = Dungeons;
    }
    
    
}

