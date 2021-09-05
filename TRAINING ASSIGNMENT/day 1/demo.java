SWAPPING
class demo
{
static int a=10;
int b=7;
public static void main(String[]args)
{
demo demo1=new demo();
demo.a=demo.a+demo1.b;
demo1.b=demo.a-demo1.b;
demo.a=demo.a-demo1.b;
System.out.println(demo.a);
System.out.println(demo1.b);
}
}




