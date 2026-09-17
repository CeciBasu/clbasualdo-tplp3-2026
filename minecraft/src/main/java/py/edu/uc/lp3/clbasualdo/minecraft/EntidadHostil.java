public abstract class EntidadHostil extends Entidad {
    public EntidadHostil(String nombre, int vida) { super(nombre, vida); }
    public abstract void atacar();
}
