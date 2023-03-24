import java.util.Scanner;
class Rectangle
  {  

    int l;
    int b;
    public int disp()
      { 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int l=sc.nextInt();
        System.out.println("Enter Breath");
        int b=sc.nextInt();
        int area=l*b;
        return area;
      }
    public static void main(String args[])
     {
       Rectangle R=new Rectangle();
       int a=R.disp();
       System.out.println(a);
     }
 }
 