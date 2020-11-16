public class Main {
    public static void main(String[] args) {
        Cuadrilatero c = new Cuadrilatero();
        for (int i = 0; i < 10; i++){
            Luchador t = new Luchador(c);
            t.setName("Luchador " + i);
            t.start();
        }
    }
}
