package EjerciciosClase7;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        int[] numerosUser= new int[5];
        int contador = 0;

        while (contador < numerosUser.length){
            System.out.print("Ingresa un numero:");
            numerosUser[contador] = cargarDatos.nextInt();
            contador++;
        }
        System.out.print(numerosUser);

    }
}
