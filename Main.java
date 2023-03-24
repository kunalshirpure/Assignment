import java.util.Scanner;
class Prime
  {  

   boolean a=false;
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   public void get()
   {
     if(num<=1)
        {
            System.out.println("NOtPrime");
        } 
      else 
        {
           for(int i=2;i<=num/2;i++)
             {
               if(num%i==0) 
                   {
                     a=true;
                   }
              }
         }
    } 
   public void disp() 
   {
      if(a==false)  
       {
        System.out.println("Number is Prime");
        }
       else
       {
         System.out.println("Numbert is not prime");
       }

   }
 }

class Main
 {
    public static void main(String args[])
     {
      Prime P=new Prime();
      P.get();
      P.disp();
      }
}