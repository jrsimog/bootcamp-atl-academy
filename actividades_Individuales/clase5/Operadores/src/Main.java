import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese una edad por favor");
        Integer edad = cargaDeDatos.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }

    }
}