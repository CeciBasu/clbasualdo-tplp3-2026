public class Esqueleto extends EntidadHostil {
    public Esqueleto() { super("Esqueleto", 20); }
    @Override public void atacar() { System.out.println("El Esqueleto dispara una flecha."); }
}
