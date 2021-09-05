import java.io.*;
import java.util.*;
class Symbol{
public static void main(String args[])
{
char ch;
int a=10,b=10;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
switch(ch)
{
case '+':
System.out.println(a+b);
break;
case '-':
System.out.println(a-b);
break;
case '*':
System.out.println(a*b);
break;
case '/':
System.out.println(a/b);
break;
case '%':
System.out.println(a%b);
break;
}
}
}


