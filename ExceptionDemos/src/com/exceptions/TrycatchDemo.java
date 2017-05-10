package com.exceptions;

import java.io.IOException;

public class TrycatchDemo {
	
	public static void main(String[] args)throws IOException {
		//try with empty catch possible but this not good practice empty catch means
		//you should write catch(Exception e ){ not like this  catch( ){
		try{
			int i = 10/0;             
	       System.out.println("This statement won't executed");
		}
	      catch(Exception e){
			
	    	   //Handling Exceptions
	    	// e.printStackTrace(); 
		}
	}

	}
	


