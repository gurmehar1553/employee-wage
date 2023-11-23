import java.util.*;
class EmployeeWage{
	public static void main(String[]args){

		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 3;

		int wagePerHr = 20;
		int numHrs;
		
		int WORK_DAYS_MONTH = 20;
		int monthlyWage = 0;
		for(int i=0;i<WORK_DAYS_MONTH;i++){
			int checkAtten = (int)Math.floor(Math.random()*10) % 3;

			if(checkAtten == IS_FULL_TIME){
				numHrs = 8;
			}
			else if(checkAtten == IS_PART_TIME){
				numHrs = 2;
			}
			else{
				numHrs = 0;
			}
			int dailyEmpWage = wagePerHr * numHrs;
			monthlyWage += dailyEmpWage; 
		}
		
		System.out.println("Monthly Employee's Wage :" + monthlyWage);
	}
}
