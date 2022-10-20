package dayThree;

public class largestElement {

    public static void main(String[] args) {
        int arrayA[]={1,2,5,6,3,2,300,50,5000};
        int arrayB[]={44,66,99,77,33,22,55};
        System.out.println("Largest: "+caculateLargestNum(arrayA,arrayA.length));
        System.out.println("Largest: "+caculateLargestNum(arrayB,arrayB.length));
    }

    public static int caculateLargestNum(int[] array, int total){
        int cal;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (array[i] >array[j]) {
                    cal =array[i];
                    array[i] = array[j];
                    array[j] = cal;
                }
            }
        }
        return array[total-1];
    }

}