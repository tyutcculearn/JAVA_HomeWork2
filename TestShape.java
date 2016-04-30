public class TestShape
{
	public static void main(String[] arg)
	{
		Shape[] arr = new Shape[6];
		arr[0] = new Circle(5.0);
		arr[1] = new Square(3.0);
		arr[2] = new Triangle(3.0,4.0,5.0);
		arr[3] = new Sphere(4.0);
		arr[4] = new Cube(4.0);
		arr[5] = new Tetrahedron(2.0);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getClass().getSuperclass().getName() == "TwoDimensionShape")
				System.out.printf("This array element refer to %s,%s 's area is %f %n",arr[i].getClass().getName(),arr[i].getClass().getName(),arr[i].getArea());
			else 
				System.out.printf("This array element refer to %s,%s 's area is %f and volume is %f %n",arr[i].getClass().getName(),arr[i].getClass().getName(),arr[i].getArea(),arr[i].getVolume());
		}
	}
}