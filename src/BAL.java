public class BAL {
    private String lettre = null;
    private static int boite = 1;

    public BAL(){}

    public synchronized void write(String lettre) {
        while (boite<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        boite--;
        this.lettre = lettre;
        notifyAll();
    }

    public synchronized String read() {
        while (boite>0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(lettre + "\n");
        String l = lettre;
        lettre = null;

        boite++;
        notifyAll();
        return l;
    }

}
