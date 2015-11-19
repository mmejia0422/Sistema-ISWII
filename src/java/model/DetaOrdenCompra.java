package model;
// Generated 11-18-2015 05:01:00 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetaOrdenCompra generated by hbm2java
 */
@Entity
@Table(name="deta_orden_compra"
    ,catalog="gasisw_bd1"
)
public class DetaOrdenCompra  implements java.io.Serializable {


     private Integer idDetaOrdenCompra;
     private CatProducto catProducto;
     private OrdenCompra ordenCompra;
     private Byte precio;
     private Integer cantidad;

    public DetaOrdenCompra() {
    }

	
    public DetaOrdenCompra(CatProducto catProducto, OrdenCompra ordenCompra) {
        this.catProducto = catProducto;
        this.ordenCompra = ordenCompra;
    }
    public DetaOrdenCompra(CatProducto catProducto, OrdenCompra ordenCompra, Byte precio, Integer cantidad) {
       this.catProducto = catProducto;
       this.ordenCompra = ordenCompra;
       this.precio = precio;
       this.cantidad = cantidad;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_deta_orden_compra", unique=true, nullable=false)
    public Integer getIdDetaOrdenCompra() {
        return this.idDetaOrdenCompra;
    }
    
    public void setIdDetaOrdenCompra(Integer idDetaOrdenCompra) {
        this.idDetaOrdenCompra = idDetaOrdenCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cat_producto_id_cat_producto", nullable=false)
    public CatProducto getCatProducto() {
        return this.catProducto;
    }
    
    public void setCatProducto(CatProducto catProducto) {
        this.catProducto = catProducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="orden_compra_id_orden", nullable=false)
    public OrdenCompra getOrdenCompra() {
        return this.ordenCompra;
    }
    
    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    
    @Column(name="precio", precision=2, scale=0)
    public Byte getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Byte precio) {
        this.precio = precio;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }




}

