package Conexao;


import Conexao.TestConexaoSqlite3;
import Conexao.CrudCarro;
import Conexao.CrudCliente;
import Conexao.CrudLocacao;
import java.sql.Statement;
import java.sql.SQLException;

public class Main{
    public static void main(String args[])throws Exception{
        TestConexaoSqlite3 conexao = new TestConexaoSqlite3();
        conexao.abrirConexao();
        CrudCarro crud = new CrudCarro(conexao.getConnection());
        
        TestConexaoSqlite3 conexao1 = new TestConexaoSqlite3();
        conexao1.abrirConexao();
        CrudCliente crud1 = new CrudCliente(conexao1.getConnection());
        
        
        TestConexaoSqlite3 conexao2 = new TestConexaoSqlite3();
        conexao2.abrirConexao();
        CrudLocacao crud2 = new CrudLocacao(conexao2.getConnection());
        
        
        //Inserindo cadastros no banco
        
       
        //String modelo,int ano,String cor,String placa,float valor,String status
        //String nome, String nascimento, String cpf, String email,  String fone, String endereço
        //+idLocacao+", "+data_retirada+","+data_devolucao+","+status+","+cpf+","+placa+","+agencia_id+","+pagamento_id+"
        
        crud.create("Gol","1980","BRANCO","453SDE","350","DISPONIVEL"); //CARRO
        crud.create("Uno","1980","PRETO","457DCD","350","DISPONIVEL");
        crud.create("Palio","1930","VERMELHO","453SDE","350","INDISPONIVEL");
     
        
        crud1.create("Maria","07/07/2001","879","não possui","67293793","Fortaleza"); //CLIENTE
        //crud1.create("José","09/05/2000","569","não possui","678546793","Fortaleza");
        //crud1.create("Maria","10/08/2001","74987654367","não possui","6865893","Maracanaú");
        
        crud2.create(1,"07/05/2020","14/05/2020","alugado","74987654367","457DCD","FreitasCar",350); //LOCACAO
      
        //crud.create
        //Consultando uma linha no banco 
        //crud.read(1); //linha onde a placa do carro é 457DCD
        //crud1.read("2"); //linha onde o cpf do cliente é 48648
        //crud2.read(2); //linha onde o id_locacao da locação 2
        
        
        //Alterando um registro no banco
        //crud.update(3,35); //atualizando 
        
        //Deletando um registro no banco
        //crud1.delete(2); //deletando o registro 
      
        
        conexao.fecharConexao();
        conexao1.fecharConexao();
        conexao2.fecharConexao();
        
        
    }
}
