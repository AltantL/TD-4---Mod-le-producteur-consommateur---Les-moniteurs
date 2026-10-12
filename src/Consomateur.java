public class Consomateur extends Thread{
    private String lettre;
    private BAL bal;
    private int nblettre;

    public Consomateur(BAL bal, int nblettre){
        this.bal = bal;
        this.nblettre = nblettre;
    }

    public void run(){

        for (int i = 0; i < nblettre; i++) {
            try {
                lettre = bal.read();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
