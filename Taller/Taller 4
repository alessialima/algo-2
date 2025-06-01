package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    private Nodo _raiz;
    private int _cardinal;

    private class Nodo {
        T valor;
        Nodo izq;
        Nodo der;
        Nodo padre;

        Nodo(T v) {
            valor = v;
            izq = null;
            der = null;
            padre = null;
        }

    }

    public ABB() {
        _raiz = null;
        _cardinal = 0;
    }

    public int cardinal() {
        return _cardinal;
    }

    public T minimo() {
        Nodo actual = _raiz;
        while(actual.izq != null){
            actual = actual.izq;
        }
        return actual.valor;
    }


    public T maximo() {
        Nodo actual = _raiz;
        while(actual.der != null){
            actual = actual.der;
        }
        return actual.valor;
    }

    public void insertarRecursivo(Nodo _nuevo, Nodo raiz){
        Nodo _actual = raiz;

            if (!pertenece(_nuevo.valor)){
                if(_nuevo.valor.compareTo(_actual.valor)<0){
                    if (_actual.izq == null){
                        _nuevo.padre = _actual;
                        _cardinal += 1;
                        _actual.izq = _nuevo;
                        
                    }
                    else {
                        insertarRecursivo(_nuevo, _actual.izq);
                    }
                }
                else {
                    if(_actual.der == null){
                        _nuevo.padre = _actual;
                        _cardinal += 1;
                        _actual.der = _nuevo;
                      
                    }
                    else {
                        insertarRecursivo(_nuevo, _actual.der);
                    }
                }
            }
        }             
    

    public void insertar(T elem) {
        Nodo _nuevo = new Nodo(elem);
        if (_raiz == null){
            _cardinal += 1;
            _raiz = _nuevo;
            _raiz.padre = null;
        }
        else {
            insertarRecursivo(_nuevo, _raiz);
        }
    }

    public boolean perteneceRecursivo(T elem, Nodo raiz){
        Nodo _actual = raiz;
        if (_actual == null){
            return false;
        }
       else {
            if (elem.compareTo(_actual.valor) == 0){
                return true;
            }
            else {
                if (elem.compareTo(_actual.valor)<0){
                    return perteneceRecursivo(elem, _actual.izq);
                }
                else {
                    return perteneceRecursivo(elem, _actual.der);
                }
            } 
        }
    }

    public boolean pertenece(T elem) {
        return perteneceRecursivo(elem, _raiz);
    }

    public Nodo devolverNodo(T elem, Nodo raiz) {
         Nodo _actual = raiz;
        if (_actual == null){
            return null;
        }
       else {
            if (elem.compareTo(_actual.valor) == 0){
                return _actual;
            }
            else {
                if (elem.compareTo(_actual.valor)<0){
                    return devolverNodo(elem, _actual.izq);
                }
                else {
                    return devolverNodo(elem, _actual.der);
                }
            } 
        }
    }


    public Nodo minimo_a_la_der(Nodo _actual){
        Nodo _sucesor = _actual.der;
            while (_sucesor.izq != null){
                _sucesor = _sucesor.izq;
            }
            return _sucesor;
    }


    public Nodo sucesor(T elem, Nodo _raiz){
       Nodo _actual = devolverNodo(elem,_raiz);
       if (_actual == maximo()){
        return null;
       }
       else { 
        if (_actual.der != null) {
           return  minimo_a_la_der(_actual);
        }
        else {
            Nodo papa = _actual.padre;
            while(papa != null&&_actual==papa.der){
                _actual = papa;
                papa = papa.padre;
            }
            return papa;
       }
       }
    }




    public void eliminar_raiz(T elem, Nodo _raiz){
        Nodo _actual = _raiz;
        if (_cardinal == 1){
            this._raiz = null;
            _cardinal = 0;
        } else{
                  if (devolverNodo(elem, _raiz).der != null) { 
                     Nodo sucesor = minimo_a_la_der(devolverNodo(elem,_raiz));
                     T valorSuc = sucesor.valor;
                     eliminar(valorSuc);
                     _raiz.valor = valorSuc;
                     // sucesor.padre.izq = null;
                  }
                  else {
                       _cardinal -= 1;
                       this._raiz = _actual.izq;
                       _actual.izq.padre = null;
                  }
            }
        }

    public void eliminar(T elem) {
        Nodo _actual = devolverNodo(elem, _raiz);
        
            if (_actual.valor.compareTo(_raiz.valor) == 0) {
                eliminar_raiz(elem, _raiz);
            }
            else { 
                Nodo papa = _actual.padre;
            if (_actual.der == null && _actual.izq == null){
                
                if (_actual.padre == null){
                    _raiz = null;
                    _cardinal -= 1;
                }
                else { 
                     
                    if (papa.izq == _actual){
                    _actual.padre.izq = null;
                    _cardinal -= 1;
                   } 
                   else {
                    _actual.padre.der = null;
                    _cardinal -= 1;
                }
            }
        }
            else {
               
                if (_actual.der == null){ 
                     
                    if (papa.izq == _actual){ 
                       papa.izq = _actual.izq; 
                       _actual.izq.padre = papa;
                       _cardinal -= 1;
                    }
                    else { 
                         papa.der = _actual.izq;
                         _actual.izq.padre = papa;
                         _cardinal -= 1;
                    }
                }
                else {
                    if (_actual.izq == null) { // hijo derecho
                         if (_actual.padre.izq == _actual){ // es hijo izq
                       papa.izq = _actual.der;
                       _actual.der.padre = papa;
                       _cardinal -= 1;
                    }
                    else { // es hijo der 
                         papa.der = _actual.der;
                         _actual.der.padre = papa;
                         _cardinal -= 1;
                    }
                    }
                    else { // tiene dos hijos 
                     Nodo sucesor = minimo_a_la_der(devolverNodo(elem,_raiz));
                     T valorSuc = sucesor.valor;
                     eliminar(valorSuc);
                     _actual.valor = valorSuc;
                    }
                }
            }
         }
     }

    public String toString() {
        
        
        if (_raiz == null){
            return "{}";
        }
        else {
          Iterador<T> iterar = iterador();
          T actual = iterar.siguiente();
          String res = "{";

            while (!actual.equals(maximo())){
            res += actual + ",";
            actual = iterar.siguiente();
            
        } 
        res += actual;
        res += "}";
        return res;
        }
        
    }

    private class ABB_Iterador implements Iterador<T> {
        private T actual = minimo();
        private int inicio = 0;

        public boolean haySiguiente() {
            return sucesor(actual,_raiz).valor != null;
        }

        public T siguiente() {
            T sucesor = actual;
            if (inicio == 0){
                inicio += 1;
                return minimo();
            }
            else {
                actual = sucesor(actual,_raiz).valor;
                return sucesor(sucesor,_raiz).valor;
            }
            
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
