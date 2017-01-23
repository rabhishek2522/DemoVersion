package demo_webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class StockQuoteService {
	 
	    @WebMethod
	    public String sayHello(String msg){
	    		System.out.println("Abhishek");
	        return "Hello and Very GoodMorning"+msg;
	    }
	     
	    public static void main(String[] args){
	    	System.out.println("Start");
	        Endpoint.publish("http://localhost:8080/testWS/", new StockQuoteService());
	        System.out.println("End");
	    }
	}
//http://localhost:8080/testWS?wsdl : check wsdl