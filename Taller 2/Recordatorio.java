package aed;

public class Recordatorio {
    private String mensaje; 
    private Fecha fecha;
    private Horario horario; 


    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = new String(mensaje); 
        this.fecha = new Fecha(fecha);
        this.horario = horario; // consultar si esta bien que horario este asi . de otro modo aparecia error 
    }

    public Horario horario() {
        return horario;
    }

    public Fecha fecha() {
        Fecha fecha2 = new Fecha(fecha);
        return fecha2;
    }    

    public String mensaje() { 
        String mensaje2 = new String(mensaje);
        return mensaje2;
    }

    @Override
    public String toString() {
        String res = mensaje + "@" + fecha.toString() + horario.toString();
        return res;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otraIsNull = (otro == null);
        boolean claseDistinta = otro.getClass() != this.getClass();

        if (otraIsNull || claseDistinta) return false; 

        String otroMensaje = (String) otro;

        return (fecha.equals(fecha) && horario.equals(horario) && (mensaje == otroMensaje));
        
    }

}
