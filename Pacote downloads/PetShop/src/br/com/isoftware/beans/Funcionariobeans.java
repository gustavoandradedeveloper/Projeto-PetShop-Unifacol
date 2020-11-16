/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isoftware.beans;

import java.util.Date;


public class Funcionariobeans extends Pessoasbeans{
     
     private Integer FuncionarioPK;
     private String Funcao;    
     private String Salario;

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
     * @return the FuncionarioPK
     */
    public Integer getFuncionarioPK() {
        return FuncionarioPK;
    }

    /**
     * @param FuncionarioPK the FuncionarioPK to set
     */
    public void setFuncionarioPK(Integer FuncionarioPK) {
        this.FuncionarioPK = FuncionarioPK;
    }   
}
