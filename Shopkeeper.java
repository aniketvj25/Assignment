
import java.util.Scanner;

import java.util.LinkedList;

import java.util.ListIterator;

public class Shopkeeper {
    
    //------------start of employee class--------
    public class Product {
         String id;
         String name;
         String c_name;
         int stock;
         double price;
        
       
        
    }
    
    
    
    public static void main(String args[])
    {
   
    	
    	LinkedList sList = new LinkedList();
    	
    }

    public  void operations(LinkedList sList )
    {	
     	
    	
    	
    	Scanner in = new Scanner(System.in);
    	
    		System.out.println("Enter Product ID");
    		String add1 = in.nextLine();
    	
    		System.out.println("Enter Productís name");
    		String add2 = in.nextLine();
    		System.out.print("Enter Productís Company Name");
    		String add3 = in.nextLine();
    		System.out.println("Enter Productís stock");
    		int add4 = in.nextInt();
    		System.out.println("Enter Productís price");
    		double add5 = in.nextDouble();
        
    		System.out.println("Product Detail is "+sList) ;
        
    }
    public void update() 
    {
    	
    		Scanner up = new Scanner(System.in);
    		System.out.println("Enter Product ID");
    		String up5 = up.nextLine();
    	
    		System.out.println("Update Productís name");
    		String up1 = up.nextLine();
    		System.out.println("Update Productís Company Name");
    		String up2 = up.nextLine();
    		System.out.println("Update Productís stock");
    		int up3 = up.nextInt();
    		System.out.println("Update Productís price");
    		double up4 = up.nextDouble();
         
    		System.out.println("Updated  Product Details is", +set(up3,up4 ) );
    }
    	public void delete(LinkedList sList)
    	{
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Productís id to delete");
    		String Del = sc.nextLine();
         
    		sList .remove(Del);
        
    	}
    	
    		
    	
    }
    
	


        
               
                
         
        
        
    

