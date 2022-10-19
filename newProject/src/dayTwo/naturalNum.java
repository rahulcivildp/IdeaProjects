package dayTwo;

import java.util.Scanner;

public class naturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();//456
        int i = 0;

        System.out.println("N: ");

        while(i < var){
            i++;
            System.out.println("+" + i);
        }
    }
}
