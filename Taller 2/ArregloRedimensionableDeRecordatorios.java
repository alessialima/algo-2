package aed;

class ArregloRedimensionableDeRecordatorios {
    private int longitud; 
    private Recordatorio[] recordatorio;

    public ArregloRedimensionableDeRecordatorios() {
        this.longitud = 0;
        this.recordatorio = Recordatorio[0];
    }

    public int longitud() {
        longitud = this.recordatorio.length;
        return longitud;
    }

    public void agregarAtras(Recordatorio i) {
        int longitud2 = longitud();
        Recordatorio[] recordatorio_new = new Recordatorio[longitud() + 1];
        for (int j = 0; j < longitud2; j++){
            recordatorio_new[j] = this.recordatorio[j];
            longitud += 1;
        }
        recordatorio_new[longitud] = i;
    }

    public Recordatorio obtener(int i) {
        return recordatorio[i];
    }

    public void quitarAtras() {
        
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.recordatorio[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
