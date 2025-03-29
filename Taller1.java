package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x * x;
        return res;
    }

    double distancia(double x, double y) {
        double res =  Math.sqrt(x*x + y*y); 
        return res;
    }

    boolean esPar(int n) {
        if (n%2==0){ 
            return true;
        }
        else {     
            return false;
        }    
    }

    boolean esBisiesto(int n) {
        if ((n%4 == 0 && n%100!=0) || (n%400==0)){ 
            return true;
        }
        else{     
            return false;
        }    
    }

    int factorialIterativo(int n) {
        int i = 1;
        int res = 1;
        while (i <= n){ 
            res = res * i;
            i += 1;
        }    
        return res;
    }

    int factorialRecursivo(int n) {
        int res = 1; 
        if (n == 0){
            return res;
        }     
        else if (n == 1){
            return res;
        }
        else {
            res = n * factorialRecursivo(n-1);
            return res;
        }
    }

    boolean esPrimo(int n) {
        int divisores = 0; 
        int i = 1; 
        if (n == 1){
            return false;
        }
        else{
            while (i <= n){
                if (n%i==0){
                    divisores += 1;
                }
                i += 1;
            }
            if (divisores == 2){
                return true;
            }
            else{
                return false;
            }
        }
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        int i = 0;
        for (i = 0; i < numeros.length; i++) {
            res += numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        int i = 0;
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado){
                res = i;
            }
        }
        return res;
    }    

    boolean tienePrimo(int[] numeros) {
        int i = 0;
        for (i = 0; i<numeros.length; i++){
            if (esPrimo(numeros[i])) {
                return true;
            }
        }
        return false;

    }

    boolean todosPares(int[] numeros) {
        int i = 0;
        for (i = 0; i < numeros.length; i++){
            if (!esPar(numeros[i])) { 
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        int i = 0;
        if (s1.length() > s2.length()) {
            return false;
        }
        else{
            for (i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
                i += 1;
            }
            return true;
        }
    }

    boolean esSufijo(String s1, String s2) {
        int i = s2.length() - 1;
        int j = s1.length() - 1;
        if (s1.length() > s2.length()) {
            return false;
        }
        else{
            while (j >= 0){
                if (s1.charAt(j) != s2.charAt(i)){
                    return false;
                }
                i -= 1;
                j -= 1;
            }
            return true;
        }
    }
}
