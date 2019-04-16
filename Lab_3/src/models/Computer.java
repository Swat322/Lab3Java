package models;
public class Computer extends CommunicationEquipment {
	private ComputerType computerType;
	private boolean networkConnection;
	private int powerConsumption;
	
	public Computer(){
		
	}
	
	
	public Computer(final ComputerType computerTypeObj , boolean networkConnectionObj , final int powerConsumptionObj){
	this.computerType = computerTypeObj;
	this.networkConnection = networkConnectionObj;
	this.powerConsumption = powerConsumptionObj;
	}


	public ComputerType getComputerType() {
		return computerType;
	}


	public void setComputerType(final ComputerType computerTypeObj) {
		this.computerType = computerTypeObj;
	}


	public boolean isNetworkConnection() {
		return networkConnection;
	}


	public void setNetworkConnection(boolean networkConnectionObj) {
		this.networkConnection = networkConnectionObj;
	}


	public int getPowerConsumption() {
		return powerConsumption;
	}


	public void setPowerConsumption(int powerConsumptionObj) {
		this.powerConsumption = powerConsumptionObj;
	}


	@Override
	public String toString() {
		return "Computer{" +
                "computerType='" + computerType + '\'' +
                ", networkConnectiont=" + networkConnection +
                ", powerConsumption=" + powerConsumption +
                '}';
	}


	
     
}
