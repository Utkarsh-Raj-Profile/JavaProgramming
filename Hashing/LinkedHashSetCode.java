import java.util.*;

public class LinkedHashSetCode {                               //O(1) but in proformance lhs < hs
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();            //maintain order
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangaluru");

        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
