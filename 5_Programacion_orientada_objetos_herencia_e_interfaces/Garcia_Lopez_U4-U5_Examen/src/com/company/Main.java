package com.company;

public class Main {

    public static void main(String[] args) {

        Conductor c1 = new Conductor("Antonio", "Garcia", "87522102F");
        Conductor c2 = new Conductor("Pepito", "Moreno", "38722102D");

        Prendascolgadas p1 = new Prendascolgadas("1","2","4","camiseta","123","2",);

        CamionCajas c9 = new CamionCajas() {
            @Override
            public void descargar() {
                super.descargar();
            }
        }



    }
}