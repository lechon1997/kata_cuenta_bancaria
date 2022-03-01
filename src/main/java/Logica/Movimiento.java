package Logica;

public class Movimiento {
    private Monto monto;
    private Fecha fecha;

    public Movimiento(Monto monto, Fecha fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public Integer obtenerMonto(){
        return monto.getMonto();
    }

    public Fecha obtenerFecha() {
        return fecha;
    }

    public void mostrarInformacion(Integer balance){

    }
}
