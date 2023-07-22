package ejercicios_clase_5;

public class reviewIrene {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5];
        intArray[0] = 100;
        intArray[1] = 230;
        intArray[2] = 250;
        intArray[3] = 160;
        intArray[4] = 370;

        int min = intArray[0];
        int max = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            printPantalla("Elemento en el índice "+ i +": " + intArray[i]);
            if (intArray[i] < min) {
                min = intArray[i];
            }

            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        printPantalla("El número menor es: " + min + " y El número mayor es: " + max);
    }

    public static void printPantalla(String str) {
        System.out.println(str);
    }

}
