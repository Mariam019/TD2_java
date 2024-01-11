package exo_6;

public class Main {
    public static void main(String [] args){
        Banque banque = new Banque(1,5000.75,"AB1200");

        banque.avoirInf();
        banque.avoirSolde();
        banque.deposer(500);
        banque.avoirSolde();
        banque.avoirInf();
        banque.retire(200);
        banque.avoirInf();
        banque.avoirSolde();
    }
}
