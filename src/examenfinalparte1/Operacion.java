package examenfinalparte1;
/**
 * Clase calcular suma de dos numeros
 * @author AdrianAbalAlonso
 */
public class Operacion {
/**
 * variable que almacena el resultado de las operaciones
 */
    int resultadoSum;
/**
 * Constructor que recibe por parametros los dos valores que queremos sumar.
 * @param numero1 Primera variable de tipo int que recibe el metodo.
 * @param numero2 Segunda variable de tipo int que recibe el metodo.
 */
    public Operacion(int numero1, int numero2) {
        resultadoSum = met(numero1, numero2);
    }
/**
 * Constructor que recibe por parametros un valor que se lo aplica 
 * al método suma para sumarse asi mismo
 * @param numero1 variable que almacena el numero que se quiere sumar a si mismo.
 */
    public Operacion(int numero1) {
        resultadoSum = met(numero1, numero1);
    }
/**
 * Constructor vacio que no recibe ninguna variable y no devuelve nada, lo unico que hace es asignarle a la variable result el valor -1
 */
    public Operacion() {
        resultadoSum = -1;
    }
/**
 * Metodo para sumar dos numeros que recibe por parametros.
 * @param numero1 variable que almacena el primer numero.
 * @param numero2 variable que almacena el segundo numero.
 * @return devuelve la suma entre numero1 y numero2.
 */
    public int met(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
