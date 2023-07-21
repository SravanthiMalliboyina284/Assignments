import java.time.LocalDate;
import java.util.ArrayList;

import com.sra.assess.Address;
import com.sra.assess.Airport;
import com.sra.assess.Flight;
import com.sra.assess.Traveller;

public class AirportMain {

	public static void main(String[] args)
	{
		Flight f1=new Flight("abc11","visakhapatnam","New Delhi",7650,50,26,"8.30AM","12.30AM","Airbus");
		Flight f2=new Flight("abc12","visakhapatnam","Hyderabad",2000,50,29,"10.30AM","12.30AM","Airbus");
		Flight f3=new Flight("abc13","visakhapatnam","Bangalore",3000,50,22,"9.30AM","12.30AM","Indigo");
		Flight f4=new Flight("abc12","visakhapatnam","kolkata",4650,50,26,"8.30AM","12.30AM","Airbus");
		Flight f5=new Flight("abc14","visakhapatnam","Mumbai",3650,50,29,"8.30AM","12.30AM","Indigo");
		Flight f6=new Flight("abc12","visakhapatnam","kolkata",4690,50,26,"11.30AM","12.30AM","Airbus");

		
		ArrayList<Flight> flights=new ArrayList<>();
		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		flights.add(f4);
		flights.add(f6);
			
		Traveller t1=new Traveller("Sravanthi","7688644399","sravanthi@gmail.com","abc12",LocalDate.now());
		Traveller t2=new Traveller("Sravani","7688678399","Sravani@gmail.com","abc13",LocalDate.now());
		Traveller t3=new Traveller("Saranya","7688984399","saranya@gmail.com","abc12",LocalDate.now());
		Traveller t4=new Traveller("samhitha","7688844399","samhitha@gmail.com","abc14",LocalDate.now());
		
		ArrayList<Traveller> tl=new ArrayList<>();
		tl.add(t1);
		tl.add(t2);
		tl.add(t3);
		
		Airport ap=new Airport(new Address("rajiv gandhi street","Hyderbad","Telangana"),flights,tl);
		System.out.println(ap.addFlight(f5));
		System.out.println(ap.bookTicket(t4));
		ap.searchFlightsbySourceandDestination("visakhapatnam","kolkata");
				
		
	}

}
