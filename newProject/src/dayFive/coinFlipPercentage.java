package dayFive;

import java.util.Random;

public class coinFlipPercentage {

    public static void flipCoin(int num_of_flips) {
        Random ran = new Random();
        int heads = 0, tails = 0;
        double headPercent, tailPercent;

        for (int i = 0; i < num_of_flips; i++) {
            int coin = ran.nextInt(2);
            if (coin == 0) {
                heads += 1;
            } else if (coin == 1) {
                tails += 1;
            }
        }

        headPercent = (double) heads/num_of_flips * 100;
        tailPercent = (double) tails/num_of_flips * 100;

        System.out.println(headPercent);
        System.out.println(tailPercent);
    }

    public static void main (String[]args){
        flipCoin(550);
    }
}
