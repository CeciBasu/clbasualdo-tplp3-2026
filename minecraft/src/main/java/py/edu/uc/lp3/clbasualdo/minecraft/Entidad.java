package py.edu.uc.lp3.clbasualdo.minecraft;

public abstract class Entidad {
    protected String nombre;
    protected int vida;

    public Entidad(String nombre, int vida) {
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
        vida -= danio;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibió " + danio + " de daño.");
    }

    public boolean estaVivo() { return vida > 0; }
}
