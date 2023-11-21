import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		
		int isPresent = 1;
		double checkAtten = Math.floor(Math.random()*10) % 2;
		if(checkAtten == isPresent){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}

		int wagePerHr = 20;

		int fullDayHrs = 8;
		int dailyEmpWage = wagePerHr * fullDayHrs;
		System.out.println("Daily Employee's Wage :" + dailyEmpWage);

		int partTimeHrs = 2;
		int partTimeWage = wagePerHr * partTimeHrs;
		System.out.println("Part Time Employee's Wage :" + partTimeWage);

		int workDays = 20;

		int monthlyWage = workDays * dailyEmpWage;
		System.out.println("Monthly Employee's Wage :" + monthlyWage);

		int workHrs = fullDayHrs * workDays;
		if(workHrs > 100){
			workHrs=100;
		}
		System.out.println("Wages till condition  :" + workHrs * wagePerHr);
	}
}
