import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		int wagePerHr = 20;
		int fullDayHrs = 8;
		int dailyEmpWage = wagePerHr * fullDayHrs;
		int workDays = 20;
		int workHrs = fullDayHrs * workDays;
		if(workHrs > 100){
			workHrs=100;
		}
		System.out.println("Wages till condition  :" + workHrs*wagePerHr);
	}
}