import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Cuenta> cuentas;
    private String nombreBanco;

    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String DNI) {
        for (Cliente c : clientes) {
            if (c.getDNI().equals(DNI)) {
                return c;
            }
        }
        return null;
    }

    public Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public boolean iniciarSesion(String usuario, String clave) {
        for (Empleado e : empleados) {
            if (e.getNombre().equals(usuario) && e.getNumeroEmpleado().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void crearCuenta(Cliente cliente, String tipo, double saldoInicial) {
    String numero = "C" + (cuentas.size() + 1);
    Cuenta nueva = new Cuenta(numero, saldoInicial, tipo);
    cuentas.add(nueva);
    cliente.abrirCuenta(numero, saldoInicial, tipo);
    System.out.println("Cuenta creada exitosamente para " + cliente.getNombre());
}

    public String getNombreBanco() {
        return nombreBanco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
}
