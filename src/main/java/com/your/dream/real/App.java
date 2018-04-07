package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	private App_1() 
	{
		throw new UnsupportedOperationException();
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	for(String arg : args) {
    		System.out.println("parameter: " + arg);
    	}
    }
}
