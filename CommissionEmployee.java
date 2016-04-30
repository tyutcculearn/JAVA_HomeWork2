public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate)
	{
		super(firstName,lastName,socialSecurityNumber);
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("commission Rate must be >= 0.0 and < 1.0");
		if(grossSales < 0.0)
			throw new IllegalArgumentException("gross Sales must be >= 0.0");
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public void setGrossSales(double grossSales)
	{
		if(grossSales < 0.0)
			throw new IllegalArgumentException("gross Sales must be >= 0.0");
		this.grossSales = grossSales;
	}

	public double getGrossSales()
	{
		return this.grossSales;
	}

	public void setCommissionRate(double commissionRate)
	{
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("commission Rate must be >= 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	public double getCommissionRate()
	{
		return this.commissionRate;
	}

	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}

	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%.2f; %s: %.2f","CommissionEmployee",super.toString(),"grossSales",getGrossSales(),"commissionRate",getCommissionRate());
	}
}