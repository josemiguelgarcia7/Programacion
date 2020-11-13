package com.company;

import java.util.Scanner;

public class Ejercicio_cuatro {

    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        int cargo,dias,estado;
        System.out.println(" Introduce tu cargo: 1-Prog. Junior / 2-Prog. Senior / 3-Jefe proyecto");
        cargo= rc.nextInt();

        switch (cargo) {
            case 1:
                System.out.println("1-Programagor Junior");
                break;
            case 2:
                System.out.println("2-Programagor Senior");
                break;
            case 3:
                System.out.println("3-Jefe de proyecto");
                break;
        }
        System.out.println("Introduce cuantos días has estado visitando a clientes ");
        dias= rc.nextInt();
        System.out.println("Viajes (Dietas)"+dias+" días");

        System.out.println("Introduzca su estado civil: 1-Soltero / 2-Casado");
        estado= rc.nextInt();

        switch (estado) {

            case 1:
                System.out.println("1-Soltero");
                break;
            case 2:
                System.out.println("2-Casado");
                break;
        }

        System.out.println("--------------------------------");
        if (cargo==1 && estado==1){
            System.out.println("Sueldo base         950 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((950+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((950+(dias*30))*(0.25))+"euros"));
            System.out.println("Sueldo neto       " +((950+(dias*30))-((950+(dias*30))*(0.25)))+" euros.");
        }
        if (cargo==2 && estado==1){
            System.out.println("Sueldo base         1200 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((1200+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((1200+(dias*30))*(0.25))+"euros"));
            System.out.println("Sueldo neto       " +((1200+(dias*30))-((1200+(dias*30))*(0.25)))+" euros.");
        }
        if (cargo==3 && estado==1){
            System.out.println("Sueldo base         1600 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((1600+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((1600+(dias*30))*(0.25))+"euros"));
            System.out.println("Sueldo neto       " +((1600+(dias*30))-((1600+(dias*30))*(0.25)))+" euros.");
        }
        if (cargo==1 && estado==2){
            System.out.println("Sueldo base         950 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((950+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((950+(dias*30))*(0.20))+"euros"));
            System.out.println("Sueldo neto       " +((950+(dias*30))-((950+(dias*30))*(0.20)))+" euros.");
        }
        if (cargo==2 && estado==2){
            System.out.println("Sueldo base         1200 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((1200+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((1200+(dias*30))*(0.20))+"euros"));
            System.out.println("Sueldo neto       " +((1200+(dias*30))-((1200+(dias*30))*(0.20)))+" euros.");
        }
        if (cargo==3 && estado==2){
            System.out.println("Sueldo base         1600 euros ");
            System.out.println("Dietas ("+dias+" dias)    "+dias*30+"euros ");
            System.out.println("Sueldo bruto        "+((1600+(dias*30))+"euros"));
            System.out.println("Retención IRPF      "+(((1600+(dias*30))*(0.20))+"euros"));
            System.out.println("Sueldo neto       " +((1600+(dias*30))-((1600+(dias*30))*(0.20)))+" euros.");
        }

        System.out.println("--------------------------------");

    }
}
