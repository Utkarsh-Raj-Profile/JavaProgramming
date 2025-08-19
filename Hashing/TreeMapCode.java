import java.util.*;

public class TreeMapCode {                        //O(logn) due to sorting
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();          //Sorted order  //follow red black tree
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);                     //sorted based on alphabetical order
    }
}
