package examenfinalparte1;
/**
 * Clase calcular suma de dos numeros
 * @author AdrianAbalAlonso
 */
public class Operacion {

    int resultadoSum;

    public Operacion(int numero1, int numero2) {
        resultadoSum = met(numero1, numero2);
    }

    public Operacion(int numero1) {
        resultadoSum = met(numero1, numero1);
    }

    public Operacion() {
        resultadoSum = -1;
    }

    public int met(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
