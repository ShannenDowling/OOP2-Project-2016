//MessageApp.java
/*This program will display an message that models an email using a user-defined class*/

public class MessageApp{
	public static void main(String args[])
	{
		Message mess1 = new Message();
		
		mess1.setSender("James O'Donoghue");
		mess1.setRecipient("Gooch Cooper");
		mess1.setMessage("Hello");
		
		System.out.println(mess1.toString());
	}
}