import java.util.concurrent.Semaphore;

public class Cuadrilatero {
    private static final int MAX_LUCHADOR = 2;
    private final Semaphore disponible = new Semaphore(MAX_LUCHADOR,true);

    public void addParticipante(Luchador luchador) throws InterruptedException{
        disponible.acquire();
    }

    public void finalPelea(Luchador luchador){
        disponible.release();
    }

}
