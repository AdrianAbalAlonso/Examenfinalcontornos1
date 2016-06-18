package examenfinalparte1;

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
