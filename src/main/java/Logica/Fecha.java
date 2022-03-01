package Logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDate fecha;

    public Fecha(String fechaString) {
        this.fecha = fechaStringToLocalDate(fechaString);
    }

    private LocalDate fechaStringToLocalDate(String fecha){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fecha,formateador);
    }

    public String getFechaString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }
}
