package src;

public class Rectangle extends Shape {

	private double x1,x2,y1,y2;
	
	public Rectangle(Drawing d,double _x1,double _y1,double _x2,double _y2)
	{
		super(d);
		x1=_x1;
		x2=_x2;
		y1=_y1;
		y2=_y2;
	}
	
	public void draw()
	{
		drawLine(x1,y1,x2,y1);
		drawLine(x2,y1,x2,y2);
		drawLine(x1,y2,x1,y2);
		drawLine(x1,y2,x1,y1);
	}
}
