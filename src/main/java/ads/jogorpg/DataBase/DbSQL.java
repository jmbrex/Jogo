package ads.jogorpg.DataBase;
import ads.jogorpg.Player.Personagens;
import ads.jogorpg.User.User;
import java.sql.*;
public class DbSQL {
    private static Connection conexao_MySql = null;
    private static String localBD = "localhost";
    private static String LINK =
            "jdbc:mysql://" + localBD + ":3306/jogo"; // MUDAR NOME DA DB SELECIONADA
    private static final String usuario = "root";
    private static final String senha = "";
    
    //CRIANDO CONEXÃO COM MYSQL
    public Connection connectionMySql(){
        try{
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("Conexao OK!");
        }catch(SQLException e){
            throw new RuntimeException("Ocorreu um Erro");
                
        }
        return conexao_MySql;
    }
    // FECHANDO CONEXÃO COM MYSQL
    public void closeConnectionMySql(Connection con){
        try{
            if(con != null){
                con.close();
                System.out.println("DB Fechado");
            }
        }catch(SQLException e){
            throw new RuntimeException("Ocorreu um problema para encerrar"+"a conexâo com o BD.", e);
        }
    }
    
    //INSERINDO USUARIO NA TEBELA USUARIO
    public void sqlDbUserInsert(User user){
        Connection connection = connectionMySql();
        
        String StringSQL = "insert into usuario(ID,Username, NickName, email, Senha, sex)values(null,?,?,?,?,? )";
        PreparedStatement preparedStmt;
        try{
            preparedStmt = connection.prepareStatement(StringSQL);
            preparedStmt.setString(1, user.getUserName());
            preparedStmt.setString(2, user.getNickName());
            preparedStmt.setString(3, user.getEmail());
            preparedStmt.setString(4, user.getPassWord());
            preparedStmt.setString(5, user.getSex()); 
            preparedStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();}
        closeConnectionMySql(connection);
    }
    //SELECIONANDO USUARIO PELO NICKNAME
    public User sqlUserSelectNickName(String NickName){
        User p1 = new User();
        
        Connection connection = connectionMySql();
        String StringSQL = "Select * from usuario where NickName  = ?";
        PreparedStatement preparedStmt;
        
        try{
            preparedStmt = connection.prepareStatement(StringSQL);
            preparedStmt.setString(1,NickName);
            ResultSet result = preparedStmt.executeQuery();
            while(result.next()){
                p1.setID(result.getInt("ID"));
                p1.setNickName(result.getString("NickName"));
                p1.setEmail(result.getString("email"));
                p1.setUserName(result.getString("UserName"));
                p1.setSex(result.getString("Sex"));
                p1.setPassWord(result.getString("Senha"));
            }
        }catch  (SQLException e){
            e.printStackTrace();
        }
        closeConnectionMySql(connection);
        
        return p1;
    }
    
    public void sqlDbPersonagemInsert(Personagens personagem){
        Connection connection = connectionMySql();
    }
}
