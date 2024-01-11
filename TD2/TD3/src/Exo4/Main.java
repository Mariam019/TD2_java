package Exo4;



public class Main {
    public static void main(String[] args) {
        Batiment b = new Batiment();
        Maison m = new Maison("Casablanca 2 Mars",3);
        Immeuble i = new Immeuble("CASABLANCA" , 24);
        System.out.println(b.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        b.setAdresse("Tanger");
        System.out.println(b.toString());
        m.setAdresse("Agadir");
        System.out.println(m.toString());
        i.setAdresse("Chaouen");
        System.out.println(i.toString());
    }
}
