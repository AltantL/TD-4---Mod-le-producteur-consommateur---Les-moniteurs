public class TD4 {
    public static void main(String[] args){

        BAL bal = new BAL();

        String[] listeLettres = {"lettre 1","lettre 2","lettre 3","lettre 4","lettre 5","lettre 6","lettre 7","lettre 8"};

        int nbLettres = listeLettres.length;

        Producteur[] producteur = new Producteur[nbLettres];
        Consomateur consomateur = new Consomateur(bal,nbLettres);

        consomateur.start();

        for (int i = 0; i <nbLettres; i++) {
            producteur[i] = new Producteur(bal, listeLettres[i]);
            producteur[i].start();
        }

    }
}
