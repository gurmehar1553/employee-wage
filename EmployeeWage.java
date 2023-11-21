import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		int wagePerHr = 20;
		int fullDayHrs = 8;
		int dailyEmpWage = wagePerHr * fullDayHrs;
		int workDays = 20;
		int monthlyWage = workDays * dailyEmpWage;
		System.out.println("Monthly Employee's Wage :" + monthlyWage);
	}
}