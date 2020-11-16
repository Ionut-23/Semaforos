import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Luchador extends Thread{

    private boolean ultimo = false;
    Cuadrilatero cuadrilatero;
    public Luchador(Cuadrilatero cuadrilatero){
        this.cuadrilatero = cuadrilatero;
    }

    @Override
    public void run() {
        try {
            cuadrilatero.addParticipante(this);
            int duracion = new Random().nextInt(10000)+1000;
            System.out.println("El luchador "+getName()+" ha entrado al combate");
            sleep(duracion);
            System.out.println("COMBATE");
            System.out.println("El luchador "+getName()+" ha perdido.");
            cuadrilatero.finalPelea(this);
        } catch (InterruptedException e) {
            Logger.getLogger(Luchador.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public synchronized void ganador(Luchador luchador) {
        if(!ultimo) {
            ultimo = true;
            System.out.println("El ganador es "+luchador.getName());
        }
    }
}
