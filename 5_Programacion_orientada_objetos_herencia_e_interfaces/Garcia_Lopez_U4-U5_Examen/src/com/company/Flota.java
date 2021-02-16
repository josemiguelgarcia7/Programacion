package com.company;

public class Flota {
    private int matricula;
    private int carga;
    private String conductor;

    public Flota(int matricula, int carga, String conductor) {
        this.matricula = matricula;
        this.carga = carga;
        this.conductor = conductor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}
