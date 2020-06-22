package multithreadinglab;

public class Trainer extends Thread
{
	private Boolean okayToEnterTheRoom = false;
	private Boolean okayToLeaveTheRoom = false;
	
	
	public Trainer() 
	{
		//run();
		// TODO Auto-generated constructor stub
	}
	
	public void run() 
	{
		while(true)
		{
			
			if (okayToEnterTheRoom == true)
			{
				enterRoomMessage();
			}
			if (okayToLeaveTheRoom == true)
			{
				leavingRoomMessage();
		    	break;
			}
		}
	}
	
	
	public void enterRoomMessage()
	{
		System.out.println("The Trainer has entered the room");
	}
		
	public void leavingRoomMessage()
	{
		System.out.println("The Trainer has left the room");
	}
	
	public void setEnteredTheRoom(boolean value)
	{
		this.okayToEnterTheRoom = value;
	}

	public void setOkayToLeaveTheRoom(boolean value)
	{
		this.okayToLeaveTheRoom = value;
	}
	public Boolean getEnteredTheRoom()
	{
		return okayToEnterTheRoom;
	}
	public Boolean getOkayToLeaveTheRoom()
	{
		return okayToLeaveTheRoom;
	}
}
