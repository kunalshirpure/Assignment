package day4;

public class Evenforr {
	public void disp()
	{
		System.out.println("Numbers are");
		for(int i=1;i<11;i++)
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[])
	{
		Evenforr E=new Evenforr();
		E.disp();
	}

}
