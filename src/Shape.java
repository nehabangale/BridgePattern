package src;

public abstract class Shape 
{
	protected Drawing d;
	
	public abstract void draw();
	
	public Shape(Drawing dr)
	{
		d = dr;
	}
	
	protected void drawLine(double x1,double y1,double x2,double y2)
	{
		d.drawLine(x1,y1,x2,y2);
	}
	
	protected void drawCircle(double x,double y,double r)
	{
		d.drawCircle(x,y,r);
	}
	
}
