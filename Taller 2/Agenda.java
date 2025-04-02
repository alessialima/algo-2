package aed;

public class Agenda {
    private final Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios agenda;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.agenda = new ArregloRedimensionableDeRecordatorios(agenda);
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.agenda.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String res = fechaActual.toString() + "\n"+ "=====\n";

        for (int i = 0; i < agenda.longitud(); i++){
            res += "\n";
            res += agenda.obtener(i).toString();
        }
        return res;
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        Fecha fechaActual2= new Fecha(fechaActual);
        return fechaActual2;
    }

}

