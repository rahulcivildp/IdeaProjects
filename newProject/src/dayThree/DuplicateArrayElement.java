package dayThree;

public class DuplicateArrayElement {

    public static void main(String []args) {
        int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println("The Duplicate elements are : ");

        for (int i = 0; i < numRay.length; i++) {
            for (int j = i + 1; j < numRay.length; j++) {
                if (numRay[i] != numRay[j]) {
                    continue;
                } else {
                    System.out.println(numRay[j]);
                }
            }
        }
    }
}
