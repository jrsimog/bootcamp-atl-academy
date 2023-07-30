import Figuras.Circulo;
import Figuras.FiguraGeometrica;
import Figuras.Rectangulo;
import Figuras.Triangulo;
import Sonoro.Guitarra;
import Sonoro.Piano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        triangulo.setAncho(10);
        triangulo.setAlto(5);
        float areaTotalTriangulo = triangulo.calcularArea();

        Circulo circulo = new Circulo();
        circulo.setRadio(10);
        float areaTotalcirculo = circulo.calcularArea();

        ///// APLICAR POLIMORFISMO

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(10);
        rectangulo.setAncho(10);
        float areaTotalRectangulo = rectangulo.calcularArea();

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(triangulo);
        figuras.add(circulo);
        figuras.add(rectangulo);


        Guitarra guitarra = new Guitarra();
        guitarra.tocar();
        Piano piano = new Piano();
        piano.tocar();
        for (FiguraGeometrica figura: figuras) {
            System.out.println("Area: "+figura.calcularArea()+" \n");
        }
    }
}