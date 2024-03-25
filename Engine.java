package Engines;

//41136063
//BT BALOYI


//the engine class
public abstract class Engine {
	
	//Fields
	private String engineVehicleName;
	private String engineVehicleType;
	private int engineVehicleSpeed;
	
	
	//constructors
	//default
	public Engine()
	{
	
	}
	
	//with parameters
	public Engine(String EVN, String EVT, int EVS)
	{
		setEVN(EVN);
		setEVT(EVT);
		setEVS(EVS);
	}
	
	
	//mutators
	//name
	public void setEVN(String engineVehicleName)
	{
		this.engineVehicleName = engineVehicleName;
	}
	//type
	public void setEVT(String engineVehicleType)
	{
		this.engineVehicleType = engineVehicleType;
	}
	//speed
	public void setEVS(int engineVehicleSpeed)
	{
		this.engineVehicleSpeed = engineVehicleSpeed;
	}
	
	
	
	
	//accessors
	//name
	public String getEVN()
	{
		return engineVehicleName;
	}
	//type
	public String getEVT()
	{
		return engineVehicleType;
	}
	//speed
	public int getEVS()
	{
		return engineVehicleSpeed;
	}
	
	
	
	
	
	
	//Engine specs abstract method
	public abstract String engineSpecs();
	//Vehicle 100m top speed time abstract method
	public abstract double hundredMeterTopSpeedTime();
	
	
	//toString method 
	public String toSrting()
	{
		return "This engine belongs to a: " + getEVN() + " " + getEVT() + " that reaches a top speed of: " + getEVS();
	}
	
	
	//the main method
	public static void main(String[] args) {
		
	}

}
