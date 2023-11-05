package com.Sunbeam;

import java.util.Arrays;

public class SelectionSort 
{
  public static void selectionSort(int arr[],int size)
  {
	  for (int i = 0; i < size-1; i++) 
	   {
		for (int j = i+1; j < size; j++) 
		 {
			if(arr[i]>arr[j]) 
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			/*	int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;*/
				
		 }
			
		 }
		 }
	   
  
  }
//arr[i]=arr[i]+arr[j];
	//arr[j]=arr[i]-arr[j];
	//arr[i]=arr[i]-arr[j];
	
  
  public static void main(String[] args)  
  {
	 int arr[]= {13,2,43,23,15,12,11,16,17,2};
	 
	  selectionSort(arr,arr.length);
	   
	  System.out.println("Sorted arr " + Arrays.toString(arr));
	  
	 
  }
  
}
