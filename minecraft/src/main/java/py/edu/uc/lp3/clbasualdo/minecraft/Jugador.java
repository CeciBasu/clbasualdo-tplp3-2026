package py.edu.uc.lp3.clbasualdo.minecraft;

public class Jugador extends Entidad {
    private int nivel;
    public Jugador(String nombre, int vida, int nivel) { super(nombre, vida); this.nivel = nivel; }
    public void atacar() { System.out.println(nombre + " está atacando."); }
    public void construir() { System.out.println(nombre + " está construyendo."); }
    public void mostrarNivel() { System.out.println("Nivel: " + nivel); }
}
