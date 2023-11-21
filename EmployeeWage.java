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
	}
}