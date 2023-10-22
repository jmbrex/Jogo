package ads.jogorpg.Batalha;
import ads.jogorpg.Player.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ataques {
    
    
    
    
    private void Confronto(Personagens P1, Inimigos I1){
        Ataques C1 = new Ataques();
        
        if(I1.getVida()<=1){
            P1.setInimigosDerrotados(P1.getInimigosDerrotados()+1);
            JOptionPane.showMessageDialog(null, P1.getName()+" Derrotou um Oponente");
        }
        
    }
    
    public int AtaqueLeve(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        
        if(personagem.getClasse().equals("Guerreiro") || personagem.getClasse().equals("arqueiro")){
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
                personagem.setStamina(personagem.getStamina() - 5);
            }
        }
        
        if(personagem.getClasse().equals("mago")){
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
                personagem.setStamina(personagem.getStamina() - 5);
            }
        }
        System.out.println(personagem.getClasse());
        System.out.println(personagem.getStregth());
        System.out.println(inimigo.getVida());
        this.Confronto(personagem, inimigo);
        return x;
    }
    
    public int AtaquePesado(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        
        if(personagem.getClasse().equals("Guerreiro") || personagem.getClasse().equals("arqueiro")){
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
                personagem.setStamina(personagem.getStamina() - 5);
            }
        }
        
        if(personagem.getClasse().equals("mago")){
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
                personagem.setStamina(personagem.getStamina() - 5);
            }
        }
        this.Confronto(personagem, inimigo);
        return x;
    }
    
    public int AtaqueSupremo(){
        return 0;
    }
}
