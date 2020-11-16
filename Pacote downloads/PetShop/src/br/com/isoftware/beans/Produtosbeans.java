
package br.com.isoftware.beans;

/**
 *
 * @author Armando
 */
public class Produtosbeans {
    
    private String valor;
    private String quantidade;
    private String descricao;
    private Integer Codigo;
    private Integer FornecedorPK;    
  

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param valorrevenda the valorrevenda to set
     */
    public void setQuantidade(String valorrevenda) {
        this.quantidade = valorrevenda;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the FornecedorPK
     */
    public Integer getFornecedorPK() {
        return FornecedorPK;
    }

    /**
     * @param FornecedorPK the FornecedorPK to set
     */
    public void setFornecedorPK(Integer FornecedorPK) {
        this.FornecedorPK = FornecedorPK;
    }

}
