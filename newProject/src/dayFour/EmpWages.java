package dayFour;

public class EmpWages {
    public void read() {
        int is_full_time = 1;
        int rate = 20;

        int empHour = 0;
        int empWage;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == is_full_time){
            empHour = 8;
        } else {
            empHour = 0;
        }

        empWage = empHour * rate;
        System.out.println("Employee Salary: " + empWage);
    }

    public static void main(String args[])
    {
        EmpWages employeobj = new EmpWages();
        employeobj.read();
    }

}

