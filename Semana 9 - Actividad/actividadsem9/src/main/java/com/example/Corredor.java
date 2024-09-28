package com.example;

public class Corredor implements Atleta {
    private String nombre;
    private String tipoDeCarrera;

    public Corredor(String nombre, String tipoDeCarrera) {
        this.nombre = nombre;
        this.tipoDeCarrera = tipoDeCarrera;
    }

    @Override
    public int realizarCompetencia() {
        return (int) (Math.random() * 100);
    }

    @Override
    public void mostrarInformacion() {
       System.out.println("Atleta: " + nombre + "/ Deporte: " + tipoDeCarrera);
    }
}
