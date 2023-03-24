import java.util.Scanner;
class Fi
  {  
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   int f0=0;
   int f1=1;
   int fib=0;
   public void get()
   {
        System.out.println("0");
        for(int i=0;i<=num;i++)
         {
          f0=f1;
          f1=fib;
          fib=f0+f1;
          System.out.println(fib);
        }
  }
}
class Fibbo
 {
    public static void main(String args[])
     {
      Fi F=new Fi();
      F.get();
      }
}