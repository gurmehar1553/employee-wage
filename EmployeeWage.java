import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		int wagePerHr = 20;

		int fullDayHrs = 8;
		int dailyEmpWage = wagePerHr * fullDayHrs;
		System.out.println("Daily Employee's Wage :" + dailyEmpWage);

		int partTimeHrs = 2;
		int partTimeWage = wagePerHr * partTimeHrs;
		System.out.println("Part Time Employee's Wage :" + partTimeWage);

		int workDays = 20;
		int workHrs = fullDayHrs * workDays;
		if(workHrs > 100){
			workHrs=100;
		}
		System.out.println("Wages till condition  :" + workHrs*wagePerHr);
	}
}