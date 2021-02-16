package com.company;

import java.util.Arrays;

public abstract class Cajas extends CamionCajas {

    protected String id;

    public Cajas(Cajas[] cajas, Prendas[] prendas, String id) {
        super(cajas, prendas);
        this.id = id;
    }

    public Cajas(Cajas[] cajas, String id) {
        super(cajas);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addCajas(Cajas CamionCajas){
        cajas= Arrays.copyOf(cajas,cajas.length+1);
        cajas[cajas.length-1] = CamionCajas;
    }
    public void deleteCajas(String Id){
        Cajas [] aux = new Cajas[0];
        for (int i = 0; i < cajas.length ; i++) {
            if(!cajas [i].getId().equalsIgnoreCase(id)){
                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]= cajas[i];
            }
        }
    }

}
