package org.example.Modelos;

import java.time.LocalDateTime;

public class Beneficiario {
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private LocalDateTime fechaNacimiento;
    private String relacionConAsegurado;
    private String direccion;
    private String telefono;
    private String email;
    private double porcentajeBeneficio;
    private boolean activo;

    public Beneficiario() {
    }

    public Beneficiario(String nombre, String apellido, String numeroIdentificacion, LocalDateTime fechaNacimiento, String relacionConAsegurado, String direccion, String telefono, String email, double porcentajeBeneficio, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.relacionConAsegurado = relacionConAsegurado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.activo = activo;
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

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRelacionConAsegurado() {
        return relacionConAsegurado;
    }

    public void setRelacionConAsegurado(String relacionConAsegurado) {
        this.relacionConAsegurado = relacionConAsegurado;
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

    public double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", relacionConAsegurado='" + relacionConAsegurado + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", activo=" + activo +
                '}';
    }
}
