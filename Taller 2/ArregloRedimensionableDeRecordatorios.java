package aed;

class ArregloRedimensionableDeRecordatorios {
    private int longitud;
    private Recordatorio[] recordatorio;

    public ArregloRedimensionableDeRecordatorios() {
        this.longitud = 0;
        this.recordatorio = new Recordatorio[0];
    }

    public int longitud() {
        return this.recordatorio.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] recordatorio_new = new Recordatorio[this.length + 1];
        for (int j = 0; j < recordatorio.length;j++) {
            recordatorio_new[j] = recordatorio[j];
        }
        recordatorio_new[recordatorio.length] = i;
        this.recordatorio = recordatorio_new.clone();
        this.longitud += 1;
    }

    public Recordatorio obtener(int i) {
        return recordatorio[i];
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] recordatorio2 = new Recordatorio[recordatorio.length + 1];
        for (int j = 0; j < recordatorio.length; j++) {
            recordatorio2[j] = recordatorio[j];
            
        }
        recordatorio2[recordatorio2.length] = i;
        this.longitud += 1; 
        this.recordatorio = recordatorio2.clone();
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.recordatorio[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.longitud = vector.longitud();
        this.recordatorio = vector.recordatorio.clone();
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios recordatorios_new = new ArregloRedimensionableDeRecordatorios(this);

        return recordatorios_new;
    }
}
