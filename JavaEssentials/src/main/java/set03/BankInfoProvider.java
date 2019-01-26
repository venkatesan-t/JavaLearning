package set03;

public class BankInfoProvider {

	public static void main(String[] args) {
		Bank bank = new SbiBank();
		bank.RateOfInterest();

		bank = new HdfcBank();
		bank.RateOfInterest();
	}

}
