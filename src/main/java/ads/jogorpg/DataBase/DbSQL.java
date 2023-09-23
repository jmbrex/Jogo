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
    
    public Connection connectionMySql(){
        
        try{
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("Conexao OK!");
        }catch(SQLException e){
            throw new RuntimeException("Ocorreu um Erro");
                
        }
        return conexao_MySql;
    }
    
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
    
    public void sqlDbPersonagemInsert(Personagens personagem){
        Connection connection = connectionMySql();
    }
}
