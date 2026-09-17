public class Animal extends EntidadPasiva {
    public Animal(String nombre) { super(nombre, 10); }
    public void comer() { System.out.println(nombre + " está comiendo."); }
}
