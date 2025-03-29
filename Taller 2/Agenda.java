package aed;

public class Agenda {
    private Fecha fechaActual;
    private Recordatorio recordatorio;

    public Agenda(Fecha fechaActual) {
        
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        // agrega un recordatorio (ya tengo una fucnion que agrega cosas en arreglos etc)
    }

    @Override
    public String toString() {
        // tengo una secuencia con tres recordatorios. puedo hacer to string con cada recordatorio
        // fecha actual + ===== + recordatorio 1 + recordatorio 2 + recordatorio 3 
        return "";
    }

    public void incrementarDia() {
        // llamo a la otra funcion incrementar dia pero seria con fecha actual 
    }

    public Fecha fechaActual() {
        // y este que es ??? 
    }

}
