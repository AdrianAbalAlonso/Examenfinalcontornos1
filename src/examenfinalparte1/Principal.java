package examenfinalparte1;

import java.io.IOException;
/**
 * Clase Principal del proyecto
 * Crea objetos a partir de los constructores de la clase secundaria llamada Operacion y va asignando valores por parametros
 * @author AdrianAbalAlonso
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        
        Operacion obj = new Operacion(10, 20);
        int n = obj.resultadoSum;
        System.out.println("Es: " + n);
        Operacion nm = new Operacion(10);
        int m = nm.resultadoSum;
        System.out.println("Es: " + m);
        Operacion mn = new Operacion();
        int nn = mn.resultadoSum;
        System.out.println("Es: " + nn);
    }
}
