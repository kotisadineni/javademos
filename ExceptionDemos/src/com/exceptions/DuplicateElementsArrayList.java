package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Ramu");
		list.add("Koti");
		list.add("Ramu");
		list.add("Siva");
		list.add("Koti");
		
		
		for(int i=0; i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					j--;
					System.out.println("DuplicateElements" +j);
					}
				
			}
			
			
			}
		
		System.out.println("list after sorting"+list);
            
	}
	          

}
