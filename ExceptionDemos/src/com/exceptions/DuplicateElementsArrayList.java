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
		
		for(int i=1; i<list.size();i++){
			
			Object a1=list.get(i);
			Object a2=list.get(i-1);
			
			if(a1.equals(a2)){
				list.remove(a2);
				
			}
			System.out.println("duplicates values" +a2);
		}
		
            System.out.println("list after sorting"+list);
	}

}
