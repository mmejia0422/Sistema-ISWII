package model;
// Generated 07-08-2016 05:51:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;

/**
 * Icono generated by hbm2java
 */
public class Icono  implements java.io.Serializable {
    
     private Integer idicono;
     private String referencia;
     private String accion;
     private String descripcion;
     private Set submenus = new HashSet(0);
     private Set menus = new HashSet(0);

    public Icono() {
        this.idicono = 0;
    }
    
    @PostConstruct
    public void init(){
        this.idicono = 0;
    }

	
    public Icono(Integer idicono, String referencia, String accion, String descripcion) {
        this.referencia = referencia;
        this.accion = accion;
        this.descripcion = descripcion;
        this.idicono = idicono;
    }
    public Icono(String referencia, String accion, String descripcion, Set submenus, Set menus) {
       this.referencia = referencia;
       this.accion = accion;
       this.descripcion = descripcion;
       this.submenus = submenus;
       this.menus = menus;
    }
   
    public Integer getIdicono() {
        return this.idicono;
    }
    
    public void setIdicono(Integer idicono) {
        this.idicono = idicono;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getAccion() {
        return this.accion;
    }
    
    public void setAccion(String accion) {
        this.accion = accion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getSubmenus() {
        return this.submenus;
    }
    
    public void setSubmenus(Set submenus) {
        this.submenus = submenus;
    }
    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }




}


