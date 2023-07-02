package ejercicios_clase_5;

import java.util.Scanner;

public class CalculadoraDPropinas {
    public static void main(String[] args) {
        Scanner  cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta en un restaurante");
        Integer totalCuentaRestaurante = cargarDatos.nextInt();
        System.out.println("Ingrese el porcentaje de propina que desea dejar.");
        Integer porcentajePropina = cargarDatos.nextInt();
        System.out.println("Muchas gracias, este seria el monto de propina a resultado:");
        Integer totalPropinaAUtilizar = (totalCuentaRestaurante * porcentajePropina)/100;
        System.out.println(totalPropinaAUtilizar);
    }
}
