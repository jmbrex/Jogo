package ads.jogorpg;
import ads.jogorpg.Player.Inimigos;
import ads.jogorpg.Player.Personagens;

import ads.jogorpg.DataBase.DbMongoDB;
import ads.jogorpg.DataBase.DbSQL;
import ads.jogorpg.DataBase.Doc;
import ads.jogorpg.User.User;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.bson.Document;
import java.util.List;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        //Personagens p1 = new Personagens();
        //p1.criarPersonagem("mago","Jmbrex","", 0);
        //Inimigos p2 = new Inimigos("nome", "a", 100, 0, 0, 0, 0, 11);
        //Batalha B = new Batalha();
        //System.out.println(p2.getVida());
        //B.AtaqueLeve(p1, p2);
        //System.out.println(p2.getVida());
        
        DbMongoDB mongo = new DbMongoDB();
        Doc doc = new Doc();
        User u = new User();
        //u = doc.DocToUser(mongo.MongoGetDBcollection("Jogo", "LogedUser"));
        //System.out.println(u.getNickName());
        Random gerador = new Random();
        Inimigos I1 = new Inimigos("I1", "", 200, 30, 30, 200, 0, 20, 25);
        mongo.MongoInsertDB("Jogo", "Inimigos", doc.DocInimigo(I1));
        
            
    }
}
