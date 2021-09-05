class Add
{
int b=5;
static int a=10;
public static void main(String args[])
{
 Add r=new Add();
int x=a;
int y=r.b;
while(r.b!=0)
{
int sum=(a&r.b);
a=a^r.b;
r.b=sum<<1;
}
System.out.println("sum" +a);
while(y!=0)
{
int sub=((~x)&y);
x=x^y;
y=sub<<1;
}
System.out.println("sub" +x);
}
}