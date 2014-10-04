package com.mycompany.dave;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	PythonScriptTest.lauchPythonScript();
    	
    	/*
        // launch SERVER class first and then CLIENT 
    	
    	Thread serverA = new Thread(new A());
    	Thread clientA = new Thread(new B());
    	
    	serverA.start();
    	clientA.start();
    	
    	*/
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static class A implements Runnable
    {

		public void run()
		{
			try
			{
				ServerA.fireUp();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
    	
    }
    
    public static class B implements Runnable
    {

		public void run()
		{
			try
			{
				ClientA.fireUp();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
    	
    }
}
