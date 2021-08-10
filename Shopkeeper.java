
import java.util.Scanner;

import java.util.LinkedList;

import java.util.ListIterator;

public class Shopkeeper {
    
  
    public class Product {
         String id;
         String name;
         String c_name;
         int stock;
         double price;
        
       
        
    }
    
 
    
    public static void main(String args[])
    {
   
    	
    	
    	operations();
    	
    	
    }


    private static void operations() {
		// TODO Auto-generated method stub
    	LinkedList sList = new LinkedList();
    	Scanner in = new Scanner(System.in);
    	
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
    
		System.out.println("Product Detail is "+sList) ;
	}

	private static void update() 
    {
    	
    		Scanner up = new Scanner(System.in);
    		System.out.println("Enter Product ID");
    		String up5 = up.nextLine();
    	
    		System.out.println("Update Product’s name");
    		String up1 = up.nextLine();
    		System.out.println("Update Product’s Company Name");
    		String up2 = up.nextLine();
    		System.out.println("Update Product’s stock");
    		int up3 = up.nextInt();
    		System.out.println("Update Product’s price");
    		double up4 = up.nextDouble();
         
    	
    }
    	private static void delete(LinkedList sList)
    	{
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Product’s id to delete");
    		String Del = sc.nextLine();
         
    		sList .remove(Del);
        
    	}
    	private static void search(LinkedList sList)
    	{
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Product’s id to search");
    		String se = sc.nextLine();
         
    		sList .remove(se);
        
    	}


		public void setName(String Newid) {
			// TODO Auto-generated method stub
			this.id = Newid;
		}
		public void setName1(String Newname) {
			// TODO Auto-generated method stub
			this.name = Newname;
		}
		public void setName2(String Newcname) {
			// TODO Auto-generated method stub
			this.c_name = Newcname;
		}
		public void setName3(int Newstock) {
			// TODO Auto-generated method stub
			this.stock = Newstock;
		}
		public void setName4(Double Newprice) {
			// TODO Auto-generated method stub
			this.price = Newprice;
		}

		public char[] getName() {
			
			return id ;
		}
		public char[] getName1() {
			
			return name ;
		}
		public char[] getName2() {
			
			return c_name ;
		}
		public char[] getName3() {
			
			return stock ;
		}
		public char[] getName4() {
			
			return price ;
		}


	
    		
    	
    }
    
	


        
               
                
         
        
        
    

