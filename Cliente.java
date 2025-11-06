import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    private String id;
    private List<Cuenta> cuentas; 

    public Cliente(String nombre, String DNI, String direccion, String telefono, String id) {
        super(nombre, DNI, direccion, telefono);
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    public void abrirCuenta(String numero, double saldo, String tipo) {
        Cuenta cuenta = new Cuenta(numero, saldo, tipo);
        cuentas.add(cuenta);
    }

    public Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumero().equals(numero)) return c;
        }
        return null;
    }

    public void consultarCuentas() {
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }
    }

    public String getId() { return id; }
}