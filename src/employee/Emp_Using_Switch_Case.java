package employee;

import java.util.Random;

public class Emp_Using_Switch_Case {

	public static void main(String[] args) {
		final  int IS_PART_TIME = 1;
      final   int IS_FULL_TIME = 2;
       final int Emp_Rate_Per_Hour = 20;

        int empHrs = 0;
        int empWage = 0;
        Random R=new Random();  
        int empcheck= new Random().nextInt(0,3);
        
        switch(empcheck)
        {
            case IS_PART_TIME :
                empHrs=4;
                break;
            case IS_FULL_TIME :
                empHrs=8;
                break;
            default:
                empHrs = 0;
                break;
        }
        empWage = empHrs * Emp_Rate_Per_Hour;
        System.out.println("Emp Wage :" + empWage);
	}

}
