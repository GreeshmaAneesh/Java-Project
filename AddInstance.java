class AddInstance
{
public int add(int a, int b)
{

int sum=a+b;
System.out.println("Sum=" +sum);
return sum;
}
public static void main(String arg[])
{
AddInstance a1=new AddInstance();
a1.add(10,10);
}}