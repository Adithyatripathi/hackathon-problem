class A extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("Hai");
}
}
}
class B extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("Welcome");
}
}
}
class addii
{
public static void main(String args[])
{
A ob=new A();
B ob1=new B();
ob.start();
ob1.start();
}
}