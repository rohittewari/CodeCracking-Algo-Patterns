package MyCodes.xsd.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import MyCodes.xsd.example.generated.CompanyType;
import MyCodes.xsd.example.generated.CourseBooking;
import MyCodes.xsd.example.generated.ObjectFactory;

public class Unmarshal {
	
	public static void main (String[] args) throws JAXBException {
		ObjectFactory factory = new ObjectFactory();
		CourseBooking courseBook = factory.createCourseBooking();
		courseBook.setCompany(null); 
		
		CompanyType compType = new CompanyType();
		compType.setAddress("address"); 
		compType.setContact(null); 
		
		courseBook.setCompany(null);
		courseBook.getStudent();
		
		
		JAXBElement<CourseBooking> booking = factory.createBooking(courseBook); 
		
		CourseBooking booking1 = new CourseBooking();
	}

}
