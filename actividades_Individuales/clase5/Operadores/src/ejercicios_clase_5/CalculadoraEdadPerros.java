package ejercicios_clase_5;

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese la edad del perrito a calcular");
        Integer edadDelPerrito = cargarDatos.nextInt();
        System.out.println("Ingrese el tamaño, pequeño (0), mediano(1) o grande (2)");
        Integer tamanioPerro = cargarDatos.nextInt();
        System.out.println("Ingrese la edad del perrito a calcular");
        Integer resultado = edadEquivalente(edadDelPerrito, tamanioPerro);

        System.out.println("La edad del perro en años humanos es de "+ resultado);
    }
    public static Integer edadEquivalente(Integer edadDelPerro, Integer tamanioPerro) {
        Integer edad = 15;
        Integer varianteAnioMayor2 = 5;
        Integer varianteAnioMayorPerroGrande = 7;
        if(edadDelPerro == 2){
            edad = edad + 9;
        }
        if(edadDelPerro > 2 ){
            if(tamanioPerro == 2){
                edad = 24 + ( edadDelPerro - 2) * varianteAnioMayorPerroGrande;
            }else{
                edad = 24 + ( edadDelPerro - 2) * varianteAnioMayor2;
            }

        }
        return edad;
    }
}
