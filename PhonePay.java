package interface_example;

public class PhonePay implements MobileRecharge
{
	@Override
	public void recharge(String mobileNo, double amount) {
		System.out.println("Recharge via phonepay for mobile no "+mobileNo+" for "+amount+" Rupees");
	}

}
