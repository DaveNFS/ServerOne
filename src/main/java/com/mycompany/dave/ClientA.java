package com.mycompany.dave;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientA {

	public static void fireUp() throws Exception 
	{
		String ipAddress = "localhost";
		
		Socket s = new Socket(ipAddress, 9090);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String response = input.readLine(); 
		System.out.println("This is what the server had to say: "); 
		System.out.println(response); 
		System.out.println("----------------------------------");
		System.exit(0);
	}
}
