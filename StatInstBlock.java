
public class StatInstBlock {
	
	
	int num=153;
	static int sum=12;
	public void nonsmethod()
	{
		System.out.println(num);
		System.out.println(sum);
	}
	public static void smethod()
	{
		//System.out.println(num); it shows error bcz static method cannot accept null value
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		StatInstBlock S=new StatInstBlock();
		S.nonsmethod();
	    S.smethod();
	    System.out.println(sum);
	}
}
