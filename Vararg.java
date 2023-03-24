package day4;

public class Vararg {

	 public void add(int...i) 
	 {
		int sum=0;
		System.out.print("Number of arguments are "+i.length+"\n");
        for(int j:i)    
		{
            sum+=j;
		}
		System.out.println(sum);
	 }
	public static void main(String[] args) 
	{
		
     Vararg V=new Vararg();
     V.add(2);
     V.add(1,2);
     V.add(4,1,2,5,6,7);
     V.add(0,100,200);
     
	}

}
