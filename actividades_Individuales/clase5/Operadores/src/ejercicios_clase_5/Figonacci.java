package ejercicios_clase_5;

public class Figonacci {
    public static void main(String[] args) {
        int numAnterior = 0;
        int numActual = 1;
        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            if (numActual > 4000000) {
                break;
            }
            if (numActual % 2 == 0) {
                sum += numActual;
            }
            int resultado = numAnterior + numActual;
            numAnterior = numActual;
            numActual = resultado;
        }
        System.out.println(sum);
    }
}
