import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
         {
		String s[] = args[0].split("");
	
		int n[] = new int[args.length];
		
		for(int i=0;i<n.length;i++)
		{
			 n[i]=Integer.parseInt(s[i]);
		
		
		}
           System.out.println("Repeated numbers");
		for(int j=0;j<n.length;j++)
		{
		
		for(int l=0;l<n.length;l++)
		{
			if(a[j]==a[l])
			{
				System.out.println(a[l]);
			}
			
		}
			
		}

	}

}
			  
			
		   
