public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco UNSA");
        Empleado emp1 = new Empleado("Ronald", "12345678", "Av. Arequipa", "987654321", "EMP001");
        banco.agregarEmpleado(emp1);
        Cliente cli1 = new Cliente("Iván", "87654321", "Calle Lima", "999888777", "CL001");
        emp1.registrarCliente(banco, cli1);
        emp1.crearCuenta(banco, cli1, "Ahorros", 500.0);
        System.out.println("Sistema del " + banco.getNombreBanco() + " funcionando correctamente.");
    }
}
