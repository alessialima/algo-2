package aed;


class ArregloRedimensionableDeRecordatorios {
    private int longitud;
    private Recordatorio[] recordatorio;

    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorio = new Recordatorio[0];
        this.longitud = 0;
    }

    public int longitud() {
        return this.recordatorio.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] recordatorio2 = new Recordatorio[this.recordatorio.length + 1];

        for (int j = 0; j < this.recordatorio.length; j++) {
            recordatorio2[j] = this.recordatorio[j];
            
        }
        recordatorio2[recordatorio2.length - 1] = i; 
        this.longitud += 1;
        this.recordatorio = recordatorio2.clone();
    }

    public Recordatorio obtener(int i) {
        return recordatorio[i];
    }

    public void quitarAtras() {
       Recordatorio[] recordatorio_new = new Recordatorio[longitud()-1];

       for (int j=0; j<(longitud()-2); j++){
        recordatorio_new[j] = this.recordatorio[j];
       }
       this.longitud -= 1;
       this.recordatorio = recordatorio_new.clone();
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
