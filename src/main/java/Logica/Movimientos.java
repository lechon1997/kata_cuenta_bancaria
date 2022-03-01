package Logica;

import java.util.ArrayList;
import java.util.List;

public class Movimientos {
    private List<Movimiento> movimientos;

    public Movimientos() {
        this.movimientos = new ArrayList<>();
    }

    public void agregarDeposito(Integer monto,Fecha fecha){
        Deposito deposito = new Deposito(new Monto(monto),fecha);
        movimientos.add(deposito);
    }

    public void agregarRetiro(Integer monto,Fecha fecha){
        Retiro retiro = new Retiro(new Monto(monto),fecha);
        movimientos.add(retiro);
    }

    public void listarMovimientos(){
        Integer balance = 0;
        for(Movimiento m : this.movimientos){
            balance = actulizarBalance(m,balance);
            m.mostrarInformacion(balance);
        }
    }

    private Integer actulizarBalance(Movimiento m,Integer balance){
        if(m instanceof Deposito){
            return balance += m.obtenerMonto();
        }
        //ES UN RETIRO
        return balance -= m.obtenerMonto();
    }

}
