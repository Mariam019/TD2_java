package Exo3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1 , 2 );
        Centre centre = new Centre(2 , 3 , "A");
        Cercle cercle = new Cercle(2 , 3 , "B" , 3);
        point.affCoord();
        centre.affCoord();
        centre.affNom();
        cercle.affNom();
    }
}