

package firstclass;

import java.util.Scanner;

public class lsearch {
	
	public int n;
	public int[] arr= new int[10];
	public void insert()
	{
		
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value for the array");
		n=sc.nextInt();
		System.out.println("enter the " + n + " value for the array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
	}
	
     public void search()
	{
		int s,i;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value to be search");
		s=sc.nextInt();
		 
		for(i=0;i<n;i++)
		{
			if(s==arr[i])
				System.out.println("the element " + s +  " found  at = " + (i+1));
			
				
		}
		
		System.out.println("element is not found ");
		
	}
	
	
	public static void main(String[] args) 
	{
	//int i;
	lsearch l = new lsearch();
		l.insert();
		l.search();

	}

}
