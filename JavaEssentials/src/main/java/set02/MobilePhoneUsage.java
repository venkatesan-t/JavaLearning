package set02;

public class MobilePhoneUsage {

	public static void main(String[] args) {
		MobilePhone phone1 = new MobilePhone();
		phone1.display();
		phone1.makeCall("John");
		phone1.endCall();
		phone1.composeMessage("Shall we meet for lunch tomorrow?");
		phone1.sendMessage("Greg");
		phone1.receiveMessages();
		phone1.display();
		System.out.println();
		MobilePhone phone2 = new MobilePhone();
		phone2.display();
		phone2.receiveCall("Jeff");
		phone2.endCall();
		phone2.composeMessage("Is the meetup on Saturday confirmed?");
		phone2.sendMessage("Chris");
		phone2.dial("9876543211");
		phone2.makeCall("9876543211");
		phone2.receiveMessages();
		phone2.endCall();
	}
}
