package com.example.layoutsparcial.Entity;

public class Estudiante {
    private String codigo;
    private String tipoDocumento;
    private String nombre;  private String correo;

    public Estudiante(String codigo, String correo, String tipoDocumento, String nombre) {
        this.codigo = codigo;
        this.correo = correo;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
