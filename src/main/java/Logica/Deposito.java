package Logica;

public class Deposito extends Movimiento{
    public Deposito(Monto monto, Fecha fecha) {
        super(monto, fecha);
    }

    public void mostrarInformacion(Integer balance){
        String _fecha = super.obtenerFecha().getFechaString();
        String _monto = super.obtenerMonto().toString();
        System.out.format("%1s %12s %12s %15s %n", new String[]{_fecha,_monto,"",balance.toString()});
    }
}

