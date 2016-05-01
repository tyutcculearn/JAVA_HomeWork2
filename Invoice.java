public class Invoice implements Payable
{
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem)
	{
		if(quantity < 0)
			throw new IllegalArgumentException("quantity must be >= 0");	
		if(pricePerItem < 0.0)
			throw new IllegalArgumentException("pricePerItem must be >= 0");
		this.quantity = quantity;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumbet()
	{
		return partNumber;
	}

	public String getPartDescription()
	{
		return partDescription;
	}

	public void setQuantity(int quantity)
	{
		if(quantity < 0)
			throw new IllegalArgumentException("quantity must be >= 0");	
		this.quantity = quantity;
	}

	public int getQuantity()
	{
		return this.quantity;
	}

	public void setPricePerItem()
	{
		if(pricePerItem < 0.0)
			throw new IllegalArgumentException("pricePerItem must be >= 0");
		this.pricePerItem = pricePerItem;
	}

	public double getPricePerItem()
	{
		return this.pricePerItem;
	}

	@Override
	public String toString()
	{
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%.2f","Invoice","partNumber",getPartNumbet(),getPartDescription(),"quantity",getQuantity(),"pricePerItem",getPricePerItem());
	}

	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem();
	}
}