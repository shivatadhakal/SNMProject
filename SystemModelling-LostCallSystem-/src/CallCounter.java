public class CallCounter {
    public static int processed=0;
    public static int completed=0;
    public static int blocked=0;
    public static int busy=0;
    public static void getCallCounter(){
        System.out.println(" Processed = "+processed+" Completed = "+completed+" Blocked = "+blocked+" Busy = "+busy);
    }

}
