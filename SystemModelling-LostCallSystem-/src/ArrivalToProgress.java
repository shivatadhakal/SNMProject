import jdk.jshell.execution.Util;

public class ArrivalToProgress {
    public static Progress mapArrivalToProgress(Arrival arrival){
        int end=arrival.getLength()+ Utility.clock;
        Progress progress=new Progress(arrival.getFrom(), arrival.getTo(),end);
        return progress;
    }
}
