package org.example.Modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asegurado {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private LocalDateTime fechaNacimiento;
    private String direccion;
    private String ciudad;
    private String codigoPostal;
    private String telefono;
    private String email;
    private String genero;
    private String estadoCivil;
    private String ocupacion;
    private String tipoDeSeguro;
    private double sumaAsegurada;
    private boolean tieneHistorialMedico;

    public Asegurado() {
    }

    public Asegurado(String nombre, String apellido, String numeroIdentificacion, LocalDateTime fechaNacimiento, String direccion, String ciudad, String codigoPostal, String telefono, String email, String genero, String estadoCivil, String ocupacion, String tipoDeSeguro, double sumaAsegurada, boolean tieneHistorialMedico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.tipoDeSeguro = tipoDeSeguro;
        this.sumaAsegurada = sumaAsegurada;
        this.tieneHistorialMedico = tieneHistorialMedico;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTipoDeSeguro() {
        return tipoDeSeguro;
    }

    public void setTipoDeSeguro(String tipoDeSeguro) {
        this.tipoDeSeguro = tipoDeSeguro;
    }

    public double getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(double sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public boolean isTieneHistorialMedico() {
        return tieneHistorialMedico;
    }

    public void setTieneHistorialMedico(boolean tieneHistorialMedico) {
        this.tieneHistorialMedico = tieneHistorialMedico;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", tipoDeSeguro='" + tipoDeSeguro + '\'' +
                ", sumaAsegurada=" + sumaAsegurada +
                ", tieneHistorialMedico=" + tieneHistorialMedico +
                '}';
    }
}



