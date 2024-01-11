package Exo_4;

public class Temps {
    int heures;
    int minutes;
    int secondes;
    Temps temps;

    public Temps() {
    }

    public Temps(int heures) {
        this.heures = heures;
    }
    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }
    public Temps(Temps temps){
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    public int getHeures(){
        return heures;
    }
    public void setHeures(int heures){
        this.heures = heures;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getSecondes(){
        return secondes;
    }
    public void setSecondes(int secondes){
        this.secondes = secondes;
    }

    public void ajouterH(int heures) {
        this.heures += heures;
        if (heures > 23) {
            this.heures %= 24;
        }
    }
    public void ajouterM(int minutes){
        this.minutes += minutes;
        if (minutes > 59) {
            ajouterH(minutes / 60);
            this.minutes %= 60;}
    }
    public void ajouterS(int secondes){
        this.secondes += secondes;
        if (secondes > 59) {
            ajouterM(secondes / 60);
            this.secondes %= 60;
        }
    }

    public String toString() {
        return "Exo_4.Temps : "
                 + heures +
                ": " + minutes +
                ": " + secondes ;
    }
}
