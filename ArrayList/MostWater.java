
import java.util.ArrayList;

public class MostWater {
    // public static int storewater(ArrayList<Integer> hight){
    //     int maxWater = 0;
    //     //Brut Force                    - O(n^2)
    //     for(int i=0;i<hight.size();i++){
    //         for(int j=i+1;j<hight.size();j++){
    //             int ht = Math.min(hight.get(i), hight.get(j));
    //             int width = j-i;
    //             int currwater = ht*width;
    //             maxWater = Math.max(maxWater, currwater);
    //         }
    //     }
    //     return maxWater;
    // }
    
    //2 pointer approch - O(n)
    public static int storewater(ArrayList<Integer> hight){
        int maxWater =0;
        int lp = 0;
        int rp = hight.size() - 1;

        while (lp<rp) {
            int ht = Math.min(hight.get(lp), hight.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            if (hight.get(lp) < hight.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(storewater(hight));
    }
}
