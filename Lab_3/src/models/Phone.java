package models;

public class Phone extends CommunicationEquipment {
         private  PhoneType  phoneType;
         private boolean recordingOption;
         private boolean displayOption;
         
         public Phone(){
        	 
         }
         public Phone(final PhoneType phoneTypeObj , final boolean recordingOptionObj ,final boolean displayOptionObj ){
        	 this.phoneType = phoneTypeObj;
        	 this.recordingOption = recordingOptionObj;
        	 this.displayOption = displayOptionObj;
         }
		public PhoneType getPhoneType() {
			return phoneType;
		}
		public void setPhoneType(final PhoneType phoneTypeObj) {
			this.phoneType = phoneTypeObj;
		}
		public boolean isRecordingOption() {
			return recordingOption;
		}
		public void setRecordingOption(boolean recordingOptionObj) {
			this.recordingOption = recordingOptionObj;
		}
		public boolean isDisplayOption() {
			return displayOption;
		}
		public void setDisplayOption(boolean displayOptionObj) {
			this.displayOption = displayOptionObj;
		}
		@Override
		public String toString() {
			return "Phone{" +
	                "phoneType=" + phoneType +
	                ", recordingOption=" + recordingOption+
	                ", displayOption=" + displayOption +
	                '}';
		
		
         
 }
}
