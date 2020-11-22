
package br.com.isoftware.beans;

import java.util.Date;

/**
 *
 * @author Armando
 */
public class Animalbeans {
    
    private String Nome;
    private String Tipo;
    private Date DataNasc;
    private Integer Codigo;
    private Integer ClientesPK;
    private String Cliente;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date descricao) {
        this.DataNasc = descricao;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public Integer getClientesPK() {
        return ClientesPK;
    }

    public void setClientesPK(Integer ClientesPK) {
        this.ClientesPK = ClientesPK;
    }
  
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
}
