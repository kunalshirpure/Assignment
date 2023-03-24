import java.util.Scanner;
public class Palindrome 
{
    int num;
    int rem;
    int rev;
    int t=num;        // jaar ithe int t kela aani ithech int t=num nhi lihala trr error deto
    Scanner sc=new Scanner(System.in);
     void get()
     {
    	 System.out.println("Enter number");
    	 num=sc.nextInt();
     }
      int logic()
      {
    	  while(num!=0)
    	  {
    		  rem=num%10;
    		  rev=(rev*10)+rem;
    		  num=num/10;
    	  }
    	  System.out.println("Reverse of Given Number is"+rev);
    	  if(t==rev)
    	  {
    		  System.out.println("Number is Palindrome");
    	  }
    	  else
    	  {
    		  System.out.println("Number is not Palindrome");
    	  }
    	 return 0;
      }
	
	
   public static void main(String args[])
   {
	    Palindrome P=new Palindrome();
	    P.get();
	    P.logic();
   }
}
