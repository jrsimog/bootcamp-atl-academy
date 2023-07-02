package ejercicios_clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto");
        Integer precioProducto = cargarDatos.nextInt();
        System.out.println("Ingrese el descuento original del producto");
        Integer descuento = cargarDatos.nextInt();
        Integer resultado = precioProducto - (precioProducto * descuento / 100);
        System.out.println("el precio final con descuento es de "+resultado );
    }

}
