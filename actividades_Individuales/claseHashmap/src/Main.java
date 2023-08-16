import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Float> temperaturas = new ArrayList<>();
        temperaturas.add(68F);
        temperaturas.add(70F);
        temperaturas.add(74F);
        temperaturas.add(89F);
        temperaturas.add(61F);
        temperaturas.add(65F);
       /* List<Float> resultado = new ArrayList<>();
        for (Float tempFahrenheit :temperaturas){
            Float tempCelsius = (tempFahrenheit - 32) * 0.5556f;
            resultado.add(tempCelsius);
            System.out.println(tempCelsius);
        }*/


        List<Float> resultado = temperaturas.stream().map(tempFahrenheit ->{
            Float tempCelsius = (tempFahrenheit - 32) * 0.5556f;
            return tempCelsius;
        }).toList();

        resultado.forEach(temperatura ->{
            System.out.println("La temperatura en celsius es de :"+ temperatura);
        });
    }
}