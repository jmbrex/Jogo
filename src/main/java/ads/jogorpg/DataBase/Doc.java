/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads.jogorpg.DataBase;
import ads.jogorpg.Player.Personagens;
import ads.jogorpg.User.User;
import com.mongodb.MongoClient;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class Doc {
    public Document DocUser(User U1) {
        Document doc = new Document();
        
        doc.append("_id", U1.getID());
        doc.append("UserName", U1.getUserName());
        doc.append("NickName", U1.getNickName());
        doc.append("Email", U1.getEmail());
        doc.append("PassWord", U1.getPassWord());
        doc.append("Sex", U1.getSex());
        //doc.append("Personagens", U1.getUserPersonagens()+";");
        
        return doc;
    }
    
    public Document DocPersonagem(Personagens P1){
        Document doc = new Document();
        doc.append("Nome",P1.getName());
        doc.append("Class",P1.getClasse());
        doc.append("Nivel", P1.getLevel());
        doc.append("VidaMax",P1.getVidaMax());
        doc.append("StaminaMax",P1.getStaminaMax());
        doc.append("Stregth", P1.getStregth());
        doc.append("Magic", P1.getMagic());
        doc.append("Defesa", P1.getDefense());
        doc.append("InimigosDerrotados", P1.getInimigosDerrotados());
        doc.append("Dungeons", P1.getDungeons());
        doc.append("Critical", P1.getCritical());
        doc.append("Sex", P1.getSex());
        
        return doc;
    }
}
