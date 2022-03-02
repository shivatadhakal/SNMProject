public class Utility {
    public static  void pause(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static int clock=1057;
}
