package br.com.isoftware.control;

import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Despesasbeans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Despesascontrol {
   
  PreparedStatement pstm; 
  ResultSet rs; 
  AcessoMysql mysql = new AcessoMysql();   
    
    
    String Debitos = "SELECT pessoa.`ClientePK` AS ClientePK, pessoa.`Nome` AS Nome, vendaprazo.`VendaPZPK` AS VendaPZPK, vendaprazo.`VendaFK` AS VendaFK,"
                     +" vendas.`Total` AS Total, vendas.`Data` AS Data, itens.`Quantidade` AS Quantidade, itens.`ProdutosFK` AS ProdutosFK, produtos.`peso` AS peso,"
                     +"produtos.`valorrevenda` AS valorrevenda FROM `pessoa` pessoa INNER JOIN `vendaprazo` vendaprazo ON pessoa.`ClientePK` = `ClienteFK`"
                     +"INNER JOIN `vendas` vendas ON vendaprazo.`VendaFK` = `VendaPK` INNER JOIN `itens` itens ON vendas.`VendaPK` = `VendasFK`"
                     +"INNER JOIN `produtos` produtos ON itens.`ProdutosFK` = `ProdutosPK` WHERE pessoa.`Nome` LIKE '%%'";
    
    
     
    public ArrayList<Despesasbeans> listaDebitos(){
        
        ArrayList<Despesasbeans> produtos = new ArrayList();
          
        try {
           
              pstm =  mysql.conectar().prepareStatement(Debitos);          
              rs = pstm.executeQuery();
              Despesasbeans  prod;
            
              while(rs.next()){
            
                    prod = new Despesasbeans();
                    prod.setCliente(rs.getString("Nome"));
                    prod.setTotal(rs.getDouble("Total"));
                    prod.setQuantidade(rs.getInt("Quantidade"));
                    prod.setPeso(rs.getString("Peso"));
                    prod.setQuantidade(rs.getInt("Quantidade"));
                    prod.setValorrevenda(rs.getString("valorrevenda"));
                    prod.setDatavenda(rs.getDate("Data"));
                    produtos.add(prod);
                   }
                   mysql.desconectar();
        
        } catch (Exception e) {
          e.printStackTrace();  
        }
          
     return produtos;
     
   }
    
}
  