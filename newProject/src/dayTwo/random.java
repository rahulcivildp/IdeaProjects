package dayTwo;

public class random {

    public static void main(String[] args) {
        int fulltime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == fulltime) {
            System.out.println("Employee is working in the company");
        } else {
            System.out.println("Employee has left the company");
        }
    }
}
