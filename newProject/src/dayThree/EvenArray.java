package dayThree;

public class EvenArray {

    public static void main(String[] args) {
        int arrayA[]={1,2,5,6,3,2,300,50,5000};
        evenArray(arrayA,arrayA.length);
    }
    public static int evenArray(int[] array, int total){
        int var;
        for (int i = 0; i < total; i++)
        {
            var = (i + 1) % 2;
            if (var == 0){
                System.out.println(array[i]);
            }
        }
        return array[total-1];
    }
}
