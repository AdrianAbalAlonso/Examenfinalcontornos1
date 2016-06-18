package examenfinalparte1;
/**
 * Clase calcular suma de dos numeros
 * @author AdrianAbalAlonso
 */
public class Operacion {

    int i;

    public Operacion(int j, int m) {
        i = met(j, m);
    }

    public Operacion(int j) {
        i = met(j, j);
    }

    public Operacion() {
        i = -1;
    }

    public int met(int x, int x1) {
        return x + x1;
    }
}
