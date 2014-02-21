package src;

public class Circle extends Shape 
{
	private double x,y,r;
	
	public Circle(Drawing d,double x1,double y1,double r1)
	{
		super(d);
		x=x1;
		y=y1;
		r=r1;
	}
	
	public void draw()
	{
		drawCircle(x,y,r);
	}
}
