
package ads.jogorpg.Batalha;

import ads.jogorpg.Player.Inimigos;
import ads.jogorpg.Player.Personagens;


public class Combate {
    
    public String Confronto(Personagens P1, Inimigos I1, String Ataque){
        Ataques C1 = new Ataques();
        
        if(Ataque.equals("Leve")){
            C1.AtaqueLeve(P1, I1);
            
            if(I1.getVida()<=1){
                return"Playey ganhou";
            }
        }
        return"Empate";
    }
}
