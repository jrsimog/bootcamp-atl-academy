package Figuras;

public class Triangulo implements FiguraGeometrica{

    private float alto;

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    private float ancho;

    @Override
    public float calcularArea() {
        return this.getAlto() * this.getAncho() / 2;
    }
}
