package Exo_3;

public class Livre {
    String titre;
    String auteur;
    double prix;
    int annee;
    Livre livre;

    public Livre(){

    }
    public Livre(String titre){
        this.titre = titre;
    }
    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }
    public Livre(String titre, String auteur, double prix){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }
    public Livre(String titre, String auteur, double prix, int annee){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }
    public Livre(Livre livre){
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.annee = livre.annee;
    }
public String getTitre(){
        return titre;
}
public void setTitre(String titre){
        this.titre = titre;
}
public String getAuteur(){
        return auteur;
}
public void setAuteur(String auteur){
        this.auteur = auteur;
}
public double getPrix(){
        return prix;
}
public void setPrix(double prix){
        this.prix = prix;
}

public int getAnnee(){
        return annee;
}
public void setAnnee(int annee){
        this.annee = annee;
}
public Livre getLivre(){
        return livre;
}
public void setLivre(Livre livre){
        this.livre = livre;
}
public String toString(){
        return
             "Title : " +  titre + " " +
                "Author : " +    auteur + " " +
                   "Price :" + prix + " " +
                     ".Year of publication : " + annee ;
}


}
