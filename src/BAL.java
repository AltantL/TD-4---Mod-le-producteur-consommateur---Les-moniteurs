public class BAL {
    private String lettre = "";
    private static int boite = 1;

    public BAL(){}

    public synchronized void write(String lettre) throws InterruptedException {
        while (boite<=0){
            wait();
        }
        boite--;
    }

    public synchronized void read(){
        System.out.println(lettre);

        boite++;
    }

}
