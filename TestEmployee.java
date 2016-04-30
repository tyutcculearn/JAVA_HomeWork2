public class TestEmployee
{
	public static void main(String[] arg)
	{
		Payable[] arr = new Payable[4];
		arr[0] = new SalariedEmployee("John","Smith","111-11-11",800.0);
		arr[1] = new HourlyEmployee("Karen","Price","222-22-22",16.75,40);
		arr[2] = new CommissionEmployee("Sue","Jones","333-33-33",10000,0.06);
		arr[3] = new BasePlusCommissionEmployee("Bob","Lewis","444-44-44",5000,0.04,300);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("%s%nPaymentAmount is :$%.2f%n%n",arr[i],arr[i].getPaymentAmount());
		}
	}
}