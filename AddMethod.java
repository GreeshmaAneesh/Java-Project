class AddMethod
{
int a,b,sum=0;

public static int add(int a, int b)
{
int sum= a+b;
System.out.println("sum=" +sum);
return sum;
}
public static void main(String arg[])
{
AddMethod.add(5,5);
}
}