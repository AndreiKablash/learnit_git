package by.ivramko;

import java.util.Scanner;

public class SumOfDigitsInNumber {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
    int number = sc.nextInt();

    int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
}

    public static int sumDigitsInNumber(int number) {
		int sum = 0;
        String  s =  Integer.toString(Math.abs(number)).trim();
        String[] s1 = s.split("");
        for (String value : s1) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
