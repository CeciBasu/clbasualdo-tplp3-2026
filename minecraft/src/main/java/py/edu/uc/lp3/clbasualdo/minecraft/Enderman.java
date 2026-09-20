public class Enderman extends EntidadHostil {
    public Enderman() { super("Enderman", 40); }
    @Override public void atacar() { System.out.println("El Enderman ataca al jugador al ser mirado."); }
    public void teletransportarse() { System.out.println("El Enderman se teletransporta."); }
}