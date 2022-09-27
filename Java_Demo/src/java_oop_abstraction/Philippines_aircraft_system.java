package java_oop_abstraction;

//interface only contains bodyless methods, while abstract contains mixed of bodyless and with-body methods

public class Philippines_aircraft_system extends World_aircraft_system{

	public static void main(String[] args) {
		
		Philippines_aircraft_system ph_Aircraft = new Philippines_aircraft_system();
		ph_Aircraft.PH_flag_logo_guidelines();
		ph_Aircraft.aircraft_bodyColor();
		ph_Aircraft.engine_guidelines();
		ph_Aircraft.safety_guidelines();
		
		// You cannot instantiate or create object with abstract class
		//World_aircraft_system worldAircraft = new World_aircraft_system();
		
		World_aircraft_system worldAircraft = new Philippines_aircraft_system();
		worldAircraft.aircraft_bodyColor();
		worldAircraft.engine_guidelines();
		worldAircraft.safety_guidelines();
	}

	@Override
	public void aircraft_bodyColor() {
		System.out.println("BODY COLOR is RED");
		
	}
	
	public void PH_flag_logo_guidelines() {
		System.out.println("FLAG standard size implementation");
	}

}
