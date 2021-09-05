import java.io.*;
import java.util.*;
class Odd
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a>0)
{
if(a%2==0)
{
System.out.println(a +"is an positive number and even number");
}
else
{
System.out.println(a +"is an odd number and  positive number");
}
}
else
{
if(a%2==0)
{

System.out.println(a +"is an negative number and even number");
}
else
{
System.out.println(a +"is an odd number and positive number");
}
}
}
}




