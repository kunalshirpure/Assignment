import java.util.*;
public class MinMax 
{
	
	public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many number you want to print");
	int num=sc.nextInt();
	int[] arr=new int[num];
//	MinMax M=new MinMax();
//	System.out.println(M.logic(arr));
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
		}
	
	System.out.println("LArgest number is ");
	int large=0;;
	for(int i=0;i<num;i++) 
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}
	}
	System.out.println(large);
    
    int small;
	small=arr[0];
	System.out.println("Smallest number is ");

	for(int j=0;j<num;j++) 
	{
		if(arr[j]<small)
		{
			small=arr[j];
		}
	}
	System.out.println(small);
    }
}

  