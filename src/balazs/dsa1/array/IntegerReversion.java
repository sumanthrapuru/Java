package balazs.dsa1.array;

public class IntegerReversion {
    public int reverse(int n) {//n>0
        int reversed = 0;
        int remainder = 0;

        while (n > 0) {
            remainder = n % 10;
            n = n / 10;
            reversed = reversed * 10 + remainder;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int reversed = new IntegerReversion().reverse(10);
        System.out.println(reversed);
    }
}
