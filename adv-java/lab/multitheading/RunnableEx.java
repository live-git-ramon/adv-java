package multithreadinglab;

public class RunnableEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		TestRE2 testRE2 = new TestRE2();
		
		Thread thread = new Thread(testRE2);
		thread.start();
	}
}

class TestRE1
{
	
}

class TestRE2 extends TestRE1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Child Thread.");
	}
}