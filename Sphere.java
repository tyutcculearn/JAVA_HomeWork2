public class Sphere extends ThreeDimensionShape
{
	private double r;
	Sphere(double r)
	{
		this.r = r;
	}
	@Override 
	public double getArea()
	{
		return Math.PI * 4 * this.r * this.r;
	}
	@Override
	public double getVolume()
	{
		return 4.0 / 3.0 * Math.PI * this.r * this.r * this.r;
	}
}