package multithreadinglab;

public class Coordinator extends Thread
{
	private Boolean okayToEnterTheRoom = false;
	private Boolean okayToLeaveTheRoom = false;
	
	public Coordinator() 
	{
		//run();
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
		System.out.println("The coordinator has entered the room");
	}
	
	public void leavingRoomMessage()
	{
		System.out.println("The coordinator has left the room");
	}
	public void setEnteredTheRoom(boolean value)
	{
		this.okayToEnterTheRoom = value;
	}

	public void setOkayToLeaveTheRoom(boolean value)
	{
		this.okayToLeaveTheRoom = value;
	}
	
	public Boolean getOkayToLeaveTheRoom()
	{
		return okayToLeaveTheRoom;
	}
	
	public Boolean getEnteredTheRoom()
	{
		return okayToEnterTheRoom;
	}
}
