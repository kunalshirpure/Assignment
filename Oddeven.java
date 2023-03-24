import java.util.Scanner;
class Oddeven 
 {
   Scanner sc=new Scanner(System.in);
   int num;
   public void get()
    {
       System.out.println("Enter Number");
       num=sc.nextInt();
     }
   public void logic()
     {
        if(num%2==0) 
           {
               System.out.println("Even number");
          }
       else
           {
               System.out.println("Odd nubmber");
           }
  
     }

    public static void main(String args[])
       {
      Oddeven O=new Oddeven();
       O.disp();
       O.logic();
}
}