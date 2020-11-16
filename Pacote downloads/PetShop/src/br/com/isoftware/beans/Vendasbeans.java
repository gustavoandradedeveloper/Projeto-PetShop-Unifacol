
package br.com.isoftware.beans;

import java.sql.Date;

/**
 *
 * @author Armando
 */
public class Vendasbeans {
 
    private Integer ProdutoFK;
    private Integer tipoVenad;
    private Integer VendasFK; 
    private Integer VendaslocalFK; 
    private Integer VendasPK;
    private Integer ClienteFK;
    private Integer FuncionarioFK;
    private Date Datavenda;
    private Date Datapago;
    private Integer Quantidade;
    private Double Total;
    private Double Desconto;
    private Double Valor;
    /**
     * @return the ProdutoFK
     */
    public Integer getProdutoFK() {
        return ProdutoFK;
    }

    /**
     * @param ProdutoFK the ProdutoFK to set
     */
    public void setProdutoFK(Integer ProdutoFK) {
        this.ProdutoFK = ProdutoFK;
    }

    /**
     * @return the VendasFK
     */
    public Integer getVendasFK() {
        return VendasFK;
    }

    /**
     * @param VendasFK the VendasFK to set
     */
    public void setVendasFK(Integer VendasFK) {
        this.VendasFK = VendasFK;
    }

    /**
     * @return the VendaslocalFK
     */
    public Integer getVendaslocalFK() {
        return VendaslocalFK;
    }

    /**
     * @param VendaslocalFK the VendaslocalFK to set
     */
    public void setVendaslocalFK(Integer VendaslocalFK) {
        this.VendaslocalFK = VendaslocalFK;
    }

    /**
     * @return the VendasPK
     */
    public Integer getVendasPK() {
        return VendasPK;
    }

    /**
     * @param VendasPK the VendasPK to set
     */
    public void setVendasPK(Integer VendasPK) {
        this.VendasPK = VendasPK;
    }

    /**
     * @return the ClienteFK
     */
    public Integer getClienteFK() {
        return ClienteFK;
    }

    /**
     * @param ClienteFK the ClienteFK to set
     */
    public void setClienteFK(Integer ClienteFK) {
        this.ClienteFK = ClienteFK;
    }

    /**
     * @return the Datavenda
     */
    public Date getDatavenda() {
        return Datavenda;
    }

    /**
     * @param Datavenda the Datavenda to set
     */
    public void setDatavenda(Date Datavenda) {
        this.Datavenda = Datavenda;
    }

    /**
     * @return the Datapago
     */
    public Date getDatapago() {
        return Datapago;
    }

    /**
     * @param Datapago the Datapago to set
     */
    public void setDatapago(Date Datapago) {
        this.Datapago = Datapago;
    }

    /**
     * @return the Quantidade
     */
    public Integer getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(Integer Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the Total
     */
    public Double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(Double Total) {
        this.Total = Total;
    }

    /**
     * @return the Desconto
     */
    public Double getDesconto() {
        return Desconto;
    }

    /**
     * @param Desconto the Desconto to set
     */
    public void setDesconto(Double Desconto) {
        this.Desconto = Desconto;
    }

    /**
     * @return the FuncionarioFK
     */
    public Integer getFuncionarioFK() {
        return FuncionarioFK;
    }

    /**
     * @param FuncionarioFK the FuncionarioFK to set
     */
    public void setFuncionarioFK(Integer FuncionarioFK) {
        this.FuncionarioFK = FuncionarioFK;
    }

    /**
     * @return the Valor
     */
    public Double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the tipoVenad
     */
    public Integer getTipoVenad() {
        return tipoVenad;
    }

    /**
     * @param tipoVenad the tipoVenad to set
     */
    public void setTipoVenad(Integer tipoVenad) {
        this.tipoVenad = tipoVenad;
    }

    
}
