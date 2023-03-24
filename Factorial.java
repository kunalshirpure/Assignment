class Factorial
   {
    int fact=1;
    public int disp(int a) 
      {
        for(int i=1;i<a;i++)
          {  
             fact=fact*i;
          }
        return fact;
      }
     public static void main(String args[])
      {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        Factorial F=new Factorial(); 
        int catch=disp(num);
        System.out.println(catch);
      }
   }