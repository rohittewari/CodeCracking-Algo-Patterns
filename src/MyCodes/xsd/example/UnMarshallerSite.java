package MyCodes.xsd.example;

import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import MyCodes.xsd.example.generated.CompanyType;
import MyCodes.xsd.example.generated.ContactType;
import MyCodes.xsd.example.generated.CourseBooking;
import MyCodes.xsd.example.generated.ObjectFactory;
import MyCodes.xsd.example.generated.StudentType;

public class UnMarshallerSite {

	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException { 
		
		JAXBContext jaxbContext 
        = JAXBContext.newInstance("MyCodes.xsd.example.generated");

    CourseBooking booking = new CourseBooking();
    booking.setCourseReference("UML-101");
    booking.setTotalPrice(new BigDecimal(10000));
    booking.setInvoiceReference("123456");
    DatatypeFactory datatypes = DatatypeFactory.newInstance();
    booking.setCourseDate(datatypes.newXMLGregorianCalendarDate(2006,06,15,0));
    booking.setTotalPrice(new BigDecimal(10000));
    booking.setInvoiceReference("123456");
    booking.getStudent().add(new StudentType());
    booking.getStudent().get(0).setFirstName("John");
    booking.getStudent().get(0).setSurname("Smith");
    booking.setCompany(new CompanyType());
    booking.getCompany().setName("Clients inc.");
    booking.getCompany().setContact(new ContactType());
    booking.getCompany().getContact().setName("Paul");
    booking.getCompany().getContact().setEmail("paul@clients.inc");
    booking.getCompany().getContact().setTelephone("12345678");
    booking.getCompany().setAddress("10 client street");

    // Marshal to System.out
    Marshaller marshaller = jaxbContext.createMarshaller();
    JAXBElement<CourseBooking> bookingElement  
         = (new ObjectFactory()).createBooking(booking);
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    marshaller.marshal( bookingElement, System.out );
		
		
		
		
	}

}
