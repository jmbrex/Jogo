/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads.jogorpg.Telas;
import javax.swing.*;
import ads.jogorpg.login;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author João Marcelo
 */
public class teste {
    private JProgressBar progressBar;
    public void a(JProgressBar jProgressBar1, int start, int end){
    Thread t = new Thread(new Runnable(){
        login T1 = new login();
            @Override
            public void run(){
                for (int i = start; i > end; i--) {
                    jProgressBar1.setForeground(Color.red);
                    try{
                    jProgressBar1.setValue(i);
                    Thread.sleep(40);
                    }catch(InterruptedException ex){
                    }
                }
                jProgressBar1.setForeground(Color.GREEN);
            }
        });
        
        t.start();
    }
}
