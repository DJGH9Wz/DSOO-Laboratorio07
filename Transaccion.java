import java.time.LocalDateTime;

public abstract class Transaccion {
    protected String id;
    protected double monto;
    protected LocalDateTime fechaHora;
    protected String tipo;
    protected String origen;

    public Transaccion(String id, double monto, String tipo, String origen){
        this.id = id;
        this.monto = monto;
        this.tipo = tipo;
        this.origen = origen;
        this.fechaHora = LocalDateTime.now();
    }

    public abstract boolean procesar(Cuenta cuenta);

    @Override
    public String toString() {
        return "ID: " + id + " | Tipo: " + tipo + " | Monto: " + monto + " | Fecha: " + fechaHora + " | Origen: " + origen;
    }

}