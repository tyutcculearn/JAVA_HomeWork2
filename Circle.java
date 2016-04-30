public class Circle extends TwoDimensionShape
{
	private double r;
	Circle(double r)
	{
		this.r = r;
	}
	@Override
	public double getArea()
	{
		return Math.PI * this.r * this.r;
	}
}