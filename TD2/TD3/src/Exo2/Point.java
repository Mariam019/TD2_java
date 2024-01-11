package Exo2;

public class Point {
    public void Point (int x, int y) { this.x = x ; this.y = y ; }
    public void deplace (int dx, int dy) { x += dx ; y += dy ; }
    public void affCoord ()
    { System.out.println ("Coordonnees : " + x + " " + y) ;}
    private int x, y ;}
class PointNom extends Point {
    public void setPointNom(int x, int y, char nom) {
        Point(x, y);
        this.nom = nom;}
    public void setNom(char nom) {
        this.nom = nom;}
    public void affCoordNom() {
        System.out.print("Point de nom " + nom + " ");
        affCoord();}
    private char nom;
    public static void main(String args[]) {
        Point p = new Point();
        p.Point(1, 7);
        p.affCoord();
        PointNom pn1 = new PointNom();
        pn1.setPointNom(5, 7, 'M');
        pn1.affCoordNom();
        pn1.deplace(8, 5);
        pn1.affCoordNom();
    }
}
