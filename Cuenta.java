import java.util.*;

public class Cuenta {
    private String numero;
    private double saldo;
    private String tipo;
    private List<Transaccion> transacciones;

    public Cuenta(String numero, double saldo, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.transacciones = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
    return transacciones;
    }

    public void depositar(double monto) {
        Deposito d = new Deposito("D" + (transacciones.size() + 1), monto, numero);
        d.procesar(this);
        transacciones.add(d);
    }

    public void retirar(double monto) {
        Retiro r = new Retiro("R" + (transacciones.size() + 1), monto, numero, "Cliente");
        if (r.procesar(this)) transacciones.add(r);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarMovimientos() {
        for (Transaccion t : transacciones) System.out.println(t);
    }

    @Override
    public String toString() {
        return "Cuenta[" + "numero='" + numero + "', saldo=" + saldo + ", tipo='" + tipo + "']";
    }
}
