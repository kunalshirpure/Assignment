import java.util.Scanner;

class Rec
 {
      public static void main(String args[])
     {
        double a;
        double b;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Length");
         a=sc.nextDouble();
         System.out.println("Enter the Breath");
         b=sc.nextDouble();
         Rect R=new Rect();
         double area=R.get(a,b);
         System.out.println("Area of Rectangle is\n"+area);
   }

 }            
class Rect
   {
    double get(double x,double y) // Jar return type function cha int ghetla aani argument double                                                                                             //ghetle t error yeto
      {
          return x*y;
      }
   }
