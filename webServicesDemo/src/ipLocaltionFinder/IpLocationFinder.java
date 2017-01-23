package ipLocaltionFinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass IP");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIp=new GeoIPService();
			GeoIPServiceSoap geoIpService=	geoIp.getGeoIPServiceSoap();
			GeoIP geoIP2= geoIpService.getGeoIP(ipAddress);
			System.out.println(geoIP2.getCountryName());
		}
	}
}
