package com.mycompany.dave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonScriptTest {

	public static void lauchPythonScript() throws Exception
	{
		
	
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("python testPython.py");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		p.waitFor();

		while (br.ready())
		{
			System.out.println(">>> " + br.readLine());
		}

		
	}
	
	
	
	
	
	public static void doSomething()
	{
		String s = null;
		 
        try {
             
             // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec("python testPython.py");
             
            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));
 
            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(p.getErrorStream()));
 
            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
             
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
             
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
	}

}
