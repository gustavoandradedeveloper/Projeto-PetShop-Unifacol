/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.beans;

import java.util.Date;


public class Fornecedorbeans extends Pessoasbeans{ 
     
     private Integer FornecedorPK;
     private String Empresa;
     private String CNPJ;
     private String Inscricao;

    public Integer getFornecedorPK() {
        return FornecedorPK;
    }

    public void setFornecedorPK(Integer FornecedorPK) {
        this.FornecedorPK = FornecedorPK;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public String getInscricao() {
        return Inscricao;
    }

    public void setInscricao(String Inscricao) {
        this.Inscricao = Inscricao;
    }
}
