package aed;

public class Agenda {
    private Fecha fechaActual;
    private Recordatorio recordatorio;
    private ArregloRedimensionableDeRecordatorios agenda;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.agenda = new ArregloRedimensionableDeRecordatorios(agenda);
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.agenda.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        return fechaActual.toString() + "=====" + recordatorio.toString();
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}
