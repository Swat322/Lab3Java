package managers;

import  models.CommunicationEquipment;
import  models.TypeOfCommunication;

import java.util.List;


public interface CommunicationEquipmentManager {
	List<CommunicationEquipment> sortByName(List<CommunicationEquipment>communicatioEquipmentList , boolean order);
    List<CommunicationEquipment> findByTypeOfCommunication(TypeOfCommunication typeOfCommunication );
    public abstract List<CommunicationEquipment> findByTypeInGap(Class<?> type, double from, double to);
	List<CommunicationEquipment> sortByPrice(List<CommunicationEquipment> communicationEquipmentListObj,
			boolean reverse);
	List<CommunicationEquipment> sortByPrice(boolean reverse);
	
}
