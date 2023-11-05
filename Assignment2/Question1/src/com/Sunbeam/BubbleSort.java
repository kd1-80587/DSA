package com.Sunbeam;

import java.util.Arrays;

public class BubbleSort 
{
   public static void bubbleSort(int arr[],int size)
   {
	   int count=0;
	   int poss=0;
	   int flag=0;
	   
	   for (int i = 1; i < size; i++) 
	   {
		   poss++;
		 for (int j = 0; j < size-i; j++) 
		 {
			count++;
			if(arr[j]>arr[j+1])
			{
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
			}
			
		 }
		  if(flag==1)
		  {
			  break;
		  }
	   }
   }
	
	
	public static void main(String[] args) {
		
		int arr[]= {13,2,43,23,15,12,11,16,17};
		 
		  bubbleSort(arr,arr.length);
		   
		  System.out.println("Sorted arr " + Arrays.toString(arr));
		  
		
	}
	
}
