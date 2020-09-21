package DaysProgram.DaysProgram;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
public class FindIPAddress {

	public static void main(String[] args) throws UnknownHostException {
	
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		System.out.println(ipAddress);
	}

}
