import java.io.*;
import java.util.*;
class Vowel
{
char a;
public static void main(String args[])
{
Vowel vo=new Vowel();
Scanner sc=new Scanner(System.in);
vo.a=sc.next().charAt(0);
if((vo.a=='a' || vo.a=='e' || vo.a=='i' || vo.a=='o' || vo.a=='u') ||(vo.a=='A' || vo.a=='E' || vo.a=='I' || vo.a=='O' || vo.a=='U'))
{
System.out.println("yes the given character is an vowel");
}
else
{
System.out.println("no the given character is not a vowel");
}
}
}

