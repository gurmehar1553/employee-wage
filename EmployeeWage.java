import java.util.*;
class EmployeeWage{
	public static void main(String[]args){
		System.out.println("Welcome");
		int isPresent = 1;
		int checkAtten = Math.floor(Math.random()*10);
		if(checkAtten == isPresent){
			System.out.println("Present");
		}
		else{
			System.out.println("Absent");
		}
	}
}