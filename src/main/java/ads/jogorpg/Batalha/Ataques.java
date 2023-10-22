package ads.jogorpg.Batalha;
import ads.jogorpg.Player.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ataques {
    Personagens personagem;
    Inimigos inimigo;
    
    public Ataques(){
        personagem = new Personagens();
        inimigo = new Inimigos();
    }
    
    public int AtaqueLeve(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        
        if(personagem.getClasse() == "guerreiro" || personagem.getClasse() == "arqueiro"){
            if(personagem.getStregth() > inimigo.getDefense()){
                if(personagem.getCritical() > gerador.nextInt(100)){
                    x = (personagem.getStregth()*2) - inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida()-x);
                    personagem.setStamina(personagem.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                }else{
                    x = personagem.getStregth() - inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
            }
        }
        
        if(personagem.getClasse() == "mago"){
            if(personagem.getMagic()> inimigo.getDefense()){
                if(personagem.getCritical() > gerador.nextInt(100)){
                    x = (personagem.getMagic()*2)- inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                }else{
                    x = personagem.getMagic()- inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
            }
        }
        return x;
    }
    
    public int AtaquePesado(){
        int x = 0;
        Random gerador = new Random();
        
        if(personagem.getClasse() == "guerreiro" || personagem.getClasse() == "arqueiro"){
            if(personagem.getStregth() > inimigo.getDefense()){
                if(personagem.getCritical() > gerador.nextInt(100)){
                    x = ((personagem.getStregth()*2)*2) - inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida()-x);
                    personagem.setStamina(personagem.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                }else{
                    x = (personagem.getStregth()*2) - inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
            }
        }
        
        if(personagem.getClasse() == "mago"){
            if(personagem.getMagic()> inimigo.getDefense()){
                if(personagem.getCritical() > gerador.nextInt(100)){
                    x = (personagem.getMagic()*2)- inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO");
                }else{
                    x = personagem.getMagic()- inimigo.getDefense();
                    inimigo.setVida(inimigo.getVida() - x);
                    personagem.setStamina(personagem.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
            }
        }
        
        return x;
    }
    
    public int AtaqueSupremo(){
        return 0;
    }
}
