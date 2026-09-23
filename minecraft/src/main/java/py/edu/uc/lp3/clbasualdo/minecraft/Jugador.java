package py.edu.uc.lp3.clbasualdo.minecraft;

public class Jugador extends Entidad {
    private int nivel;

    public Jugador(String nombre, int vida, int nivel) {
        super(nombre, vida);
        this.nivel = nivel;
    }

    public void atacar() { System.out.println(getNombre() + " esta atacando."); }
    public void construir() { System.out.println(getNombre() + " esta construyendo."); }
    public void mostrarNivel() { System.out.println("Nivel: " + nivel); }

    /** Regenera vida usando la herramienta protegida heredada de Entidad.*/
    public void regenerar(int cantidad) {
        curar(cantidad);
    }

    @Override public String reaccionar() {
        return getNombre() + " evalua si combatir o retroceder segun su vida restante.";
    }
}
