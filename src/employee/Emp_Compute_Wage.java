package employee;

import java.util.Random;

public class Emp_Compute_Wage {
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME = 2;
	final int Emp_Rate_Per_Hour = 20;
	final int NO_OF_WORKING_DAYS = 2;
    final int MAX_HOURS_IN_MONTH = 10;

    public  int computeEmpWage()
    {
        
     
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays =0;
        while (totalEmpHours<= MAX_HOURS_IN_MONTH  && totalWorkingDays< NO_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            Random R = new Random();
            int empcheck = new Random().nextInt(0,3);

            switch (empcheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHours += empHrs;
            System.out.println("Day#:" + totalWorkingDays + " Emp Hrs :" + empHrs);
        }
        int totalEmpWage = totalEmpHours * Emp_Rate_Per_Hour;
        System.out.println(" Total Emp Wage :" + totalEmpWage);
        return totalEmpWage;
    }

	public static void main(String[] args) {
		Emp_Compute_Wage e = new Emp_Compute_Wage();
		e.computeEmpWage();
	}

}
