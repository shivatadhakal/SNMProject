import java.util.ArrayList;

public class Caller {
    public static ArrayList<Integer> callers;

    public static Boolean checkCallPossibility(int from,int to){
        if(callers.get(from)==1 || callers.get(to)==1){
            return false;
        }
        return true;
    }
}
