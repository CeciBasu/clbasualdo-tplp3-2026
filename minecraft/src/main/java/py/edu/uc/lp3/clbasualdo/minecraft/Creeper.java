public class Creeper extends EntidadHostil {
    public Creeper() { super("Creeper", 20); }
    @Override public void atacar() { System.out.println("El Creeper está a punto de explotar."); }
}
