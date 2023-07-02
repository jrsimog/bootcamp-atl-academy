package ejercicios_clase_5;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdinivinaElNumero {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("### Bienvenido a nuestro juego adivina un numero entre el 1 y 100 ###");
        System.out.println("  ");
        System.out.println("  ");
        Random aleatorio = new Random(System.currentTimeMillis());
        Integer numeroAleatorio = aleatorio.nextInt(100);
        System.out.println(" Ingresa un numero del tipo entero");
        Integer numeroUser = cargarDatos.nextInt();


        if(numeroAleatorio == numeroUser){
            System.out.println(" Felicidades lo adivinaste.");
        }else{
            System.out.println(" Oh lo sentimos el numero es "+numeroAleatorio+", por favor intentalo nuevamente.");
        }

    }
}
