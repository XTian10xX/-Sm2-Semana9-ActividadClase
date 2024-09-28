package com.example;

public class Nadador implements Atleta{
    private String nombre;
    private String tipoDeCarrera;

    public Nadador(String nombre, String tipoDeCarrera) {
        this.nombre = nombre;
        this.tipoDeCarrera = tipoDeCarrera;
    }

    @Override
    public int realizarCompetencia() {
        return (int) (Math.random() * 300);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre + "/ Tipo de Deporte: " + tipoDeCarrera);
    }


}
