/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author robson
 */
@Entity
@Table(name = "carros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carros.findAll", query = "SELECT c FROM Carros c"),
    @NamedQuery(name = "Carros.findByNumeroCarro", query = "SELECT c FROM Carros c WHERE c.numeroCarro = :numeroCarro"),
    @NamedQuery(name = "Carros.findByPlacaCarro", query = "SELECT c FROM Carros c WHERE c.placaCarro = :placaCarro"),
    @NamedQuery(name = "Carros.findByKmIncial", query = "SELECT c FROM Carros c WHERE c.kmIncial = :kmIncial"),
    @NamedQuery(name = "Carros.findByRenavam", query = "SELECT c FROM Carros c WHERE c.renavam = :renavam"),
    @NamedQuery(name = "Carros.findByModelo", query = "SELECT c FROM Carros c WHERE c.modelo = :modelo")})
public class Carros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_carro")
    private Integer numeroCarro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "placa_carro")
    private String placaCarro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "km_incial")
    private int kmIncial;
    @Column(name = "renavam")
    private Integer renavam;
    @Size(max = 20)
    @Column(name = "modelo")
    private String modelo;

    public Carros() {
    }

    public Carros(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Carros(Integer numeroCarro, String placaCarro, int kmIncial) {
        this.numeroCarro = numeroCarro;
        this.placaCarro = placaCarro;
        this.kmIncial = kmIncial;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public int getKmIncial() {
        return kmIncial;
    }

    public void setKmIncial(int kmIncial) {
        this.kmIncial = kmIncial;
    }

    public Integer getRenavam() {
        return renavam;
    }

    public void setRenavam(Integer renavam) {
        this.renavam = renavam;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCarro != null ? numeroCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carros)) {
            return false;
        }
        Carros other = (Carros) object;
        if ((this.numeroCarro == null && other.numeroCarro != null) || (this.numeroCarro != null && !this.numeroCarro.equals(other.numeroCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teste.Carros[ numeroCarro=" + numeroCarro + " ]";
    }
    
}
