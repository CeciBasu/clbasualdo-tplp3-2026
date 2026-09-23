package py.edu.uc.lp3.clbasualdo.minecraft;

public abstract class Entidad {
    private String nombre;
    private int vida;

    public Entidad(String nombre, int vida) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (vida <= 0) {
            throw new IllegalArgumentException("La vida inicial debe ser mayor a 0.");
        }
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
    }

    public void recibirDanio(int danio) {
        if (danio < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo.");
        }
        vida -= danio;
        if (vida < 0) vida = 0;
    }

    /** Herramienta interna de la jerarquia: no toda entidad puede pedir esto desde afuera (un Creeper no se regenera), por eso no es público general, pero Jugador sí la necesita. */
    protected void curar(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a curar no puede ser negativa.");
        }
        vida += cantidad;
    }

    public boolean estaVivo() { return vida > 0; }

    public void moverse() {
        System.out.println(nombre + " se desplaza.");
    }

    public void desaparecer() {
        if (estaVivo()) {
            throw new IllegalStateException(nombre + " no puede desaparecer: todavía sigue vivo.");
        }
        System.out.println(nombre + " desaparece del mundo.");
    }

    /** Cada hija reacciona distinto ante el jugador; el padre no puede saber como. */
    public abstract String reaccionar();
}
