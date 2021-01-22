import java.util.Arrays;

public class Empresa {

    private String NombreEmpresa;
    private String ListaDepartamentos;
    private int listadepartamentos;
    private Departamento[] departamentos;

    public Empresa(String nombreEmpresa, String listaDepartamentos, int listadepartamentos, Departamento[] departamentos) {
        NombreEmpresa = nombreEmpresa;
        ListaDepartamentos = listaDepartamentos;
        this.listadepartamentos = listadepartamentos;
        this.departamentos = departamentos;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public String getListaDepartamentos() {
        return ListaDepartamentos;
    }

    public void setListaDepartamentos(String listaDepartamentos) {
        ListaDepartamentos = listaDepartamentos;
    }

    public int getListadepartamentos() {
        return listadepartamentos;
    }

    public void setListadepartamentos(int listadepartamentos) {
        this.listadepartamentos = listadepartamentos;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public boolean addDepartamento(Departamento d) {
        if (this.listadepartamentos< this.departamentos.length) {
            departamentos=Arrays.copyOf(departamentos,departamentos.length+1);
            this.departamentos[listadepartamentos] = d;
            this.listadepartamentos++;
            return true;
        } else {
            return false;
        }

    }
    public int listadepartamentos() {
        return listadepartamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "NombreEmpresa='" + NombreEmpresa + '\'' +
                ", ListaDepartamentos='" + ListaDepartamentos + '\'' +
                ", listadepartamentos=" + listadepartamentos +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}


