/*
Largest palindrome product

Problem 4
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class EulerProblem4 {
    public static void main(String[] args) {
        int x;
        int maxPal = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                x = i * j;
                if (CzyPal(x)){if (x > maxPal) maxPal = x;}
            }
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + maxPal + ".");
    }

    public static boolean CzyPal(int k) {
        int a_1, a_2, a_3, a_4, a_5, a_6;

        a_1 = k % 10;
        a_2 = ((k % 100) - a_1) / 10;
        a_3 = ((k % 1000) - 10 * a_2 - a_1) / 100;
        a_4 = ((k % 10000) - 100 * a_3 - 10 * a_2 - a_1) / 1000;
        a_5 = ((k % 100000) - 1000 * a_4 - 100 * a_3 - 10 * a_2 - a_1) / 10000;
        a_6 = ((k % 1000000) - 10000 * a_5 - 1000 * a_4 - 100 * a_3 - 10 * a_2 - a_1) / 100000;


        if (k <= 99999) {
            int a = 10000 * a_1 + 1000 * a_2 + 100 * a_3 + 10 * a_4 + a_5;
            if (k == a) return true;
            else return false;
        } else { // k >= 100000
            int b = 100000 * a_1 + 10000 * a_2 + 1000 * a_3 + 100 * a_4 + 10 * a_5 + a_6;
            if (k == b) return true;
            else return false;
        }
    }
}
