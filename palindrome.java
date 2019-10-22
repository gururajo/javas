/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class palindrome {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */

    static boolean cpalindrome(int t) {
        int a[], b = t, n = 0;
        a = new int[10];
        for (int i = 0; b > 0; i++) {
            a[i] = b % 10;
            b /= 10;
            n++;
        }
        for (int i = 0; i < n / 2; i++)
            if (a[i] != a[n - i - 1])
                return false;
        return true;

    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Give any number");
        int x = sc.nextInt();
        if (cpalindrome(x))
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
    }

}
