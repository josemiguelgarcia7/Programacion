package com.company;

public class Prendascolgadas extends CamionPerchas implements Doblar ,Devolver {
    protected int altura;
    protected int precio;
    protected String nombre;
    protected String codigoBarras;
    protected int peso;

    public Prendascolgadas(Prendascolgadas[] prendascolgadas, int altura, int precio, String nombre, String codigoBarras, int peso) {
        super(prendascolgadas);
        this.altura = altura;
        this.precio = precio;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre:" + nombre + "y precio:" + precio);
    }

    @Override
    public void doblar() {
        if (altura < 0) {
            System.out.println("La prenda" + nombre + "se puede doblar");
        } else {
            System.out.println("La prenda" + nombre + "no se puede doblar");
        }

    }
}

