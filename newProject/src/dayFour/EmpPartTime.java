package dayFour;

public class EmpPartTime {
    public void read() {
        int is_full_time = 1;
        int is_part_time = 2;
        int rate = 20;

        int empHour = 0;
        int empWage;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == is_full_time){
            empHour = 8;
        } else if (empCheck == is_part_time) {
            empHour = 4;
        } else {
            empHour = 0;
        }

        empWage = empHour * rate;
        System.out.println("Employee Salary: " + empWage);
    }

    public static void main(String args[])
    {
        EmpPartTime employeobj = new EmpPartTime();
        employeobj.read();
    }
}
