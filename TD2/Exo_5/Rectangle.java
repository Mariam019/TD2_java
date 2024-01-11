package Exo_5;

public class Rectangle {
    int largeur;
    int longueur;

    public Rectangle(){
    }

    public Rectangle(int largeur, int longueur){
        this.largeur  = largeur;
        this.longueur  = longueur;
    }
    public Rectangle(Rectangle rectangle){
        this.largeur = rectangle.largeur;
        this.longueur = rectangle.longueur;
    }
    public int getLargeur(){
        return largeur;
    }
    public void setLargeur(int largeur){
        this.largeur = largeur;
    }

    public int getLongueur(){
        return longueur;
    }
    public void setLongueur(int longueur){
        this.longueur = longueur;
    }

    public void perimetre(int longueur,int largeur){
        int p = 2*(largeur + longueur);
        System.out.println("Le perimetre est : " +p);
    }
    public void aire(int largeur,int longueur){
        int a = largeur * longueur;
        System.out.println("L'aire est : " +a);
    }
    public  void isCarre(int largeur, int longueur){
        if(largeur == longueur){
            System.out.println("Le rectagle est carre ");
        }
        else
            System.out.println("Le rectagle n'est pas carre ");
    }

    public String toString(){
        return "Longueur du rectangle = " +longueur + " " +
                "Largeur du rectangle = " +largeur;
    }
}
