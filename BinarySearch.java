public class BinarySearch {
    public static int BinarySearch(int numbers[], int key) {                          // Time Complexity =O(log n)
        int start =0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid =(start + end ) / 2;

            //comprision
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start =mid+1;
            }else{                    // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void reverse(int numbers[]) {
        int first = 0; int last = numbers.length-1;

        while (first<last) {
            //swaps
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 10;

        // System.out.println("Index of number is : " + BinarySearch(numbers , key));
        reverse(numbers);
        //print
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
