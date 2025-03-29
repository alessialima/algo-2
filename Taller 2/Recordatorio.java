package aed;

public class Recordatorio {
    private String mensaje; 
    private Fecha fecha;
    private Horario horario; 


    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = new Mensaje(mensaje); 
        this.fecha = new Fecha(fecha);
        this.horario = new Horario(horario);
    }

    public Horario horario() {
        Horario horario2 = new Horario(horario); 
        return horario2;
    }

    public Fecha fecha() {
        Fecha fecha2 = new Fecha(fecha);
        return fecha2;
    }    

    public String mensaje() { 
        Mensaje mensaje2 = new Mensaje(mensaje);
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