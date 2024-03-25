package Engines;

//41136063
//BT BALOYI

//the Car class
public class Car extends Engine{

	//Fields
	private int cylinder;
	private double displacement;
	private String fuelSystem;
	private String fuel;
	private double fuelCapacity;
	
	
	//constructors
	//default
	public Car()
	{
		
	}
	
	
	//with parameters
	public Car(String EVN, String EVT, int EVS,int cyl, double disp, String fs, String fl, double fc)
	{
		super(EVN, EVT, EVS);
		setCyl(cyl);
		setDisp(disp);
		setFuelSys(fs);
		setFuel(fl);
		setFuelCap(fc);
	}
	
	
	
	
	
	//mutators 
	//cylinder 
	public void setCyl(int cylinder)
	{
		this.cylinder = cylinder;
	}
	//displacement
	public void setDisp(double displacement)
	{
		this.displacement = displacement;
	}
	//fuelSystem
	public void setFuelSys(String fuelSystem)
	{
		this.fuelSystem = fuelSystem;
	}
	//fuel
	public void setFuel(String fuel)
	{
		this.fuel = fuel;
	}
	//fuelCapacity
	public void setFuelCap(double fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}
	
	
	
	
	//accessors
	//cylinders
	public int getCyl()
	{
		return cylinder;
	}
	//displacement
	public double getDisp()
	{
		return displacement;
	}
	//fuelSystem
	public String getFuelSys()
	{
		return fuelSystem;
	}	
	//fuel
	public String getFuel()
	{
		return fuel;
	}
	//fuelCapacity
	public double getFuelCap()
	{
		return fuelCapacity;
	}
	
	
	
	
	
	
	
	
	
	//Engine specs abstract method
	public String engineSpecs()
	{
		System.out.println();
		return getCyl() + "\t \t" + getDisp() + "\t \t" + getFuelSys() + "\t" + getFuel() + "\t" + getFuelCap() + " L";
		
	}
	
	
	//Vehicle 100m top speed time abstract method
	public double hundredMeterTopSpeedTime()
	{
		return (100.0/super.getEVS());
	}
	
	
	
	//toString method
	public String toString()
	{
		return super.getEVN();
	}
	
	//the main method
	public static void main(String[] args) {
		
	}

}
