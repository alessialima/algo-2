package aed;


class ArregloRedimensionableDeRecordatorios {
    private int longitud;
    private Recordatorio[] recordatorio;

    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorio = new Recordatorio[0];
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] recordatorio2 = new Recordatorio[recordatorio.length + 1];
        for (int j = 0; j < recordatorio.length; j++) {
            recordatorio2[j] = this.obtener(j);
        }
        recordatorio2[recordatorio2.length - 1] = i; 
        recordatorio = recordatorio2;
    }

    public Recordatorio obtener(int i) {
        return recordatorio[i];
    }

    public void quitarAtras() {
        Recordatorio[] recordatorio2 = new Recordatorio[recordatorio.length - 1];
        for (int j = 0; j < (recordatorio.length-1); j++) {
            recordatorio2[j] = this.obtener(j);
        }
        recordatorio = recordatorio2;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        recordatorio[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.recordatorio = vector.recordatorio.clone();
        this.longitud = vector.longitud;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios recordatorio_new = new ArregloRedimensionableDeRecordatorios(this);
        return recordatorio_new;
    } 
}
