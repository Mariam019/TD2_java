package Exo_1;

class Point{
    String nom;
    double abscisse;

    public Point(String nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void afficher()
    {
        System.out.println("Point " + this.nom + " : abscisse = " + this.abscisse);
    }
    public void translate(double dx)
    {
        this.abscisse += dx;
    }
}
