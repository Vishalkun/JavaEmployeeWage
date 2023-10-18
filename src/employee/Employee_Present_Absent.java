package employee;

import java.util.Random;

public class Employee_Present_Absent {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
        Random R=new Random();  
        int empcheck= new Random().nextInt(2);
        if(empcheck== IS_FULL_TIME)
        {
        	System.out.println(" Employee is Present");
        }
        else
        {
        	System.out.println("Employe is not present");
        }
	}

}
