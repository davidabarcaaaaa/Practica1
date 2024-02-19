package mates;

public class Matematicas {


    public static double generarNumeroPiIterativo(long pasos) {

        long dentroDelCirculo = 0;
        for (long i = 0; i < pasos; i++) {
            double x = Math.random() * 2 - 1; 
            double y = Math.random() * 2 - 1; 
            if (x * x + y * y <= 1) {
                dentroDelCirculo++;
            }
        }
        return (dentroDelCirculo / (double) pasos) * 4;
    }
}
