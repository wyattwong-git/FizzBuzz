package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int n) {
        int count = 0;
        if (n > 0) {
            do {
                if (n % 2 == 0) {
                    n = n /2;
                }
                else {
                    n--;
                }
                count++;
            } while (n > 0);
        }
        return count;
    }
}
