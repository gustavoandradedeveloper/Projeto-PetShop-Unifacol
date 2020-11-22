package br.com.isoftware.beans;

import java.util.Date;

/**
 *
 * @author Armando e Edijane
 */
public class Servicosbeans {
    
    private Integer Codigo;
    private String Servico;
    private String Preco;
    private String funcionario;
    private String Animal;
    private Integer animalPK;
    private Integer funcionarioPK;
    private Date Dataservico;

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getServico() {
        return Servico;
    }

    public void setServico(String Servico) {
        this.Servico = Servico;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public Integer getAnimalPK() {
        return animalPK;
    }

    public void setAnimalPK(Integer animalPK) {
        this.animalPK = animalPK;
    }

    public Integer getFuncionarioPK() {
        return funcionarioPK;
    }

    public void setFuncionarioPK(Integer funcionarioPK) {
        this.funcionarioPK = funcionarioPK;
    }
    
    public Date getDataservico() {
        return Dataservico;
    }

    public void setDataservico(Date DataNasc) {
        this.Dataservico = DataNasc;
    }

}
