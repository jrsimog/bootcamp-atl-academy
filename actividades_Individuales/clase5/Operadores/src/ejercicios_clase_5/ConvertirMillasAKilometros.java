package ejercicios_clase_5;

import java.util.Scanner;

public class ConvertirMillasAKilometros {

    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas");
        Double distancia = cargarDatos.nextDouble();
        Double kilometros = redondear(distancia *  1.60934);
        System.out.println("La distancia en Kilometro es "+kilometros + " Km");
    }

    private static double redondear(double promedio) {
        return Math.floor(promedio);
    }
}
