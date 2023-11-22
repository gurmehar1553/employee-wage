import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		int isPresent = 1;
		double checkAtten = Math.floor(Math.random()*10) % 2;

		int wagePerHr = 20;
		int fullDayHrs = 8;

		if(checkAtten == isPresent){
			fullDayHrs = 8;
			System.out.println("Employee is Present");
		}
		else{
			fullDayHrs = 0;
			System.out.println("Employee is Absent");
		}
		
		
		int dailyEmpWage = wagePerHr * fullDayHrs;
		System.out.println("Daily Employee's Wage :" + dailyEmpWage);
	}
}
