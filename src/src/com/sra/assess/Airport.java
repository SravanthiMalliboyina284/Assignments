package com.sra.assess;
import java.util.*;
public class Airport 
{
	private Address address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers;
	ArrayList Empty;
	int index=0;
	public Airport() {}
	public Airport(Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		super();
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
		
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}
	public boolean addFlight(Flight flight)
	{
		if(index<flights.size())
		{
			flights.add(flight);
			return true;
		}
		return false;	
	}
	public ArrayList<Flight> searchFlightsbySourceandDestination(String Source,String Destination)
	{
		for(Flight f:flights)
		{
			if(f.getSource()==Source && f.getDestination()==Destination)
			{
					System.out.println("FlightID "+f.getId());
					System.out.println("Arrival Time "+f.getArrivalTime());
					System.out.println("Total Seats "+f.getTotalSeats());
					System.out.println("AvailabaleSeats "+f.getAvailableSeats());
					System.out.println("Fare "+f.getFare());
					System.out.println("CompanyName "+f.getCompanyName());								
			}
		}
			return Empty;
	}
	public boolean bookTicket(Traveller traveller)
	{
		if(index<travellers.size())
		{
			travellers.add(traveller);
			return true;
		}
	return false;
	}

	
}
