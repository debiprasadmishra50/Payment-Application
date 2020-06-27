package interface_example;

public class GooglePay implements PaymentGateway , MobileRecharge
{
	@Override
	public void transact(String from, String to, double amount, String remarks) 
	{
		System.out.println("Initiating payments from "+from+" to "+to+" for "+amount+" Rupees");
		System.out.printf("Initiating payments from %s to %s for Rupees %.2f\n",from,to,amount);
		System.out.println("you have earned reward points : "+50);
	}

	@Override
	public void recharge(String mobileNo, double amount) 
	{
		System.out.println("Recharge for mobile no "+mobileNo+" for "+amount+" Rupees");
	}
}
