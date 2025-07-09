public class PrifixSum {
    public static void Prifixsu(int numbers[]) {                           // Optimmiz Approch
        int currentsum = 0;                                                // Time complexity = o (n2)
        int MaxSum = Integer.MIN_VALUE;
        int Prifix[] = new int[numbers.length];
        Prifix[0] = numbers[0];
        //Calculate Prifix Array
        for(int i = 1; i<Prifix.length;i++){
            Prifix[i] = Prifix[i-1] + numbers[i];
        }

        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currentsum = start == 0? Prifix[end] : Prifix[end] - Prifix[start-1];

                if (MaxSum < currentsum) {
                    MaxSum = currentsum;
                }
            }
        }
        System.out.println("Maximum Sum : "+ MaxSum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        Prifixsu(numbers);
    }
}
