package Logica;

public class Monto {
    private Integer monto;

    public Monto(Integer monto) {
        this.monto = monto;
    }

    public boolean montoValidoDeposito(Integer monto){
        if(monto > 0){
            return true;
        }
        return false;
    }

    public boolean montoValidoRetiro(Integer monto){
        if(monto > 0 || monto >= this.monto){
            return true;
        }
        return false;
    }

    public void sumarMonto(Integer monto){
        this.monto += monto;
    }

    public void restarMonto(Integer monto){
        this.monto -= monto;
    }

    public Integer getMonto(){
        return this.monto;
    }
}
