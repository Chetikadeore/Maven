package variables;

public class LocalVar {
	//instance variable declared inside cls but outside method or constructor or blocks
		String instancevariable="This is instance variable";
		
		public void method1()
		{
			//public string abc="access modifier cannot assign for loacl variable";
			
			//static string cde="static cannot used for local variable";
			
			//local var declared inside the method only
			String localvariable="This is local variable";
			System.out.println(localvariable);
			System.out.println();
		}
		
		public static void main(String[] args)
		{
			LocalVar lv=new LocalVar();
			lv.method1();
			System.out.println(lv.instancevariable);
		
		}
	}


