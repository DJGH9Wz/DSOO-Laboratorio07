// clase principal del sistema bancario
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ====== CREACIÓN DE DATOS BASE ======
        Banco banco = new Banco("Banco Andino"); // crear banco

        // crear empleado del banco
        Empleado emp = new Empleado(
                "Lucía Ramos",
                "44556677",
                "Av. Grau 205",
                "987654321",
                "EMP02"
        );
        banco.agregarEmpleado(emp);

        // crear cliente del banco
        Cliente cliente = new Cliente(
                "Diego Torres",      // nombre
                "99887766",          // DNI
                "Miraflores - Lima", // dirección
                "987123456",         // teléfono
                "CLI02"              // ID
        );
        banco.registrarCliente(cliente);

        // abrir cuenta desde el cliente
        cliente.abrirCuenta("CTA001", 1000.0, "Ahorros");
        Cuenta cuenta = cliente.buscarCuenta("CTA001");

        int opcion;

        // ====== MENÚ PRINCIPAL ======
        do {
            System.out.println("\n===============================");
            System.out.println("      SISTEMA BANCARIO");
            System.out.println("===============================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver movimientos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // mostrar saldo
                    System.out.println("\n--- SALDO DISPONIBLE ---");
                    System.out.println("Saldo actual: S/ " + cuenta.getSaldo());
                    break;

                case 2:
                    // depósito
                    System.out.println("\n--- DEPÓSITO ---");
                    System.out.print("Monto a depositar: ");
                    double montoDep = sc.nextDouble();

                    cuenta.depositar(montoDep);
                    break;

                case 3:
                    // retiro
                    System.out.println("\n--- RETIRO ---");
                    System.out.print("Monto a retirar: ");
                    double montoRet = sc.nextDouble();

                    cuenta.retirar(montoRet);
                    break;

                case 4:
                    // historial de movimientos
                    System.out.println("\n--- HISTORIAL DE MOVIMIENTOS ---");
                    List<Transaccion> movimientos = cuenta.getTransacciones();

                    if (movimientos.isEmpty()) {
                        System.out.println("Aún no hay movimientos registrados.");
                    } else {
                        for (Transaccion t : movimientos) {
                            System.out.println(t);
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nGracias por usar el Sistema Bancario del Banco Azteca. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}