package com.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Siva");
		list.add("Raju");
		list.add("Siva");
		list.add("Ravi");
		
		Map<String,Integer> counts = new HashMap<String,Integer>();
		
		for(String str:list){
			if(counts.containsKey(str)){
				counts.put(str, counts.get(str)+1);
			} else{
				counts.put(str, 1);
			}
		}
		 
		for(Map.Entry<String,Integer> entry :counts.entrySet()){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
