package multithreadinglab;

public class Participant extends Thread
{
	private Boolean okayToEnterTheRoom = false;
	private Boolean okayToLeaveTheRoom = false;
	
	
	Participant()
	{
		
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
	System.out.println("The Participant has entered the room");
}
		
public void leavingRoomMessage()
{
	System.out.println("The Participant has left the room");
}
	

public void practice()
{
	System.out.println("Participant number Practices");
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