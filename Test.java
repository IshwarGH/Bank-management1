//Write a java program to implement interface
//Create an interface class

interface C
{
           void drawA();
           void drawB();
}
class D implements C
{
         public void drawA()
	{
	         System.out.println("Drawing Toll");
	}
  	public void drawB()
	{
	         System.out.println("Drawing Tooll");
	}
}
class Test
{
	public static void main(String[] args)
	{
  	       C c=new D();
	       c.drawA();
	       c.drawB();
	}
}