/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.beans;

import java.util.Date;


public class Pessoasbeans {
 
     private Integer ClientePK;
     private String CNPJ;
     private String CPF;
     private String Funcao;
     private String Salario;
     private String Nome;
     private String Cidade;   
     private Date Datanasc;
     private String  Logradouro;
     private String  Numero;
     private String  Bairro;
     private String  CEP;
     private String  UF; 
     private String Fone;
     private String DD;  

     
    public Integer getClientePK() {
        return ClientePK;
    }

    public void setClientePK(Integer ClientePK) {
        this.ClientePK = ClientePK;
    }
     
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Datanasc
     */
    public Date getDatanasc() {
        return Datanasc;
    }

    /**
     * @param Datanasc the Datanasc to set
     */
    public void setDatanasc(Date Datanasc) {
        this.Datanasc = Datanasc;
    }
   
    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }
    
    /**
     * @return the Fone
     */
    public String getFone() {
        return Fone;
    }

    /**
     * @param Fone the Fone to set
     */
    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    /**
     * @return the DD
     */
    public String getDD() {
        return DD;
    }

    /**
     * @param DD the DD to set
     */
    public void setDD(String DD) {
        this.DD = DD;
    }


    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }
    
    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
  
}
