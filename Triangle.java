public class Triangle extends TwoDimensionShape
{
	private double a,b,c;
	Triangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double getArea()
	{
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}