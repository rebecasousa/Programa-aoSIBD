package Conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudCliente
{
    //cria o objeto do tipo conexão
    private Connection conexao1;
    public CrudCliente(Connection conexao1){
        this.conexao1 = conexao1;
    }
    
    public boolean create( String nome, String nascimento, String cpf, String email,  String fone, String endereço){
        try{
            Statement statement = this.conexao1.createStatement();
            statement.executeUpdate("INSERT INTO Cliente VALUES("+nome+" , "+nascimento+" ,"+cpf+" ,"+email+" ,"+fone+" , "+endereço+")");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean read(String cpf){
        try{
            Statement statement = this.conexao1.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Cliente WHERE cpf = "+cpf);

        
            
            while (rs.next()) {
                String nome = rs.getString("nome");
                String nascimento = rs.getString("nascimento");
                cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String fone = rs.getString("fone");
                String endereço = rs.getString("endereço");
                



                System.out.println( nome +" - " + nascimento + " - " + cpf + " - " + email +" - " + fone + " - " + endereço);
            }
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean update(String novonome, String novonascimento, String cpf, String novoemail,  String novofone, String novoendereço){
        try{
            Statement statement = this.conexao1.createStatement();
            statement.executeUpdate("UPDATE Cliente SET nome ="+novonome+" WHERE cpf ="+cpf);
            //statement.executeUpdate("UPDATE Cliente SET nascimento ="+novonascimento+" WHERE cpf ="+cpf);
            //statement.executeUpdate("UPDATE Cliente SET email ="+novoemail+" WHERE cpf ="+cpf);
            //statement.executeUpdate("UPDATE Cliente SET fone ="+novofone+" WHERE cpf ="+cpf);
            //statement.executeUpdate("UPDATE Cliente SET endereço ="+novoendereço+" WHERE cpf ="+cpf);
                
            
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean delete(String cpf){
        try{
            Statement statement = this.conexao1.createStatement();
            statement.executeUpdate("DELETE FROM Cliente WHERE cpf ="+cpf+"");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}