public class Pato extends Ave implements Nadador{

    @Override
    public void nadar() {
        System.out.println("Mira mama puedo nadar");
    }

    @Override
    public void aletear() {
        System.out.println("Mira mama puedo aletear");
    }

    @Override
    public void planear() {
        System.out.println("Mira mama puedo planear");
    }
}
