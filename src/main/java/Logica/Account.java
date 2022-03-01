package Logica;

public class Account {
    private Monto monto;
    private Movimientos movimientos;

    public Account() {
        this.monto = new Monto(0);
        this.movimientos = new Movimientos();
    }

    public void deposito(Integer monto, Fecha fecha){

        if(this.monto.montoValidoDeposito(monto)){
            this.monto.sumarMonto(monto);
            this.movimientos.agregarDeposito(monto,fecha);
        }

    }

    public void retiro(Integer monto,Fecha fecha){

        if(this.monto.montoValidoRetiro(monto)){
            this.monto.restarMonto(monto);
            this.movimientos.agregarRetiro(monto,fecha);
        }
    }

    public void imprimirEstadoCuenta(){
        System.out.format("%5s %15s %15s %15s %n", new String[]{"Date","Credit","Debit","Balance"});
        this.movimientos.listarMovimientos();
    }

}
