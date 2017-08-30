package MyCodes.java.features.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.api.addressing.AddressingPropertySet;

public class ReferenceTest {

	public static void main(String[] args) {
		Person[] persons = {
				new Person ("Charles","Dickens",60),
				new Person ("Lewis","Carroll",42),
				new Person ("Thomas","Charlyle",51),
				new Person ("Charlotte","Bronte",45),
				new Person ("Matthew","Arnold",39)
				
		};
		
		List<Person> people= new ArrayList<>();
		
		people.add(new Person ("Charles","Dickens",60));
		addPerson(people); 
		
		for (Person person: people){
			System.out.println(person.getfName());
		}
		

	}
	
	static void addPerson(List<Person> people ){
		
		people = new ArrayList();
		people.add(new Person ("Rohit","Tewari", 39));
		/*
		for (Person person: people){
			System.out.println(person.getfName());
		}*/
	}
	
	

}
