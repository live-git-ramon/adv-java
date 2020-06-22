package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectPersonArray 
{

	public static void main(String[] args) 
	{
		File file = new File("personArray.dat");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			Person[] person = new Person[5];
			
			person[0] = new Person("James", 35, 'M');
			person[1] = new Person("Mike", 35, 'M');
			person[2] = new Person("Brittany", 22, 'F');
			person[3] = new Person("Barb", 50, 'F');
			person[4] = new Person("Shelly", 35, 'F');
			
			objectOutputStream.writeObject(person);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
