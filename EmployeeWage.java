import java.util.*;
class EmployeeWage{

	public final static int IS_FULL_TIME = 1;
	public final static int IS_PART_TIME = 2;
	public final static int WORK_DAYS_MONTH = 20;
	public final static int MAX_HRS = 100;

	public static void main(String[]args){
		int wagePerHr = 20;
		int numHrs=0;
		int maxDays =0;
		int totalHrs=0;
		
		int monthlyWage = 0;
		while(totalHrs <= MAX_HRS && maxDays <= WORK_DAYS_MONTH){
			int checkAtten = (int)Math.floor(Math.random()*10) % 3;

			switch(checkAtten){
				case 1:
					numHrs = 8;
					break;
				case 2:
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
		
		System.out.println("Monthly Employee's Wage :" + monthlyWage);
	}
}
