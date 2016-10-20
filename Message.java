//Message.java
/**/

public class Message{
	
	//declare attributes
	private String sender;
	private String recipient;
	private String message;
	
	//constructor method
	public Message(){
		
		setSender("Unknown");
		setRecipient("Unknown");
		setMessage("Unknown"); 
	}
	
	
	//mutator methods
	public void setSender(String sender)
	{
		this.sender = sender;	
	}
	
	public void setRecipient(String recipient)
	{
		this.recipient = recipient;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	
	//accessor methods
	public String getSender()
	{
		return sender;
	}
	
	public String getRecipient()
	{
		return recipient;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	
	public String toString()
	{
		return "From: " + sender + "\nTo: " + recipient + "\n\n\t" + message;	
	}
	
}