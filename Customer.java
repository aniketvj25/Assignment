

import java.util.Scanner;


import java.util.LinkedList;

import java.util.ListIterator;

public class Customer {
    
    //------------start of employee class--------
    public class Product
    {
         String id;
         String name;
         String c_name;
         int stock;
         double price;
        
       
        
    }
    public class Order{
    		String id;
    		int card_no;
    		int cvv;
    }
    
    
    
    public static void main(String args[])
    {
   
    	
    	LinkedList sList = new LinkedList();
    	
    	
    	
    }

    public  void ProductList(LinkedList sList )
    {	
    	
 
        
    		System.out.println("Product Detail is "+sList) ;
        
    }
    public void search() 
    {
    	
    		Scanner se  = new Scanner(System.in);
    		System.out.println("Enter product id to search");
    		String search = se.nextLine();

    }
    	public void Buy(LinkedList sList)
    	{
    		LinkedList l = new LinkedList();
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Product Name to buy");
    		
    		String buy = sc.nextLine();
    		System.out.println("Enter Card Number For Purchase");
    		int card = sc.nextInt();
    		
    		System.out.println("Enter CVV for card no");
    		int cvv = sc.nextInt();
        
    	}
    	
    		
    	
    }
    
	


        
               
                
         