package ads.jogorpg.Player;
public class Atributos {
    public void Atributos(Personagens p1){
        
        switch (p1.getClasse()) {
            case "Guerreiro":
                
                p1.setVidaMax(200);
                p1.setStaminaMax(200);
                p1.setLevel(0);
                p1.setStregth(25);
                p1.setMagic(5);
                p1.setCritical(10);
                p1.setDefense(20);
                p1.setInimigosDerrotados(0);
                p1.setDungeons(0);
                break;
                
            case "Mago":
                p1.setVidaMax(200);
                p1.setStaminaMax(200);
                p1.setLevel(0);
                p1.setStregth(5);
                p1.setMagic(25);
                p1.setCritical(15);
                p1.setDefense(10);
                p1.setInimigosDerrotados(0);
                p1.setDungeons(0);
                break;
               
            case "Arqueiro":
                p1.setVidaMax(200);
                p1.setStaminaMax(200);
                p1.setLevel(0);
                p1.setStregth(15);
                p1.setMagic(20);
                p1.setCritical(25);
                p1.setDefense(15);
                p1.setInimigosDerrotados(0);
                p1.setDungeons(0);
                break;    
            default:
        }
    }
}
