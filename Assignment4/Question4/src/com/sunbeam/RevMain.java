package com.sunbeam;

public class RevMain {
	public static void main(String[]args)
	{
		LinkedList l1= new LinkedList();
		
		l1.addFirst(60);
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.display();
		l1.reverse();
		l1.display();
	}

}
