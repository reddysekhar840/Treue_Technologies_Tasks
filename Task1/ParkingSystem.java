package com.treueTechnologies;

import java.util.*;

public class ParkingSystem 
{
    private List<ParkingSpot> parkingSpots;
    //OnlineParkingSystem ops = new OnlineParkingSystem();
    public ParkingSystem(int totalSpots) 
    {
    	parkingSpots = new ArrayList<>();
    	for(int i=1;i<=totalSpots;i++)
    	{
    		parkingSpots.add(new ParkingSpot(i));
    	}
    }
    
    public void displayAvailableSlots()
    {
    	System.out.println("Available Parking Spots:\n");
    	for(ParkingSpot pslot : parkingSpots)
    	{
    		if(pslot.isAvailable())
    		{
    			System.out.println("Spot "+pslot.getSpotNumber()+" ");
    		}
    	}
    	System.out.println();
    }
    
    public void bookSlot(int bs , ParkingSystem ps)
    {
    	for(ParkingSpot pslot : parkingSpots)
    	{
    		if(pslot.getSpotNumber() == bs)
    		{
    			if(pslot.isAvailable())
    			{
    				pslot.book();
        			System.out.println("Spot " + bs + " booked successfully.\n");
        			break;
    			}
    			else
    			{
    				System.out.println("Spot " + bs + " is already Booked by Others.\n");
    				break;
    			}
    		}
    	}
    	OnlineParkingSystem.start(ps);
    }
    

	public void vacateSlot(int vs,ParkingSystem ps) 
	{
		for(ParkingSpot pslot : parkingSpots)
    	{
			if(pslot.getSpotNumber() == vs)
    		{
				if(!pslot.isAvailable())
				{
					pslot.release();
					System.out.println("Spot " + vs + " Vacated successfully.\n");
				}
				else
				{
					System.out.println("Spot " + vs + " is not Booked.\n");
				}
    		}
    	}
		OnlineParkingSystem.start(ps);
	}
}