import java.lang.reflect.Method;

public class Orders
{
	public static void main (String arg[])throws Exception
	{
		Class c =  Class.forName("Customer");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("Buy",null);
		m.setAccessible(true);
		m.invoke(o, null);
	}
}