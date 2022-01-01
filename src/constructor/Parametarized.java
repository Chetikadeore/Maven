package constructor;

public class Parametarized {

		// TODO Auto-generated method stub
		int id;
		String name;
		
		Parametarized(int i,String n)
		{
			id=i;
			name=n;
		}
		void method()
		{
			System.out.println(id);
			System.out.println(name);
		}
		public static void main(String[] args)
		{
			Parametarized p=new Parametarized(1,"shraddha");
			Parametarized p1=new Parametarized(2,"chetika");
			p.method();
			p1.method();
	}

}
