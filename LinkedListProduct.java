import java.util.Scanner;


import java.util.LinkedList;

import java.util.ListIterator;

public class LinkedListProduct {
    
    //------------start of employee class--------
    public class Employee {
         String id;
         String name;
         String c_name;
         int stock;
         double price;
        
       
        
    }
    
    
    
    public static void main(String args[])
    {
    	
            LinkedList sList = new LinkedList();
            System.out.println("1 Shopkeeper \n 2.Customer ");
            Scanner in1 = new Scanner(System.in);
            
            int choice1 = in1.nextInt();
            if(choice1 == 1)
            {
            	System.out.println("\nMENU\n1.Add Product\n2.Update\n3.Delete\n4.Search");
            	Scanner in = new Scanner(System.in);
            
            	int choice = in.nextInt();
            	if (choice == 1)
            	{
            		System.out.println("Enter Product ID");
            		String add1 = in.nextLine();
            	
            		System.out.println("Enter Product’s name");
            		String add2 = in.nextLine();
            		System.out.print("Enter Product’s Company Name");
            		String add3 = in.nextLine();
            		System.out.println("Enter Product’s stock");
            		int add4 = in.nextInt();
            		System.out.println("Enter Product’s price");
            		double add5 = in.nextDouble();
                
            		System.out.println("Product Detail is "sList) ;
                
            	}
            	if(choice ==2)
            	{
            		System.out.println("Enter Product ID");
            		String up5 = in.nextLine();
            	
            		System.out.println("Update Product’s name");
            		String up1 = in.nextLine();
            		System.out.println("Update Product’s Company Name");
            		String up2 = in.nextLine();
            		System.out.println("Update Product’s stock");
            		int up3 = in.nextInt();
            		System.out.println("Update Product’s price");
            		double up4 = in.nextDouble();
                 
            		System.out.println("Updated  Product Details is", +set(up3,up4 ) );
            	}
            	if(choice ==3)
            	{
            		System.out.println("Enter Product’s id to delete");
            		String Del = in.nextLine();
                 
            		sList .remove(Del);
                
            	}
            	if(choice1==2)
            	{
            	 	System.out.println("\nMENU\n 1.List Product \n2.Search\n3.Buy");
                	Scanner keypad = new Scanner(System.in);
                	int choice3 = keypad.nextInt();
                	if(choice3==1)
                	{
                		System.out.println("Products are"+sList);
                	}
                	if(choice3==2)
                	{
                		
                	}
                	if(choice3==3)
                	{
                		System.out.println("Product bought");
                	}
            	}
            		
            	}
           
    }




        
               
                
         
        
        
    
}
