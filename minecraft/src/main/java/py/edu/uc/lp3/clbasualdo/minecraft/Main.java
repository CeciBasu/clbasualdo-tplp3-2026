package py.edu.uc.lp3.clbasualdo.minecraft;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Steve", 20, 5);
        Zombie zombie = new Zombie();
        Esqueleto esqueleto = new Esqueleto();
        Creeper creeper = new Creeper();
        Aldeano aldeano = new Aldeano();
        Animal vaca = new Animal("Vaca");

        System.out.println("===== JUGADOR =====");
        jugador.mostrarInfo();
        jugador.mostrarNivel();
        jugador.atacar();
        jugador.construir();

        System.out.println("\n===== ENTIDADES HOSTILES =====");
        zombie.mostrarInfo(); zombie.atacar();
        esqueleto.mostrarInfo(); esqueleto.atacar();
        creeper.mostrarInfo(); creeper.atacar();

        System.out.println("\n===== ENTIDADES PASIVAS =====");
        aldeano.mostrarInfo(); aldeano.comerciar(); aldeano.huir();
        vaca.mostrarInfo(); vaca.comer(); vaca.huir();

        System.out.println("\n===== COMBATE =====");
        zombie.atacar();
        jugador.recibirDanio(5);
        System.out.println("¿El jugador está vivo? " + jugador.estaVivo());
    }
}
