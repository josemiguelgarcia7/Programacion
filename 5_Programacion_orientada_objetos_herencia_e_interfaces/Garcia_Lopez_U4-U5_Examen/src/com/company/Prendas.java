package com.company;

import java.util.Arrays;

public abstract class Prendas extends Cajas {

    protected int precio;
    protected String nombre;
    protected String codigoBarras;
    protected int peso;

    public Prendas(Cajas[] cajas, Prendas[] prendas, String id, int precio, String nombre, String codigoBarras, int peso) {
        super(cajas, prendas, id);
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void addPrendas(Prendas Cajas) {
        prendas = Arrays.copyOf(prendas, prendas.length + 1);
        prendas[prendas.length - 1] = Cajas;
    }

    public void deletePrendas(String nombre) {
        Prendas[] aux = new Prendas[0];
        for (int i = 0; i < prendas.length; i++) {
            if (!prendas[i].getNombre().equalsIgnoreCase(nombre)) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = prendas[i];
            }
        }
    }
}



    //"La prenda X se puede doblar" en caso de Prenda general y "La prenda X no se puede doblar" en caso de que sea PrendaColgada


