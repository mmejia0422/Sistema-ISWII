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
 * Pago generated by hbm2java
 */
@Entity
@Table(name="pago"
    ,catalog="gasisw_bd1"
)
public class Pago  implements java.io.Serializable {


     private Integer idPago;
     private Factura factura;
     private TipoPago tipoPago;

    public Pago() {
    }

    public Pago(Factura factura, TipoPago tipoPago) {
       this.factura = factura;
       this.tipoPago = tipoPago;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_pago", unique=true, nullable=false)
    public Integer getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="factura_id_factura", nullable=false)
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIPO_PAGO_id_tipo_pago", nullable=false)
    public TipoPago getTipoPago() {
        return this.tipoPago;
    }
    
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }




}

