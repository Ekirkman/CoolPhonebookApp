import java.util.*;
import java.util.Comparator;
public class Contacts {
	private ArrayList<Person>  contacts = new ArrayList();

	public Contacts() {}

	public void addContacts(Person person) {
		this.contacts.add(person);
		//System.out.println("Contact List Size: "+contacts.size());
	}
	public void showContacts() {
		for (Person person : contacts) {
			//Person is the class. person is the object. contacts is the array of person 
			//for every person in the contacts array { print the person string set in Person toString
			System.out.println(person);
		}
		
		// The for loop above works exactly like the one below
		
		/*for(int i =0; i < contacts.size(); i++)
		{
			System.out.println(contacts.get(i));
		}
		*/
	}
	public ArrayList<Person> searchByFirstName(String firstName)
	{
		ArrayList<Person> tempList = new ArrayList();
		for(int i =0; i < contacts.size();i++)
		{
			if(firstName.equals(contacts.get(i).getFirstName()))
			{
				
				tempList.add(contacts.get(i));
			}
		}
		return tempList;
	}
public ArrayList<Person> searchByLastName(String lastName) {
	ArrayList<Person> tempArray = new ArrayList<Person>();
	for(int i = 0; i < contacts.size();i++) {
		if(lastName.equals(contacts.get(i).getLastName())) {
			
			tempArray.add(contacts.get(i));
			
		}
	}
	return tempArray;
}
public ArrayList<Person> searchByCityOrState(String cityState) {
	ArrayList<Person> tempList = new ArrayList<Person>();
	for(int i = 0; i < contacts.size();i++) {
		if(cityState.equals(contacts.get(i).getAddress().getState()) || cityState.equals(contacts.get(i).getAddress().getCity())) {
			
			tempList.add(contacts.get(i));
			
		}
	}
	return tempList;
}
public void deleteContact(String telephone) {
	for(int i =0; i < contacts.size();i++) {
		if(telephone.equals(contacts.get(i).getTelephone())) {
			contacts.remove(i);
		}
	}
}

public void update(String telephone,String firstName, String midname,String lastName,String street,String city, String state, String zip) {
	for(int i =0; i < contacts.size();i++) {
		if(telephone.equals(contacts.get(i).getTelephone())) {
		contacts.get(i).setFirstName(firstName);
		contacts.get(i).setMiddleName(midname);
		contacts.get(i).setLastName(lastName);
		contacts.get(i).getAddress().setStreet(street);
		contacts.get(i).getAddress().setCity(city);
		contacts.get(i).getAddress().setState(state);
		contacts.get(i).getAddress().setZipcode(zip);
		}		
}
}
	public ArrayList<Person> searchFullName(String name) {
		ArrayList<Person> tempArray = new ArrayList<Person>();
		for(int i =0; i < contacts.size();i++) {
			if(name.equals(contacts.get(i).getFirstName()+" "+contacts.get(i).getMiddleName()+" "+contacts.get(i).getLastName())) {
				tempArray.add(contacts.get(i));
			}
		
	}
		return tempArray;
	}
	public ArrayList<Person> sortAll() {
	Collections.sort(contacts, (a, b) -> a.getFullName().compareToIgnoreCase(b.getFullName()));
	return contacts;
		
	}
	
	
public ArrayList<Person> searchByFullName(String fullname) {
	ArrayList<Person> tempList = new ArrayList<Person>();
	for(int i = 0; i < contacts.size();i++) {
		if(fullname.equals(contacts.get(i).getFullName())) {
			
			tempList.add(contacts.get(i));
	
		}

  }
	return tempList;
}

public ArrayList<Person> searchByTelephone(String telephone){
ArrayList<Person> tempList = new ArrayList<Person>();
for(int i = 0; i< contacts.size(); i++) {
	if(telephone.equals(contacts.get(i).getTelephone())) {
		tempList.add(contacts.get(i));
	}
		
	}
return tempList;
}
	}


	

	

