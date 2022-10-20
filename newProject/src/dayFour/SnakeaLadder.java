package dayFour;

public class SnakeaLadder {
    public static void main(String[] args) {
        int player1 = 0;

        while (player1 < 100 ) {
            player1 += 1;

            int dice = (int) (Math.random() * 6);

            switch (dice) {
                case 1: {
                    System.out.println("The Dice 1 output is One");
                    break;
                }
                case 2: {
                    System.out.println("The Dice 1 output is two");
                    break;
                }
                case 3: {
                    System.out.println("The Dice 1 output is three");
                    break;
                }
                case 4: {
                    System.out.println("The Dice 1 output is four");
                    break;
                }
                case 5: {
                    System.out.println("The Dice 1 output is five");
                    break;
                }
                default: {
                    System.out.println("The Dice 1 output is six");
                    break;
                }


            }
        }
    }
}
