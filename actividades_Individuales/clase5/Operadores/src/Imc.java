import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos");
        double peso = cargarDatos.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = cargarDatos.nextDouble();
        double indiceMasaCorporal = peso / (altura*altura);
        /// mayor a 30 obesidad
        if(indiceMasaCorporal >= 30){
            System.out.println(" Estas en obesidad");
        }
        /// entre 25 y 30 sobrepeso
        if(indiceMasaCorporal > 25 && indiceMasaCorporal < 30){
            System.out.println(" Estas en sobrepeso");
        }

        if(indiceMasaCorporal > 18.5 && indiceMasaCorporal < 25){
            System.out.println(" Estas en un indice normal");
        }

        if(indiceMasaCorporal < 18.6){
            System.out.println(" Estas en un idice bajo de peso");
        }
        // entre 18.5 y 25 normal
        /// menor a 18.6 delagadez
    }
}
