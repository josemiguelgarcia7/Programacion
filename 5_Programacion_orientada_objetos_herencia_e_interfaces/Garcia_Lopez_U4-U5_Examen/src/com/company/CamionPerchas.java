package com.company;

import java.util.Arrays;

public abstract class CamionPerchas implements Descargar{
    Prendascolgadas[] prendascolgadas;


    public CamionPerchas(Prendascolgadas[] prendascolgadas) {
        this.prendascolgadas = prendascolgadas;
    }

    public Prendascolgadas[] getPrendascolgadas() {
        return prendascolgadas;
    }

    public void setPrendascolgadas(Prendascolgadas[] prendascolgadas) {
        this.prendascolgadas = prendascolgadas;
    }

    public void addPrendascolgadas(Prendascolgadas Cajas){
        prendascolgadas= Arrays.copyOf(prendascolgadas,prendascolgadas.length+1);
        prendascolgadas[prendascolgadas.length-1] = Cajas;
    }
    public void deletePrendascolgadas(String Nombre){
        Prendascolgadas [] aux = new Prendascolgadas[0];
        for (int i = 0; i < prendascolgadas.length ; i++) {
            if(!prendascolgadas [i].getNombre().equalsIgnoreCase(Nombre)){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]= prendascolgadas[i];
            }
        }
    }

    @Override
    public void descargar() {
        System.out.println("Descargando"+prendascolgadas+"prendas");
    }
}

