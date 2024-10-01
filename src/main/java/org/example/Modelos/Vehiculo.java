package org.example.Modelos;

import java.time.LocalDateTime;

public class Vehiculo {
    private String marca;
    private String modelo;
    private LocalDateTime año;
    private String numeroPlaca;
    private String color;
    private String tipo;
    private String numeroIdentificacionVehicular;
    private double kilometraje;
    private boolean asegurado;
    private String tipoDeCombustible;
    private int capacidadPasajeros;
    private String propietario;
    private LocalDateTime fechaRegistro;
    private boolean estado;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, LocalDateTime año, String numeroPlaca, String color, String tipo, String numeroIdentificacionVehicular, double kilometraje, boolean asegurado, String tipoDeCombustible, int capacidadPasajeros, String propietario, LocalDateTime fechaRegistro, boolean estado, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroPlaca = numeroPlaca;
        this.color = color;
        this.tipo = tipo;
        this.numeroIdentificacionVehicular = numeroIdentificacionVehicular;
        this.kilometraje = kilometraje;
        this.asegurado = asegurado;
        this.tipoDeCombustible = tipoDeCombustible;
        this.capacidadPasajeros = capacidadPasajeros;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getAño() {
        return año;
    }

    public void setAño(LocalDateTime año) {
        this.año = año;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroIdentificacionVehicular() {
        return numeroIdentificacionVehicular;
    }

    public void setNumeroIdentificacionVehicular(String numeroIdentificacionVehicular) {
        this.numeroIdentificacionVehicular = numeroIdentificacionVehicular;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isAsegurado() {
        return asegurado;
    }

    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", numeroPlaca='" + numeroPlaca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numeroIdentificacionVehicular='" + numeroIdentificacionVehicular + '\'' +
                ", kilometraje=" + kilometraje +
                ", asegurado=" + asegurado +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", propietario='" + propietario + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", estado=" + estado +
                ", precio=" + precio +
                '}';
    }
}
