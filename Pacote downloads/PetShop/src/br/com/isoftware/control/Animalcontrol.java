
package br.com.isoftware.control;

import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Animalbeans;
import br.com.isoftware.beans.Produtosbeans;
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

public class Animalcontrol {
    
  PreparedStatement pstm; 
  ResultSet rs;
  
  String consultarProdutos = "SELECT * FROM ANIMAIS WHERE NOME_ANIMAL LIKE ?";
  String consultarAmimais = "SELECT ANIMAIS.`COD_ANIMAL` AS CODIGO, ANIMAIS.`NOME_ANIMAL` AS ANIMAL, ANIMAIS.`TIPO_ANIMAL` AS TIPO, ANIMAIS.`DTNASC_ANIMAL` AS DATANASC, ANIMAIS.`CLIENTE_ANIMAL` AS CLIENTEPK, CLIENTES.`NOME_CLIENTE` AS CLIENTE FROM `CLIENTES` CLIENTES INNER JOIN `ANIMAIS` ANIMAIS ON CLIENTES.`COD_CLIENTE` = ANIMAIS.`CLIENTE_ANIMAL` WHERE NOME_ANIMAL LIKE ? ORDER BY COD_ANIMAL";
  String cadastraAnimal = "INSERT INTO ANIMAIS(NOME_ANIMAL, TIPO_ANIMAL, DTNASC_ANIMAL, CLIENTE_ANIMAL)VALUES(?,?,?,?)";
  String atualisaAnimal = "UPDATE ANIMAIS SET NOME_ANIMAL = ?, TIPO_ANIMAL = ?, DTNASC_ANIMAL = ?, CLIENTE_ANIMAL = ? WHERE COD_ANIMAL = ?"; 
  String excluirProdutos = "DELETE FROM PRODUTOS WHERE COD_PRODUTO = ?";
    
  AcessoMysql mysql = new AcessoMysql();
    
  ArrayList<Animalbeans> listAnimais;
       
    
   public void cadastraAnimal(Animalbeans Animais){
    
        try {
                pstm = mysql.conectar().prepareStatement(cadastraAnimal);
                pstm.setString(1,Animais.getNome());
                pstm.setString(2, Animais.getTipo());
                pstm.setDate(3, new java.sql.Date(Animais.getDataNasc().getTime()));
                pstm.setInt(4, Animais.getClientesPK());
                pstm.executeUpdate();
             
             } catch (Exception e) {
                      System.out.println(e);
                      JOptionPane.showMessageDialog(null, "PORDUTO NÃO CADASTRADO !!!");            
                     }
        
            mysql.desconectar(); 
     }
    
    public ArrayList<Animalbeans> listaAnimais(String nome){
        
        ArrayList<Animalbeans> Animais = new ArrayList();
          
        try {           
              pstm =  mysql.conectar().prepareStatement(consultarAmimais);          
              pstm.setString(1, nome);
              rs = pstm.executeQuery();
              
              Animalbeans animal;
            
              while(rs.next()){
            
                    animal = new Animalbeans();
                    animal.setCodigo(rs.getInt("codigo"));
                    animal.setNome(rs.getString("animal"));
                    animal.setTipo(rs.getString("tipo"));
                    animal.setDataNasc(rs.getDate("datanasc"));
                    animal.setCliente(rs.getString("cliente"));
                    animal.setClientesPK(rs.getInt("clientePK"));
                    Animais.add(animal);
                 }                  
           mysql.desconectar();
        } catch (Exception e) {
                   e.printStackTrace();  
                  } 
   
     return Animais;     
   } 
    
    
     public void atualisarAnimal(Animalbeans Animal){
    
      try {
    
            pstm = mysql.conectar().prepareStatement(atualisaAnimal);
            pstm.setString(1,Animal.getNome());
            pstm.setString(2,Animal.getTipo());
            pstm.setDate(3, new java.sql.Date(Animal.getDataNasc().getTime()));
            pstm.setInt(4,Animal.getClientesPK());
            pstm.setInt(5,Animal.getCodigo());         
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
   public Date CapturaData(){    
       
        java.util.Date data = new java.util.Date();        
        SimpleDateFormat formatdate = new  SimpleDateFormat("yyyy-MM-dd");      
        Date date = Date.valueOf(formatdate.format(data));     
    
   return date;  
  }
}
