import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Fecha actual
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual: " + fecha);
        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual: " + hora);
        // Fecha y hora actuales
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + fechaHora);

        // Fecha, hora y zona horaria actuales
        ZonedDateTime fechaHoraZona = ZonedDateTime.now(ZoneId.of("America/Santiago"));
        System.out.println("Fecha, hora y zona horaria actuales: " + fechaHoraZona);

        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        String fechaFormateada = fechaHora.format(formatFecha);
        System.out.println(fechaFormateada);

        LocalDateTime fecha2 = LocalDateTime.of(2023,5,3,2,5);
        if(fechaHora.isAfter(fecha2)){
            System.out.println("La fecha no es anterior");
        }
    }
}
