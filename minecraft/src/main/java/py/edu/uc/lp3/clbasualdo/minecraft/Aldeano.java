package py.edu.uc.lp3.clbasualdo.minecraft;

public class Aldeano extends EntidadPasiva {
    public Aldeano() { super("Aldeano", 20); }
    public void comerciar() { System.out.println("El Aldeano esta comerciando."); }
    
@Override public String reaccionar() { return getNombre() + " se asusta y corre a esconderse.";} 
}
