public abstract class TwoDimensionShape extends Shape
{
	TwoDimensionShape(){}
	public abstract double getArea();
	@Override
	public double getVolume(){return 0;}
}