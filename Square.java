public class Square extends TwoDimensionShape
{
	private double l;
	Square(double l)
	{
		this.l = l;
	}
	@Override
	public double getArea()
	{
		return this.l * this.l;
	}
}