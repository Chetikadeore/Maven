package variables;

public class StaticVar {
	int rno;
	String name;
	static String collegename="kkw";
	
	StaticVar(int r,String n)
	{
		rno=r;
		name=n;
	}
	void toprint() 
	{
		System.out.println(rno);
		System.out.println(name);
		System.out.println(collegename);
	}
	public static void main(String[] args)
	{
		StaticVar s=new StaticVar(1,"Shraddha");
		StaticVar s1=new StaticVar(2,"chetika");
		s.toprint();
		s1.toprint();
		
	}
}


