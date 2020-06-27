package interface_example;

public interface PaymentGateway 
{
	public void transact(String from, String to, double amount, String remarks);
	
}
