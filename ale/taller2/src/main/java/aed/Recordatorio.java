package aed;

public class Recordatorio {
    private String mensaje; 
    private Fecha fecha;
    private Horario horario; 


    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje; 
        this.fecha = fecha;
        this.horario = horario;
    }

    public Horario horario() {
        return horario;
    }

    public Fecha fecha() {
        return fecha;
    }    

    public String mensaje() { 
        return mensaje;
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
