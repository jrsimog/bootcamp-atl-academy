public class Main {
    public static void main(String[] args) {
        Gorrion gorrion = new Gorrion();
        PezBetta pezBetta = new PezBetta();
        gorrion.aletear();
        gorrion.planear();
        pezBetta.nadar();

        /// cosas que permite las clases astractas y las interfaces
        Ave ave = gorrion;
        Volador volador = gorrion;

        Pato pato = new Pato();
        Ave paton = pato;

    }
}