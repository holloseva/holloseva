package animalContest;

import java.util.Comparator;

public class SorbaRendez implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.getSumPoint()-o2.getSumPoint();
	}

}
