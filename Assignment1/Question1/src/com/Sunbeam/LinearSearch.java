package com.Sunbeam;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LinearSearch
{
       
	public static int linearSort(int[] arr,int s, int k)
	{
		for(int i=0;i<s;i++)
		{
			if(arr[i]==k)
				return i;
			
		}
		
		return -1;
		//return i;
	}
	
	public static void main(String[] args) 
	{
		int[] arr =new int[] {11,65,12,45,78,92,48,51,26,2,62,36};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key: ");
		int key=sc.nextInt();
		
		 int index=linearSort(arr,arr.length,key);
		 
		 if(index != -1)
		System.out.println("key found at index:  " +index+ " which is = " +arr[index]);
		 else
			 System.out.println("key not found ");
		
	}
}
