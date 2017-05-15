package com.exceptions;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int small = 0;
		int max=0;
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++){
			num=sc.nextInt();
			
			if (num>max)
				num=max;
			
			 if(num<small)
				 num=small;
			 
			 System.out.println("Largest num is" +max);
			 System.out.println("Smallest num is" +small);
			}
			
		}
		
		
		
		// TODO Auto-generated method stub

	}


