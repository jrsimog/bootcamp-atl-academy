public class Figura {
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularPerimetro(float lado){
        float perimetro = lado * 4;
        return perimetro;
    }
}