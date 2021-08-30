package Conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class CrudLocacao {

    
    
    //cria o objeto do tipo conexão
    private Connection conexao2;
    public CrudLocacao(Connection conexao2){
        this.conexao2 = conexao2;
    }
    
    public boolean create(int idLocacao, String data_retirada, String data_devolucao,String status,String cpf,String placa, String agencia_id, int pagamento_id){
        try{
            //O código SQL pode ser qualquer um, nesse caso é devido ser a construção do CRUD
            Statement statement = this.conexao2.createStatement();
            statement.executeUpdate("INSERT INTO Locacao VALUES("+idLocacao+", "+data_retirada+","+data_devolucao+","+status+","+cpf+","+placa+","+agencia_id+","+pagamento_id+")");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    

    
    
    public boolean read(int idlocacao){
        try{
            Statement statement = this.conexao2.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Locacao WHERE idlocacao = "+idlocacao);

            //ResultSet rs = statement.executeQuery("SELECT * FROM Aluno");
            
            while (rs.next()) {
                int idLocacao= rs.getInt("idlocacao");
                String data_retirada = rs.getString("data_retirada");
                String data_devolucao= rs.getString ("data_devolucao");
                String cpf = rs.getString("cpf");
                int agencia_id= rs.getInt("agencia_id");
                int pagamento_id = rs.getInt("pagamento_id");
                String status = rs.getString("status");
                String placa = rs.getString("placa");

                System.out.println( idLocacao +" - "+data_retirada+ " - " +data_devolucao+" - " +cpf+" - "+agencia_id+" - " + pagamento_id +" - " + status);
            }
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean update(int idLocacao, int novoidLocacao, String novodata_retirada,String novodata_devolucao,String cpf,int novoagencia_id,int novopagamento_id,String novostatus){
        try{
            Statement statement = this.conexao2.createStatement();
            statement.executeUpdate("UPDATE Locacao SET idLocacao ='"+novoidLocacao+"' WHERE idLocacao ="+idLocacao);
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean delete(int idLocacao){
        try{
            Statement statement = this.conexao2.createStatement();
            statement.executeUpdate("DELETE FROM Locacao WHERE idLocacao ="+idLocacao+"");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
