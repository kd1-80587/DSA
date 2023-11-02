package com.Sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	
	public static int binarySearch(int arr[],int size,int key)
	{
	  int l=0; 
	  int r =size-1;
	  int mid;
	    
	  while (l<=r)
	  {
		  mid=(l+r)/2;
		 if(key==arr[mid])
			 return mid;
		 
		 else if(key<arr[mid])
			 r=mid-1;
		 
		 else
			 l=mid+1;
		 
	  }
	  
		return -1;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= new int[] {11,22,33,44,55,66,77,88,99,110};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key: ");
		int key=sc.nextInt();
		
		int index =binarySearch(arr,arr.length,key);
		if(index !=-1)
		 System.out.println("key found at index:   " +index+ " which is =  " +arr[index]);
		else
		 System.out.println("key not found ");
	}

}
