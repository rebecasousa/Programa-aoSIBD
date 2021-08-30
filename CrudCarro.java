package Conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudCarro
{
    //cria o objeto do tipo conexão
    private Connection conexao;
    public CrudCarro(Connection conexao){
        this.conexao = conexao;
    }
    
    public boolean create(String modelo, String ano, String cor, String placa, String valor, String status){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Carro VALUES("+modelo+" , "+ano+" ,"+cor+" ,"+placa+" ,"+valor+"  , "+status+")");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean read(String placa){
        try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Carro WHERE placa = "+placa);

        
            
            while (rs.next()) {
                String modelo = rs.getString("modelo");
                String ano = rs.getString("ano");
                String cor = rs.getString("cor");
                placa = rs.getString("placa");
                String valor = rs.getString("valor");
                String status = rs.getString("status");



                System.out.println( modelo +" - " + ano + " - " + cor + " - " + placa +" - " + valor + " - " +status );
            }
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean update(String placa, String novomodelo,String novoano,String novacor,String novovalor,String novostatus){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Carro SET status ="+novostatus+" WHERE placa ="+placa);
            
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean delete(String placa){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("DELETE FROM Carro WHERE placa ="+placa+"");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
