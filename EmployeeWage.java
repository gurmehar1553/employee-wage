import java.util.*;
class EmployeeWage{

	public final static int IS_FULL_TIME = 1;
	public final static int IS_PART_TIME = 2;

	public static int empWageCompany(String company,int WORK_DAYS_MONTH,int MAX_HRS,int wagePerHr){
		int numHrs=0;
		int maxDays =0;
		int totalHrs=0;
		int monthlyWage = 0;
		while(totalHrs <= MAX_HRS && maxDays <= WORK_DAYS_MONTH){
			int checkAtten = (int)Math.floor(Math.random()*10) % 3;

			switch(checkAtten){
				case IS_FULL_TIME:
					numHrs = 8;
					break;
				case IS_PART_TIME:
					numHrs = 2;
					break;
				default:
					numHrs = 0;
			}

			totalHrs += numHrs;
			int dailyEmpWage = wagePerHr * numHrs;
			monthlyWage += dailyEmpWage;
			maxDays++;
		}
		return monthlyWage;
	}
	public static void main(String[]args){
		int empWage = empWageCompany("DMart",20,100,8);
		System.out.println("Monthly Employee's Wage :" + empWage);
	}
}
