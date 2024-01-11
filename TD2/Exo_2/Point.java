package Exo_2;

public class Point {
    String name;
    double abscisse;
    double ordonnee;

    public Point(){

    }
    public Point(String name, double abscisse, double ordonnee){
        this.name = name;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getAbscisse(){
        return abscisse;
    }

    public void setAbscisse(double abscisse){
        this.abscisse = abscisse;
    }

    public double getOrdonnee(){
        return ordonnee;
    }

    public void setOrdonee(double ordonnee){
        this.ordonnee = ordonnee;
    }

    public void afficher()
    {
        System.out.println("Point " + this.name + " : abscisse = " + this.abscisse + "   ordonnee =  " + this.ordonnee);
    }
    public void norme(double abscisse,double ordonnee){

       double d = Math.sqrt((0-abscisse)*(0-abscisse) + (0-ordonnee)*(0-ordonnee));
       System.out.println("La distance entre l'origine et M est :" +d);

    }
}
