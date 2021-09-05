package Assignment1;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class Sum_Even_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		
		IntConsumer bi=(o)->{
			FibSeries(o);
			SumFib(o);
			};
		bi.accept(n);

	}

	private static void FibSeries(int o) {
		int num1=0;
		int num2=1;
		int i=0;
		System.out.print("Fibonacci Series is : ");
		while(i<=o)
		{
			if(i==o)
				System.out.print(num1);
			else
				System.out.print(num1+ "  ");
			
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			i++;
		}
	}
	
	private static void SumFib(int o)
	{
		int i=0;
		int num1=0;
		int num2=1;
		int sum=0;
		int a=0;
		System.out.print("\n\nEven Number in Fibonacci Sequence is : ");
		while(i<=o)
		{
			if(i==o)
			{
				if(num1%2==0 )
				{
					System.out.println(num1);
					sum=sum+num1;
				}
			}
			else
			{
				if(num1%2==0)
				{
					System.out.print(num1+" ");
					sum=sum+num1;
				}
			}
			
			int s=num1+num2;
			num1=num2;
			num2=s;
			i++;
		}
		System.out.println("\nSum of Even Numbers in Fibonacci Sequence is : "+sum);
		
	}
}
