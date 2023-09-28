package com.treueTechnologies;

import java.util.Scanner;

public class OnlineParkingSystem
{
	static Scanner sc = new Scanner(System.in);
	public static void start(ParkingSystem ps)
	{
		System.out.println("1. Display Available Parking Spots");
        	System.out.println("2. Book a Parking Spot");
	        System.out.println("3. Vacate a Parking Spot");
	        System.out.println("4. Exit\n");
	        
	        System.out.println("Select Your Choice :");
	        int choice = sc.nextInt();
	        switch(choice)
	        {
	        	case 1:
	        		ps.displayAvailableSlots();
	        		start(ps);
	        		break;
	        	case 2:
	        		System.out.println("Enter the spot number to book:\n");
	        		int bookSpot = sc.nextInt();
	        		ps.bookSlot(bookSpot,ps);
	        		start(ps);
	        		break;
	        	case 3: 
	        		System.out.println("Enter the spot number to vacate:\n");
	        		int vacateSpot = sc.nextInt();
	        		ps.vacateSlot(vacateSpot,ps);
	        		start(ps);
	        		break;
	        	case 4:
	        		System.out.println("Parking System Exited Successfully...\n");
	        		System.exit(0);
	        		break;
	        	default:
	        		System.out.println("Invalid Option \n Select below Options Only...\n");
	        		start(ps);
		}
	}
	public static void main(String[] args)
	{
		
		System.out.println("Enter a Total Number Parking Slots :");
		int totalSlots = sc.nextInt();
		ParkingSystem ps = new ParkingSystem(totalSlots);
		System.out.println("!!!!!!   Welcome to the Parking System   !!!!!!\n");
		start(ps);  
	}
}

