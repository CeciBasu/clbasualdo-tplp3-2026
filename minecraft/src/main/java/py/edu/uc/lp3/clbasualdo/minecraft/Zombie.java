package py.edu.uc.lp3.clbasualdo.minecraft;

public class Zombie extends EntidadHostil {
    public Zombie() { super("Zombie", 20); }
    @Override public void atacar() { System.out.println("El Zombie ataca al jugador."); }
}
