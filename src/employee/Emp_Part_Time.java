package employee;

import java.util.Random;

public class Emp_Part_Time {

	public static void main(String[] args) {
		  int IS_PART_TIME = 1;
          int IS_FULL_TIME = 2;
          int Emp_Rate_Per_Hour = 20;

          int empHrs = 0;
          int empWage = 0;
          Random R=new Random();  
          int empcheck= new Random().nextInt(0,2);
          if(empcheck== IS_PART_TIME)
          {
              empHrs = 4;
          }
          else if(empcheck== IS_FULL_TIME)
          {
              empHrs = 8;
          }
          else
          {
              empHrs = 0;
          }
          empWage = empHrs * Emp_Rate_Per_Hour;
          System.out.println("Emp Wage :" + empWage);

	}

}
