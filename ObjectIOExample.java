package animalContest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import feladatokKiraly.Kiraly;

public class ObjectIOExample {



private static final String filepath="C:\\\\Users\\\\hollo\\\\Desktop\\\\Java\\\\feladatok\\\\src\\\\animalContest\\\\animals.txt";

public static void main(String[] args) {

	Animal a1 = new Animal("doggo1", 2011);
	Animal a2 = new Animal("doggo2", 2013);

	try {
		FileOutputStream f = new FileOutputStream(new File("C:\\\\Users\\\\hollo\\\\Desktop\\\\Java\\\\feladatok\\\\src\\\\animalContest\\\\animals.txt"));
		ObjectOutputStream o = new ObjectOutputStream(f);

		// Write objects to file
		o.writeObject(a1);
		o.writeObject(a2);

		o.close();
		f.close();

		FileInputStream fi = new FileInputStream(new File("C:\\\\Users\\\\hollo\\\\Desktop\\\\Java\\\\feladatok\\\\src\\\\animalContest\\\\animals.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		// Read objects
		Animal a11 = (Animal) oi.readObject();
		Animal a22 = (Animal) oi.readObject();

		System.out.println(a11.toString());
		System.out.println(a22.toString());

		oi.close();
		fi.close();

	} catch (FileNotFoundException e) {
		System.out.println("File not found");
	} catch (IOException e) {
		System.out.println("Error initializing stream");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}
