package Exo_1;

public class Main {
    public static void main(String[] args) {

        //exo 1
        Point m = new Point("M", 3.5);
        m.afficher();
        m.translate(5.8);
        System.out.println("apres translation");
        m.afficher();

    }
}