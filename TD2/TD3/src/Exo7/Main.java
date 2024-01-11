package Exo7;


public class Main {
    public static void main(String[] args) {
        Patron patron = new Patron("idrissi" , ": malak ", 45000);
        TravailleurCommission tc = new TravailleurCommission("idrissi ", "fatima ", 40000, 3500);
        TravailleurHoraire th = new TravailleurHoraire("idrissi", "fatima" , 2000);
        System.out.println(patron.toString());
        patron.setSalaire(47000);
        System.out.println(patron.toString());
        System.out.println(tc.toString());
        tc.gains();
        System.out.println(tc.toString());
        th.gains();
    }
}
