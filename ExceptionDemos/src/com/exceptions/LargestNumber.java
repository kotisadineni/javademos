package com.exceptions;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int small = 0;
		int max=0;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		small=num; //Assume first entered value is small one
		 //i starts 2nd one because we already we took one value
		for(int i=2;i<num;i++){
			num=sc.nextInt();
			if (num>max){
				max=num;
			}
				
			 if(num<small){
				 small=num;
			 }
			 System.out.println("Largest num is" +max);
			 System.out.println("Smallest num is" +small);
			}
			
		}
		
		
		
		// TODO Auto-generated method stub

	}


