package interface_example;

public class PaymentClient 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please enter option");
		System.out.println("1 -> google Pay \n2 -> Phone Pay");
		int option = sc.nextInt();
		MobileRecharge gateway = null;
		switch (option) 
		{
			case 1: 
			{
				gateway = new GooglePay();
				break;
			}
			case 2:
			{
				gateway = new PhonePay();
				break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
//		PaymentGateway gateway = new GooglePay();
//		gateway.transact("Harish", "Debi", 1000, "Transfer rent");
//		MobileRecharge gateway = new GooglePay();
		gateway.recharge("2233665522",399);
	}
}
