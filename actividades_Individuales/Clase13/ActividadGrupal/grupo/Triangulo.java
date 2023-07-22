public class Triangulo extends Figura {
    private float base;
    private float altura;

    private float lado1;
    private float lado2;
    private float lado3;


    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularPerimetro(float lado1, float lado2, float lado3) {
        float perimetro = (float) lado1 + lado2 + lado3;
        return perimetro;
    }

    public float area(float base, float altura){
        float area = (float) base * altura;
        return area;
    }
}