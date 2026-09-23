package py.edu.uc.lp3.clbasualdo.minecraft;

public class Enderman extends EntidadHostil {
    public Enderman() {
        super("Enderman", 40);
    }

    @Override
    public void atacar() {
        System.out.println("El Enderman ataca al jugador al ser mirado.");
    }

    public void teletransportarse() {
        System.out.println("El Enderman se teletransporta.");
    }

    @Override
    public String reaccionar() {
        return "El Enderman se teletransporta al ser observado.";
    }
}
