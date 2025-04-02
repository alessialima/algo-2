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
        for (int j = 0; j < longitud(); j++){
            recordatorio_new[j] = this.recordatorio[j];
        }
        recordatorio_new[recordatorio_new.length-1] = i;
        this.recordatorio = recordatorio_new.clone();
        this.longitud = recordatorio_new.length;
    }

    public Recordatorio obtener(int i) {
        return this.recordatorio[i];
    }

    public void quitarAtras() {
    
        if (longitud() == 0) {
           // quiero dejar todo como esta 
        }
        else {
            Recordatorio[] recordatorio_new = new Recordatorio[longitud() - 1];
            for (int j = 0; j < (longitud() - 1); j++){
                recordatorio_new[j] = this.recordatorio[j];
            }
            this.recordatorio = recordatorio_new.clone();
            this.longitud = recordatorio_new.length;
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
