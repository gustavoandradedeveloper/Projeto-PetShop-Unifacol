
package br.com.isoftware.control;

import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Pessoasbeans;
import br.com.isoftware.beans.Produtosbeans;
import br.com.isoftware.beans.Vendasbeans;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Armando
 */
public class Vendascontrol {
 
  PreparedStatement pstm; 
  ResultSet rs; 
  AcessoMysql mysql = new AcessoMysql();
    
  String listaClientes = "SELECT * FROM CLIENTES WHERE NOME_CLIENTE LIKE ?";
  String listaFuncionarios = "SELECT * FROM FUNCIONARIOS WHERE NOME LIKE ?";  
  String consultarProdutos = "SELECT * FROM PRODUTOS"; 
  
  String cadastraVendas = "INSERT INTO COMPRAS(VALOR_COMPRA, DT_COMPRA, CLIENTE_COMPRA)VALUES(?,?,?)";
  String cadastraItensVendas = "INSERT INTO ITENS(QTD_ITEM, COMPRA_ITEM, PRODUTO_ITEM)VALUES(?,?,?)";
  
  
  
  ArrayList<Produtosbeans> produtos;
  ArrayList<Pessoasbeans> listObjCli = new ArrayList(); 
  ArrayList<Pessoasbeans> listObjFunci = new ArrayList();
  ArrayList<Vendasbeans> listObjVendas = new ArrayList();   
  ArrayList<Pessoasbeans> listObjForm = new ArrayList();  
 
  
  
  
    public ArrayList<Produtosbeans> listaProdutos(){
        
        ArrayList<Produtosbeans> produtos = new ArrayList();
          
        try {
           
              pstm =  mysql.conectar().prepareStatement(consultarProdutos);          
              rs = pstm.executeQuery();
              Produtosbeans  prod;
            
              while(rs.next()){
            
                    prod = new Produtosbeans();
                    prod.setCodigo(rs.getInt("ProdutosPK"));
               //     prod.setPeso(rs.getString("peso"));
                    prod.setValor(rs.getString("valor"));
               //     prod.setValorrevenda(rs.getString("valorrevenda"));
                    produtos.add(prod);
                   }
                   mysql.desconectar();
        
        } catch (Exception e) {
          e.printStackTrace();  
        }
          
     return produtos;
     
   }
  
  
    public ArrayList<Pessoasbeans> listaCBClientes(String nome){ 
      
          try {
            
               pstm =  mysql.conectar().prepareStatement(listaClientes);
               pstm.setString(1, nome);
               rs = pstm.executeQuery();
               Pessoasbeans  Clientes;
            
               while(rs.next()){
            
                     Clientes = new Pessoasbeans();   
                     Clientes.setClientePK(rs.getInt("cod_cliente"));  
                     Clientes.setNome(rs.getString("nome_cliente")); 
                     listObjForm.add(Clientes);
                 }
                   
               
            }  catch (Exception e) {
                          e.printStackTrace();  
                        }
      return listObjForm;       
   }       
    
     public ArrayList<Pessoasbeans> listaCBFuncionarios(String nome){ 
      
          try {
            
               pstm =  mysql.conectar().prepareStatement(listaFuncionarios);
               pstm.setString(1, nome);
               rs = pstm.executeQuery();
               Pessoasbeans  Funci;
            
               while(rs.next()){
            
                     Funci = new Pessoasbeans();   
//                     Funci.setFuncionarioPK(rs.getInt("FuncionarioPK"));  
                     Funci.setNome(rs.getString("Nome")); 
                     listObjFunci.add(Funci);
                 }
                   
               
            }  catch (Exception e) {
                          e.printStackTrace();  
                        }
      return listObjFunci;       
   }          
  
   public void cadastraPedidoAvista(ArrayList<Vendasbeans> Pedidos, int clientePK,Double Totalgeral){
    
        try {           
             
                Integer CodVendasPK = null;
                pstm = mysql.conectar().prepareStatement(cadastraVendas, PreparedStatement.RETURN_GENERATED_KEYS);
                //COD_COMPRA, VALOR_COMPRA, DT_COMPRA, CLIENTE_COMPRA  
                pstm.setDouble(1, Totalgeral);
                pstm.setDate(2, CapturaData());
                pstm.setInt(3, clientePK);
                pstm.executeUpdate();                 
                rs = pstm.getGeneratedKeys();

                while(rs.next()){

                       CodVendasPK = rs.getInt(1);                        
                      }
           
             //COD_ITEM, QTD_ITEM, COMPRA_ITEM, PRODUTO_ITEM
             for(int i = 0;i < Pedidos.size();i++){         
                 
                        pstm = mysql.conectar().prepareStatement(cadastraItensVendas);
                        pstm.setInt(1, Pedidos.get(i).getQuantidade());
                        pstm.setInt(2, CodVendasPK);
                        pstm.setInt(3, Pedidos.get(i).getProdutoFK());                        
                        pstm.executeUpdate();               
                       
                        mysql.desconectar();   
                  }
            
        } catch (Exception e) {
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
