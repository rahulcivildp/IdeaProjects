package dayFour;

public class EmpSwitch {
    public void read() {
        final int rate = 20;
        final int is_full_time = 1;
        final int is_part_time = 2;
        int numWorkingDays = 20;
        int empTotalhrs = 0;
        int empHour = 0;
        int empWage;

        for (int i = 0; i<numWorkingDays; ++i ) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3; // 0 1 2

            switch (empCheck) {
                case is_full_time:
                    empHour = 8;
                    break;
                case is_part_time:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
                    break;
            }
            empTotalhrs += empHour;
        }
        empWage = empTotalhrs * rate;

        if ( empTotalhrs >=  80 ){
            System.out.println("Employee is eligiable for next assignment. Total work hour: " +empTotalhrs+ " Employee Salary: " + empWage);
        }else {
            System.out.println("Employee did not reach the goal. Total work hour: " +empTotalhrs+ " Employee Salary: " + empWage);
        }

    }

    public static void main(String args[])
    {
        EmpSwitch employeobj = new EmpSwitch();
        employeobj.read();
    }
}
