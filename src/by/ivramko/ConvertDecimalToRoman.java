package by.ivramko;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertDecimalToRoman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mainLoop:
        while (true) {
            System.out.print("Please, select mode. If you want to convert Roman "
                    + "numbers to decimal - type 'R2D' and press enter."
                    + System.lineSeparator()
                    + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

            String mode = sc.next();
            if (mode.equalsIgnoreCase("R2D")) {
                while (true) {
                    System.out.print("Please, enter Roman number you want to convert: ");
                    String romanNumber = sc.next();
                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered invalid Roman number. "
                                + "Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number "
                            + "you want to convert: ");
                    int decimalNumber = sc.nextInt();
                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter positive integer from 1 to 100.");
                        continue;
                    }

                }

            }

            System.out.println("Please, enter 'R2D' or 'D2R.");
        }
    }


    /**
     * Converts decimal numbers to Roman.
     * <p>
     * Takes int value as a parameter. Works only with numbers from 1 to 100.
     *
     * @param number to convert to Roman.
     * @return string of Roman number.
     */

    public static String decimal2Roman(int number) {
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                stringBuilder.append(romanLiterals[i]);
            }
        }
        return stringBuilder.toString();
    }


    /**
     * Converts Roman numbers to decimal.
     * <p>
     * Takes string value with Roman number as a parameter.
     * <p>
     * At first method validates if input string could be Roman number. After method
     * uses algorithm to convert Roman numeral to decimal.
     *
     * @param romanNumber
     * @return decimal representation of Roman number
     */

    public static int roman2Decimal(String romanNumber) {
        int decimalNumber = 0;
        int number = 0;
        int previousNumber = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char x = romanNumber.charAt(i);

            switch (x) {
                case 'I':
                    previousNumber = number;
                    number = 1;
                    break;
                case 'V':
                    previousNumber = number;
                    number = 5;
                    break;
                case 'X':
                    previousNumber = number;
                    number = 10;
                    break;
                case 'L':
                    previousNumber = number;
                    number = 50;
                    break;
                case 'C':
                    previousNumber = number;
                    number = 100;
                    break;
            }

            if (number < previousNumber) {
                decimalNumber = decimalNumber - number;
            } else {
                decimalNumber = decimalNumber + number;
            }
        }

        return decimalNumber;
    }


    /**
     * Validation for Roman numbers.
     * <p>
     * Use regular expression which is checking if string really could be Roman
     * number.
     *
     * @param romanNumber
     * @return true if String is Roman number
     */
    public static boolean isRomanNumberValid(String romanNumber) {
        String regex = "^C?(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(romanNumber);
        return matcher.find();
    }

    public static boolean isDecimalNumberValid(int decimalNumber) {
        boolean isValid = false;
        if (decimalNumber > 0 && decimalNumber <= 100) {
            isValid = true;
        }
        return isValid;
    }
}