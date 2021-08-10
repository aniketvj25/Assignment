
public class main {

	public static void main(String arg[])
	{
		Shopkeeper myObj = new Shopkeeper();
		myObj.setName();
		myObj.setName1();
		myObj.setName2();
		myObj.setName3();
		myObj.setName4();
		System.out.println(myObj.getName());
		System.out.println(myObj.getName1());
		System.out.println(myObj.getName2());
		System.out.println(myObj.getName3());
		System.out.println(myObj.getName4());
		Customer myObj1 = new Customer();
		myObj1.setName();
		myObj1.setName1();
		myObj1.setName2();
		myObj1.setName3();
		System.out.println(myObj1.getName());
		System.out.println(myObj1.getName1());
		System.out.println(myObj1.getName2());
		System.out.println(myObj1.getName3());
		Orders myObj2 = new Orders();
		myObj2.setName();
		
		System.out.println(myObj2.getName());
		ProductList myObj3 = new ProductList();
		myObj3.setName();
		System.out.println(myObj3.getName());
		
		
	}
}
