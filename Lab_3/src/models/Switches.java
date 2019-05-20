package models;

public class Switches extends CommunicationEquipment{
	private SwitchesType switchesType;
	private int numberOfConnection;
	private float switchingSpeeds;
	
	
	public Switches(){
		
	}

	public Switches(final SwitchesType switchesTypeObj , final int numberOfConnectionObj, final float switchingSpeedsObj){
		this.switchesType = switchesTypeObj;
		this.numberOfConnection = numberOfConnectionObj;
		this.switchingSpeeds = switchingSpeedsObj;
	}

	public SwitchesType getSwitchesType() {
		return switchesType;
	}

	public void setSwitchesType(final SwitchesType switchesTypeObj) {
		this.switchesType = switchesTypeObj;
	}

	public int getNumberOfConnection() {
		return numberOfConnection;
	}

	public void setNumberOfConnection(int numberOfConnectionObj) {
		this.numberOfConnection = numberOfConnectionObj;
	}

	public float getSwitchingSpeeds() {
		return switchingSpeeds;
	}

	public void setSwitchingSpeeds(float switchingSpeedsObj) {
		this.switchingSpeeds = switchingSpeedsObj;
	}

	@Override
	public String toString() {
		return "Switches{" +
                "switchesType=" + switchesType +
                ",numberOfConnection=" + numberOfConnection +
                ", switchingSpeeds=" + switchingSpeeds +
                '}';
    }


	
	
}
