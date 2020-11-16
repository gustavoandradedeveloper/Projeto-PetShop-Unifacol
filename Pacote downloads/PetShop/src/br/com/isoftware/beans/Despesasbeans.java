
package br.com.isoftware.beans;

import java.sql.Date;


public class Despesasbeans {
    
    private Integer ProdutoFK;
    private Integer VendasFK;  
    private Date Datavenda;
    private Date Datapago;
    private Integer Quantidade;
    private Double Total;
    private Double Desconto;
    private Double Valor;  
    private String peso;
    private String Cliente;
    private String Valorrevenda;
    
   
    
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
     * @return the tipoVenad
     */
 

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
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the Valorrevenda
     */
    public String getValorrevenda() {
        return Valorrevenda;
    }

    /**
     * @param Valorrevenda the Valorrevenda to set
     */
    public void setValorrevenda(String Valorrevenda) {
        this.Valorrevenda = Valorrevenda;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
}
