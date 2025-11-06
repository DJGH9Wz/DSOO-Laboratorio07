public class Titularidad {

    private Cliente cliente;
    private Cuenta cuenta;

    public Titularidad(Cliente cliente, Cuenta cuenta) {
        this.cliente = cliente;
        this.cuenta = cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titularidad [Cliente ID: " + cliente.getId() + ", Cuenta Número: " + cuenta.getNumero() + "]";
    }
}
