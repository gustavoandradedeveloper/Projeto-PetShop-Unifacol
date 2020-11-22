
package br.com.isoftware.control;

import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Animalbeans;
import br.com.isoftware.beans.Produtosbeans;
import br.com.isoftware.beans.Servicosbeans;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */

public class Servicocontrol {
    
  PreparedStatement pstm; 
  ResultSet rs;
  
  String consultarProdutos = "SELECT * FROM ANIMAIS WHERE NOME_ANIMAL LIKE ?";
  String consultarServicos = "SELECT SERVICOS.`COD_SERVICO` AS CODIGO, SERVICOS.`NOME_SERVICO` AS SERVICO, SERVICOS.`PRECO_SERVICO` AS PRECO, SERVICOS.`DATASERVICO` AS DATASERVICO, SERVICOS.`ANIMAL_SERVICO` AS ANIMALPK, SERVICOS.`FUNCIONARIO_SERVICO` AS FUNCIONARIOPK, FUNCIONARIOS.`NOME_FUNCIONARIO` AS FUNCIONARIO, ANIMAIS.`NOME_ANIMAL` AS ANIMAL FROM  `FUNCIONARIOS` FUNCIONARIOS INNER JOIN `SERVICOS` SERVICOS ON FUNCIONARIOS.`COD_FUNCIONARIO` = SERVICOS.`FUNCIONARIO_SERVICO` INNER JOIN `ANIMAIS` ANIMAIS ON SERVICOS.`ANIMAL_SERVICO` = ANIMAIS.`COD_ANIMAL` WHERE NOME_ANIMAL LIKE ?";
  String cadastraServico = "INSERT INTO SERVICOS(NOME_SERVICO, PRECO_SERVICO, DATASERVICO, ANIMAL_SERVICO, FUNCIONARIO_SERVICO)VALUES(?,?,?,?,?)";
  String atualisaServico = "UPDATE SERVICOS SET NOME_SERVICO = ?, PRECO_SERVICO = ?, DATASERVICO = ?, ANIMAL_SERVICO = ?, FUNCIONARIO_SERVICO = ? WHERE COD_SERVICO = ?"; 
  String excluirProdutos = "DELETE FROM SERVICOS WHERE COD_PRODUTO = ?";
    
  AcessoMysql mysql = new AcessoMysql();
    
  ArrayList<Animalbeans> listAnimais;
  boolean retorno = false;    
    
   public boolean cadastraServico(Servicosbeans servico){
        
        try {            
                pstm = mysql.conectar().prepareStatement(cadastraServico);
                pstm.setString(1,servico.getServico());
                pstm.setString(2, servico.getPreco());
                pstm.setDate(3, new java.sql.Date(servico.getDataservico().getTime()));
                pstm.setInt(4, servico.getAnimalPK());
                pstm.setInt(5, servico.getFuncionarioPK());
                pstm.executeUpdate();
                retorno = true;
             } catch (Exception e) {
                        System.err.println(e);          
                    }        
            mysql.desconectar();
            return retorno;
     }
    
    public ArrayList<Servicosbeans> listaServicos(String nome){
        
        ArrayList<Servicosbeans> Servicos = new ArrayList();
        
        try {           
              pstm =  mysql.conectar().prepareStatement(consultarServicos);          
              pstm.setString(1, nome);
              rs = pstm.executeQuery();
              
              Servicosbeans servico;
            
              while(rs.next()){
            
                    servico = new Servicosbeans();
                    servico.setCodigo(rs.getInt("codigo"));
                    servico.setAnimal(rs.getString("animal"));
                    servico.setServico(rs.getString("servico"));
                    servico.setPreco(rs.getString("preco"));
                    servico.setDataservico(rs.getDate("DataServico"));
                    servico.setFuncionario(rs.getString("funcionario"));
                    servico.setAnimalPK(rs.getInt("animalPK"));
                    servico.setFuncionarioPK(rs.getInt("funcionarioPK"));
                    Servicos.add(servico);
                 }                  
           mysql.desconectar();
        } catch (Exception e) {
                   e.printStackTrace();  
                  } 
   
     return Servicos;     
   } 
    
     public boolean atualisaServico(Servicosbeans servico){
    
      try {    
            pstm = mysql.conectar().prepareStatement(atualisaServico);
            pstm.setString(1, servico.getServico());
            pstm.setString(2, servico.getPreco());
            pstm.setDate(3, new java.sql.Date(servico.getDataservico().getTime()) );
            pstm.setInt(4, servico.getAnimalPK());
            pstm.setInt(5, servico.getFuncionarioPK());
            pstm.setInt(6, servico.getCodigo());         
            pstm.executeUpdate();
            retorno = true;
        } catch (Exception e) {
                 e.printStackTrace();                
        }
        mysql.desconectar();
        return retorno;
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
