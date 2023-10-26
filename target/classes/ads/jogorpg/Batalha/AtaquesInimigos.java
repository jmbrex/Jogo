/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads.jogorpg.Batalha;

import ads.jogorpg.Player.Inimigos;
import ads.jogorpg.Player.Personagens;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author João Marcelo
 */
public class AtaquesInimigos {
    
    public void EscolhaDeAtaque(Personagens P1, Inimigos I1){
        
        Random gerador = new Random();
        int Ataque = gerador.nextInt(10);
        System.out.println(Ataque);
        JOptionPane.showMessageDialog(null, "Vez do Oponente!!");
        if (Ataque <= 8) {
            this.AtaqueLeve(P1, I1);
            
        } else if(Ataque >8) {
            if(I1.getStamina()<5){
                this.AtaqueLeve(P1, I1);
            }else{
                this.AtaquePesado(P1, I1);
            }
        }
        
    }
    
    
    
    
    
    public boolean ResultatdoConfronto(Personagens P1, Inimigos I1){
        Ataques C1 = new Ataques();
        
        if(P1.getVida()<=1){
           
            JOptionPane.showMessageDialog(null, P1.getName()+" Foi derrotado");
            return true;
        }
        return false;
        
    }
    
    public int AtaqueLeve(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        
        if(inimigo.getType().equals("Monstro")){
            if(inimigo.getStregth() > personagem.getDefense()){
                if(inimigo.getCritical() > gerador.nextInt(100)){
                    x = (inimigo.getStregth()*2) - personagem.getDefense();
                    personagem.setVida(personagem.getVida()-x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO INIMIGO");
                }else{
                    x = inimigo.getStregth() - personagem.getDefense();
                    personagem.setVida(personagem.getVida() - x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
                x=5;
                personagem.setVida(personagem.getVida()-x);
                inimigo.setStamina(inimigo.getStamina() - 5);
            }
        }
        
        if(inimigo.getType().equals("Magico")){
            if(inimigo.getMagic()> personagem.getDefense()){
                if(inimigo.getCritical() > gerador.nextInt(100)){
                    x = (inimigo.getMagic()*2) - personagem.getDefense();
                    personagem.setVida(personagem.getVida()-x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO INIMIGO");
                }else{
                    x = inimigo.getMagic() - personagem.getDefense();
                    personagem.setVida(personagem.getVida() - x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
                x=5;
                personagem.setVida(personagem.getVida()-x);
                inimigo.setStamina(inimigo.getStamina() - 5);
            }
        }
        
        JOptionPane.showMessageDialog(null, inimigo.getName()+" ataque Leve!");
        JOptionPane.showMessageDialog(null, "Dano Causado "+x);
        return x;
    }
    
    public int AtaquePesado(Personagens personagem, Inimigos inimigo){
        int x = 0;
        Random gerador = new Random();
        
        if(inimigo.getType().equals("Monstro")){
            if(inimigo.getStregth() > personagem.getDefense()){
                if(inimigo.getCritical() > gerador.nextInt(100)){
                    x = ((inimigo.getStregth()*2)*2) - personagem.getDefense();
                    personagem.setVida(personagem.getVida()-x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO INIMIGO");
                }else{
                    x = (inimigo.getStregth()*2) - personagem.getDefense();
                    personagem.setVida(inimigo.getVida() - x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
                x=5;
                personagem.setVida(personagem.getVida()-x);
                inimigo.setStamina(inimigo.getStamina() - 5);
            }
        }
        
        if(inimigo.getType().equals("Magico")){
            if(inimigo.getMagic()> personagem.getDefense()){
                if(inimigo.getCritical() > gerador.nextInt(100)){
                    x = ((inimigo.getMagic()*2)*2) - personagem.getDefense();
                    personagem.setVida(personagem.getVida()-x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                    JOptionPane.showMessageDialog(null, "ATAQUE CRITICO INIMIGO");
                }else{
                    x = (inimigo.getMagic()*2) - personagem.getDefense();
                    personagem.setVida(personagem.getVida() - x);
                    inimigo.setStamina(inimigo.getStamina() - 5);
                }
            }else{
                JOptionPane.showMessageDialog(null, inimigo.getName()+": Ataque muito frco");
                x=5;
                personagem.setVida(personagem.getVida()-x);
                inimigo.setStamina(inimigo.getStamina() - 5);
            }
        }
        
        JOptionPane.showMessageDialog(null, inimigo.getName()+" ataque Pesado!");
        JOptionPane.showMessageDialog(null, "Dano Causado "+x);
        return x;
        
    }
}
