package Assignment;

import java.io.IOException;
import java.util.*;

public class Shopkeeper extends Product {
	
	String product_list;
	static List<String> al=new ArrayList<String>();
	
	public static void add()
	{
		
		 Scanner myObj = new Scanner(System.in);
		 
		 
		 
		 System.out.println("Enter Product Name");
		 name = myObj.nextLine();
		
		 System.out.println("Enter Product Brand");
		 brand = myObj.nextLine();
		 
		 System.out.println("Enter Product Price");
		 price = Double.parseDouble(myObj.nextLine());
		 
		 
		 System.out.println("Enter Product Stock");
		 stock = Integer.parseInt(myObj.nextLine());
		 
		
		
		
		
	}
	public static void delete(List al)
	
	{
	 Scanner myObj1 = new Scanner(System.in);
		 
		 
		 
		 System.out.println("Enter Product Name you want to delete");
		 name = myObj1.nextLine();
		
		boolean isRemoved = al.remove(name);
		
	}
	
	public static void view()
	{
		System.out.println("Product list is "+al);
	}

	public static void main(String []args)
	{
	
		add();
		
		view();
		
	}
	
	public static void search()
	{
		
	}
	public void setName() 
	{
	
		
	}
	public char[] getName() {
		
		return null;
	}

	
}
