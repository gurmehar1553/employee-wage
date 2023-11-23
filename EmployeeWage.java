import java.util.*;
class EmployeeWage{
	public static void main(String[]args){

		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 3;

		int wagePerHr = 20;
		int numHrs;

		int checkAtten = (int)Math.floor(Math.random()*10) % 3;

		if(checkAtten == IS_FULL_TIME){
			numHrs = 8;
			System.out.println("Employee is FullTime");
		}
		else if(checkAtten == IS_PART_TIME){
			numHrs = 2;
			System.out.println("Employee is PartTime");
		}
		else{
			numHrs = 0;
			System.out.println("Employee is Absent");
		}
		
		
		int dailyEmpWage = wagePerHr * numHrs;
		System.out.println("Daily Employee's Wage :" + dailyEmpWage);
	}
}
