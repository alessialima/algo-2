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
        Recordatorio[] recordatorio_new = new Recordatorio[longitud() + 1];
        for (int j = 0; j < (longitud()); j++){
            recordatorio_new[j] = obtener(j);
        }
        recordatorio_new[recordatorio_new.length-1] = i;
        this.recordatorio = recordatorio_new.clone();
    }

    public Recordatorio obtener(int i) {
        return this.recordatorio[i];
    }

    public void quitarAtras() {
    
        if (this.longitud == 0) {
           // quiero dejarlo como está 
        }
        else {
            Recordatorio[] recordatorio_new = new Recordatorio[this.longitud - 1];
            for (int j = 0; j < (this.longitud - 1); j++){
                recordatorio_new[j] = this.recordatorio[j];
            }
            this.recordatorio = recordatorio_new.clone();
        }
        
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

// consultas: 
// ver si agenda esta bien 
// CONSULTAR POR QUITAR ULTIMO Y AGREGAR !!!!!!!!!! 
