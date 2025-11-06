public class Persona {

    protected String nombre;
    protected String DNI;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String DNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", DNI=" + DNI + ", Dirección=" + direccion + ", Teléfono=" + telefono + "]";
    }
}