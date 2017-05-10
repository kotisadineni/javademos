package com.exceptions;

public class MultiReturnStatmentDemo {
	
	
	public static void main(String[] args) {
		
	
	
	 //Irreceptive Condition of Return statment allways finally block executed 
		
		try {
			
			
		int i =10/0;
		return;
			
		
		}

		
		catch(Exception e){
			
			e.printStackTrace();
			return;
		}
		
		
		finally{
	System.out.println("Hello");
				
	return;
}
	}
	
	


}