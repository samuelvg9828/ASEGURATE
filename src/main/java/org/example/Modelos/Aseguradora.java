package org.example.Modelos;

import java.time.LocalDateTime;

public class Aseguradora {
    private String nombre;
    private String razonSocial;
    private String nit;
    private String direccion;
    private String telefono;
    private String email;
    private String paginaWeb;
    private String pais;
    private String tiposDeSeguro;
    private LocalDateTime fechaFundacion;

    public Aseguradora() {
    }

    public Aseguradora(String nombre, String razonSocial, String nit, String direccion, String telefono, String email, String paginaWeb, String pais, String tiposDeSeguro, LocalDateTime fechaFundacion) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.paginaWeb = paginaWeb;
        this.pais = pais;
        this.tiposDeSeguro = tiposDeSeguro;
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTiposDeSeguro() {
        return tiposDeSeguro;
    }

    public void setTiposDeSeguro(String tiposDeSeguro) {
        this.tiposDeSeguro = tiposDeSeguro;
    }

    public LocalDateTime getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDateTime fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", pais='" + pais + '\'' +
                ", tiposDeSeguro='" + tiposDeSeguro + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                '}';
    }
}
