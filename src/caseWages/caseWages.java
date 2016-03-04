package caseWages;

import java.util.Scanner;

public class caseWages {

	public static void main(String[] args) {
			
		String workerName;
		double hours;
		double wages;
		double income;
		double otHours;
		double otWage;
		double monthly;
		double yearly;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What is you name?");
		workerName = scan.nextLine();
			
		switch(workerName){
			case"worker a":
				hours =(34);
				wages = (17.24);
				break;
			case"worker b":
				hours = (47);
				wages = (23.43);
				break;
			default:
				System.out.println(workerName + " is not a registered worker");
				hours = 0;
				wages = 0;
				break;
		}
		
		
		if(hours > 40){
			otHours =(hours - 40);
			otWage = (wages * 1.5);
			income = (otHours * otWage) + (wages*40);
		}else{		
			income = wages*hours;
		}
			monthly = income * 4;
			yearly = monthly * 12;
		
			System.out.printf("Your weekly income is: $" + Math.round(income*100.0) / 100.0);
			System.out.println();
			System.out.printf("Your monthly income is: $" + "%.2f", monthly);
			System.out.println();
			System.out.printf("Your yearly income is: " + "%.2f", yearly);
			System.out.println();
			
			if(yearly > 100000){
				System.out.println("Great job working hard! You are a successful American citizen!");
			}else if(100000 > yearly & yearly > 50000){
				System.out.println("Great, you have made between $50k and $100k this year.");
			}else if(50000 > yearly & yearly > 30000){
				System.out.println("You have made between $30k and $50k this year. Not too bad.");
			}else if(30000 > yearly & yearly > 20000){
				System.out.println("$20k - $30k...You're scraping along...lets try to get it together here.");
			}else{
				System.out.println("Less than $20k...keep tryin', you'll get there.");
			}
			}
		 
		
	}


