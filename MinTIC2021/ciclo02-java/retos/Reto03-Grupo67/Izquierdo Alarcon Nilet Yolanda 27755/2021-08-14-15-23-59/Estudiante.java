//package model;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String nombre;
    private String apellido;
    private String fechaNaci;
    private String correoInst;
    private String correoPers;
    private long numeroCelular;
    private long numeroFijo;
    private String programa;
    
    public Estudiante(){}
    
    public Estudiante(String nombre, String apellido, String fechaNaci, String correoInst, String correoPers, Long numeroCelular, Long numeroFijo, String programa){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNaci = fechaNaci;
        this.correoInst = correoInst;
        this.correoPers = correoPers;
        this.numeroCelular = numeroCelular;
        this.numeroFijo = numeroFijo;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getCorreoInst() {
        return correoInst;
    }

    public void setCorreoInst(String correoInst) {
        this.correoInst = correoInst;
    }

    public String getCorreoPers() {
        return correoPers;
    }

    public void setCorreoPers(String correoPers) {
        this.correoPers = correoPers;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public long getNumeroFijo() {
        return numeroFijo;
    }

    public void setNumeroFijo(long numeroFijo) {
        this.numeroFijo = numeroFijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
