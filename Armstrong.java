import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	int rem;
    	int rev=0;
    	int t=num;
        while(num!=0)
   	      {
   		    rem=num%10;
   		    rev=(rev*10)+rem*rem*rem;
   		    num=num/10;
   	      }
        if(t==rev)
        {
        	System.out.println(+rev+"is Armstrong Number");
        }
        else
        {
        	System.out.println(+rev+"is not Armstrong Number");
        }
    }
}
