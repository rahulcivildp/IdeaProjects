package dayFour;

public class EmpSalaryPerMonth {
    public void read() {
        int is_full_time = 1;
        int workingDays = 20;
        int rate = 20;

        int empHour = 0;
        int empWage;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == is_full_time){
            empHour = 8;
        } else {
            empHour = 0;
        }

        empWage = empHour * rate * workingDays;
        System.out.println("Employee Salary: " + empWage);
    }

    public static void main(String args[])
    {
        EmpSalaryPerMonth employeobj = new EmpSalaryPerMonth();
        employeobj.read();
    }
}
