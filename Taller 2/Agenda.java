package aed;

public class Agenda {
    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios agenda;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.agenda = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.agenda.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        return fechaActual.toString() + "\n"+ "=====\n" + agenda.toString();
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        Fecha fechaActual2= new Fecha(fechaActual);
        return fechaActual2;
    }

}
