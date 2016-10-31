package model;
// Generated 10-30-2016 07:08:51 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private Municipio municipio;
     private String nombre;
     private String apellido;
     private String dui;
     private String nit;
     private String telefono;
     private Set facturas = new HashSet(0);
     private Set ordenVentas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Municipio municipio, String nombre, String apellido) {
        this.municipio = municipio;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Cliente(Municipio municipio, String nombre, String apellido, String dui, String nit, String telefono, Set facturas, Set ordenVentas) {
       this.municipio = municipio;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dui = dui;
       this.nit = nit;
       this.telefono = telefono;
       this.facturas = facturas;
       this.ordenVentas = ordenVentas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getOrdenVentas() {
        return this.ordenVentas;
    }
    
    public void setOrdenVentas(Set ordenVentas) {
        this.ordenVentas = ordenVentas;
    }




}


