package animalContest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import feladatokKiraly.Kiraly;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
	    
	    // Declare the object and initialize with 
        // predefined standard input object 
	    String file = "C:\\Users\\hollo\\Desktop\\Java\\feladatok\\src\\animalContest\\animals.txt";
        Scanner s = new Scanner(new File(file)); 
        
       s.useDelimiter(",");
       
       ArrayList<Animal> animals = new ArrayList<>();
       ArrayList<Doggo> doggos = new ArrayList<>();
       ArrayList<Catto> cattos = new ArrayList<>();
       
       
       
      
  // prints: 2
       while (s.hasNextLine()) {
    	   String l = s.next().trim();
    	   if(l.equals("d")) {
    		   Doggo d = new Doggo(
    			       (s.next()).trim(),     // prints: red

    			       s.nextInt());  // prints: 1
    			   
    				animals.add(d);
    				doggos.add(d);
    				System.out.println(d);
    			      
    	   }
    	   
  if(l.equals("c")) {
	  Catto c = new Catto(
		       (s.next()).trim(),     // prints: red

		       s.nextInt(),
			  s.nextBoolean());  // prints: 1
		   
			animals.add(c);
			System.out.println(c);
    	   }
	
      
}  s.close(); 
        // String input 
System.out.println(animals);





Enumeration<Animal> an = Collections.enumeration(animals);


while (an.hasMoreElements()) {
	Animal a = an.nextElement();
	a.setBeautyContest();
	a.setBehaviorContest();
	System.out.println(a);
	
	
	
	
}
System.out.println(animals);


Enumeration<Animal> an2 = Collections.enumeration(animals);


int nO=1;
while (an2.hasMoreElements()) {
	Animal a = an2.nextElement();
	//a.setnO(nO);
	a.setSumPointContest();
	System.out.println(a);
	
	nO++;
	
	
}

System.out.println("animals");

for (Iterator iterator = animals.iterator(); iterator.hasNext();) {
	Animal animal = (Animal) iterator.next();
	System.out.println(animal);
	
}
Collections.sort(animals, new SorbaRendez());

System.out.println("sorbarendezes");



for (Iterator iterator = animals.iterator(); iterator.hasNext();) {
	Animal animal = (Animal) iterator.next();
	System.out.println(animal);
	
}

System.out.println("enumeration");
while (an2.hasMoreElements()) {
	System.out.println(an2.nextElement());
	
}


getTheWinner(animals);


	}

	private static void getTheWinner(ArrayList<Animal> animals) {
		
int sumP = 0;
Animal winner = new Animal();
for (Iterator iterator = animals.iterator(); iterator.hasNext();) {
	Animal animal = (Animal) iterator.next();
	if(sumP < animal.getSumPoint()) ;
	sumP = animal.getSumPoint();
	winner = animal;
}

System.out.println("Annnd the winner is: ");
System.out.println(winner);
		
	}
	
	

}
