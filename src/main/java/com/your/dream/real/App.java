package com.your.dream.real;
import com.your.dream.real.util.Log;
/**
 * Hello world!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	for(String arg : args) {
    		logger.log("parameter: " + arg);
    	}
    }
}
