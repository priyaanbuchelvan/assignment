package student1;
import java.util.*;

public class LargeNum {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	public void largest()
	{
	int max=a;
	if(b>max)
	{
	max=b;
	}
	if(c>max)
	{
	max=c;
	}
	System.out.println(max +"is the greatest");
	}
	public void small()
	{
	int min=a;
	if(b<min)
	{
	min=b;
	}
	if(c<min)
	{
	min=c;
	}
	System.out.println(min +"is the smallest");
	}
	public static void main(String args[])
	{
	LargeNum ln=new LargeNum();
	ln.largest();
	ln.small();
	}

}
