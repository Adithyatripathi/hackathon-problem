class A extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}
class B extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}
class mainth
{
public static void main(String args[])
{
A ob=new A();
B ob1=new B();
ob.run();
ob1.run();
}
}