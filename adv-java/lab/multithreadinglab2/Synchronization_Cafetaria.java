package multithreadinglab2;

public class Synchronization_Cafetaria {
	public static void main(String[] args) {
//The brand new LG Oven for the cafetaria.
		Oven lgOven = new Oven();
		// Getting access to the oven.
		Person colette = new Person(lgOven);
		colette.food = "Pizaa";
		Person malik = new Person(lgOven);
		malik.food = "Coffee";
		Person ramon = new Person(lgOven);
		ramon.food = "Chicken Wings";
		// start cooking food at the same time
		colette.start();
		malik.start();
		ramon.start();
	}
}

//Resource (any object that is used by the thread (threads)
class Oven {
	public synchronized void cook(String food) {

		for (int i = 1; i < 100; i++) 
		{
			System.out.println("Cooking : " + food + " Timer : " + i);
		}
	}
}

//Action : Two people, Colette & Malik
class Person extends Thread {
//The person has to access the cook button
	Oven oven = null;
	String food = null;

	public Person(Oven ovenParameter) 
	{
		this.oven = ovenParameter;
	}

// The person hits the cook button.
	public void run() {
		oven.cook(food);
	}
}