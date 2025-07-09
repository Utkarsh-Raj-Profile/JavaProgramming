public class BintoDec {
    public static void BinetoDec(int binNum) {
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit *(int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + Mynum + " = " + decNum);
    }
    public static void DectoBin(int n) {
        int MyNum = n;
        int pow = 0;
        int BinNum = 0;

        while (n>0) {
            int rem = n % 2;
            BinNum = BinNum + (rem  * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + MyNum + " = " + BinNum);
    }
    public static void main(String args[]) {
        BinetoDec(101);
        DectoBin(5);
    }
}

