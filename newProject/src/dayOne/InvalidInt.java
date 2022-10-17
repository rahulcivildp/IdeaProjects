package dayOne;

public class InvalidInt {

    public static void main (String args[])
    {
        int n, cnt=0, sum=0;
        for(int i=0;i<args.length;i++)
        {
            try
            {
                n=Integer.parseInt(args[i]);
                sum= sum+n;
            }
            catch (NumberFormatException e)
            {
                cnt++;
            }
        }
        System.out.println("Sum of only valid integers is= "+sum) ;

        System.out.println("Invalid integers are: "+cnt) ;
    }

}
