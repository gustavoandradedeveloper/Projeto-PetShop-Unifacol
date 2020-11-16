
package br.com.isoftware.control;

import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Produtosbeans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */

public class Produtoscontrol {
    
  PreparedStatement pstm; 
  ResultSet rs;
  
  String consultarProdutos = "SELECT * FROM PRODUTOS WHERE NOME_PRODUTO LIKE ?";
  String cadastraProdutos = "INSERT INTO PRODUTOS(NOME_PRODUTO, PRECO_PRODUTO, QTD_PRODUTO, FORNECEDOR_PRODUTO)VALUES(?,?,?,?)";
  String atualisaProdutos = "UPDATE PRODUTOS SET NOME_PRODUTO = ?, PRECO_PRODUTO = ?, QTD_PRODUTO = ?, FORNECEDOR_PRODUTO = ? WHERE COD_PRODUTO = ?"; 
  String excluirProdutos = "DELETE FROM PRODUTOS WHERE COD_PRODUTO = ?";
    
  AcessoMysql mysql = new AcessoMysql();
    
  ArrayList<Produtosbeans> listProdutos;
       
    
   public void cadastraProduto(Produtosbeans Produtos){
    
        try {
            
                pstm = mysql.conectar().prepareStatement(cadastraProdutos);
                pstm.setString(1,Produtos.getDescricao());
                pstm.setString(2,Produtos.getValor());
                pstm.setString(3,Produtos.getQuantidade());
                pstm.setInt(4,Produtos.getFornecedorPK());
                pstm.executeUpdate();
         
             
             } catch (Exception e) {
                    
                      JOptionPane.showMessageDialog(null, "PORDUTO NÃO CADASTRADO !!!");            
                     }
        
            mysql.desconectar(); 
     }
    
    public ArrayList<Produtosbeans> listaProdutos(String nome){
        
        ArrayList<Produtosbeans> produtos = new ArrayList();
          
        try {
           
              pstm =  mysql.conectar().prepareStatement(consultarProdutos);          
              pstm.setString(1, nome);
              rs = pstm.executeQuery();
              
              Produtosbeans  prod;
            
              while(rs.next()){
            
                    prod = new Produtosbeans();
                    prod.setCodigo(rs.getInt("cod_produto"));
                    prod.setDescricao(rs.getString("nome_produto"));
                    prod.setValor(rs.getString("preco_produto"));
                    prod.setQuantidade(rs.getString("qtd_produto"));
                    prod.setFornecedorPK(rs.getInt("fornecedor_produto"));
                    produtos.add(prod);
                 }
                  
           mysql.desconectar();
        } catch (Exception e) {
                   e.printStackTrace();  
                  } 
   
     return produtos;
     
   } 
    
    
     public void atualisarProduto(Produtosbeans Produtos){
    
      try {
    
            pstm = mysql.conectar().prepareStatement(atualisaProdutos);
            pstm.setString(1,Produtos.getDescricao());
            pstm.setString(2,Produtos.getValor());
            pstm.setString(3,Produtos.getQuantidade());
            pstm.setInt(4,Produtos.getFornecedorPK());
            pstm.setInt(5,Produtos.getCodigo());         
            pstm.executeUpdate();
        } catch (Exception e) {
                 e.printStackTrace(); 
               
        }
        mysql.desconectar();
  }
     
   public void excluirProduto(Produtosbeans Produtos) {

    try {   

            pstm = (com.mysql.jdbc.PreparedStatement) mysql.conectar().prepareStatement(excluirProdutos);
            pstm.setInt(1, Produtos.getCodigo());           
            pstm.executeUpdate();           
            mysql.desconectar();

        } catch (SQLException e) {
                 e.printStackTrace();
                 }

    }
}
