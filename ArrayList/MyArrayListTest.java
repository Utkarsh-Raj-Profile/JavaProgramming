import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListTest {
    public static void swap(ArrayList<Integer> list, int idx, int idx2) {
        int temp = list.get(idx);
        list.set(idx, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Add operation
        list.add(1);                                          //O(1)
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(1,10);                          //O(n)

        //Short array
        Collections.sort(list);                                      //assending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());          //decending order       (comparator fnx-logic)
        System.out.println(list);

        //Swap two number
        // int idx=1, idx2=3;
        // System.out.println(list);
        // swap(list,idx,idx2);
        // System.out.println(list);


        //Find Maximum                                         //O(n)
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            //or
        //     max = Math.max(max, list.get(i));
        // }
        //  System.out.println("The maximum number is "+ max);


        // System.out.println(list.size());

        // for(int i=0; i<list.size();i++){
        //     System.out.print(list.get(i)+  " ");
        // }
        // System.out.println();

        //Reverse of arraylist                             //O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Get operation                                     //O(1)

        // int element = list.get(1);
        // System.out.println(element);

        // Remove operation                                     //O(n)

        // list.remove(2);
        // System.out.println(list);

        // Set operation                                       //O(n)
        // list.set(2, 20);
        // System.out.println(list);

        // Contains operation

        // System.out.println(list.contains(5));
        // System.out.println(list.contains(11));
    }
}
