package ads.jogorpg.Batalha;
import ads.jogorpg.Player.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ataques {
    
    
    public boolean ResultadoConfronto(Personagens P1, Inimigos I1){
        Ataques C1 = new Ataques();
        
        if(I1.getVida()<=1){
            P1.setInimigosDerrotados(P1.getInimigosDerrotados()+1);
            JOptionPane.showMessageDialog(null, P1.getName()+" Derrotou um Oponente");
            return true;
        }
        return false;
    }
    
    public int AtaqueLeve(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        JOptionPane.showMessageDialog(null, personagem.getName()+" ataque Leve!");
        if (personagem.getClasse().equals("Guerreiro")) {
            if (personagem.getStamina() >= 20) {
                if (personagem.getStregth() > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = (personagem.getStregth() * 2) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = personagem.getStregth() - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, personagem.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 10);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
        }
        
        if (personagem.getClasse().equals("Mago")) {
            if (personagem.getStamina() >= 20) {
                if (personagem.getMagic() > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = (personagem.getMagic() * 2) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = personagem.getMagic() - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, inimigo.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 15);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
        }
        
        if (personagem.getClasse().equals("Arqueiro")) {
            if (personagem.getStamina() >= 20) {
                if ((personagem.getMagic() + personagem.getStregth()) > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = ((personagem.getMagic() + personagem.getStregth()) * 2) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = (personagem.getMagic() + personagem.getStregth()) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, inimigo.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 15);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
            
            
        }
       
            JOptionPane.showMessageDialog(null, "Dano Causado "+x); 
        return x;
    }
    
    
    
    
    public int AtaquePesado(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        JOptionPane.showMessageDialog(null, personagem.getName()+" ataque Pesado!");
        if (personagem.getClasse().equals("Guerreiro")) {
            if (personagem.getStamina() >= 20) {
                if (personagem.getStregth() > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = ((personagem.getStregth() * 2) * 2) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 40);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = (personagem.getStregth() * 2) - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 40);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, inimigo.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 20);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
        } 
        
        if (personagem.getClasse().equals("Mago")) {
            if (personagem.getStamina() >= 20) {
                if (personagem.getMagic() > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = (personagem.getMagic() * 2) * 2 - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 40);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = personagem.getMagic() * 2 - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 40);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, inimigo.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 20);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
        } 
        
        if (personagem.getClasse().equals("Arqueiro")) {
            if (personagem.getStamina() >= 20) {
                if ((personagem.getMagic() + personagem.getStregth()) > inimigo.getDefense()) {
                    if (personagem.getCritical() > gerador.nextInt(100)) {
                        x = ((personagem.getMagic() + personagem.getStregth()) * 2) * 2 - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                        JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                    } else {
                        x = (personagem.getMagic() + personagem.getStregth()) * 2 - inimigo.getDefense();
                        inimigo.setVida(inimigo.getVida() - x);
                        personagem.setStamina(personagem.getStamina() - 20);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, inimigo.getName() + ": Ataque muito fraco");
                    personagem.setStamina(personagem.getStamina() - 15);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Stamina muito baixa");
                x = 10;
                inimigo.setVida(inimigo.getVida() - x);
            }
        } 
        
        JOptionPane.showMessageDialog(null, "Dano Causado "+x);
        return x;
    }
    
}
