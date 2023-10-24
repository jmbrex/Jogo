/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ads.jogorpg.DataBase;
import ads.jogorpg.Player.Inimigos;
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
    public Document UserToDoc(User U1) {
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
    
    public User DocToUser(Document Doc){
        User p1 = new User();
        
        p1.setID((int) Doc.get("_id"));
        p1.setUserName((String) Doc.get("UserName"));
        p1.setNickName((String) Doc.get("NickName"));
        p1.setEmail((String) Doc.get("Email"));
        p1.setPassWord((String) Doc.get("PassWord"));
        p1.setSex((String) Doc.get("Sex"));
        
        return p1;
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
    
    public Personagens DoctoPersonagens (Document doc){
        Personagens P1 = new Personagens();
        P1.setName((String) doc.get("Nome"));
        P1.setClasse((String) doc.get("Class"));
        P1.setLevel((int) doc.get("Nivel"));
        P1.setVidaMax((int) doc.get("VidaMax"));
        P1.setStaminaMax((int) doc.get("StaminaMax"));
        P1.setStregth((int) doc.get("Stregth"));
        P1.setMagic((int) doc.get("Magic"));
        P1.setDefense((int) doc.get("Defesa"));
        P1.setInimigosDerrotados((int) doc.get("InimigosDerrotados"));
        P1.setDungeons((int) doc.get("Dungeons"));
        P1.setCritical((int) doc.get("Critical"));
        P1.setSex((String) doc.get("Sex"));
        return P1;
    }
    
    public Document DocInimigo(Inimigos I1){
        Document doc = new Document();
        doc.append("Nome", I1.getName());
        doc.append("type", I1.getType());
        doc.append("Vida", I1.getVida());
        doc.append("Stregth", I1.getStregth());
        doc.append("Magic", I1.getMagic());
        doc.append("Stamina", I1.getStamina());
        doc.append("Level", I1.getLevel());
        doc.append("Defense", I1.getDefense());
        doc.append("Critical", I1.getCritical());
        return doc;
    }
    
    public Inimigos DocToInimigo(Document doc){
        Inimigos I1 = new Inimigos();
        I1.setName((String)doc.get("Nome"));
        I1.setType((String)doc.get("type"));
        I1.setVida((int)doc.get("Vida"));
        I1.setStregth((int)doc.get("Stregth"));
        I1.setMagic((int)doc.get("Magic"));
        I1.setStamina((int)doc.get("Stamina"));
        I1.setLevel((int)doc.get("Level"));
        I1.setDefense((int)doc.get("Defense"));
        I1.setCritical((int)doc.get("Critical"));
        return I1;
    }
}
