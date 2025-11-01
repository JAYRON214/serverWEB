/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jayron
 */
@Entity
@Table(name = "cliente")
public class Cliente {

   

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cliente_id")
    private Long clienteId;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "nombre_contacto")
    private String nombreContacto;
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "nit")
    private long nit;
    @Column(name = "puesto_contacto")
    private String puestoContacto;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "cod_postal")
    private CodigoPostal codPostal;
    @Column(name = "usuario_id")
    private Usuario usuarioId;

    
   

    }

