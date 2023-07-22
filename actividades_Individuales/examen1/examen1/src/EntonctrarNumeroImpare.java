public class EntonctrarNumeroImpare {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 3; i < 1000; i += 3) {
            suma += i;
        }
        System.out.println(suma);
    }
}
