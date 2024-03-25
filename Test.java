package Engines;

//41136063
//BT BALOYI


//Test class
public class Test {

	//Fields 

	
	//Fields
	private static Engine[] engineArr = new Engine[100];
		
	//addData method
	public static void addData()
	{
		
		//adding the vehicle objects to the vehicleArr
		//adding a  car 
		engineArr[1] = new Car("BMW M2 CS", "Car", 280, 6, 3.0, "Turbocharged Direct Injection", "petrol", 51.9);
					
		//addinng a jet airplane
		engineArr[2] = new Airplane("1978 Cessna Citation 500", "Jet", 820, "9-12.3","2 centrifugal", "7 can-type burners", 1270);
	}
		
	//displayData method
	public static void displayData()
	{
		//engine object
		System.out.println("Engine");
		
		
		
		//printing the List of cars
		System.out.println("List of car engine specs: ");
		System.out.println("------------------------");
		System.out.println("Id" + "\t" + "Name" + "\t \t" + "Cylinder" + "\t" + "Displacement" + "\t" + "Fuel system \t \t \t" + "Fuel" + "\t" + "Fuel capacity" + "\t" + "Top speed" + "\t" + "100m Top speed time");
		for(int i=0;i<engineArr.length;i++)
		{
			if(engineArr[i] != null && engineArr[i] instanceof Car)
			{
				String sp = "" + engineArr[i].hundredMeterTopSpeedTime();
				System.out.println((i+1) + "." + "\t" + engineArr[i] + "\t" + engineArr[i].engineSpecs() + "\t \t" + engineArr[i].getEVS() + " km/h"  + "\t" + sp.substring(0,4) + "s");
			}
		}
		
		
		//Making space 
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		
		
		//printing the List of airplanes
		System.out.println("List of airplane engine specs: ");
		System.out.println("-----------------------------");
		System.out.println("Id" + "\t" + "Name" + "\t \t \t \t" + "Compressor" + "\t" + "Air mass flow" + "\t" + "Combustion system" + "\t" + "Turbine entry temperature (Max)" + "\t" + "Top speed" + "\t" + "100m Top speed time");
		for(int n=0;n<engineArr.length;n++)
		{
			if(engineArr[n] != null && engineArr[n] instanceof Airplane)
			{
				String sp = "" + engineArr[n].hundredMeterTopSpeedTime();
				System.out.println((n) + ". \t" + engineArr[n] + "\t" + engineArr[n].engineSpecs() +  engineArr[n].getEVS() + " km/h" + "\t" + sp.substring(0,4) + "s");
			}
		}
	}
	
	
	
	
		
		//the main method
		public static void main(String[] args) {
			
			//adding the data to the array 
			addData();
			//printing the list of vehicle engines
			displayData();
		}


}
