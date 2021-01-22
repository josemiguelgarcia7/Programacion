import java.util.Calendar;

public class Empleado {

    private String NombreCompleto;
    private String NumSS;
    private String Tlf;
    private Calendar Fecha;
    private String TipoEmpleado;

    public Empleado(String nombreCompleto, String numSS, String tlf, Calendar fecha, String tipoEmpleado) {
        NombreCompleto = nombreCompleto;
        NumSS = numSS;
        Tlf = tlf;
        Fecha = fecha;
        TipoEmpleado = tipoEmpleado;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public String getNumSS() {
        return NumSS;
    }

    public void setNumSS(String numSS) {
        NumSS = numSS;
    }

    public String getTlf() {
        return Tlf;
    }

    public void setTlf(String tlf) {
        Tlf = tlf;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar fecha) {
        Fecha = fecha;
    }

    public String getTipoEmpleado() {
        return TipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        TipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "NombreCompleto='" + NombreCompleto + '\'' +
                ", NumSS='" + NumSS + '\'' +
                ", Tlf='" + Tlf + '\'' +
                ", Fecha=" + Fecha +
                ", TipoEmpleado='" + TipoEmpleado + '\'' +
                '}';
    }
}
