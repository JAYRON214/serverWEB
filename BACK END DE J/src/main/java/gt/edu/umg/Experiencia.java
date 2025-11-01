/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {

    



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "experiencia_id")
    private Integer experienciaId;

    @Column(name = "experiencia_total")
    private Integer experienciaTotal;



    public Integer getExperienciaId() {
        return experienciaId;
    }

    public void setExperienciaId(Integer experienciaId) {
        this.experienciaId = experienciaId;
    }

    public Integer getExperienciaTotal() {
        return experienciaTotal;
    }

    public void setExperienciaTotal(Integer experienciaTotal) {
        this.experienciaTotal = experienciaTotal;
    }

  

    void persist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    

}
