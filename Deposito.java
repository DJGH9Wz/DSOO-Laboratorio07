public class Deposito extends Transaccion{

    public Deposito(String id, double monto, String origen) {
        super(id, monto, "Depósito", origen);
    }

    @Override
    public boolean procesar(Cuenta cuenta) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
        return true;
    }
}