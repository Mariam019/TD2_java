package Exo_4;

public class Main {
    public static void main(String[] args) {

        //exo 4
        Temps t = new Temps(3, 10, 10);
        System.out.println(t.toString());
        t.ajouterH(5);
        System.out.println(t);
        t.ajouterM(180);
        System.out.println(t);
        t.ajouterS(3660);
        System.out.println(t);
    }
}
