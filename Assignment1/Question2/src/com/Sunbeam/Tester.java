package com.Sunbeam;

import java.util.Scanner;

public class Tester {
	 
	public static int linearsearchid(Employee arr[],int size,int id)
	{
		
		for (int i = 0; i < size; i++) 
		{
			
			if(arr[i].getEmpid()==id)
				return i;
			    
		}
		return -1;
		
	}
    
	public static int linearsearchsal(Employee arr[],int size,double sal)
	 {
		 
		
		for (int i = 0; i < size; i++) 
		{
			
			if(arr[i].getSalary()==sal)
				return i;
			
			 
		}
		
		return -1;
	 }
	
	
	public static int linearsearchstri(Employee arr[],int size,String name)
	 {
		 
		
		for (int i = 0; i < size; i++) 
		{
			
			if(arr[i].getName().equalsIgnoreCase(name))
				return i;
		
			 
		}
		
		return -1;
	 }
	
	
	public static void main(String[] args) 
	{
		Employee[] arr = new Employee[6];
		arr[0]=new Employee(1,"vinod",10000);
		arr[1]=new Employee(2,"pramod",20000);
		arr[2]=new Employee(3,"tanod",30000);
		arr[3]=new Employee(4,"shindo",50000);
		arr[4]=new Employee(5,"sharon",25000);
		arr[5]=new Employee(6,"vinod",10000);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id to search: ");
	    int id = sc.nextInt();
	    int ii = linearsearchid(arr,arr.length,id);
	    
	    if(ii != -1)
	    System.out.println("Key fount at index "+ ii+ "is equalto: "+arr[ii].getEmpid());
	    else
	    	{System.out.println("key not found");}
	    
	    
	    System.out.println("Enter name to search: ");
	    String name =sc.next();
	    int s = linearsearchstri(arr,arr.length,name);
	    

	    if(s != -1)
	    System.out.println("Key fount at index "+ s+ "is equalto: "+arr[s].getName());
	    else
	    	{System.out.println("key not found");}
	    
	    
	    
	    System.out.println("Enter salary to search: ");
	    
	    double salary =sc.nextDouble();
	    int i = linearsearchsal(arr,arr.length,salary);
    	    
	    if(i != -1)
		    System.out.println("Key fount at index "+ i+ "is equalto: "+arr[i].getSalary());
		    else
		    	System.out.println("key not found");
		    
		
	}

}
