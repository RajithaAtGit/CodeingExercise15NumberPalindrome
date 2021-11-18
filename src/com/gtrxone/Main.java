package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println("-1221 is Palindrome number " + isPalindrome(-1221));
        System.out.println("707 is Palindrome number " + isPalindrome(707));
        System.out.println("11212 is Palindrome number " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number <= 0) {
            number = Math.abs(number);
        }
        // number = 55 then
        int reverse = 0;
        int original = number;
        while (number > 0) {  // true  2round -> number = 0 -> number > 0 ->false
            int lastDigit = number % 10; // 55 % 10 = 5  2round -> 5 % 10 = 5
            reverse *= 10;  // 0*10 =0  2round -> 5 * 10 = 50
            reverse += lastDigit; // 0 + 5 = 5 2round ->  50 + 5 = 55
            number /= 10; // 55 /10 = 5  2round -> 5 / 10 = 0.5 -> 0
        }
        return (original == reverse);

    }
}
