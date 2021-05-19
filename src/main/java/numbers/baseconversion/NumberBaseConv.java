package numbers.baseconversion;

import java.util.Locale;
import java.util.Scanner;

public class NumberBaseConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter original number: ");
        String originalNumber = scan.next();

        System.out.print("Enter original base: ");
        int originalBase = scan.nextInt();

        // Validate originalNumber and originalBase
        validateOriginalBase(originalBase);
        validateOriginalNumber(originalBase, originalNumber);

        // To convert to new base
        System.out.print("Enter new base: ");
        int newBase = scan.nextInt();

        scan.close();

        // Conversion
        String out = convertNewBase(originalNumber, originalBase, newBase);
        System.out.println(out + " is the value of " + originalNumber + " to base " + newBase);


    }

    /**
     * Convert a new representation from one base to another
     *
     * @param originalNumber
     * @param originalBase
     * @param newBase
     * @return
     */
    private static String convertNewBase(String originalNumber, int originalBase, int newBase) {
        double val = 0;
        double decDigit = 0;
        char charDigit;

        // Looping through each digit of originalNumber from reverse
        int numberLength = originalNumber.length();
        for (int i = 0; i < numberLength; i++) {
            // get the each digit from last
            charDigit = originalNumber.toUpperCase(Locale.ROOT).charAt(numberLength - 1 - i);

            // check if digit 0 to 9
            if (Character.isDigit(charDigit)) {
                decDigit = charDigit - '0';
            } else if (Character.isLetter(charDigit)) { // check if digit is A to Z
                decDigit = charDigit - 'A' + 10;
            } else { // Double check
                System.out.println("Special character not allowed");
                System.exit(1);
            }

            val += decDigit * Math.pow(originalBase, i);
        }

        // To determine the number of digits in our new base
        int D = 1;
        for (; Math.pow(newBase, D) <= val; D++) {
        }

        // creating charArr to hold new digits
        double pwr = 0;
        char newNum[] = new char[D];
        for (int p = D - 1; p >= 0; p--) {
            // calculate the power for this power of base
            pwr = Math.pow(newBase, p);
            decDigit = Math.floor(val / pwr);
            val -= decDigit * pwr;

            // Store the digit character
            if (decDigit <= 9) {
                newNum[D - 1 - p] = (char) ('0' + (int) decDigit); // digit
            } else {
                newNum[D - 1 - p] = (char) ('A' + (int) (decDigit - 10)); // character
            }
        }


        return new String(newNum);
    }

    /**
     * Checks whether the base is between 2 to 36
     * 2 < originalBase < 36
     *
     * @param originalBase
     */
    private static void validateOriginalBase(int originalBase) {
        if (2 > originalBase || originalBase > 36) {
            System.out.println("The base number that you have entered is incorrect");
            System.exit(1); // exit(1) -> closing program with error; exit(0) -> closing with success
        }
    }

    /**
     * Validate the originalNumber along with given originalBase
     * Eg., for base 2 -> allowed numbers are 0,1
     * for base 16 -> allowed numbers are from 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
     * <p>
     * Allowed values -> 0-9 & A-Z for 36 being max (need to check)
     *
     * @param base
     * @param number
     */
    private static void validateOriginalNumber(int base, String number) {
        char charDigit;
        for (int d = 0; d < number.length(); d++) {
            charDigit = number.toUpperCase(Locale.ROOT).charAt(d); // Converting to uppercase
            if (Character.isDigit(charDigit) && (charDigit - '0') >= base) { // Check if Digit and more than base
                System.out.println("Cannot have digit " + charDigit + " in " + base);
                System.exit(1);
            } else if (Character.isLetter(charDigit) && (charDigit - 'A' + 10) >= base) { // added 10 to skip 0,1,2...9
                System.out.println("Cannot have character " + charDigit + " in " + base);
                System.exit(1);
            } else if (!Character.isDigit(charDigit) && !Character.isLetter(charDigit)) { // Skip special characters
                System.out.println("Invalid symbol is used");
                System.exit(1);
            }
        }
    }
}


// Sample input and outputs
//        Enter original number: 21
//        Enter original base: 10
//        Enter new base: 2
//        10101 is the value of 21 to base 2