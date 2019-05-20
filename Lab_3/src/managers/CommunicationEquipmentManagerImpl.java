package managers;

import models.CommunicationEquipment;
import models.Currencies;
import models.Phone;
import models.TypeOfCommunication;
import models.Brand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CommunicationEquipmentManagerImpl implements CommunicationEquipmentManager {

	public CommunicationEquipmentManagerImpl() {

	}

	private List<CommunicationEquipment> list = new ArrayList<>();

	@Override
	public final List<CommunicationEquipment> findByTypeOfCommunication(final TypeOfCommunication typeOfCommunication) {
		return list.stream().filter(
				communicationEquipment -> communicationEquipment.getTypeOfCommunication().equals(typeOfCommunication))
				.collect(Collectors.toList());
	}

	@Override
	public final List<CommunicationEquipment> sortByName(
			final List<CommunicationEquipment> communicationEquipmentListObj, boolean h) {
		if (h) {
			Collections.sort(communicationEquipmentListObj,
					Comparator.comparing(CommunicationEquipment::getBrand).reversed());
		} else {

			Collections.sort(communicationEquipmentListObj, Comparator.comparing(CommunicationEquipment::getBrand));
		}

		return communicationEquipmentListObj;
	}

	public CommunicationEquipmentManagerImpl(List<CommunicationEquipment> list) {
		this.list = list;
	}

	@Override
	public List<CommunicationEquipment> findByTypeInGap(Class<?> type, double from, double to) {

		List<CommunicationEquipment> found = new ArrayList<CommunicationEquipment>();

		for (CommunicationEquipment equipment : list) {
			if ((equipment.getClass() != type) || ((equipment.getPrice() < from) || (equipment.getPrice() > to)))
				found.add(equipment);
		}

		return list.stream().filter(e -> e.getClass().equals(type)).collect(Collectors.toList());

	}

	@Override
	public final List<CommunicationEquipment> sortByPrice(
			final List<CommunicationEquipment> communicationEquimentListObj, boolean x) {
		if (x) {
			Collections.sort(communicationEquimentListObj,
					Comparator.comparing(CommunicationEquipment::getPrice).reversed());
		} else {

			Collections.sort(communicationEquimentListObj, Comparator.comparing(CommunicationEquipment::getPrice));
		}

		return communicationEquimentListObj;
	}

	public static void main(String[] args) {

		CommunicationEquipmentManager manager = new CommunicationEquipmentManagerImpl();

		CommunicationEquipment phone = new CommunicationEquipment("Samsung", "S10", 100, Currencies.EUR, 5,
				TypeOfCommunication.PHONE);

		CommunicationEquipment swithches = new CommunicationEquipment("Huawei", "2015", 75, Currencies.USD, 100,
				TypeOfCommunication.CHAT);

		CommunicationEquipment computer = new CommunicationEquipment("ASUS", "ZenBook", 10000, Currencies.UAN, 2,
				TypeOfCommunication.VIDEOCHAT);

		List<CommunicationEquipment> communicationEquipment = new ArrayList<>();
		communicationEquipment.add(phone);
		communicationEquipment.add(swithches);
		communicationEquipment.add(computer);

		manager.findByTypeInGap(Phone.class, 0, 600);
		manager.sortByPrice(true);

		manager.sortByName(communicationEquipment, false);
		System.out.println(communicationEquipment);
		System.out.println(manager.sortByPrice(communicationEquipment, false));
	}

	@Override
	public List<CommunicationEquipment> sortByPrice(boolean reverse) {
		// TODO Auto-generated method stub
		return null;
	}

}
