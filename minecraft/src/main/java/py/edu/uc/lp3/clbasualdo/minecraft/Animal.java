package py.edu.uc.lp3.clbasualdo.minecraft;

public class Animal extends EntidadPasiva {
    public Animal(String nombre) { super(nombre, 10); }
    public void comer() { System.out.println(getNombre() + " esta comiendo."); }
    @Override public String reaccionar() { return getNombre() + " sigue comiendo, no le presta atencion al jugador.";} 
}
