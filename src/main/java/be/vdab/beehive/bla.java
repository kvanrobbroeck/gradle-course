package be.vdab.beehive;

public class bla {
    public static void main(String[] args) {
        int i = 0;
        try {
            while (true) {
                System.out.println(i);
                if(i++ >= 100) {
                    throw new Throwable("DONE");
                }
            }
        } catch(Throwable t) {
            System.out.println("Continue");
        }
    }
}
