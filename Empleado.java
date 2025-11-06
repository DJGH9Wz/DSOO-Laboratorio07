public class Empleado extends Persona {
    private String numeroEmpleado;

    public Empleado(String nombre, String DNI, String direccion, String telefono, String numeroEmpleado) {
        super(nombre, DNI, direccion, telefono);
        this.numeroEmpleado = numeroEmpleado;
    }

    public void registrarCliente(Banco banco, Cliente cliente) {
        banco.registrarCliente(cliente);
    }

    public void crearCuenta(Banco banco, Cliente cliente, String tipo, double saldoInicial) {
        banco.crearCuenta(cliente, tipo, saldoInicial);
    }

    public void realizarDeposito(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
    }

    public void realizarRetiro(Cuenta cuenta, double monto) {
        cuenta.retirar(monto);
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
}


