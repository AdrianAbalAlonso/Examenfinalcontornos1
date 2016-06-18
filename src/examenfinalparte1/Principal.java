package examenfinalparte1;

import java.io.IOException;
/**
 * Clase Principal del proyecto
 * Crea objetos a partir de los constructores de la clase secundaria llamada Operacion y va asignando valores por parametros
 * @author AdrianAbalAlonso
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        
        Operacion constructor1 = new Operacion(10, 20);
        
        int resultado1 = constructor1.resultadoSum;
        
        System.out.println("Es: " + resultado1);
        
        Operacion constructor2 = new Operacion(10);
        
        int resultado2 = constructor2.resultadoSum;
        
        System.out.println("Es: " + resultado2);
        
        Operacion constructor3 = new Operacion();
        
        int resultado3 = constructor3.resultadoSum;
        
        System.out.println("Es: " + resultado3);
        
    }
}
