import java.lang.reflect.Method;

public class ProductList {
	public static void main(String arg[]) throws Exception
	{
		Class S = Class.forName("Shopkeeper");
		Object p = S.newInstance();
		Method a = S.getDeclaredMethod("operations", null);
		a.setAccessible(true);
		a.invoke(p,null );
		
	}
	

}
