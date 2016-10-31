package model;
// Generated 11-18-2015 05:01:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="departamento"
    ,catalog="gasisw_bd1"
)
public class Departamento  implements java.io.Serializable {


     private Integer idDepto;
     private Pais pais;
     private String nombre;
     private Set municipios = new HashSet(0);

    public Departamento() {
        this.idDepto = 0;
        this.pais = new Pais();
    }

    @PostConstruct
    public void init(){
        this.idDepto = 0;
        this.pais = new Pais();
    }
	
    public Departamento(Pais pais) {
        this.pais = pais;
    }
    public Departamento(Pais pais, String nombre, Set municipios) {
       this.pais = pais;
       this.nombre = nombre;
       this.municipios = municipios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_depto", unique=true, nullable=false)
    public Integer getIdDepto() {
        return this.idDepto;
    }
    
    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pais_id_pais", nullable=false)
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    @Column(name="nombre", length=25)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Set municipios) {
        this.municipios = municipios;
    }




}


