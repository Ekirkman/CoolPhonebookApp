import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Contacts contacts1 = new Contacts();
		// TODO Auto-generated method stub
		boolean flag = true;
		do{
			
		
		System.out.println("Welcome to Ed's phonebook"+"\n1. add a contact"+"\n2. search by first name "+"\n3. search by last name"+"\n4. search by full name"+"\n5. search by telephone number"+"\n6. search by city or state"+"\n7. delete a contact"+"\n8. update a contact"+"\n9. show all contacts"+"\n0. Exit ");
		Scanner input = new Scanner(System.in);	
		int main= input.nextInt();
		
	 
	
		if(main== 1) {
			System.out.print("Please enter name and address of the person you would like to add.\nEx: LeBron James, 23 Mvp Court, Cleveland, OH, 44101, 2166435698 ");
			
		 Scanner input1 = new Scanner(System.in);
		 String temp = input1.nextLine();
		 String temp1[] = temp.split(",");
		 String name []= temp1[0].split(" ");
		 String mn="";
		 for(int i=1; i<=name.length-2; i++) { 	
			 mn = mn+" "+name[i];
		 }
		 /*this loop starts at the middle name and adds each name[i]) 
		 to String mn. i=1 because the first name is at 0.
		 i is set to >= name.lenth-2 because length-1 would include the last name too.
		 */
		 
			String street1 = temp1[1].trim();
			//.trim(); gets rid of unused spaces
			String city1 = temp1[2].trim();
			String state1 = temp1[3].trim();
			String zip= temp1[4].trim();
			Address xx = new Address(street1,city1,state1,zip);
			String name1 = name[0].trim();
			String midname = mn.trim();
			String lastname3 = name[name.length-1].trim();
			String phone = temp1[5].trim();
			Person p = new Person(name1,midname,lastname3,phone,xx);
			p.setAddress(xx);
			contacts1.addContacts(p);
			System.out.print("Great \n"+p+"has been added!\n \n");
			
		
		}
		
				
		if(main==2) {
			System.out.println("Please enter the First name of the person that you would like to search: ");
			Scanner input3 = new Scanner(System.in);
			String firstName = input3.nextLine();
			System.out.println(contacts1.searchByFirstName(firstName));
		
			
		}
		if(main==3) {
			System.out.println("Please enter the Last name of the person that you would like to search: ");
			Scanner input4 = new Scanner(System.in);
			String lastName1 = input4.nextLine();
			System.out.println(contacts1.searchByLastName(lastName1));
			
		}
			
		if(main==4) {
			System.out.println("Please enter the Full name of the person that you would like to search: ");
			Scanner input5= new Scanner(System.in);
			String fullName = input5.nextLine();
			System.out.println(contacts1.searchByFullName(fullName));
			
		}
		
		if(main==5) {
			System.out.println("Please enter the telephone number of the person that you would like to search");
			Scanner input6= new Scanner(System.in);
			String telephone = input6.nextLine();
			System.out.println(contacts1.searchByTelephone(telephone));
			
		}
		
		if(main==6) {
			System.out.println("Please enter the City or State of the person that you would like to search: ");
			Scanner input7= new Scanner(System.in);
			String cityState = input7.nextLine(); 
			System.out.println(contacts1.searchByCityOrState(cityState));
		}
			
		if(main==7) {
			System.out.println("Please enter the telephone number of the person that you would like to delete: ");
			Scanner input8= new Scanner(System.in);
			String telephone1 = input8.nextLine();
			contacts1.deleteContact(telephone1);
			
		}
			
		if(main==8) {
			System.out.println("Please enter the telephone number of the contact that you would like to update: ");
			Scanner input9= new Scanner(System.in);
			String telephone2 = input9.nextLine();
			contacts1.deleteContact(telephone2);
			System.out.print("Please enter name and address of the person you would like to add.\nEx: LeBron James, 23 Mvp Court, Cleveland, OH, 44101, 2166435698 ");
			
			 Scanner input10 = new Scanner(System.in);
			 String temp = input10.nextLine();
			 String temp1[] = temp.split(",");
			 String name []= temp1[0].split(" ");
			 String mn="";
			 for(int i=1; i<=name.length-2; i++) { 	
				 mn = mn+" "+name[i];
			 }
				String street1 = temp1[1].trim();
				String city1 = temp1[2].trim();
				String state1 = temp1[3].trim();
				String zip= temp1[4].trim();
				Address xx = new Address(street1,city1,state1,zip);
				String name1 = name[0].trim();
				String midname = mn.trim();
				String lastname3 = name[name.length-1].trim();
				String phone = temp1[5].trim();
				Person p = new Person(name1,midname,lastname3,phone,xx);
				p.setAddress(xx);
				contacts1.addContacts(p);
				System.out.print("Contact"+p+"updated\n \n");
				
			
		}
			
		if(main==9) {
			System.out.println("Your contacts consist of : ");
			contacts1.showContacts();
			
		}
		
		if(main==0) {
		flag = false;
				System.exit(0);
		}
	}while(flag );
		

		
		
	}

	
	}
