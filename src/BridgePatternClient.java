package src;
public class BridgePatternClient
{
	public static void main(String args[])
	{
		Shape s1,s2;
		Drawing dp;
		
		dp=new Drawing1();
		s1=new Rectangle(dp,1,1,2,2);
		
		dp=new Drawing2();
		s2=new Circle(dp,2,2,3);
		
		s1.draw();
		s2.draw();
	}
}
