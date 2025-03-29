package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio i; 
    private int[] array;

    public ArregloRedimensionableDeRecordatorios() {
        this.i = new Recordatorio(i);
        this.array = array;  // como defino un array wtf 
    }

    public int longitud() {
        res = array.length;
        return res;
    }

    public void agregarAtras(Recordatorio i) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array2[array2.length - 1] = i; 
        return array2;
    }

    public Recordatorio obtener(int i) {
        int pos = i;
        return array[pos];
    }

    public void quitarAtras() {
        int[] array2 = new int[array.length - 1];
        for (int i = 0; i < array2.length; i++){
            array2[i] = array[i]; 
        }
        return array2;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // no entiendo qué pide 
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
