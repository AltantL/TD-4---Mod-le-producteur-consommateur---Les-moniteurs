public class Producteur extends Thread {
    private String lettre;
    private BAL bal;

    public Producteur(BAL bal, String lettre){
        this.bal = bal;
        this.lettre = lettre;
    }

    public void run(){
        try {
            bal.write(lettre);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
