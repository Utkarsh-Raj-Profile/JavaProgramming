public class PrintPairs {
    public static void PrintPair(int numbers[]) {
        int tp = 0;
        for(int i =0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
    public static void PrintSubbArray(int numbers[]) {
        //int ts=0;
        int currentsum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentsum = 0;
                for(int k =start;k<=end;k++){
                    //System.out.print(numbers[k] + " ");
                    currentsum+= numbers[k];                              // MaxSum Brutforce
                }                                                         // Time Complixity = O(n3)
                System.out.println(currentsum);
                //ts++;
                if (MaxSum<currentsum) {
                    MaxSum=currentsum;
                }
            }
        }
        //System.out.println("Total SubArrays :" + ts);
        System.out.println("Maximum Sum : " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        //PrintPair(numbers);
        //PrintSubbArray(numbers);
        PrintSubbArray(numbers);
    }
}
