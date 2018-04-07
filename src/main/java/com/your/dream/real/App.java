package com.your.dream.real;
import java.util.Log;
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
    		Log.log("parameter: " + arg);
    	}
    }
}
