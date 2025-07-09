public class LinearSearch {
    public static int linearsearch(int numbers[] , int keys) {                  //Time Complexity =O(n);
        for(int i = 0; i<numbers.length ; i++){
            if (numbers[i] == keys) {
                return i ;
            }
            }
            return -1;
        }
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i <numbers.length ; i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value in array : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {82,100,1,2,4,8,10,12,16};
        System.out.println("largest number in the array : " + getlargest(numbers));
    //     int key = 10;
    //     int index = linearsearch(numbers, key);
    //     if (index == -1) {
    //         System.out.println("NOT FOUND");
    //     }else{
    //         System.out.println("Key is at index : " + index);
    //     }
     }
}
