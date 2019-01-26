package set02;

public class MobilePhone {
	public void dial(String number)
	{
		System.out.println("You just dialed " + number);
	}
	
	public void makeCall(String receiverName)
	{
		System.out.println("You are in a call with " + receiverName);
	}
	
	public void endCall()
	{
		System.out.println("You just ended a call");
	}
	
	public void receiveCall(String callerName)
	{
		System.out.println("You received a call from " + callerName + " and you are on it");
	}
	
	public void composeMessage(String message)
	{
		System.out.println("You are composing a message " + message);
	}
	
	public void sendMessage(String receiverName)
	{
		System.out.println("You just sent to " + receiverName);
	}
	
	public void receiveMessages()
	{
		System.out.println("You just received 2 messages");
	}
	
	public void display()
	{
		System.out.println("You are now shown the mobile display");
	}
}
