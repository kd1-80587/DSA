package com.Sunbeam;

import java.util.Scanner;

public class BinarySearchdesc
{
	
	public static int binarySearchDesc(int arr[],int size,int key)
	{
		int l=0;
	    int r=size-1;
	   int mid;
	    
	   while (l<=r)
	   {
		   mid=(r+l)/2;
		   
		   if(arr[mid]==key)
			   return mid;
		   
		   else if(key>arr[mid])
			   r=mid-1;
		   
		   else 
		        l=mid+1;
		   
		   
		   
	   }
	   
		return -1;
		
	}
	
	public static void main(String[] args) {
		
	
 int[] arr = new int[] {88,77,66,55,44,33,22,11};
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter key: ");
 int key =sc.nextInt();
 
	
	int index =binarySearchDesc(arr,arr.length,key);
	
	if(index !=-1)
	 System.out.println("key found at index:   " +index+ " which is =  " +arr[index]);
	else
	 System.out.println("key not found ");
	
	}
}
