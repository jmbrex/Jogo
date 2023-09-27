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


public class DbMongoDB {
    public void MongoInsertDB (String dataBaseName, String dataBaseCollection, Document ParameterDoc){
        MongoClient Client = new MongoClient("localhost", 27017);
        MongoDatabase DT = Client.getDatabase(dataBaseName);
        MongoCollection<Document> docDataBase = DT.getCollection(dataBaseCollection);
        docDataBase.insertOne(ParameterDoc);
        System.out.println("insertValues ok");
        
    }
    
    public void MongoUpdateDB(String dataBaseName, String DataBaseCollection, String FilterAtributo, String FilterAtributoValue, String UpdatedAtributo, String UpdatedValue){
        System.out.println("updateValues");
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase(dataBaseName);
        MongoCollection<Document> docs = db.getCollection(DataBaseCollection);
        docs.updateOne(Filters.eq(FilterAtributo, FilterAtributoValue), Updates.set(UpdatedAtributo, UpdatedValue));
        System.out.println("Documento teve sucesso no update...");
        for (Document doc : docs.find()) {
            System.out.println("item update: " + doc);
        }
    }
    public void MongoDeleteDB(String dataBase, String DataBaseCollection, String FilterAtributo, String FilterAtributoValue){
        System.out.println("deleteValues");
        MongoClient mongo = new MongoClient("localhost", 27017);

        MongoDatabase db = mongo.getDatabase(dataBase);
        MongoCollection<Document> docs = db.getCollection(DataBaseCollection);

        docs.deleteOne(Filters.eq(FilterAtributo, FilterAtributoValue));
        System.out.println("Documento teve sucesso no delete...");
    }
    
    public Document MongoGetDB(String dataBase, String DataBaseCollection, String  FilterAtributo, String FilterAtributoValue){
        System.out.println("getValues");
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase(dataBase);
        MongoCollection<Document> docs = db.getCollection(DataBaseCollection);
        for (Document doc : docs.find()) {
            if(doc.get(FilterAtributo).equals(FilterAtributoValue)){
                return doc;
            }else{
                System.out.println("Não encontrado");
                return null;
            }
        }
        return null;

    }
}
