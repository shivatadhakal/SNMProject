import java.time.Clock;
import java.util.Scanner;

public class Runner {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Links :");
        int totalLinks=scan.nextInt();

        System.out.println("Enter Total Users :");
        int totalUsers=scan.nextInt();

        Call call=new Call(totalLinks,totalUsers);

        while(true){
//            System.out.println(Caller.callers[1]);
            call.checkArrivalCalls();
            call.checkProgressCalls();

            System.out.println("Current Clock="+Utility.clock++);
            Utility.pause();
            if(Utility.clock==4000){
                break;
            }
            System.out.println("The Progress Queue:");
            for (Progress progress:call.getCallsInProgress()) {
                System.out.println(progress);
            }
            System.out.println("The Arrival Queue:");
            for (Arrival arrival:call.getCallsToArrive()) {
                System.out.println(arrival);
            }
            CallCounter.getCallCounter();
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Thankyou For Simulating our Lost Call System.");
    }
}
