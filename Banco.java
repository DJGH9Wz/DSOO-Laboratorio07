// clase Banco
import java.util.ArrayList;
import java.util.List;

public class Banco{

    // listas de clientes, empleados y cuentas del banco
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Cuenta> cuentas;
    private String nombreBanco;

    // constructor
    public Banco(String nombreBanco){
        this.nombreBanco = nombreBanco;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    // registrar un cliente nuevo
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    // buscar cliente por DNI
    public Cliente buscarCliente(String DNI){
        for (Cliente c : clientes){
            if (c.getDNI().equals(DNI)){
                return c;
            }
        }
        return null; // si no se encuentra
    }

    // buscar cuenta por número
    public Cuenta buscarCuenta(String numero){
        for (Cuenta c : cuentas){
            if (c.getNumero().equals(numero)){
                return c;
            }
        }
        return null;
    }

    // agregar un empleado al banco
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    // buscar empleado por su código o número
    public Empleado buscarEmpleado(String idEmpleado){
        for (Empleado e : empleados){
            if (e.getNumeroEmpleado().equals(idEmpleado)){
                return e;
            }
        }
        return null; // si no se encuentra
    }

    // iniciar sesión con usuario y clave
    public boolean iniciarSesion(String usuario, String clave){
        for (Empleado e : empleados){
            if (e.getNombre().equals(usuario) && e.getNumeroEmpleado().equals(clave)){
                return true;
            }
        }
        return false;
    }

    // agregar una cuenta a la lista del banco
    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    // crear una cuenta nueva y asignarla a un cliente
    public void crearCuenta(Cliente cliente, String tipo, double saldoInicial){
        String numero = "C" + (cuentas.size() + 1);
        Cuenta nueva = new Cuenta(numero, saldoInicial, tipo);
        cuentas.add(nueva);
        cliente.abrirCuenta(numero, saldoInicial, tipo);
        System.out.println("Cuenta creada exitosamente para " + cliente.getNombre());
    }

    // getter del nombre del banco
    public String getNombreBanco(){
        return nombreBanco;
    }

    // obtener lista de clientes
    public List<Cliente> getClientes(){
        return clientes;
    }

    // obtener lista de empleados
    public List<Empleado> getEmpleados(){
        return empleados;
    }

    // obtener lista de cuentas
    public List<Cuenta> getCuentas(){
        return cuentas;
    }
}
