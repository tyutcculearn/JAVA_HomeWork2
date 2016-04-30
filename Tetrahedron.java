public class Tetrahedron extends ThreeDimensionShape
{
	private double l;
	Tetrahedron(double l)
	{
		this.l = l;
	}
	@Override
	public double getArea()
	{
		return Math.sqrt(3) * this.l * this.l;
	}
	@Override
	public double getVolume()
	{
		return Math.sqrt(2) / 12.0 * this.l * this.l * this.l;
	}
}