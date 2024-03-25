package Engines;

//41136063
//BT BALOYI

//the airplane class
public class Airplane extends Engine{

	//Fields
	String airMassFlow;
	String compressor;
	String combustionSystem;
	int turbineEntryTemperature;
	
	//constructors
	//default
	public Airplane()
	{
		
	}
	//with parameters
	public Airplane(String EVN, String EVT, int EVS, String AMF, String comp, String combSys, int TET)
	{
		super(EVN, EVT, EVS);
		setAMF(AMF);
		setComp(comp);
		setCombSys(combSys);
		setTET(TET);
	}
	
	
	
	
	
	
	//mutators 
	//airMassFlow
	public void setAMF(String airMassFlow)
	{
		this.airMassFlow = airMassFlow;
	}
	//Compressor
	public void setComp(String compressor)
	{
		this.compressor = compressor;
	}
	//combustionSystem
	public void setCombSys(String combustionSystem)
	{
		this.combustionSystem = combustionSystem;
	}
	//turbineEntryTemperature
	public void setTET(int turbineEntryTemperature)
	{
		this.turbineEntryTemperature = turbineEntryTemperature;
	}
	
	
	
	
	
	//accerssors
	//airMassFlow
	public String getAMF()
	{
		return airMassFlow;
	}
	//Compressor
	public String getComp()
	{
		return compressor;
	}
	//combustionSystem
	public String getCombSys()
	{
		return combustionSystem;
	}
	//turbineEntryTemperature
	public int getTET()
	{
		return turbineEntryTemperature;
	}
	
	
	
	
	//Engine specs abstract method
	public String engineSpecs()
	{
		return getComp() + "\t" + getAMF() + "\t \t" + getCombSys() + "\t" + getTET() + "\t \t \t \t";
	}
	
	//9–12.3 kg/s	2 centrifugal	7 can-type burners	1270 K	15000/1400 rpm
	
	
	
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
