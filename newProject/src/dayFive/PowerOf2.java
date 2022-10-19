package dayFive;

public class PowerOf2 {

    public static void main (String args[])
    {
        int n = 1;
        int parse = Integer.parseInt(args[0]);

        if (0<=parse && parse<31){
            for(int i=0;i<parse;i++) {
                int var = 2;
                n *= var;
            }
            System.out.println("Power of 2 = "+ n ) ;
        } else {
            System.out.println("Memory out of bound") ;
        }



    }
}
