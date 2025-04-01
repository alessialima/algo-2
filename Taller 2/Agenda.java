package aed;

public class Agenda {
    private Fecha fechaActual; 
    private Recordatorio recordatorio;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        
    }

    @Override
    public String toString() {
        String res = fechaActual.toString() + "=====" + recordatorio.toString();
        return res; 
    }

    public void incrementarDia() {
        

    }

    public Fecha fechaActual() {
        // Implementar
        return null;
    }

}
