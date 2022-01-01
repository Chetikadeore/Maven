package variables;

public class InstanceVar {

	public int var1;
	private String var2;
	
	public void method1(int abc)
	{
		var1=abc;
	}
	void method2(String cde)
	{
		var2=cde;
	}
	void method3()
	{
		System.out.println(var1);
		System.out.println(var2);
	}
	public static void main(String[] args)
	{
		InstanceVar v1=new InstanceVar();
		v1.method1(20000);
		v1.method2("chetika");
		
	}
}

		
		