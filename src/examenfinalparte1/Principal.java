package examenfinalparte1;

import java.io.IOException;
/**
 * Clase Principal del proyecto
 * Crea objetos a partir de los constructores de la clase secundaria llamada Operacion y va asignando valores por parametros
 * @author AdrianAbalAlonso
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        /**
         * Crea un objeto de tipo Operacion, llamado constructor1,este recibe dos variables (10 y 20)
         * Lo que nos indica es que llama al constructor para realizar la suma con dos variables distintas (10+20)
         */
        Operacion constructor1 = new Operacion(10, 20);
        /**
         * Se declara una variable de tipo int llamada resultado1 y se le asigna la funcion resultadoSum del objeto constructor1
         */
        int resultado1 = constructor1.resultadoSum;
        /**
         * Mostramos por pantalla la variable de tipo int resultado1 con el valor adquirido en la anterior sentencia
         */
        System.out.println("Es: " + resultado1);
        /**
         * Crea un objeto de tipo Operacion, llamado constructor2, que recibe una sola variable (10)
         * Esto indica que este objeto llama al constructor que suma una variable del mismo valor que la introducida (10+10)
         */
        Operacion constructor2 = new Operacion(10);
        /**
         * Se declara una variable de tipo int llamada resultado2 y se le asigna la funcion resultadoSum del objeto constructor2
         */
        int resultado2 = constructor2.resultadoSum;
        /**
         * Mostramos por pantalla la variable de tipo int resultado2 con su nuevo valor
         */
        System.out.println("Es: " + resultado2);
        /**
         * Crea un objeto de tipo ClaseOperacion, llamado constructor3, que no recibe nada
         * Al no recibir nada, sabemos que se trata del constructor que asigna el valor -1 al resultado
         */
        Operacion constructor3 = new Operacion();
        /**
         * Se declara una variable de tipo int llamada resultado3 y se le asgina la funcion result del objeto constructor3
         */
        int resultado3 = constructor3.resultadoSum;
        /**
         * Mostramos por pantalla la variable de tipo int resultado3 con el valor adquirido de haber accedido al constructor que da -1 como valor
         */
        System.out.println("Es: " + resultado3);
        
    }
}
