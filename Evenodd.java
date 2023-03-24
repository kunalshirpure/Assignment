import java.util.Scanner;
public class Evenodd
{

   public static void main(String args[])
{

	int r1;
	int r2;
	Scanner sc=new  Scanner(System.in);
                  System.out.println("Enter range with space");
		   r1=sc.nextInt();
		   r2=sc.nextInt();
                                       System.out.println("HELLO");
                                       System.out.println("Even numbers");
		    for(int i=r1;i<=r2;i++)
		    {
		    	if(i%2==0)
		    	{
		    		System.out.println(i);
		    	}
		    	
		    }
                                        System.out.println("Odd Numbers are");
		    for(int i=r1;i<=r2;i++)
		    {
		    	if(i%2!=0)
		    	{
		    		System.out.println(i);
		    	}
	         
		    }
            
}
 }
