public class TestPayable
{
	public static void main(String[] arg)
	{
		Payable[] arr = new Payable[5];
		arr[0] = new Invoice("01234","seat",2,375.00);
		arr[1] = new SalariedEmployee("John","Smith","111-11-11",800.0);
		arr[2] = new HourlyEmployee("Karen","Price","222-22-22",16.75,40);
		arr[3] = new CommissionEmployee("Sue","Jones","333-33-33",10000,0.06);
		arr[4] = new BasePlusCommissionEmployee("Bob","Lewis","444-44-44",5000,0.04,300);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			if(arr[i] instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) arr[i];
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%.2f%n",employee.getBaseSalary());
			}
			System.out.printf("PaymentAmount $%.2f%n%n",arr[i].getPaymentAmount());
		}
	}
}