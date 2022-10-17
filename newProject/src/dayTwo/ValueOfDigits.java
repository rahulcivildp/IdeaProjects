package dayTwo;

import java.util.Scanner;

public class ValueOfDigits {

    static Scanner input = new Scanner(System.in);
    static int hundreds = 0;
    static int tens = 0;
    static int ones = 0;
    static int number;

    public static void start(){
        System.out.print("Enter a 3 digit number: ");
        ValueOfDigits vd = new ValueOfDigits();
        vd.getNumber();
    }
    public int getNumber() {
        number = input.nextInt();
        return number;
    }
    public void numIndex(){
        //Prompt user to input 3 digit number

        //Displays hundreds place digit //451
        hundreds = number / 100;
        System.out.printf("\nHundreds place digit: " + hundreds);

        //Displays tens digit
        tens = (number % 100) / 10;
        System.out.printf("\nTens place digit: " + tens);

        //Display ones digit
        ones = number % 10;
        System.out.printf("\nOnes place digit: " + ones);
    }

    public static void main(String[] args) {
        start();
        //Error if number is less or more then three digits
        if (number > 999) {
            System.out.println("\nError! Number more then 3 digits.");
        } else if (number < 100) {
            System.out.println("Error! Number less then 3 digits.");
        } else {
            ValueOfDigits vd = new ValueOfDigits();
            vd.numIndex();
        }
    }
}
