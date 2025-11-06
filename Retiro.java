public class Retiro extends Transaccion{
    private String destino;

    public Retiro(String id, double monto, String origen, String destino) {
        super(id, monto, "Retiro", origen);
        this.destino = destino;
    }

    @Override
    public boolean procesar(Cuenta cuenta) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            return true;
        } else {
            System.out.println("Saldo insuficiente para el retiro");
            return false;
        }
    }
}