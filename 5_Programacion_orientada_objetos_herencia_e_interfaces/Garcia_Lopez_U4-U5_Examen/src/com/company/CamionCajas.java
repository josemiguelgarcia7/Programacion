package com.company;

import java.util.Arrays;

public abstract class CamionCajas implements Descargar {
   protected Cajas[] cajas;
    protected Prendas[] prendas;

    public CamionCajas(Cajas[] cajas, Prendas[] prendas) {
        this.cajas = cajas;
        this.prendas = prendas;
    }

    public CamionCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }

    public Cajas[] getCajas() {
        return cajas;
    }

    public void setCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }

    public Prendas[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prendas[] prendas) {
        this.prendas = prendas;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando"+cajas+"cajas y "+prendas+ "prendas");
    }
}
