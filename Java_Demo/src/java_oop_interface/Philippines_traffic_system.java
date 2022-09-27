package java_oop_interface;


// When you implements interface, bodyless method will be added to the child class
// interface only contains bodyless methods, while abstract contains mixed of bodyless and with-body methods
// Interface will have methods but no body.

public class Philippines_traffic_system implements World_traffic_system, Continental_traffic_system {

	public static void main(String[] args) {
		
		// Creating object for Philippines_traffic_system class with World_traffic_system interface.
		Philippines_traffic_system PHsystem = new Philippines_traffic_system();
		PHsystem.pedestrian();
		PHsystem.greenLight();
		PHsystem.redLight();
		PHsystem.yellowLight();
		PHsystem.airportSymbol();
		PHsystem.portSymbol();
		PHsystem.trainSymbol();
		
		
		// Creating object for World_traffic_system interface.
		// pedestrian() cannot access with this object, it only access all the methods of interface World_traffic_system.
		World_traffic_system WRLDsystem = new Philippines_traffic_system();
		WRLDsystem.greenLight();
		WRLDsystem.redLight();
		WRLDsystem.yellowLight();
		
		
		// Creating object for Continental_traffic_system interface.
		// pedestrian() cannot access with this object, it only access all the methods of interface Continental_traffic_system.
		Continental_traffic_system CONTsystem = new Philippines_traffic_system();
		CONTsystem.airportSymbol();
		CONTsystem.portSymbol();
		CONTsystem.trainSymbol();
		

	}

	@Override
	public void greenLight() {
		System.out.println("WORLD GREEN lights rule implementation");
		
	}

	@Override
	public void redLight() {
		System.out.println("WORLD RED lights rule implementation");
		
	}

	@Override
	public void yellowLight() {
		System.out.println("WORLD YELLOW lights rule implementation");
		
	}
	
	public void pedestrian() {
		System.out.println("PH PEDESTRIAN rule implementation");
	}

	@Override
	public void trainSymbol() {
		System.out.println("CONTINENT TRAIN rule implementation");
		
	}

	@Override
	public void airportSymbol() {
		System.out.println("CONTINENT AIRPORT rule implementation");
		
	}

	@Override
	public void portSymbol() {
		System.out.println("CONTINENT PORT rule implementation");
		
	}

}
