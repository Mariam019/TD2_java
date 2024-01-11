package exo_6;

public class Banque {

    private int Ncompte;
    private double solde;
    private String CIN;

    public Banque(int Ncompte, double solde, String CIN) {
        this.Ncompte = Ncompte;
        this.solde = solde;
        this.CIN = CIN;
    }

    public void deposer(double somme){
        this.solde += somme;
    }

    public void retire(double somme) {
        if (this.solde > somme) {
            this.solde -= somme;
        }
    }
    public double avoirSolde(){
        System.out.println( "Votre solde en MAD est : "  +solde);
        return solde;
    }
    public String avoirInf(){
        System.out.println("Numero de compte : " +Ncompte+
                ".Votre solde est : " +solde+
                "CIN : " +CIN);
        return "Numero de compte : " +Ncompte+
                ".Votre solde est : " +solde+
                "CIN : " +CIN;

    }
    public String toString(){
        return "Numero de compte : " +Ncompte+ " " +
                ".Votre solde est : " +solde+ " " +
                "CIN : " +CIN;
    }
}




