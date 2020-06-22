package multithreadinglab;

public class Room 
{
	Coordinator president = new Coordinator();
	Trainer bob = new Trainer();
	Participant participant = new Participant();
	
	public Room() 
	{
		participant.start();
		president.start();
		bob.start();
		president.setPriority(10);
		bob.setPriority(8);
		participant.setPriority(6);
	}
	
	
	synchronized public void theBouncer()
	{
		
		
		president.setEnteredTheRoom(true);
		
		while(president.getEnteredTheRoom() == false || bob.getEnteredTheRoom() == false || participant.getEnteredTheRoom() == false)
		{
			if (president.getEnteredTheRoom() == true)
				bob.setEnteredTheRoom(true);
			if (bob.getEnteredTheRoom() == true)
				participant.setEnteredTheRoom(true);
		}
		
		while(president.getOkayToLeaveTheRoom() == false || bob.getOkayToLeaveTheRoom() == false || participant.getOkayToLeaveTheRoom() == false)
		{
			participant.setOkayToLeaveTheRoom(true);
			if (participant.getOkayToLeaveTheRoom() == true)
				bob.setOkayToLeaveTheRoom(true);
			if (participant.getOkayToLeaveTheRoom() == true && bob.getOkayToLeaveTheRoom() == true)
				president.setOkayToLeaveTheRoom(true);
		}
	}
}
