package examenfinalparte1;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        Operacion obj = new Operacion(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        Operacion nm = new Operacion(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        Operacion mn = new Operacion();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
