package helloworld;

public class helloworld {


		// TODO Auto-generated method stub
		
			
			public static void main(String[] args)
			{
				System.out.println("hello world");
				
				helloworld hw=new helloworld();
				hw.add();
				hw.substract(20,10);
				int a=hw.substract(20,5);
				System.out.print(a);
			}		
			public void add()
			{
				System.out.println("add");
			}
			public int substract(int a,int b)
			{
				int c=a-b;
				return c;
			}
		}

			