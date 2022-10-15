package dayTwo;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), reverse = 0;

        while(num != 0) {
            int remValue = num % 10;
            reverse = reverse*10 + remValue;
            num = num/10;
        }

        System.out.println("the reversed number: "+ reverse);
    }
}
