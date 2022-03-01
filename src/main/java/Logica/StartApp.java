package Logica;

public class StartApp {
    public static void main(String[] args) {
        Account account1 = new Account();

        account1.deposito(1000,new Fecha("10/01/2021"));
        account1.deposito(2000,new Fecha("13/01/2021"));
        account1.retiro(500,new Fecha("14/01/2021"));
        account1.imprimirEstadoCuenta();
    }

}
