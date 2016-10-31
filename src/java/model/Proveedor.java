package model;
// Generated 11-18-2015 05:01:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
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
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name="proveedor"
    ,catalog="gasisw_bd1"
)
public class Proveedor  implements java.io.Serializable {


     private Integer idProveedor;
     private Municipio municipio;
     private String nombre;
     private String direccion;
     private String telefono;
     private String descripcion;
     private String nit;
     private Set productoProveedors = new HashSet(0);
     private Set ordenCompras = new HashSet(0);

    public Proveedor() {
        this.municipio = new Municipio();
    }

	
    public Proveedor(Municipio municipio, String nombre, String direccion, String telefono) {
        this.municipio = municipio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Proveedor(Municipio municipio, String nombre, String direccion, String telefono, String descripcion, String nit, Set productoProveedors, Set ordenCompras) {
       this.municipio = municipio;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.descripcion = descripcion;
       this.nit = nit;
       this.productoProveedors = productoProveedors;
       this.ordenCompras = ordenCompras;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_proveedor", unique=true, nullable=false)
    public Integer getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="municipio_id_municipio", nullable=false)
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="direccion", nullable=false, length=100)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="telefono", nullable=false, length=8)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="descripcion", length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="nit", length=45)
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="proveedor")
    public Set getProductoProveedors() {
        return this.productoProveedors;
    }
    
    public void setProductoProveedors(Set productoProveedors) {
        this.productoProveedors = productoProveedors;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="proveedor")
    public Set getOrdenCompras() {
        return this.ordenCompras;
    }
    
    public void setOrdenCompras(Set ordenCompras) {
        this.ordenCompras = ordenCompras;
    }




}


