public class Cube extends ThreeDimensionShape
{
	private double l;
	Cube(double l)
	{
		this.l = l;
	}
	@Override
	public double getArea()
	{
		return 6 * this.l * this.l;
	}
	@Override
	public double getVolume()
	{
		return this.l * this.l * this.l;
	}
}