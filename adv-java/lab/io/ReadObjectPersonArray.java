package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectPersonArray {

	public static void main(String[] args) {
				File file = new File("personArray.dat");
				try {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

				Person[] person = new Person[5];
				try {
					person = (Person[]) objectInputStream.readObject();
					for (Person human : person)
					{
						System.out.println(human);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				fileInputStream.close();
			} catch (FileNotFoundException e)
				{
					System.out.println(e);
				} catch (IOException e) {
					System.out.println(e);
				e.printStackTrace();
			}

	}

}
