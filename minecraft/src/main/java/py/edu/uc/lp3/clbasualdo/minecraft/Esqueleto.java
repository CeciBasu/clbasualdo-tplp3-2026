package py.edu.uc.lp3.clbasualdo.minecraft;

public class Esqueleto extends EntidadHostil {
    public Esqueleto() { super("Esqueleto", 20); }
    public Esqueleto(String nombre, int vida) { super(nombre, vida); }
    @Override public void atacar() { System.out.println("El Esqueleto dispara una flecha."); }
}
