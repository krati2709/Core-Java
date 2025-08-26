package com.rays.basic;

public class SwitchDayName {
	public static void main(String[] args) {
		
		int a = 7;
		
		switch (a) {
		case 1:
			System.out.println("today is Monday");
			
			break;
			
		case 2:
			System.out.println("today is Tuesday");
			
			break;
			
		case 3:
			System.out.println("today is Wednesday");
			
			break;
			
		case 4:
			System.out.println("today is Thrusday");
			
			break;
			
		case 5:
			System.out.println("today is Friday");
			
			break;
			
		case 6:
			System.out.println("today is Saturday");
			
			break;
			
		case 7:
			System.out.println("today is Sunday");
			
			break;
			

		default:
			System.out.println("This case is not applicable");
			break;
		}
	}

}
