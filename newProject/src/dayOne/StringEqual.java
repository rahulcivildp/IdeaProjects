package dayOne;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if(name.equals("tanmay")) System.out.println("Password is accepted! " + name);
        else {
            System.out.println(name + " is incorrect. Please try again!!");
        }
    }
}
