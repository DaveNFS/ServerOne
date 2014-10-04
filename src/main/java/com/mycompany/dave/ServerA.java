package com.mycompany.dave;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerA {

	public static void fireUp() throws Exception 
	{
		ServerSocket listener = new ServerSocket(9090);
		try
		{
			while(true)
			{
				Socket socket = listener.accept();
				try
				{
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
					out.println("==> printing from the server");
				}
				finally
				{
					socket.close();
				}
			}
			
		}
		finally
		{
			listener.close();
		}
		
	}
	
	
}
