package day4;

public class EvenWhile {
	public void disp()
	{
		System.out.println("Numbers are");
		int i=1;
	    while(i<=11)
	    {
	    	if(i%2==0)
	    	{
	    		System.out.println(i);
	    	}
	    	i++;
	    }
	}
	
	public static void main(String args[])
	{
		Evenforr E=new Evenforr();
		E.disp();
	}
}
