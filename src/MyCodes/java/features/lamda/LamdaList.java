package MyCodes.java.features.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaList {

	public static void main(String[] args) {
		
		Person[] persons = {
				new Person ("Charles","Dickens",60),
				new Person ("Lewis","Carroll",42),
				new Person ("Thomas","Charlyle",51),
				new Person ("Charlotte","Bronte",45),
				new Person ("Matthew","Arnold",39)
				
		};
		
		List<Person> people= Arrays.asList(persons);
		/*
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.age - o2.age);
			}
		});*/
		
		Collections.sort(people, (a,b)-> a.age - b.age);
		
		
		for (Person person: people){
			System.out.println(person.getAge());
		}
		
		people.forEach(p ->System.out.println(p.getAge())); 
		
	}

}

class Person {
	String fName;
	String lname;
	int age;
	
	public Person(String fName, String lname, int age) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}