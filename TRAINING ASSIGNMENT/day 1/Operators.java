class Operators
{ 
public static void main(String args[])
{
int a=10;
int b=20;
//ARTHMETIC OPERATORS
System.out.println("add" + (a+b));
System.out.println("sub" + (a-b));
System.out.println("mul" + (a*b));
System.out.println("mod" + (a/b));
System.out.println("div" + (a%b));
//RELATIONAL OPERATORS
System.out.println("Large" + (a>b));
System.out.println("less" + (a<b));
System.out.println("eq" + (a>=b));
System.out.println("el" + (a<=b));
System.out.println("not eqal" + (a!=b));
//LOGICAL
System.out.println("and" + (a&b));
System.out.println("or" + (a|b));
System.out.println("exor" + (a^b));
//BITWISE 
int r=~a;
System.out.println(r);

//INCREMENT AND DECREMENT
int c=a++;
int d=b--;
System.out.println("increment" + c);
System.out.println("decrement" + d);
//ASSIGNMENT OPERATORS
int ab=20,bc=40;
int y=ab;
System.out.println(y);
//COMPOUND OPERATOR
a+=b;
System.out.println(a);
}
}
