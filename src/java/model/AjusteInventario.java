package model;
// Generated 10-30-2016 07:08:51 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AjusteInventario generated by hbm2java
 */
public class AjusteInventario  implements java.io.Serializable {


     private Integer idAjusteInventario;
     private Date fecha;
     private String justificacion;
     private Set detaAjusteInventarios = new HashSet(0);

    public AjusteInventario() {
    }

    public AjusteInventario(Date fecha, String justificacion, Set detaAjusteInventarios) {
       this.fecha = fecha;
       this.justificacion = justificacion;
       this.detaAjusteInventarios = detaAjusteInventarios;
    }
   
    public Integer getIdAjusteInventario() {
        return this.idAjusteInventario;
    }
    
    public void setIdAjusteInventario(Integer idAjusteInventario) {
        this.idAjusteInventario = idAjusteInventario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getJustificacion() {
        return this.justificacion;
    }
    
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    public Set getDetaAjusteInventarios() {
        return this.detaAjusteInventarios;
    }
    
    public void setDetaAjusteInventarios(Set detaAjusteInventarios) {
        this.detaAjusteInventarios = detaAjusteInventarios;
    }




}


