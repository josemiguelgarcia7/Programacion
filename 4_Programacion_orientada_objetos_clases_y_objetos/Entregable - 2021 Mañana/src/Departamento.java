import java.util.Arrays;

public class Departamento {

    private String Sede;
    private String Extensiontlf;
    private int ListaEmpleados;
    private Empleado[] empleados;

    public Departamento(String sede, String extensiontlf, int listaEmpleados, Empleado[] empleados) {
        Sede = sede;
        Extensiontlf = extensiontlf;
        ListaEmpleados = listaEmpleados;
        this.empleados = empleados;
    }


    public int ListaEmpleados() {
        return ListaEmpleados;
    }

    public boolean addEmpleado(Empleado e) {
        if (this.ListaEmpleados < this.empleados.length) {
            empleados=Arrays.copyOf(empleados,empleados.length+1);
            this.empleados[ListaEmpleados] = e;
            this.ListaEmpleados++;
            return true;
        } else {
            return false;
        }

    }
    public boolean deleteEmpleado(Empleado e) {
        if (this.ListaEmpleados > this.empleados.length) {
            empleados=Arrays.copyOf(empleados,empleados.length+1);
            this.empleados[ListaEmpleados] = e;
            this.ListaEmpleados--;
            return true;
        } else {
            return false;
        }

        public boolean removeEmpleado(Empleado e) {
            if (esta(elemento)) {
                int[] resultado= new int[0];
                for (int i = 0; i < this.getElementos().length; i++) {
                    if (this.getElementos()[i]!=elemento) {
                        resultado = Arrays.copyOf(resultado,resultado.length+1);
                        resultado[resultado.length-1]= this.getElementos()[i];
                    }
                }

    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    public String getExtensiontlf() {
        return Extensiontlf;
    }

    public void setExtensiontlf(String extensiontlf) {
        Extensiontlf = extensiontlf;
    }

    public int getListaEmpleados() {
        return ListaEmpleados;
    }

    public void setListaEmpleados(int listaEmpleados) {
        ListaEmpleados = listaEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "Sede='" + Sede + '\'' +
                ", Extensiontlf='" + Extensiontlf + '\'' +
                ", ListaEmpleados=" + ListaEmpleados +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}