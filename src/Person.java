import java.util.Collections;

public class Person extends Contacts {

	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String telephone;
	
	public Person() {}
	public Person(String firstName,String middleName,String lastName,String telephone,Address address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.telephone = telephone;
		
	}
	public Person(String firstName,String middleName,String lastName,String telephone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.telephone = telephone;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getFullName() {
		return firstName+" "+middleName+" "+lastName.toString();
	}
 
	
	public String toString() {
		return ("Name: "+firstName+" "+middleName+" "+lastName+"\nNumber: ("+telephone.charAt(0)+telephone.charAt(1)+telephone.charAt(2)+")"+"-"+telephone.charAt(3)+telephone.charAt(4)+telephone.charAt(5)+"-"+telephone.charAt(6)+telephone.charAt(7)+telephone.charAt(8)+telephone.charAt(9)+"\nAddress: "+address+"\n");
				
	}
}
