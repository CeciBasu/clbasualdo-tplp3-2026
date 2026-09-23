package py.edu.uc.lp3.clbasualdo.minecraft;

public class Creeper extends EntidadHostil {
    public Creeper() { super("Creeper", 20); }
    @Override public void atacar() { System.out.println("El Creeper está a punto de explotar."); }
    @Override public String reaccionar() { return getNombre() + " se acerca silbando y está a punto de explotar.";} 
}
