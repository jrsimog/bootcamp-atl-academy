package Figuras;

public class Circulo implements FiguraGeometrica {
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float)Math.PI * this.getRadio() * 2;
    }
}
