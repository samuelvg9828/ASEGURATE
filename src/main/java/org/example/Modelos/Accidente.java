package org.example.Modelos;

import java.time.LocalDateTime;

public class Accidente {
    private LocalDateTime fecha;
    private String hora;
    private String lugar;
    private String descripcion;
    private String tipoVehiculoInvolucrado;
    private String numeroPlacaVehiculo;
    private String nombreConductor;
    private String numeroIdentificacionConductor;
    private String companiaAseguradora;
    private boolean hayLesionados;


    public Accidente() {
    }

    public Accidente(LocalDateTime fecha, String hora, String lugar, String descripcion, String tipoVehiculoInvolucrado, String numeroPlacaVehiculo, String nombreConductor, String numeroIdentificacionConductor, String companiaAseguradora, boolean hayLesionados) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipoVehiculoInvolucrado = tipoVehiculoInvolucrado;
        this.numeroPlacaVehiculo = numeroPlacaVehiculo;
        this.nombreConductor = nombreConductor;
        this.numeroIdentificacionConductor = numeroIdentificacionConductor;
        this.companiaAseguradora = companiaAseguradora;
        this.hayLesionados = hayLesionados;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoVehiculoInvolucrado() {
        return tipoVehiculoInvolucrado;
    }

    public void setTipoVehiculoInvolucrado(String tipoVehiculoInvolucrado) {
        this.tipoVehiculoInvolucrado = tipoVehiculoInvolucrado;
    }

    public String getNumeroPlacaVehiculo() {
        return numeroPlacaVehiculo;
    }

    public void setNumeroPlacaVehiculo(String numeroPlacaVehiculo) {
        this.numeroPlacaVehiculo = numeroPlacaVehiculo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getNumeroIdentificacionConductor() {
        return numeroIdentificacionConductor;
    }

    public void setNumeroIdentificacionConductor(String numeroIdentificacionConductor) {
        this.numeroIdentificacionConductor = numeroIdentificacionConductor;
    }

    public String getCompaniaAseguradora() {
        return companiaAseguradora;
    }

    public void setCompaniaAseguradora(String companiaAseguradora) {
        this.companiaAseguradora = companiaAseguradora;
    }

    public boolean isHayLesionados() {
        return hayLesionados;
    }

    public void setHayLesionados(boolean hayLesionados) {
        this.hayLesionados = hayLesionados;
    }


    @Override
    public String toString() {
        return "Accidente{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoVehiculoInvolucrado='" + tipoVehiculoInvolucrado + '\'' +
                ", numeroPlacaVehiculo='" + numeroPlacaVehiculo + '\'' +
                ", nombreConductor='" + nombreConductor + '\'' +
                ", numeroIdentificacionConductor='" + numeroIdentificacionConductor + '\'' +
                ", companiaAseguradora='" + companiaAseguradora + '\'' +
                ", hayLesionados=" + hayLesionados +
                '}';
    }
}

