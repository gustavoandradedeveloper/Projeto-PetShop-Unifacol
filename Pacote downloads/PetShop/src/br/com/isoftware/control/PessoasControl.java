package br.com.isoftware.control;
import br.com.isoftware.AcessoBD.AcessoMysql;
import br.com.isoftware.beans.Pessoasbeans;
import br.com.isoftware.beans.Clientebeans;
import br.com.isoftware.beans.Fornecedorbeans;
import br.com.isoftware.beans.Funcionariobeans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


  public class PessoasControl {
  boolean resposta = false;
  
  PreparedStatement pstm; 
  ResultSet rs; 
 
  String cadastraCliente = "INSERT INTO CLIENTES(NOME_CLIENTE, CPF_CLIENTE, DATANASC, RUA_CLIENTE, NUMERO_CLIENTE, BAIRRO_CLIENTE, CIDADE_CLIENTE, CEP_CLIENTE, ESTADO_CLIENTE, DD_CLIENTE, TELEFONE_CLIENTE, SITUACAO)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
  String cadastraFuncionarios = "INSERT INTO FUNCIONARIOS(NOME_FUNCIONARIO, FUNCAO_FUNCIONARIO, CPF_FUNCIONARIO, DATANASC, RUA_FUNCIONARIO, NUMERO_FUNCIONARIO, BAIRRO_FUNCIONARIO, CIDADE_FUNCIONARIO, CEP_FUNCIONARIO, ESTADO_FUNCIONARIO, SALARIO_FUNCIONARIO, DD_FUNCIONARIO, TELEFONE_FUNCIONARIO, SITUACAO)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  String cadastraFornecedores = "INSERT INTO FORNECEDORES(CNPJ_FORNECEDOR, IE_FORNECEDOR, RAZAOSOCIAL_FORNECEDOR, RUA_FORNECEDOR, NUMERO_FORNECEDOR, BAIRRO_FORNECEDOR, CIDADE_FORNECEDOR, CEP_FORNECEDOR, ESTADO_FORNECEDOR, DD_FORNECEDOR, TELEFONE_FORNECEDOR, SITUACAO)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
  
  
  String listaFuncionarios = "SELECT * FROM FUNCIONARIOS WHERE NOME_FUNCIONARIO LIKE ? AND SITUACAO = 1";  
  String listaClientes = "SELECT * FROM CLIENTES WHERE NOME_CLIENTE LIKE ? AND SITUACAO = 1";
  String listaFornecedores[] = new String[]{"SELECT * FROM FORNECEDORES WHERE RAZAOSOCIAL_FORNECEDOR LIKE ? AND SITUACAO = 1", "SELECT * FROM FORNECEDORES WHERE RAZAOSOCIAL_FORNECEDOR LIKE ?"};
  
  String atualisaClinte = "UPDATE CLIENTES SET NOME_CLIENTE = ?, CPF_CLIENTE = ?, DATANASC = ?, RUA_CLIENTE = ?, NUMERO_CLIENTE = ?, BAIRRO_CLIENTE = ?, CIDADE_CLIENTE = ?, CEP_CLIENTE = ?, ESTADO_CLIENTE = ?, DD_CLIENTE = ?, TELEFONE_CLIENTE = ? WHERE COD_CLIENTE = ?";  
  String atualisaFuncionaros = "UPDATE FUNCIONARIOS SET NOME_FUNCIONARIO = ?, FUNCAO_FUNCIONARIO = ?, CPF_FUNCIONARIO = ?, DATANASC = ?, RUA_FUNCIONARIO = ?, NUMERO_FUNCIONARIO = ?, BAIRRO_FUNCIONARIO = ?, CIDADE_FUNCIONARIO = ?, CEP_FUNCIONARIO = ?, ESTADO_FUNCIONARIO = ?, SALARIO_FUNCIONARIO = ?, DD_FUNCIONARIO = ?, TELEFONE_FUNCIONARIO = ? WHERE COD_FUNCIONARIO = ?"; 
  String atualisaFornecedores = "UPDATE FORNECEDORES SET CNPJ_FORNECEDOR = ?, IE_FORNECEDOR = ?, RAZAOSOCIAL_FORNECEDOR = ?, RUA_FORNECEDOR = ?, NUMERO_FORNECEDOR = ?, BAIRRO_FORNECEDOR = ?, CIDADE_FORNECEDOR = ?, CEP_FORNECEDOR = ?, ESTADO_FORNECEDOR = ?, DD_FORNECEDOR = ?, TELEFONE_FORNECEDOR = ? WHERE COD_FORNECEDOR = ?";
  
  String listaCadastro = "SELECT pessoa.`ClientePK` AS ClientePK, pessoa.`Nome` AS Nome, pessoa.`Datanasc` AS Datanasc, pessoa.`EnderecoFK` AS EnderecoFK,"
                        +"pessoa.`TelefoneFK` AS TelefoneFK, pessoa.`PessoaFK` AS PessoaFK, endereco.`Logradouro` AS Logradouro, endereco.`Bairro` AS Bairro,"
                        +"endereco.`Cidade` AS Cidade, endereco.`Uf` AS Uf, endereco.`Cep` AS Cep, endereco.`Numero` AS Num, tipopessoa.`Tipopessoa` AS Tipopessoa,"
                        +"tipopessoa.`Codigo` AS Codigo, telefone.`Numero` AS Numero, telefone.`Numero1` AS Numero1, telefone.`Numero2` AS Numero2, telefone.`DD` AS DD FROM"
                        +"`endereco` endereco INNER JOIN `pessoa` pessoa ON endereco.`EnderecoPK` = pessoa.`EnderecoFK` INNER JOIN `tipopessoa` tipopessoa ON pessoa.`PessoaFK` = tipopessoa.`PessoaPK`"                      
                        +"INNER JOIN `telefone` telefone ON pessoa.`TelefoneFK` = telefone.`TelefonePK` WHERE pessoa.`Nome` LIKE ?";
 
  String[] excluir = new String[]{"UPDATE CLIENTES SET SITUACAO = 0 WHERE COD_CLIENTE = ?", "UPDATE FUNCIONARIOS SET SITUACAO = 0 WHERE COD_FUNCIONARIO = ?", "UPDATE FORNECEDORES SET SITUACAO = 0 WHERE COD_FORNECEDOR = ?"};
  AcessoMysql mysql = new AcessoMysql();
  
   public PessoasControl(){}
    
      public boolean cadastroCliente(Pessoasbeans ObjBeans){
    
          try {    
                    pstm = mysql.conectar().prepareStatement(cadastraCliente);
                    pstm.setString(1,ObjBeans.getNome());
                    pstm.setString(2, ObjBeans.getCPF());
                    pstm.setDate(3, new java.sql.Date(ObjBeans.getDatanasc().getTime()));   
                    pstm.setString(4,ObjBeans.getLogradouro());
                    pstm.setString(5,ObjBeans.getNumero());
                    pstm.setString(6,ObjBeans.getBairro());
                    pstm.setString(7,ObjBeans.getCidade());
                    pstm.setString(8,ObjBeans.getCEP().replace("-",""));                    
                    pstm.setString(9,ObjBeans.getUF());
                    pstm.setString(10, ObjBeans.getDD().replace("(","").replace(")",""));
                    pstm.setString(11, ObjBeans.getFone().replace("(","").replace(")",""));
                    pstm.setInt(12, 1);
                    pstm.executeUpdate();
                    resposta = true;
          } 
           catch (Exception e) {
                    resposta = false;
                    e.printStackTrace();            
                }
          return resposta;
     }
   
        public void cadastroFuncionario(Pessoasbeans ObjBeans){
    
          try {       
                
                pstm = mysql.conectar().prepareStatement(cadastraFuncionarios);
                pstm.setString(1,ObjBeans.getNome());
                pstm.setString(2,ObjBeans.getFuncao());
                pstm.setString(3,ObjBeans.getCPF());
                pstm.setDate(4, new java.sql.Date(ObjBeans.getDatanasc().getTime()));                               
                pstm.setString(5,ObjBeans.getLogradouro());
                pstm.setString(6,ObjBeans.getNumero());
                pstm.setString(7,ObjBeans.getBairro());
                pstm.setString(8,ObjBeans.getCidade());                             
                pstm.setString(9,ObjBeans.getCEP().replace("-",""));
                pstm.setString(10,ObjBeans.getUF());                    
                pstm.setString(11,ObjBeans.getSalario());
                pstm.setString(12,ObjBeans.getDD().replace("(", "").replace(")", "").replace("-",""));
                pstm.setString(13,ObjBeans.getFone().replace("(", "").replace(")", "").replace("-",""));                           

                pstm.executeUpdate();
                mysql.desconectar();             
          } 
           catch (Exception e) {
                 e.printStackTrace();            
                  }
     }
     public boolean cadastroFornecedor(Fornecedorbeans ObjBeans){
    
          try {       
                
                pstm = mysql.conectar().prepareStatement(cadastraFornecedores);
                
                pstm.setString(1,ObjBeans.getCNPJ());                
                pstm.setString(2,ObjBeans.getInscricao());
                pstm.setString(3,ObjBeans.getEmpresa());
                pstm.setString(4,ObjBeans.getLogradouro());
                pstm.setString(5,ObjBeans.getNumero());
                pstm.setString(6,ObjBeans.getBairro());
                pstm.setString(7,ObjBeans.getCidade());
                pstm.setString(8,ObjBeans.getCEP().replace("-",""));                    
                pstm.setString(9,ObjBeans.getUF());
                pstm.setString(10, ObjBeans.getDD().replace("(","").replace(")",""));
                pstm.setString(11, ObjBeans.getFone().replace("(","").replace(")",""));                           

                pstm.executeUpdate();
                resposta = true;
                mysql.desconectar();             
          } 
           catch (Exception e) {
                    resposta = false;
                    e.printStackTrace();            
                  }
        return resposta;
     }        

        
    public ArrayList<Clientebeans> listarClientes(String nome){ 
      
         ArrayList<Clientebeans> listObjForm = new ArrayList(); 
        try {
            
            pstm =  mysql.conectar().prepareStatement(listaClientes);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Clientebeans  Claent;                 
                  
            while(rs.next()){           
                    //cod_cliente 	cpf_cliente 	nome_cliente 	DataNasc 	estado_cliente 	cep_cliente 	numero_cliente 	rua_cliente 	bairro_cliente 	cidade_cliente 	telefone_cliente
                     Claent = new Clientebeans();   
                     Claent.setClientePK(rs.getInt("cod_cliente"));
                     Claent.setCPF(rs.getString("cpf_cliente"));
                     Claent.setNome(rs.getString("nome_cliente"));                                                    
                     Claent.setDatanasc(rs.getDate("DataNasc"));
                     Claent.setLogradouro(rs.getString("rua_cliente"));  
                     Claent.setBairro(rs.getString("bairro_cliente"));
                     Claent.setCidade(rs.getString("cidade_cliente")); 
                     Claent.setUF(rs.getString("estado_cliente")); 
                     Claent.setCEP(rs.getString("cep_cliente"));
                     Claent.setNumero(rs.getString("numero_cliente"));
                     Claent.setDD(rs.getString("dd_cliente"));
                     Claent.setFone(rs.getString("telefone_cliente"));
                    
                     listObjForm.add(Claent);                  
                   }
                     mysql.desconectar();
        
        } catch (Exception e) {
            e.printStackTrace();  
        }
          
    return listObjForm;
 } 
    public ArrayList<Funcionariobeans> listarFuncionarios(String nome){      
          ArrayList<Funcionariobeans> listObjForm = new ArrayList();
        try {
            
            pstm =  mysql.conectar().prepareStatement(listaFuncionarios);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Funcionariobeans  Funci;
            while(rs.next()){
                
                  Funci = new Funcionariobeans();   
                  Funci.setFuncionarioPK(rs.getInt("cod_funcionario"));  
                  Funci.setNome(rs.getString("nome_funcionario"));
                  Funci.setFuncao(rs.getString("funcao_funcionario"));
                  Funci.setDatanasc(rs.getDate("Datanasc"));
                  Funci.setCPF(rs.getString("cpf_funcionario"));
                  Funci.setLogradouro(rs.getString("rua_funcionario"));
                  Funci.setBairro(rs.getString("bairro_funcionario"));
                  Funci.setCidade(rs.getString("cidade_funcionario")); 
                  Funci.setUF(rs.getString("estado_funcionario")); 
                  Funci.setCEP(rs.getString("cep_funcionario"));
                  Funci.setNumero(rs.getString("numero_funcionario"));
                  Funci.setSalario(rs.getString("salario_funcionario"));
                  Funci.setDD(rs.getString("dd_funcionario"));
                  Funci.setFone(rs.getString("telefone_funcionario"));
                  listObjForm.add(Funci);
            }      
            
                mysql.desconectar();
        
        } catch (Exception e) {
          e.printStackTrace();  
          }
          
    return listObjForm;
 } 
  
   public ArrayList<Fornecedorbeans> listarFornecedores(String nome, int situacao){      
         
        ArrayList<Fornecedorbeans> listObjForm = new ArrayList();
        try {
            
            pstm =  mysql.conectar().prepareStatement(listaFornecedores[situacao]);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            Fornecedorbeans  forn;
            while(rs.next()){
                
                  forn = new Fornecedorbeans();   
                  forn.setFornecedorPK(rs.getInt("cod_fornecedor"));  
                  forn.setEmpresa(rs.getString("razaosocial_fornecedor"));
                  forn.setInscricao(rs.getString("ie_fornecedor"));
                  forn.setCNPJ(rs.getString("cnpj_fornecedor"));
                  forn.setLogradouro(rs.getString("rua_fornecedor"));
                  forn.setBairro(rs.getString("bairro_fornecedor"));
                  forn.setCidade(rs.getString("cidade_fornecedor")); 
                  forn.setUF(rs.getString("estado_fornecedor")); 
                  forn.setCEP(rs.getString("cep_fornecedor"));
                  forn.setNumero(rs.getString("numero_fornecedor"));
                  forn.setDD(rs.getString("dd_fornecedor"));
                  forn.setFone(rs.getString("telefone_fornecedor"));
                  listObjForm.add(forn);
            }      
            
                mysql.desconectar();
        
        } catch (Exception e) {
          e.printStackTrace();  
          }
          
    return listObjForm;
 } 
   
    public boolean atualisarClientes(Clientebeans ObjBeans){    
       
        try {//UPDATE CLIENTES SET NOME_CLIENTE = ?, CPF_CLIENTE = ?, DATANASC = ?, RUA_CLIENTE = ?, NUMERO_CLIENTE = ?, BAIRRO_CLIENTE = ?, CIDADE_CLIENTE = ?, CEP_CLIENTE = ?, ESTADO_CLIENTE = ?, DD_CLIENTE = ?, TELEFONE_CLIENTE = ? WHERE COD_CLIENTE = ?          

                pstm = mysql.conectar().prepareStatement(atualisaClinte);            
                pstm.setString(1,ObjBeans.getNome());
                pstm.setString(2, ObjBeans.getCPF());
                pstm.setDate(3, new java.sql.Date(ObjBeans.getDatanasc().getTime())); 
                pstm.setString(4,ObjBeans.getLogradouro());
                pstm.setString(5,ObjBeans.getNumero());                                
                pstm.setString(6,ObjBeans.getBairro());
                pstm.setString(7,ObjBeans.getCidade());
                pstm.setString(8,ObjBeans.getCEP().replace("-",""));
                pstm.setString(9,ObjBeans.getUF());                
                pstm.setString(10,ObjBeans.getDD().replace("(", "").replace(")", ""));   
                pstm.setString(11,ObjBeans.getFone().replace("(", "").replace(")", "").replace("-",""));
                pstm.setInt(12, ObjBeans.getClientePK());
                pstm.executeUpdate();
                resposta = true;
                mysql.desconectar();
             
          }  catch (Exception e) {
                resposta = false;
                 e.printStackTrace();            
        }
        return resposta;
     }
   
     public boolean atualisarFuncionario(Funcionariobeans ObjBeans){    
       
        try {

                pstm = mysql.conectar().prepareStatement(atualisaFuncionaros);            
                pstm.setString(1,ObjBeans.getNome());
                pstm.setString(2, ObjBeans.getFuncao());
                pstm.setString(3, ObjBeans.getCPF());
                pstm.setDate(4, new java.sql.Date(ObjBeans.getDatanasc().getTime())); 
                pstm.setString(5,ObjBeans.getLogradouro());
                pstm.setString(6,ObjBeans.getNumero());                                
                pstm.setString(7,ObjBeans.getBairro());
                pstm.setString(8,ObjBeans.getCidade());
                pstm.setString(9,ObjBeans.getCEP().replace("-",""));
                pstm.setString(10,ObjBeans.getUF());
                pstm.setString(11,ObjBeans.getSalario());
                pstm.setString(12,ObjBeans.getDD().replace("(", "").replace(")", ""));   
                pstm.setString(13,ObjBeans.getFone().replace("(", "").replace(")", "").replace("-",""));
                pstm.setInt(14, ObjBeans.getFuncionarioPK());
                pstm.executeUpdate();
                mysql.desconectar();
             
          }  catch (Exception e) {
                resposta = false;
                e.printStackTrace();            
        }
        return resposta;
     }
   
    public boolean atualisarFornecedores(Fornecedorbeans ObjBeans){    
       
        try {

                pstm = mysql.conectar().prepareStatement(atualisaFornecedores);
                
                pstm.setString(1, ObjBeans.getCNPJ());
                pstm.setString(2,ObjBeans.getInscricao());
                pstm.setString(3, ObjBeans.getEmpresa());                
                pstm.setString(4,ObjBeans.getLogradouro());
                pstm.setString(5,ObjBeans.getNumero());                                
                pstm.setString(6,ObjBeans.getBairro());
                pstm.setString(7,ObjBeans.getCidade());
                pstm.setString(8,ObjBeans.getCEP().replace("-",""));
                pstm.setString(9,ObjBeans.getUF());
                pstm.setString(10,ObjBeans.getDD().replace("(", "").replace(")", ""));   
                pstm.setString(11,ObjBeans.getFone().replace("(", "").replace(")", "").replace("-",""));
                pstm.setInt(12, ObjBeans.getFornecedorPK());
                pstm.executeUpdate();
                resposta = true;
                mysql.desconectar();
             
          }  catch (Exception e) {
                resposta = false;
                e.printStackTrace();            
        }
        return resposta;
     }
    
    public boolean excluirPessoa(Integer codigo, int pessoa) { 
        
        try {            
             pstm = mysql.conectar().prepareStatement(excluir[pessoa]);
             pstm.setInt(1, codigo);
             pstm.executeUpdate();           
             mysql.desconectar();
             resposta = true;
            } catch (SQLException e){
                    resposta = false;
                    e.printStackTrace();
            }
        return resposta;
    }
}



