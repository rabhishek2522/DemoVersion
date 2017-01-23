package demo_webservices;

import demo_webservices.StockQuoteService;

public class ConsumeServiecs {
	public static void main(String[] args) {
		StockQuoteService s = new StockQuoteService();
		s.sayHello("Abhishek");
	}//Extra Comment

}
