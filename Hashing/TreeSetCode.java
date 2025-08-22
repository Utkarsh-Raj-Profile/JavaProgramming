import java.util.*;

public class TreeSetCode {                                  //O(logn)
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();              //sorted order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bangaluru");

        System.out.println(ts);
    }
}
