package py.edu.uc.lp3.clbasualdo.minecraft;

public abstract class EntidadPasiva extends Entidad {
    public EntidadPasiva(String nombre, int vida) { super(nombre, vida); }
    public void huir() { System.out.println(nombre + " está huyendo."); }
}
